package com.bananaforscale;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by franzj on 26.03.2015.
 */
public class BananaVisitor extends BananaCompilerBaseVisitor<String> {

    private boolean calculation = false;
    private String errorMessage = "";
    private Map<String, Integer> variables = new HashMap<String, Integer>();

    public String getErrorMessage(){
        return errorMessage;
    }

    public boolean getIsCalculation(){
        return calculation;
    }

    /**
     * This is the visitor for the starting rule.
    */
    @Override
    public String visitProg(@NotNull BananaCompilerParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public String visitProgrammpart(@NotNull BananaCompilerParser.ProgrammpartContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Declare variable (not value assigned)
     */
    @Override
    public String visitDeclaration(@NotNull BananaCompilerParser.DeclarationContext ctx) {
        variables.put(ctx.lval.getText(), variables.size());
        return "";
    }
    /**
     * Define a variable (declare then) assign value
     */
    @Override
    public String visitDefinition(@NotNull BananaCompilerParser.DefinitionContext ctx) {
        if (ctx.declr.getText().length() > 0) {
            if (variables.containsKey(ctx.lval.getText()))
                errorMessage = "Error: Creating already declared variable.";
            variables.put(ctx.lval.getText(), variables.size());
        }
        if (!variables.containsKey(ctx.lval.getText()))
            errorMessage = "Error: Assigning to undeclared variable";
        return "ldc " + ctx.rval.getText() + System.lineSeparator() + "istore " + variables.get(ctx.lval.getText());
    }

    @Override
     public String visitNum(@NotNull BananaCompilerParser.NumContext ctx) {
        return ("ldc "+ ctx.getText() + System.lineSeparator());
    }

    @Override
    public String visitVar(@NotNull BananaCompilerParser.VarContext ctx) {
        if (!variables.containsKey(ctx.getText()))
            errorMessage = "Error: Accessing undeclared variable";
        return "iload " + variables.get(ctx.getText()) + System.lineSeparator();
    }

    /**
     * Calculate an operation where the math operator stands in the middle
     */
    @Override
    public String visitMidoperation(@NotNull BananaCompilerParser.MidoperationContext ctx) {
        calculation = true;

        //check if operand is var or num
        String left, right;
        try{
            Double.parseDouble(ctx.lval.getText());
            left = visitNum((BananaCompilerParser.NumContext) ctx.lval);
        }
        catch(NumberFormatException nfe){
            left = visitVar((BananaCompilerParser.VarContext) ctx.lval);
        }
        try{
            Double.parseDouble(ctx.rval.getText());
            right = visitNum((BananaCompilerParser.NumContext) ctx.rval);
        }
        catch(NumberFormatException nfe){
            right = visitVar((BananaCompilerParser.VarContext) ctx.rval);
        }

        String mid = ctx.midop.getText();
        if(mid.equals("+")) {mid = "iadd";}
        if(mid.equals("-")) {mid = "isub";}
        if(mid.equals("*")) {mid = "imul";}
        if(mid.equals("/")) {mid = "idiv";
            if(ctx.rval.getText().equals("0")) {
                //error message for division by zero
                errorMessage = "Error: Division by zero";
            }
        }
        //error message for invalid math operation
        if(!mid.equals("iadd") && !mid.equals("isub") && !mid.equals("imul") && !mid.equals("idiv")) {
            errorMessage = "Error: Invalid math operation";
        }
        return (left + right + mid);
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null)
            return nextResult;
        else if (nextResult == null)
            return aggregate;
        return aggregate + System.lineSeparator() + nextResult;
    }
}

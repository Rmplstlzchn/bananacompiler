package com.bananaforscale;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by franzj on 26.03.2015.
 */
public class BananaVisitor extends BananaCompilerBaseVisitor<String> {

    private String errorMessage = "";
    private Map<String, Integer> variables = new HashMap<String, Integer>();

    public String getErrorMessage(){
        return errorMessage;
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
        return ctx.rval.getText() + System.lineSeparator() + "ISTORE " + variables.get(ctx.lval.getText());
    }

    @Override
     public String visitNum(@NotNull BananaCompilerParser.NumContext ctx) {
        return ("LDC "+ ctx.getText() + System.lineSeparator());
    }

    @Override
    public String visitVar(@NotNull BananaCompilerParser.VarContext ctx) {
        return "ILOAD " + variables.get(ctx.getText() + System.lineSeparator());
    }

    /**
     * Calculate an operation where the math operator stands in the middle
     */
    @Override
    public String visitMidoperation(@NotNull BananaCompilerParser.MidoperationContext ctx) {
        String left = "LDC " + ctx.lval.getText() + System.lineSeparator();
        String right = "LDC " + ctx.rval.getText() + System.lineSeparator();
        String mid = ctx.midop.getText();
        if(mid.equals("+")) {mid = "IADD";}
        if(mid.equals("-")) {mid = "ISUB";}
        if(mid.equals("*")) {mid = "IMUL";}
        if(mid.equals("/")) {mid = "IDIV";
            if(ctx.rval.getText().equals("0")) {
                //error message for division by zero
                errorMessage = "Error: Division by zero";
            }
        }
        //error message for invalid math operation
        if(!mid.equals("IADD") && !mid.equals("ISUB") && !mid.equals("IMUL") && !mid.equals("IDIV")) {
            errorMessage = "Error: invalid math operation";
        }
        return (left + right + mid);
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null)
            return nextResult;
        else if (nextResult == null)
            return aggregate;
        return aggregate + "\n" + nextResult;
    }
}

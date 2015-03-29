package com.bananaforscale;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by franzj on 26.03.2015.
 */
public class BananaVisitor extends BananaCompilerBaseVisitor<String> {
    /**
     * This is the visitor for the starting rule.
    */
    @Override
    public String visitProg(@NotNull BananaCompilerParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    /**
     * Declare variable (not value assigned)
     */
    @Override
    public String visitDeclaration(@NotNull BananaCompilerParser.DeclarationContext ctx) {
        System.out.println("Declare variable");
        return super.visitDeclaration(ctx);
    }
    /**
     * Define a variable (declare then assign value)
     */
    @Override
    public String visitDefine(@NotNull BananaCompilerParser.DefineContext ctx) {
        return super.visitDefine(ctx);
    }

    @Override
     public String visitNum(@NotNull BananaCompilerParser.NumContext ctx) {
        return ("LDC "+ctx.getText());
    }

    /**
     * Calculate an operation where the math operator stands in the middle
     */
    @Override
    public String visitMidoperation(@NotNull BananaCompilerParser.MidoperationContext ctx) {
        String left = "LDC " + ctx.lval.getText() + System.lineSeparator();
        String right = "LDC " + ctx.rval.getText() + System.lineSeparator();
        String mid = ctx.midop.getText();
        String error = "";
        if(mid.equals("+")) {mid = "IADD";}
        if(mid.equals("-")) {mid = "ISUB";}
        if(mid.equals("*")) {mid = "IMUL";}
        if(mid.equals("/")) {mid = "IDIV";
            if(ctx.rval.getText().equals("0")) {
                error = "you cannot divide by 0";
            }
        }
        if(mid.equals("+") && mid.equals("-") && mid.equals("*") && mid.equals("/")) {
            error = ctx.midop.getText() + " is not a valid operation";
        }
        if(error.equals("")) {return (left + right + mid);}
        else{return error;}
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

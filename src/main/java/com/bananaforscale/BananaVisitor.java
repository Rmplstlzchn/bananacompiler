package com.bananaforscale;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created for bananaforscale on 26.03.2015.
 */
public class BananaVisitor extends BananaCompilerBaseVisitor<String> {
    private String errorMessage = "";
    private Map<String, Integer> variables = new HashMap<String, Integer>();

    /**
     *
     * @return
     */
    public String getErrorMessage(){
        return errorMessage;
    }

    @Override
    public String visitProg(BananaCompilerParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitMulti(BananaCompilerParser.MultiContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * @param ctx
     * @return
     */
    @Override
    public String visitInit(BananaCompilerParser.InitContext ctx) {
        if (!variables.containsKey(ctx.lval.getText())) {
            variables.put(ctx.lval.getText(), variables.size());
        }
        return visitChildren(ctx) + "fstore " + variables.get(ctx.lval.getText()) + System.lineSeparator();
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitPrint(BananaCompilerParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitCalc(BananaCompilerParser.CalcContext ctx) {
        String children = visitChildren(ctx); // Load the operands
        String mid = ctx.midop.getText();
        if(mid.equals("+"))
            mid = "fadd";
        else if(mid.equals("-"))
            mid = "fsub";
        else if(mid.equals("*"))
            mid = "fmul";
        else if(mid.equals("/"))
            mid = "fdiv";
        else
            errorMessage = "Error: Invalid math operation";

        return children + mid + System.lineSeparator();
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitParenthesis(BananaCompilerParser.ParenthesisContext ctx) {
        return super.visitParenthesis(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
     public String visitNum(@NotNull BananaCompilerParser.NumContext ctx) {
        String number = ctx.getText();
        if (!ctx.getText().contains("."))
            number += ".0";
        return ("ldc "+ number + System.lineSeparator());
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitVar(@NotNull BananaCompilerParser.VarContext ctx) {
        if (!variables.containsKey(ctx.getText()))
            errorMessage = "Error: Accessing undeclared variable";
        return "fload " + variables.get(ctx.getText()) + System.lineSeparator();
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

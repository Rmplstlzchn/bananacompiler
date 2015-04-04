package com.bananaforscale;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created for bananaforscale on 26.03.2015.
 */
public class BananaVisitor extends BananaCompilerBaseVisitor<String> {
    private String errorMessage = "";
    private int lineNumber = 1;
    private Map<String, Integer> variables = new HashMap<String, Integer>();

    /**
     * This method checks is used to check whether an error message is set or not.
     * @return: an error message if set, else an empty String
     */
    public String getErrorMessage() {
        if (!errorMessage.equals("")) {
            return ("Error in line " + lineNumber + ": " + errorMessage);
        } else {
            return "";
        }
    }

    /**
     * This method visits the starting rule of the Banan4S grammar and visits the children.
     * @param ctx: the context is given as input parameter
     * @return: the result given by the visited children
     */
    @Override
    public String visitProg(BananaCompilerParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * This method visits a command consisting of a math operation with at least 3 operands and visits the children.
     * @param ctx: the context is given as input parameter
     * @return: the result given by the visited children
     */
    @Override
    public String visitMulti(BananaCompilerParser.MultiContext ctx) {
        if(errorMessage.equals("")) {
            lineNumber++;
            return visitChildren(ctx);
        }
        return "";
    }

    /**
     * This method visits the initialitation of a variable which stores a new value for this variable.
     * If the variable does not exist yet, it is created in the table of variables beforehand.
     * @param ctx: the context is given as input parameter
     * @return: jasmin code to store the value to the according variable
     */
    @Override
    public String visitInit(BananaCompilerParser.InitContext ctx) {
        if (!variables.containsKey(ctx.lval.getText())) {
            variables.put(ctx.lval.getText(), variables.size());
        }
        return visitChildren(ctx) + System.lineSeparator() + "fstore " + variables.get(ctx.lval.getText());
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
     * This method visits the calculation of a math operation where the operand stands in the middle.
     * This method does not do a calculation, but it creates the jasmin code which can perform the math operation
     * @param ctx: the context is given as input parameter
     * @return: a String consisting of both children and the midoperation symbol written in jasmin code
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
            errorMessage = "Invalid math operation";

        return children  + System.lineSeparator() + mid;
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
     * This method visits a number and returns its value.
     * @param ctx: the context is given as input parameter
     * @return: jasmin code which loads the according number on the stack
     */
    @Override
     public String visitNum(@NotNull BananaCompilerParser.NumContext ctx) {
        String number = ctx.getText();
        if (!ctx.getText().contains("."))
            number += ".0";
        return ("ldc "+ number);
    }

    /**
     * This method visits a variable and returns its value (if given).
     * If the variable does not exist, an error is given.
     * @param ctx: the context is given as input parameter
     * @return: either the value of the variable or nothing if the variable does not exist
     */
    @Override
    public String visitVar(@NotNull BananaCompilerParser.VarContext ctx) {
        if (!variables.containsKey(ctx.getText())) {
            errorMessage = "Accessing undeclared variable";
            return "";
        }
        return "fload " + variables.get(ctx.getText());
    }

    /**
     * This method combines two Strings
     * @param aggregate: first String to be combined
     * @param nextResult: second String to be combined
     * @return: if one of the Strings is null, the other one is returned, else the combined String is returned
     */
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null)
            return nextResult;
        else if (nextResult == null)
            return aggregate;
        return aggregate + System.lineSeparator() + nextResult;
    }
}

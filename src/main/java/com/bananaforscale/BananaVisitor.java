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

    @Override
    public String visitPlus(@NotNull BananaCompilerParser.PlusContext ctx) {
        return "IADD";
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

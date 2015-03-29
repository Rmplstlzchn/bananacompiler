package com.bananaforscale;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by franzj on 26.03.2015.
 */
public class BananaVisitor extends BananaCompilerBaseVisitor<String> {
    @Override
    public String visitProg(@NotNull BananaCompilerParser.ProgContext ctx) {
        visitChildren(ctx);
        if (ctx.getChildCount() == 1) {
            System.out.println(ctx.getChild(0));
        } else {
            System.out.println(ctx.getChild(2));
        }
        return null;
    }

}

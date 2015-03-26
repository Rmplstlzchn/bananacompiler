// Generated from C:/Users/franzj/Documents/Software Engineering/BananaCompiler/src/main/antlr4/com/bananaforscale\BananaCompiler.g4 by ANTLR 4.5
package com.bananaforscale;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BananaCompilerParser}.
 */
public interface BananaCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull BananaCompilerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull BananaCompilerParser.ProgContext ctx);
}
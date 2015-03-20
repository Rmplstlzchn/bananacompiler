// Generated from com\bananaforscale\BananaCompiler.g4 by ANTLR 4.3
package com.bananaforscale;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BananaCompilerParser}.
 */
public interface BananaCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull BananaCompilerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull BananaCompilerParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#ausdruck}.
	 * @param ctx the parse tree
	 */
	void enterAusdruck(@NotNull BananaCompilerParser.AusdruckContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#ausdruck}.
	 * @param ctx the parse tree
	 */
	void exitAusdruck(@NotNull BananaCompilerParser.AusdruckContext ctx);
}
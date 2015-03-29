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
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BananaCompilerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BananaCompilerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull BananaCompilerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull BananaCompilerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull BananaCompilerParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull BananaCompilerParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#mathoperation}.
	 * @param ctx the parse tree
	 */
	void enterMathoperation(@NotNull BananaCompilerParser.MathoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#mathoperation}.
	 * @param ctx the parse tree
	 */
	void exitMathoperation(@NotNull BananaCompilerParser.MathoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void enterBasicoperand(@NotNull BananaCompilerParser.BasicoperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void exitBasicoperand(@NotNull BananaCompilerParser.BasicoperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull BananaCompilerParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull BananaCompilerParser.OperandContext ctx);
}
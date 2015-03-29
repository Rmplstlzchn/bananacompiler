// Generated from C:/Users/franzj/Documents/Software Engineering/BananaCompiler/src/main/antlr4/com/bananaforscale\BananaCompiler.g4 by ANTLR 4.5
package com.bananaforscale;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BananaCompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BananaCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BananaCompilerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull BananaCompilerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull BananaCompilerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BananaCompilerParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull BananaCompilerParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BananaCompilerParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull BananaCompilerParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BananaCompilerParser#mathoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathoperation(@NotNull BananaCompilerParser.MathoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicoperand(@NotNull BananaCompilerParser.BasicoperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(@NotNull BananaCompilerParser.OperandContext ctx);
}
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
	 * Visit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(@NotNull BananaCompilerParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code define}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(@NotNull BananaCompilerParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calc}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(@NotNull BananaCompilerParser.CalcContext ctx);
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
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull BananaCompilerParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull BananaCompilerParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Times}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(@NotNull BananaCompilerParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Through}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrough(@NotNull BananaCompilerParser.ThroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull BananaCompilerParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(@NotNull BananaCompilerParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(@NotNull BananaCompilerParser.ConstContext ctx);
}
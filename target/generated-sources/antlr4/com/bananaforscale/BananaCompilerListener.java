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
	 * Enter a parse tree produced by the {@code declare}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(@NotNull BananaCompilerParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(@NotNull BananaCompilerParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code define}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDefine(@NotNull BananaCompilerParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code define}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDefine(@NotNull BananaCompilerParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calc}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull BananaCompilerParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calc}
	 * labeled alternative in {@link BananaCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull BananaCompilerParser.CalcContext ctx);
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
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull BananaCompilerParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull BananaCompilerParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull BananaCompilerParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull BananaCompilerParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Times}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void enterTimes(@NotNull BananaCompilerParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Times}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void exitTimes(@NotNull BananaCompilerParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Through}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void enterThrough(@NotNull BananaCompilerParser.ThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Through}
	 * labeled alternative in {@link BananaCompilerParser#basicoperand}.
	 * @param ctx the parse tree
	 */
	void exitThrough(@NotNull BananaCompilerParser.ThroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull BananaCompilerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull BananaCompilerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull BananaCompilerParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull BananaCompilerParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterConst(@NotNull BananaCompilerParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link BananaCompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitConst(@NotNull BananaCompilerParser.ConstContext ctx);
}
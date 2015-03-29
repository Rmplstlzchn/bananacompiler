// Generated from C:/Users/franzj/Documents/Software Engineering/BananaCompiler/src/main/antlr4/com/bananaforscale\BananaCompiler.g4 by ANTLR 4.5
package com.bananaforscale;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BananaCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CONSTANT=7, NUMBER=8, 
		VARIABLE=9, WHITESPACE=10;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_declaration = 2, RULE_definition = 3, 
		RULE_mathoperation = 4, RULE_basicoperand = 5, RULE_operand = 6;
	public static final String[] ruleNames = {
		"prog", "expression", "declaration", "definition", "mathoperation", "basicoperand", 
		"operand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "CONSTANT", "NUMBER", "VARIABLE", 
		"WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BananaCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BananaCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareContext extends ExpressionContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineContext extends ExpressionContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefineContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalcContext extends ExpressionContext {
		public MathoperationContext mathoperation() {
			return getRuleContext(MathoperationContext.class,0);
		}
		public CalcContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(19);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16); 
				declaration();
				}
				break;
			case 2:
				_localctx = new DefineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17); 
				definition();
				}
				break;
			case 3:
				_localctx = new CalcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(18); 
				mathoperation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(BananaCompilerParser.VARIABLE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			match(T__0);
			setState(22); 
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public Token lval;
		public Token rval;
		public TerminalNode VARIABLE() { return getToken(BananaCompilerParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(BananaCompilerParser.NUMBER, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(24); 
				match(T__0);
				}
			}

			setState(27); 
			((DefinitionContext)_localctx).lval = match(VARIABLE);
			setState(28); 
			match(T__1);
			setState(29); 
			((DefinitionContext)_localctx).rval = match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathoperationContext extends ParserRuleContext {
		public OperandContext lval;
		public OperandContext rval;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public BasicoperandContext basicoperand() {
			return getRuleContext(BasicoperandContext.class,0);
		}
		public MathoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterMathoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitMathoperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitMathoperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathoperationContext mathoperation() throws RecognitionException {
		MathoperationContext _localctx = new MathoperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mathoperation);
		try {
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); 
				operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); 
				((MathoperationContext)_localctx).lval = operand();
				setState(33); 
				basicoperand();
				setState(34); 
				((MathoperationContext)_localctx).rval = operand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicoperandContext extends ParserRuleContext {
		public BasicoperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicoperand; }
	 
		public BasicoperandContext() { }
		public void copyFrom(BasicoperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimesContext extends BasicoperandContext {
		public TimesContext(BasicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThroughContext extends BasicoperandContext {
		public ThroughContext(BasicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends BasicoperandContext {
		public PlusContext(BasicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends BasicoperandContext {
		public MinusContext(BasicoperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicoperandContext basicoperand() throws RecognitionException {
		BasicoperandContext _localctx = new BasicoperandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_basicoperand);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38); 
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39); 
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new TimesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40); 
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new ThroughContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41); 
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstContext extends OperandContext {
		public TerminalNode CONSTANT() { return getToken(BananaCompilerParser.CONSTANT, 0); }
		public ConstContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends OperandContext {
		public TerminalNode VARIABLE() { return getToken(BananaCompilerParser.VARIABLE, 0); }
		public VarContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends OperandContext {
		public TerminalNode NUMBER() { return getToken(BananaCompilerParser.NUMBER, 0); }
		public NumContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BananaCompilerVisitor ) return ((BananaCompilerVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operand);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44); 
				match(VARIABLE);
				}
				break;
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45); 
				match(NUMBER);
				}
				break;
			case CONSTANT:
				_localctx = new ConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46); 
				match(CONSTANT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\4\3\4\3\4\3\5\5\5\34\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\'\n\6\3\7\3\7\3\7\3\7\5\7-\n\7\3\b\3\b\3\b\5\b\62\n\b\3\b\2\2\t\2\4"+
		"\6\b\n\f\16\2\2\65\2\20\3\2\2\2\4\25\3\2\2\2\6\27\3\2\2\2\b\33\3\2\2\2"+
		"\n&\3\2\2\2\f,\3\2\2\2\16\61\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\26"+
		"\5\6\4\2\23\26\5\b\5\2\24\26\5\n\6\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24"+
		"\3\2\2\2\26\5\3\2\2\2\27\30\7\3\2\2\30\31\7\13\2\2\31\7\3\2\2\2\32\34"+
		"\7\3\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\13\2\2\36\37"+
		"\7\4\2\2\37 \7\n\2\2 \t\3\2\2\2!\'\5\16\b\2\"#\5\16\b\2#$\5\f\7\2$%\5"+
		"\16\b\2%\'\3\2\2\2&!\3\2\2\2&\"\3\2\2\2\'\13\3\2\2\2(-\7\5\2\2)-\7\6\2"+
		"\2*-\7\7\2\2+-\7\b\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\r\3\2"+
		"\2\2.\62\7\13\2\2/\62\7\n\2\2\60\62\7\t\2\2\61.\3\2\2\2\61/\3\2\2\2\61"+
		"\60\3\2\2\2\62\17\3\2\2\2\7\25\33&,\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
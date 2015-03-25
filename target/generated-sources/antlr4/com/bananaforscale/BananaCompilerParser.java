// Generated from com\bananaforscale\BananaCompiler.g4 by ANTLR 4.3
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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, ZAHL=4, WHITE=5;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'-'", "'('", "ZAHL", "WHITE"
	};
	public static final int
		RULE_start = 0, RULE_ausdruck = 1;
	public static final String[] ruleNames = {
		"start", "ausdruck"
	};

	@Override
	public String getGrammarFileName() { return "BananaCompiler.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
	public static class StartContext extends ParserRuleContext {
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); ausdruck(0);
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

	public static class AusdruckContext extends ParserRuleContext {
		public TerminalNode ZAHL() { return getToken(BananaCompilerParser.ZAHL, 0); }
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausdruck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).enterAusdruck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BananaCompilerListener ) ((BananaCompilerListener)listener).exitAusdruck(this);
		}
	}

	public final AusdruckContext ausdruck() throws RecognitionException {
		return ausdruck(0);
	}

	private AusdruckContext ausdruck(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AusdruckContext _localctx = new AusdruckContext(_ctx, _parentState);
		AusdruckContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_ausdruck, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(7); match(T__0);
				setState(8); ausdruck(0);
				setState(9); match(T__2);
				}
				break;
			case ZAHL:
				{
				setState(11); match(ZAHL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AusdruckContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
					setState(14);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(15); match(T__1);
					setState(16); ausdruck(4);
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return ausdruck_sempred((AusdruckContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ausdruck_sempred(AusdruckContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\31\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\17\n\3\3\3\3\3\3\3\7\3\24\n\3"+
		"\f\3\16\3\27\13\3\3\3\2\3\4\4\2\4\2\2\30\2\6\3\2\2\2\4\16\3\2\2\2\6\7"+
		"\5\4\3\2\7\3\3\2\2\2\b\t\b\3\1\2\t\n\7\5\2\2\n\13\5\4\3\2\13\f\7\3\2\2"+
		"\f\17\3\2\2\2\r\17\7\6\2\2\16\b\3\2\2\2\16\r\3\2\2\2\17\25\3\2\2\2\20"+
		"\21\f\5\2\2\21\22\7\4\2\2\22\24\5\4\3\6\23\20\3\2\2\2\24\27\3\2\2\2\25"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\25\3\2\2\2\4\16\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
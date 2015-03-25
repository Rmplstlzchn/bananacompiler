// Generated from com\bananaforscale\BananaCompiler.g4 by ANTLR 4.3
package com.bananaforscale;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BananaCompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, ZAHL=4, WHITE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "ZAHL", "WHITE"
	};


	public BananaCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BananaCompiler.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7$\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5\26"+
		"\n\5\f\5\16\5\31\13\5\3\5\5\5\34\n\5\3\6\6\6\37\n\6\r\6\16\6 \3\6\3\6"+
		"\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\6\3\2\63;\3\2\62;\3\2\62\62\4\2\13\f\17"+
		"\17&\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r"+
		"\3\2\2\2\5\17\3\2\2\2\7\21\3\2\2\2\t\33\3\2\2\2\13\36\3\2\2\2\r\16\7+"+
		"\2\2\16\4\3\2\2\2\17\20\7/\2\2\20\6\3\2\2\2\21\22\7*\2\2\22\b\3\2\2\2"+
		"\23\27\t\2\2\2\24\26\t\3\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2"+
		"\27\30\3\2\2\2\30\34\3\2\2\2\31\27\3\2\2\2\32\34\t\4\2\2\33\23\3\2\2\2"+
		"\33\32\3\2\2\2\34\n\3\2\2\2\35\37\t\5\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36"+
		"\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\b\6\2\2#\f\3\2\2\2\6\2\27\33 \3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
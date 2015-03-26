// Generated from C:/Users/franzj/Documents/Software Engineering/BananaCompiler/src/main/antlr4/com/bananaforscale\BananaCompiler.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXPRESSION=1, DECLARATION=2, DEFINITION=3, MATHOPERATION=4, BASICOPERATION=5, 
		OPERAND=6, CONSTANT=7, NUMBER=8, VARIABLE=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EXPRESSION", "DECLARATION", "DEFINITION", "MATHOPERATION", "BASICOPERATION", 
		"OPERAND", "CONSTANT", "NUMBER", "VARIABLE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EXPRESSION", "DECLARATION", "DEFINITION", "MATHOPERATION", "BASICOPERATION", 
		"OPERAND", "CONSTANT", "NUMBER", "VARIABLE"
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


	public BananaCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BananaCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13K\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4$\n\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\7\3\7\3\7\5\7\66\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\6\tA\n\t\r\t\16\tB\3\n\3\n\7\nG\n\n"+
		"\f\n\16\nJ\13\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\6"+
		"\5\2,-//\61\61\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|T\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\3\30\3\2\2\2\5\32\3\2\2\2\7#\3\2\2\2\t.\3\2\2\2"+
		"\13\60\3\2\2\2\r\65\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23D\3\2\2\2\25\31"+
		"\5\5\3\2\26\31\5\7\4\2\27\31\5\t\5\2\30\25\3\2\2\2\30\26\3\2\2\2\30\27"+
		"\3\2\2\2\31\4\3\2\2\2\32\33\7p\2\2\33\34\7g\2\2\34\35\7y\2\2\35\36\3\2"+
		"\2\2\36\37\5\23\n\2\37\6\3\2\2\2 !\7p\2\2!\"\7g\2\2\"$\7y\2\2# \3\2\2"+
		"\2#$\3\2\2\2$%\3\2\2\2%&\5\23\n\2&\'\7?\2\2\'(\5\21\t\2(\b\3\2\2\2)/\5"+
		"\r\7\2*+\5\r\7\2+,\5\13\6\2,-\5\r\7\2-/\3\2\2\2.)\3\2\2\2.*\3\2\2\2/\n"+
		"\3\2\2\2\60\61\t\2\2\2\61\f\3\2\2\2\62\66\5\23\n\2\63\66\5\21\t\2\64\66"+
		"\5\17\b\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\16\3\2\2\2\678"+
		"\7R\2\28>\7K\2\29>\7G\2\2:;\7D\2\2;<\7H\2\2<>\7U\2\2=\67\3\2\2\2=9\3\2"+
		"\2\2=:\3\2\2\2>\20\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3"+
		"\2\2\2C\22\3\2\2\2DH\t\4\2\2EG\t\5\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2H"+
		"I\3\2\2\2I\24\3\2\2\2JH\3\2\2\2\n\2\30#.\65=BH\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Nottex.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NottexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_MARKER=1, COMMA=2, FUNCTION_MARKER=3, COLON=4, LPAREN=5, RPAREN=6, 
		LBRACE=7, RBRACE=8, ESCAPED_QUOTE=9, ESCAPED_BACKSLASH=10, BACKSLASH=11, 
		QUOTE=12, PLUS=13, MINUS=14, MULTIP=15, DIVIS=16, WS=17, NUMBER=18, ALPHA=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TAG_MARKER", "COMMA", "FUNCTION_MARKER", "COLON", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "ESCAPED_QUOTE", "ESCAPED_BACKSLASH", "BACKSLASH", 
		"QUOTE", "PLUS", "MINUS", "MULTIP", "DIVIS", "WS", "NUMBER", "ALPHA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "',,'", "','", "'::'", "':'", "'('", "')'", "'{'", "'}'", "'\\\"'", 
		"'\\\\'", "'\\'", "'\"'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TAG_MARKER", "COMMA", "FUNCTION_MARKER", "COLON", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "ESCAPED_QUOTE", "ESCAPED_BACKSLASH", "BACKSLASH", 
		"QUOTE", "PLUS", "MINUS", "MULTIP", "DIVIS", "WS", "NUMBER", "ALPHA"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public NottexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nottex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\7\23S\n\23"+
		"\f\23\16\23V\13\23\5\23X\n\23\3\23\3\23\6\23\\\n\23\r\23\16\23]\5\23`"+
		"\n\23\3\24\6\24c\n\24\r\24\16\24d\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\5"+
		"\2\13\f\17\17\"\"\3\2\63;\3\2\62;\f\2\13\f\17\17\"\"$$*/\61\61<<^^}}\177"+
		"\177j\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\61"+
		"\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2"+
		"\2\2\25>\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35G\3\2\2\2\37I\3"+
		"\2\2\2!K\3\2\2\2#M\3\2\2\2%W\3\2\2\2\'b\3\2\2\2)*\7.\2\2*+\7.\2\2+\4\3"+
		"\2\2\2,-\7.\2\2-\6\3\2\2\2./\7<\2\2/\60\7<\2\2\60\b\3\2\2\2\61\62\7<\2"+
		"\2\62\n\3\2\2\2\63\64\7*\2\2\64\f\3\2\2\2\65\66\7+\2\2\66\16\3\2\2\2\67"+
		"8\7}\2\28\20\3\2\2\29:\7\177\2\2:\22\3\2\2\2;<\7^\2\2<=\7$\2\2=\24\3\2"+
		"\2\2>?\7^\2\2?@\7^\2\2@\26\3\2\2\2AB\7^\2\2B\30\3\2\2\2CD\7$\2\2D\32\3"+
		"\2\2\2EF\7-\2\2F\34\3\2\2\2GH\7/\2\2H\36\3\2\2\2IJ\7,\2\2J \3\2\2\2KL"+
		"\7\61\2\2L\"\3\2\2\2MN\t\2\2\2N$\3\2\2\2OX\7\62\2\2PT\t\3\2\2QS\t\4\2"+
		"\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WO\3\2\2"+
		"\2WP\3\2\2\2X_\3\2\2\2Y[\7\60\2\2Z\\\t\4\2\2[Z\3\2\2\2\\]\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^`\3\2\2\2_Y\3\2\2\2_`\3\2\2\2`&\3\2\2\2ac\n\5\2\2ba\3"+
		"\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e(\3\2\2\2\b\2TW]_d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
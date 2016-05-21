// Generated from NoTTeX.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NoTTeXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG=1, FUN=2, LBRACE=3, RBRACE=4, LPAREN=5, RPAREN=6, ARG_SEPARATOR=7, 
		FUN_IDENT=8, TAG_IDENT=9, NUMBER=10, LETTER=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TAG", "FUN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "ARG_SEPARATOR", 
		"FUN_IDENT", "TAG_IDENT", "NUMBER", "LETTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "',,'", "'::'", "'{'", "'}'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TAG", "FUN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "ARG_SEPARATOR", 
		"FUN_IDENT", "TAG_IDENT", "NUMBER", "LETTER", "WS"
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


	public NoTTeXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NoTTeX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\7\7)\n\7\f\7\16\7,\13\7\3\7\3\7\3\b\7\b\61\n\b\f\b\16\b\64\13\b"+
		"\3\b\3\b\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\t\3\t\6\tA\n\t\r\t\16\tB\3"+
		"\t\7\tF\n\t\f\t\16\tI\13\t\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\t\6\tS\n"+
		"\t\r\t\16\tT\7\tW\n\t\f\t\16\tZ\13\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3"+
		"\n\6\nd\n\n\r\n\16\ne\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\7\np\n\n\f\n"+
		"\16\ns\13\n\3\n\6\nv\n\n\r\n\16\nw\7\nz\n\n\f\n\16\n}\13\n\3\n\7\n\u0080"+
		"\n\n\f\n\16\n\u0083\13\n\3\13\6\13\u0086\n\13\r\13\16\13\u0087\3\13\3"+
		"\13\6\13\u008c\n\13\r\13\16\13\u008d\3\13\3\13\3\13\6\13\u0093\n\13\r"+
		"\13\16\13\u0094\5\13\u0097\n\13\3\f\3\f\3\r\6\r\u009c\n\r\r\r\16\r\u009d"+
		"\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\6\6\2\62;C\\aac|\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\u00b5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r"+
		"*\3\2\2\2\17\62\3\2\2\2\21>\3\2\2\2\23a\3\2\2\2\25\u0096\3\2\2\2\27\u0098"+
		"\3\2\2\2\31\u009b\3\2\2\2\33\34\7.\2\2\34\35\7.\2\2\35\4\3\2\2\2\36\37"+
		"\7<\2\2\37 \7<\2\2 \6\3\2\2\2!\"\7}\2\2\"\b\3\2\2\2#$\7\177\2\2$\n\3\2"+
		"\2\2%&\7*\2\2&\f\3\2\2\2\')\5\31\r\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+"+
		"\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7+\2\2.\16\3\2\2\2/\61\5\31\r\2\60/\3\2"+
		"\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2"+
		"\2\2\65\66\7=\2\2\66\67\7=\2\2\67;\3\2\2\28:\5\31\r\298\3\2\2\2:=\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<\20\3\2\2\2=;\3\2\2\2>@\5\5\3\2?A\t\2\2\2@?\3"+
		"\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CX\3\2\2\2DF\5\31\r\2ED\3\2\2\2FI"+
		"\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\7.\2\2KM\5\31\r\2L"+
		"K\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QS\t\2\2\2"+
		"RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VG\3\2\2\2WZ\3\2\2\2"+
		"XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\31\r\2\\[\3\2\2\2]`\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_\22\3\2\2\2`^\3\2\2\2ac\5\3\2\2bd\t\2\2\2cb\3"+
		"\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f{\3\2\2\2gi\5\31\r\2hg\3\2\2\2il"+
		"\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mq\7.\2\2np\5\31\r\2o"+
		"n\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\t\2\2\2"+
		"ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yj\3\2\2\2z}\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\u0081\3\2\2\2}{\3\2\2\2~\u0080\5\31\r\2\177~\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\24"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\7\60\2\2\u008a\u008c\t\3\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0097\3\2"+
		"\2\2\u008f\u0097\t\3\2\2\u0090\u0092\t\4\2\2\u0091\u0093\t\3\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0085\3\2\2\2\u0096\u008f\3\2\2\2\u0096"+
		"\u0090\3\2\2\2\u0097\26\3\2\2\2\u0098\u0099\13\2\2\2\u0099\30\3\2\2\2"+
		"\u009a\u009c\t\5\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\r\2\2\u00a0"+
		"\32\3\2\2\2\27\2*\62;BGNTX^ejqw{\u0081\u0087\u008d\u0094\u0096\u009d\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
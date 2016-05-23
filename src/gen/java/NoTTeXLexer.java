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
		T__0=1, T__1=2, T__2=3, TAG=4, FUN=5, LBRACE=6, RBRACE=7, LPAREN=8, RPAREN=9, 
		ARG_SEPARATOR=10, FUN_IDENT=11, TAG_IDENT=12, WORD=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "TAG", "FUN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
		"ARG_SEPARATOR", "FUN_IDENT", "TAG_IDENT", "WORD", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "':'", "',,'", "'::'", "'{'", "'}'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "TAG", "FUN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
		"ARG_SEPARATOR", "FUN_IDENT", "TAG_IDENT", "WORD", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\7\n\63\n\n\f\n\16\n"+
		"\66\13\n\3\n\3\n\3\13\7\13;\n\13\f\13\16\13>\13\13\3\13\3\13\3\13\3\13"+
		"\7\13D\n\13\f\13\16\13G\13\13\3\f\3\f\6\fK\n\f\r\f\16\fL\3\f\7\fP\n\f"+
		"\f\f\16\fS\13\f\3\f\3\f\7\fW\n\f\f\f\16\fZ\13\f\3\f\6\f]\n\f\r\f\16\f"+
		"^\7\fa\n\f\f\f\16\fd\13\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\r\3\r\6\rn\n\r"+
		"\r\r\16\ro\3\r\7\rs\n\r\f\r\16\rv\13\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r"+
		"\3\r\6\r\u0080\n\r\r\r\16\r\u0081\7\r\u0084\n\r\f\r\16\r\u0087\13\r\3"+
		"\r\7\r\u008a\n\r\f\r\16\r\u008d\13\r\3\16\6\16\u0090\n\16\r\16\16\16\u0091"+
		"\3\17\6\17\u0095\n\17\r\17\16\17\u0096\3\17\3\17\2\2\20\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\6\2\62;"+
		"C\\aac|\7\2*+..<=}}\177\177\5\2\13\f\17\17\"\"\u00aa\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13("+
		"\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\64\3\2\2\2\25<\3\2\2\2"+
		"\27H\3\2\2\2\31k\3\2\2\2\33\u008f\3\2\2\2\35\u0094\3\2\2\2\37 \7.\2\2"+
		" \4\3\2\2\2!\"\7=\2\2\"\6\3\2\2\2#$\7<\2\2$\b\3\2\2\2%&\7.\2\2&\'\7.\2"+
		"\2\'\n\3\2\2\2()\7<\2\2)*\7<\2\2*\f\3\2\2\2+,\7}\2\2,\16\3\2\2\2-.\7\177"+
		"\2\2.\20\3\2\2\2/\60\7*\2\2\60\22\3\2\2\2\61\63\5\35\17\2\62\61\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2"+
		"\2\678\7+\2\28\24\3\2\2\29;\5\35\17\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<="+
		"\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7=\2\2@A\7=\2\2AE\3\2\2\2BD\5\35\17\2C"+
		"B\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2GE\3\2\2\2HJ\5\13\6"+
		"\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2Mb\3\2\2\2NP\5\35"+
		"\17\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TX\7"+
		".\2\2UW\5\35\17\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2Z"+
		"X\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2"+
		"\2`Q\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2\2db\3\2\2\2eg\5\35"+
		"\17\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\30\3\2\2\2jh\3\2\2\2km"+
		"\5\t\5\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\u0085\3\2"+
		"\2\2qs\5\35\17\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3"+
		"\2\2\2w{\7.\2\2xz\5\35\17\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083t\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008a\5\35\17\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\32\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008e\u0090\n\3\2\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\17\2\2\u0099"+
		"\36\3\2\2\2\24\2\64<ELQX^bhot{\u0081\u0085\u008b\u0091\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
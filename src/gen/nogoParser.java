// Generated from C:/Users/Kaspar/Dropbox/CODE/Java/akt2016/nottex/src/main/antlr\nogo.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NL=10;
	public static final int
		RULE_markup_text = 0, RULE_word = 1, RULE_function_call = 2, RULE_tag_use = 3, 
		RULE_plain = 4;
	public static final String[] ruleNames = {
		"markup_text", "word", "function_call", "tag_use", "plain"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "';;'", "'iden'", "'('", "')'", "',,'", "'{'", "'}'", "'a'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NL"
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

	@Override
	public String getGrammarFileName() { return "nogo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Markup_textContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Markup_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markup_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).enterMarkup_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).exitMarkup_text(this);
		}
	}

	public final Markup_textContext markup_text() throws RecognitionException {
		Markup_textContext _localctx = new Markup_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_markup_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			word();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(11);
					match(T__0);
					}
					}
					setState(14); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(16);
				word();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class WordContext extends ParserRuleContext {
		public Tag_useContext tag_use() {
			return getRuleContext(Tag_useContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode NL() { return getToken(nogoParser.NL, 0); }
		public PlainContext plain() {
			return getRuleContext(PlainContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_word);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				tag_use();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				function_call();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(NL);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				plain();
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

	public static class Function_callContext extends ParserRuleContext {
		public Markup_textContext markup_text() {
			return getRuleContext(Markup_textContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__1);
			setState(29);
			match(T__2);
			setState(30);
			match(T__3);
			setState(31);
			markup_text();
			setState(32);
			match(T__4);
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

	public static class Tag_useContext extends ParserRuleContext {
		public Markup_textContext markup_text() {
			return getRuleContext(Markup_textContext.class,0);
		}
		public Tag_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).enterTag_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).exitTag_use(this);
		}
	}

	public final Tag_useContext tag_use() throws RecognitionException {
		Tag_useContext _localctx = new Tag_useContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__5);
			setState(35);
			match(T__2);
			setState(36);
			match(T__6);
			setState(37);
			markup_text();
			setState(38);
			match(T__7);
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

	public static class PlainContext extends ParserRuleContext {
		public PlainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).enterPlain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nogoListener ) ((nogoListener)listener).exitPlain(this);
		}
	}

	public final PlainContext plain() throws RecognitionException {
		PlainContext _localctx = new PlainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_plain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(40);
					match(T__8);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\7\2\24"+
		"\n\2\f\2\16\2\27\13\2\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6,\n\6\r\6\16\6-\3\6\3-\2\7\2\4\6\b\n"+
		"\2\2\60\2\f\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b$\3\2\2\2\n+\3\2\2\2\f"+
		"\25\5\4\3\2\r\17\7\3\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21"+
		"\3\2\2\2\21\22\3\2\2\2\22\24\5\4\3\2\23\16\3\2\2\2\24\27\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\35\5\b\5\2\31\35"+
		"\5\6\4\2\32\35\7\f\2\2\33\35\5\n\6\2\34\30\3\2\2\2\34\31\3\2\2\2\34\32"+
		"\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\4\2\2\37 \7\5\2\2 !\7\6\2"+
		"\2!\"\5\2\2\2\"#\7\7\2\2#\7\3\2\2\2$%\7\b\2\2%&\7\5\2\2&\'\7\t\2\2\'("+
		"\5\2\2\2()\7\n\2\2)\t\3\2\2\2*,\7\13\2\2+*\3\2\2\2,-\3\2\2\2-.\3\2\2\2"+
		"-+\3\2\2\2.\13\3\2\2\2\6\20\25\34-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
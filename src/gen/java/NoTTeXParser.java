// Generated from NoTTeX.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NoTTeXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG=1, FUN=2, LBRACE=3, RBRACE=4, LPAREN=5, RPAREN=6, ARG_SEPARATOR=7, 
		FUN_IDENT=8, TAG_IDENT=9, NUMBER=10, LETTER=11, WS=12;
	public static final int
		RULE_tag = 0, RULE_content = 1, RULE_function = 2, RULE_function_args = 3, 
		RULE_function_arg = 4, RULE_text = 5, RULE_number = 6, RULE_string = 7;
	public static final String[] ruleNames = {
		"tag", "content", "function", "function_args", "function_arg", "text", 
		"number", "string"
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

	@Override
	public String getGrammarFileName() { return "NoTTeX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NoTTeXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TagContext extends ParserRuleContext {
		public TerminalNode TAG_IDENT() { return getToken(NoTTeXParser.TAG_IDENT, 0); }
		public TerminalNode LBRACE() { return getToken(NoTTeXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NoTTeXParser.RBRACE, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(TAG_IDENT);
			setState(17);
			match(LBRACE);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUN_IDENT) | (1L << TAG_IDENT) | (1L << NUMBER) | (1L << LETTER))) != 0)) {
				{
				{
				setState(18);
				content();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(RBRACE);
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

	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContentAsTextContext extends ContentContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ContentAsTextContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterContentAsText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitContentAsText(this);
		}
	}
	public static class ContentAsFunctionContext extends ContentContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ContentAsFunctionContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterContentAsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitContentAsFunction(this);
		}
	}
	public static class ContentAsTagContext extends ContentContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public ContentAsTagContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterContentAsTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitContentAsTag(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(29);
			switch (_input.LA(1)) {
			case TAG_IDENT:
				_localctx = new ContentAsTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				tag();
				}
				break;
			case FUN_IDENT:
				_localctx = new ContentAsFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				function();
				}
				break;
			case NUMBER:
			case LETTER:
				_localctx = new ContentAsTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				text();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUN_IDENT() { return getToken(NoTTeXParser.FUN_IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(NoTTeXParser.LPAREN, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NoTTeXParser.RPAREN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(FUN_IDENT);
			setState(32);
			match(LPAREN);
			setState(33);
			function_args();
			setState(34);
			match(RPAREN);
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

	public static class Function_argsContext extends ParserRuleContext {
		public List<Function_argContext> function_arg() {
			return getRuleContexts(Function_argContext.class);
		}
		public Function_argContext function_arg(int i) {
			return getRuleContext(Function_argContext.class,i);
		}
		public List<TerminalNode> ARG_SEPARATOR() { return getTokens(NoTTeXParser.ARG_SEPARATOR); }
		public TerminalNode ARG_SEPARATOR(int i) {
			return getToken(NoTTeXParser.ARG_SEPARATOR, i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterFunction_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitFunction_args(this);
		}
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUN_IDENT) | (1L << TAG_IDENT) | (1L << NUMBER) | (1L << LETTER))) != 0)) {
				{
				setState(36);
				function_arg();
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARG_SEPARATOR) {
				{
				{
				setState(39);
				match(ARG_SEPARATOR);
				setState(40);
				function_arg();
				}
				}
				setState(45);
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

	public static class Function_argContext extends ParserRuleContext {
		public Function_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arg; }
	 
		public Function_argContext() { }
		public void copyFrom(Function_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgTextContext extends Function_argContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ArgTextContext(Function_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterArgText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitArgText(this);
		}
	}
	public static class ArgTagContext extends Function_argContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public ArgTagContext(Function_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterArgTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitArgTag(this);
		}
	}
	public static class ArgFunctionContext extends Function_argContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ArgFunctionContext(Function_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterArgFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitArgFunction(this);
		}
	}

	public final Function_argContext function_arg() throws RecognitionException {
		Function_argContext _localctx = new Function_argContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_arg);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case TAG_IDENT:
				_localctx = new ArgTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				tag();
				}
				break;
			case FUN_IDENT:
				_localctx = new ArgFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				function();
				}
				break;
			case NUMBER:
			case LETTER:
				_localctx = new ArgTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				text();
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

	public static class TextContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_text);
		try {
			int _alt;
			setState(61);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(51);
						number();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(54); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(56);
						string();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(59); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NoTTeXParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(NUMBER);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(NoTTeXParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(NoTTeXParser.LETTER, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65);
					match(LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\5\5(\n\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\5\6\64\n\6\3"+
		"\7\6\7\67\n\7\r\7\16\78\3\7\6\7<\n\7\r\7\16\7=\5\7@\n\7\3\b\3\b\3\t\6"+
		"\tE\n\t\r\t\16\tF\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2K\2\22\3\2\2\2\4\37\3"+
		"\2\2\2\6!\3\2\2\2\b\'\3\2\2\2\n\63\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2\20D"+
		"\3\2\2\2\22\23\7\13\2\2\23\27\7\5\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31"+
		"\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33"+
		"\7\6\2\2\33\3\3\2\2\2\34 \5\2\2\2\35 \5\6\4\2\36 \5\f\7\2\37\34\3\2\2"+
		"\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!\"\7\n\2\2\"#\7\7\2\2#$\5\b"+
		"\5\2$%\7\b\2\2%\7\3\2\2\2&(\5\n\6\2\'&\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)*"+
		"\7\t\2\2*,\5\n\6\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2"+
		"/-\3\2\2\2\60\64\5\2\2\2\61\64\5\6\4\2\62\64\5\f\7\2\63\60\3\2\2\2\63"+
		"\61\3\2\2\2\63\62\3\2\2\2\64\13\3\2\2\2\65\67\5\16\b\2\66\65\3\2\2\2\67"+
		"8\3\2\2\28\66\3\2\2\289\3\2\2\29@\3\2\2\2:<\5\20\t\2;:\3\2\2\2<=\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?\66\3\2\2\2?;\3\2\2\2@\r\3\2\2\2AB\7"+
		"\f\2\2B\17\3\2\2\2CE\7\r\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"\21\3\2\2\2\13\27\37\'-\638=?F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
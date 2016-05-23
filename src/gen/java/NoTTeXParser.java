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
		T__0=1, T__1=2, T__2=3, TAG=4, FUN=5, LBRACE=6, RBRACE=7, LPAREN=8, RPAREN=9, 
		ARG_SEPARATOR=10, FUN_IDENT=11, TAG_IDENT=12, WORD=13, WS=14;
	public static final int
		RULE_tag = 0, RULE_content = 1, RULE_function = 2, RULE_function_args = 3, 
		RULE_function_arg = 4, RULE_text = 5, RULE_string = 6, RULE_limited = 7;
	public static final String[] ruleNames = {
		"tag", "content", "function", "function_args", "function_arg", "text", 
		"string", "limited"
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
		public List<TerminalNode> WS() { return getTokens(NoTTeXParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NoTTeXParser.WS, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(TAG_IDENT);
			setState(17);
			match(LBRACE);
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18);
					match(WS);
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LPAREN) | (1L << RPAREN) | (1L << FUN_IDENT) | (1L << TAG_IDENT) | (1L << WORD))) != 0)) {
				{
				{
				setState(24);
				content();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(30);
				match(WS);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
			setState(41);
			switch (_input.LA(1)) {
			case TAG_IDENT:
				_localctx = new ContentAsTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				tag();
				}
				break;
			case FUN_IDENT:
				_localctx = new ContentAsFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				function();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case LPAREN:
			case RPAREN:
			case WORD:
				_localctx = new ContentAsTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
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
		public List<TerminalNode> WS() { return getTokens(NoTTeXParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NoTTeXParser.WS, i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(FUN_IDENT);
			setState(44);
			match(LPAREN);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					match(WS);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(51);
			function_args();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(52);
				match(WS);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
			setState(61);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << FUN_IDENT) | (1L << TAG_IDENT) | (1L << WORD))) != 0)) {
				{
				setState(60);
				function_arg();
				}
			}

			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARG_SEPARATOR) {
				{
				{
				setState(63);
				match(ARG_SEPARATOR);
				setState(64);
				function_arg();
				}
				}
				setState(69);
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
		public List<TerminalNode> WORD() { return getTokens(NoTTeXParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(NoTTeXParser.WORD, i);
		}
		public List<Function_argContext> function_arg() {
			return getRuleContexts(Function_argContext.class);
		}
		public Function_argContext function_arg(int i) {
			return getRuleContext(Function_argContext.class,i);
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
		int _la;
		try {
			int _alt;
			setState(95);
			switch (_input.LA(1)) {
			case TAG_IDENT:
				_localctx = new ArgTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				tag();
				}
				break;
			case FUN_IDENT:
				_localctx = new ArgFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				function();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case WORD:
				_localctx = new ArgTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
					{
					{
					setState(72);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78);
						match(WORD);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						function_arg();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(97);
					string();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(NoTTeXParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(NoTTeXParser.WORD, i);
		}
		public List<LimitedContext> limited() {
			return getRuleContexts(LimitedContext.class);
		}
		public LimitedContext limited(int i) {
			return getRuleContext(LimitedContext.class,i);
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
		enterRule(_localctx, 12, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(104);
					switch (_input.LA(1)) {
					case WORD:
						{
						setState(102);
						match(WORD);
						}
						break;
					case T__0:
					case T__1:
					case T__2:
					case LPAREN:
					case RPAREN:
						{
						setState(103);
						limited();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class LimitedContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NoTTeXParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NoTTeXParser.RPAREN, 0); }
		public LimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterLimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitLimited(this);
		}
	}

	public final LimitedContext limited() throws RecognitionException {
		LimitedContext _localctx = new LimitedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LPAREN) | (1L << RPAREN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\7\4\61\n\4\f\4"+
		"\16\4\64\13\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\5\5@\n\5\3\5"+
		"\3\5\7\5D\n\5\f\5\16\5G\13\5\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\6"+
		"\6R\n\6\r\6\16\6S\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\7\6]\n\6\f\6\16\6`\13"+
		"\6\5\6b\n\6\3\7\6\7e\n\7\r\7\16\7f\3\b\3\b\6\bk\n\b\r\b\16\bl\3\t\3\t"+
		"\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\3\5\4\2\3\5\n\13z\2\22\3\2\2\2\4"+
		"+\3\2\2\2\6-\3\2\2\2\b?\3\2\2\2\na\3\2\2\2\fd\3\2\2\2\16j\3\2\2\2\20n"+
		"\3\2\2\2\22\23\7\16\2\2\23\27\7\b\2\2\24\26\7\20\2\2\25\24\3\2\2\2\26"+
		"\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\35\3\2\2\2\31\27\3\2\2\2\32"+
		"\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"#\3\2\2\2\37\35\3\2\2\2 \"\7\20\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3"+
		"\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\t\2\2\'\3\3\2\2\2(,\5\2\2\2),\5\6\4\2"+
		"*,\5\f\7\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\r\2\2.\62\7\n"+
		"\2\2/\61\7\20\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\65\3\2\2\2\64\62\3\2\2\2\659\5\b\5\2\668\7\20\2\2\67\66\3\2\2\2"+
		"8;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\13\2\2=\7\3\2"+
		"\2\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@E\3\2\2\2AB\7\f\2\2BD\5\n\6\2CA\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GE\3\2\2\2Hb\5\2\2\2Ib\5"+
		"\6\4\2JL\t\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3"+
		"\2\2\2PR\7\17\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2UW"+
		"\t\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2["+
		"]\5\n\6\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2aH\3\2\2\2aI\3\2\2\2aM\3\2\2\2b\13\3\2\2\2ce\5\16\b\2dc\3\2\2\2ef\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hk\7\17\2\2ik\5\20\t\2jh\3\2\2\2"+
		"ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2no\t\3\2\2o\21\3\2"+
		"\2\2\22\27\35#+\629?EMSX^afjl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
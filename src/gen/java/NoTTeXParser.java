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
		DOUBLE_COMMA=1, COMMA=2, DOUBLE_COLON=3, COLON=4, LPAREN=5, RPAREN=6, 
		LBRACE=7, RBRACE=8, QUOTE=9, WS=10, ELSE=11;
	public static final int
		RULE_tag = 0, RULE_element = 1, RULE_function_call = 2, RULE_tag_use = 3, 
		RULE_text = 4, RULE_args = 5, RULE_arg = 6, RULE_tags = 7, RULE_string = 8, 
		RULE_ws = 9;
	public static final String[] ruleNames = {
		"tag", "element", "function_call", "tag_use", "text", "args", "arg", "tags", 
		"string", "ws"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "',,'", "','", "'::'", "':'", "'('", "')'", "'{'", "'}'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOUBLE_COMMA", "COMMA", "DOUBLE_COLON", "COLON", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "QUOTE", "WS", "ELSE"
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20);
					element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Tag_useContext tag_use() {
			return getRuleContext(Tag_useContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(28);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				function_call();
				}
				break;
			case DOUBLE_COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				tag_use();
				}
				break;
			case COMMA:
			case COLON:
			case LPAREN:
			case RPAREN:
			case LBRACE:
			case RBRACE:
			case QUOTE:
			case WS:
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode DOUBLE_COLON() { return getToken(NoTTeXParser.DOUBLE_COLON, 0); }
		public TerminalNode ELSE() { return getToken(NoTTeXParser.ELSE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(NoTTeXParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NoTTeXParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(DOUBLE_COLON);
			setState(31);
			match(ELSE);
			setState(32);
			ws();
			setState(33);
			match(LPAREN);
			setState(34);
			ws();
			setState(36);
			_la = _input.LA(1);
			if (_la==DOUBLE_COLON || _la==QUOTE) {
				{
				setState(35);
				args();
				}
			}

			setState(38);
			ws();
			setState(39);
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

	public static class Tag_useContext extends ParserRuleContext {
		public TerminalNode DOUBLE_COMMA() { return getToken(NoTTeXParser.DOUBLE_COMMA, 0); }
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(NoTTeXParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NoTTeXParser.RBRACE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public Tag_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterTag_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitTag_use(this);
		}
	}

	public final Tag_useContext tag_use() throws RecognitionException {
		Tag_useContext _localctx = new Tag_useContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(DOUBLE_COMMA);
			setState(42);
			tags();
			setState(43);
			ws();
			setState(44);
			match(LBRACE);
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(45);
				tag();
				}
				break;
			}
			setState(48);
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(NoTTeXParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(NoTTeXParser.ELSE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NoTTeXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NoTTeXParser.COMMA, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NoTTeXParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NoTTeXParser.COLON, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(NoTTeXParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(NoTTeXParser.QUOTE, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(NoTTeXParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(NoTTeXParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(NoTTeXParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(NoTTeXParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(NoTTeXParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(NoTTeXParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(NoTTeXParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(NoTTeXParser.RBRACE, i);
		}
		public List<TerminalNode> WS() { return getTokens(NoTTeXParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NoTTeXParser.WS, i);
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
		enterRule(_localctx, 8, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << QUOTE) | (1L << WS) | (1L << ELSE))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NoTTeXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NoTTeXParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			arg();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					ws();
					setState(57);
					match(COMMA);
					setState(58);
					ws();
					setState(59);
					arg();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ArgContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				string();
				}
				break;
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				function_call();
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

	public static class TagsContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(NoTTeXParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(NoTTeXParser.ELSE, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NoTTeXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NoTTeXParser.COMMA, i);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitTags(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tags);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ELSE);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					ws();
					setState(72);
					match(COMMA);
					setState(73);
					ws();
					setState(74);
					match(ELSE);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(NoTTeXParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(NoTTeXParser.QUOTE, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(NoTTeXParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(NoTTeXParser.ELSE, i);
		}
		public List<TerminalNode> DOUBLE_COMMA() { return getTokens(NoTTeXParser.DOUBLE_COMMA); }
		public TerminalNode DOUBLE_COMMA(int i) {
			return getToken(NoTTeXParser.DOUBLE_COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NoTTeXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NoTTeXParser.COMMA, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(NoTTeXParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(NoTTeXParser.DOUBLE_COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NoTTeXParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NoTTeXParser.COLON, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(NoTTeXParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(NoTTeXParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(NoTTeXParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(NoTTeXParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(NoTTeXParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(NoTTeXParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(NoTTeXParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(NoTTeXParser.RBRACE, i);
		}
		public List<TerminalNode> WS() { return getTokens(NoTTeXParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NoTTeXParser.WS, i);
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
		enterRule(_localctx, 16, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(QUOTE);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COMMA) | (1L << COMMA) | (1L << DOUBLE_COLON) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << WS) | (1L << ELSE))) != 0)) {
				{
				{
				setState(82);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COMMA) | (1L << COMMA) | (1L << DOUBLE_COLON) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << WS) | (1L << ELSE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(QUOTE);
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

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(NoTTeXParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NoTTeXParser.WS, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoTTeXListener ) ((NoTTeXListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(WS);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rc\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\'\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\5\3\5\3\6\6"+
		"\6\66\n\6\r\6\16\6\67\3\7\3\7\3\7\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7"+
		"\3\b\3\b\5\bG\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\n"+
		"\3\n\7\nV\n\n\f\n\16\nY\13\n\3\n\3\n\3\13\7\13^\n\13\f\13\16\13a\13\13"+
		"\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\4\2\4\4\6\r\4\2\3\n\f\rc\2\27"+
		"\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b+\3\2\2\2\n\65\3\2\2\2\f9\3\2\2\2\16"+
		"F\3\2\2\2\20H\3\2\2\2\22S\3\2\2\2\24_\3\2\2\2\26\30\5\4\3\2\27\26\3\2"+
		"\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\37\5\6"+
		"\4\2\34\37\5\b\5\2\35\37\5\n\6\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2"+
		"\2\2\37\5\3\2\2\2 !\7\5\2\2!\"\7\r\2\2\"#\5\24\13\2#$\7\7\2\2$&\5\24\13"+
		"\2%\'\5\f\7\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\5\24\13\2)*\7\b\2\2*\7"+
		"\3\2\2\2+,\7\3\2\2,-\5\20\t\2-.\5\24\13\2.\60\7\t\2\2/\61\5\2\2\2\60/"+
		"\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\n\2\2\63\t\3\2\2\2\64\66"+
		"\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\13\3\2"+
		"\2\29A\5\16\b\2:;\5\24\13\2;<\7\4\2\2<=\5\24\13\2=>\5\16\b\2>@\3\2\2\2"+
		"?:\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\r\3\2\2\2CA\3\2\2\2DG\5\22\n"+
		"\2EG\5\6\4\2FD\3\2\2\2FE\3\2\2\2G\17\3\2\2\2HP\7\r\2\2IJ\5\24\13\2JK\7"+
		"\4\2\2KL\5\24\13\2LM\7\r\2\2MO\3\2\2\2NI\3\2\2\2OR\3\2\2\2PN\3\2\2\2P"+
		"Q\3\2\2\2Q\21\3\2\2\2RP\3\2\2\2SW\7\13\2\2TV\t\3\2\2UT\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\13\2\2[\23\3\2\2\2\\^\7"+
		"\f\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\25\3\2\2\2a_\3\2\2\2"+
		"\f\31\36&\60\67AFPW_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
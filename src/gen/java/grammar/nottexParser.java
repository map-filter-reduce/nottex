// Generated from C:/Users/Kaspar/Dropbox/CODE/Java/akt2016/nottex/src/main/antlr\nottex.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nottexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_MARKER=1, COMMA=2, FUNCTION_MARKER=3, COLON=4, LPAREN=5, RPAREN=6, 
		LBRACE=7, RBRACE=8, QUOTE=9, WS=10, NOTHING_TO_SEE_HERE=11;
	public static final int
		RULE_markupText = 0, RULE_functionCall = 1, RULE_tagUse = 2, RULE_tagIdens = 3, 
		RULE_text = 4, RULE_funcArgs = 5, RULE_funcArg = 6, RULE_string = 7, RULE_ws = 8;
	public static final String[] ruleNames = {
		"markupText", "functionCall", "tagUse", "tagIdens", "text", "funcArgs", 
		"funcArg", "string", "ws"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "',,'", "','", "'::'", "':'", "'('", "')'", "'{'", "'}'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TAG_MARKER", "COMMA", "FUNCTION_MARKER", "COLON", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "QUOTE", "WS", "NOTHING_TO_SEE_HERE"
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
	public String getGrammarFileName() { return "nottex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nottexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MarkupTextContext extends ParserRuleContext {
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<TagUseContext> tagUse() {
			return getRuleContexts(TagUseContext.class);
		}
		public TagUseContext tagUse(int i) {
			return getRuleContext(TagUseContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public MarkupTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markupText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterMarkupText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitMarkupText(this);
		}
	}

	public final MarkupTextContext markupText() throws RecognitionException {
		MarkupTextContext _localctx = new MarkupTextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_markupText);
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
					setState(21);
					switch (_input.LA(1)) {
					case FUNCTION_MARKER:
						{
						setState(18);
						functionCall();
						}
						break;
					case TAG_MARKER:
						{
						setState(19);
						tagUse();
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
					case NOTHING_TO_SEE_HERE:
						{
						setState(20);
						text();
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
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public Token name;
		public FuncArgsContext argumentsNode;
		public TerminalNode FUNCTION_MARKER() { return getToken(nottexParser.FUNCTION_MARKER, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(nottexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(nottexParser.RPAREN, 0); }
		public TerminalNode NOTHING_TO_SEE_HERE() { return getToken(nottexParser.NOTHING_TO_SEE_HERE, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(FUNCTION_MARKER);
			setState(26);
			((FunctionCallContext)_localctx).name = match(NOTHING_TO_SEE_HERE);
			setState(27);
			ws();
			setState(28);
			match(LPAREN);
			setState(29);
			ws();
			setState(31);
			_la = _input.LA(1);
			if (_la==FUNCTION_MARKER || _la==QUOTE) {
				{
				setState(30);
				((FunctionCallContext)_localctx).argumentsNode = funcArgs();
				}
			}

			setState(33);
			ws();
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

	public static class TagUseContext extends ParserRuleContext {
		public TagIdensContext namesNode;
		public MarkupTextContext content;
		public TerminalNode TAG_MARKER() { return getToken(nottexParser.TAG_MARKER, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(nottexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(nottexParser.RBRACE, 0); }
		public TagIdensContext tagIdens() {
			return getRuleContext(TagIdensContext.class,0);
		}
		public MarkupTextContext markupText() {
			return getRuleContext(MarkupTextContext.class,0);
		}
		public TagUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagUse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterTagUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitTagUse(this);
		}
	}

	public final TagUseContext tagUse() throws RecognitionException {
		TagUseContext _localctx = new TagUseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TAG_MARKER);
			setState(37);
			((TagUseContext)_localctx).namesNode = tagIdens();
			setState(38);
			ws();
			setState(39);
			match(LBRACE);
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(40);
				((TagUseContext)_localctx).content = markupText();
				}
				break;
			}
			setState(43);
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

	public static class TagIdensContext extends ParserRuleContext {
		public Token NOTHING_TO_SEE_HERE;
		public List<Token> names = new ArrayList<Token>();
		public List<TerminalNode> NOTHING_TO_SEE_HERE() { return getTokens(nottexParser.NOTHING_TO_SEE_HERE); }
		public TerminalNode NOTHING_TO_SEE_HERE(int i) {
			return getToken(nottexParser.NOTHING_TO_SEE_HERE, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(nottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(nottexParser.COMMA, i);
		}
		public TagIdensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagIdens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterTagIdens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitTagIdens(this);
		}
	}

	public final TagIdensContext tagIdens() throws RecognitionException {
		TagIdensContext _localctx = new TagIdensContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagIdens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((TagIdensContext)_localctx).NOTHING_TO_SEE_HERE = match(NOTHING_TO_SEE_HERE);
			((TagIdensContext)_localctx).names.add(((TagIdensContext)_localctx).NOTHING_TO_SEE_HERE);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					ws();
					setState(47);
					match(COMMA);
					setState(48);
					ws();
					setState(49);
					((TagIdensContext)_localctx).NOTHING_TO_SEE_HERE = match(NOTHING_TO_SEE_HERE);
					((TagIdensContext)_localctx).names.add(((TagIdensContext)_localctx).NOTHING_TO_SEE_HERE);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TextContext extends ParserRuleContext {
		public Token NOTHING_TO_SEE_HERE;
		public List<Token> content = new ArrayList<Token>();
		public Token COMMA;
		public Token COLON;
		public Token QUOTE;
		public Token LPAREN;
		public Token RPAREN;
		public Token LBRACE;
		public Token RBRACE;
		public Token WS;
		public Token _tset103;
		public List<TerminalNode> NOTHING_TO_SEE_HERE() { return getTokens(nottexParser.NOTHING_TO_SEE_HERE); }
		public TerminalNode NOTHING_TO_SEE_HERE(int i) {
			return getToken(nottexParser.NOTHING_TO_SEE_HERE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(nottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(nottexParser.COMMA, i);
		}
		public List<TerminalNode> COLON() { return getTokens(nottexParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(nottexParser.COLON, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(nottexParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(nottexParser.QUOTE, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(nottexParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(nottexParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(nottexParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(nottexParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(nottexParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(nottexParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(nottexParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(nottexParser.RBRACE, i);
		}
		public List<TerminalNode> WS() { return getTokens(nottexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(nottexParser.WS, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitText(this);
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
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					((TextContext)_localctx)._tset103 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << QUOTE) | (1L << WS) | (1L << NOTHING_TO_SEE_HERE))) != 0)) ) {
						((TextContext)_localctx)._tset103 = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					((TextContext)_localctx).content.add(((TextContext)_localctx)._tset103);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class FuncArgsContext extends ParserRuleContext {
		public FuncArgContext funcArg;
		public List<FuncArgContext> argumentNodes = new ArrayList<FuncArgContext>();
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(nottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(nottexParser.COMMA, i);
		}
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitFuncArgs(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((FuncArgsContext)_localctx).funcArg = funcArg();
			((FuncArgsContext)_localctx).argumentNodes.add(((FuncArgsContext)_localctx).funcArg);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					ws();
					setState(63);
					match(COMMA);
					setState(64);
					ws();
					setState(65);
					((FuncArgsContext)_localctx).funcArg = funcArg();
					((FuncArgsContext)_localctx).argumentNodes.add(((FuncArgsContext)_localctx).funcArg);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FuncArgContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitFuncArg(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcArg);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				string();
				}
				break;
			case FUNCTION_MARKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				functionCall();
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

	public static class StringContext extends ParserRuleContext {
		public Token NOTHING_TO_SEE_HERE;
		public List<Token> content = new ArrayList<Token>();
		public Token TAG_MARKER;
		public Token COMMA;
		public Token FUNCTION_MARKER;
		public Token COLON;
		public Token LPAREN;
		public Token RPAREN;
		public Token LBRACE;
		public Token RBRACE;
		public Token WS;
		public Token _tset171;
		public List<TerminalNode> QUOTE() { return getTokens(nottexParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(nottexParser.QUOTE, i);
		}
		public List<TerminalNode> NOTHING_TO_SEE_HERE() { return getTokens(nottexParser.NOTHING_TO_SEE_HERE); }
		public TerminalNode NOTHING_TO_SEE_HERE(int i) {
			return getToken(nottexParser.NOTHING_TO_SEE_HERE, i);
		}
		public List<TerminalNode> TAG_MARKER() { return getTokens(nottexParser.TAG_MARKER); }
		public TerminalNode TAG_MARKER(int i) {
			return getToken(nottexParser.TAG_MARKER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(nottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(nottexParser.COMMA, i);
		}
		public List<TerminalNode> FUNCTION_MARKER() { return getTokens(nottexParser.FUNCTION_MARKER); }
		public TerminalNode FUNCTION_MARKER(int i) {
			return getToken(nottexParser.FUNCTION_MARKER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(nottexParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(nottexParser.COLON, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(nottexParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(nottexParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(nottexParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(nottexParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(nottexParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(nottexParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(nottexParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(nottexParser.RBRACE, i);
		}
		public List<TerminalNode> WS() { return getTokens(nottexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(nottexParser.WS, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(QUOTE);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_MARKER) | (1L << COMMA) | (1L << FUNCTION_MARKER) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << WS) | (1L << NOTHING_TO_SEE_HERE))) != 0)) {
				{
				{
				setState(77);
				((StringContext)_localctx)._tset171 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_MARKER) | (1L << COMMA) | (1L << FUNCTION_MARKER) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << WS) | (1L << NOTHING_TO_SEE_HERE))) != 0)) ) {
					((StringContext)_localctx)._tset171 = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((StringContext)_localctx).content.add(((StringContext)_localctx)._tset171);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
		public List<TerminalNode> WS() { return getTokens(nottexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(nottexParser.WS, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(WS);
					}
					} 
				}
				setState(90);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\66\n"+
		"\5\f\5\16\59\13\5\3\6\6\6<\n\6\r\6\16\6=\3\7\3\7\3\7\3\7\3\7\3\7\7\7F"+
		"\n\7\f\7\16\7I\13\7\3\b\3\b\5\bM\n\b\3\t\3\t\7\tQ\n\t\f\t\16\tT\13\t\3"+
		"\t\3\t\3\n\7\nY\n\n\f\n\16\n\\\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2"+
		"\4\4\2\4\4\6\r\4\2\3\n\f\r_\2\27\3\2\2\2\4\33\3\2\2\2\6&\3\2\2\2\b/\3"+
		"\2\2\2\n;\3\2\2\2\f?\3\2\2\2\16L\3\2\2\2\20N\3\2\2\2\22Z\3\2\2\2\24\30"+
		"\5\4\3\2\25\30\5\6\4\2\26\30\5\n\6\2\27\24\3\2\2\2\27\25\3\2\2\2\27\26"+
		"\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\34"+
		"\7\5\2\2\34\35\7\r\2\2\35\36\5\22\n\2\36\37\7\7\2\2\37!\5\22\n\2 \"\5"+
		"\f\7\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\5\22\n\2$%\7\b\2\2%\5\3\2\2\2"+
		"&\'\7\3\2\2\'(\5\b\5\2()\5\22\n\2)+\7\t\2\2*,\5\2\2\2+*\3\2\2\2+,\3\2"+
		"\2\2,-\3\2\2\2-.\7\n\2\2.\7\3\2\2\2/\67\7\r\2\2\60\61\5\22\n\2\61\62\7"+
		"\4\2\2\62\63\5\22\n\2\63\64\7\r\2\2\64\66\3\2\2\2\65\60\3\2\2\2\669\3"+
		"\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29\67\3\2\2\2:<\t\2\2\2;:\3"+
		"\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?G\5\16\b\2@A\5\22\n\2"+
		"AB\7\4\2\2BC\5\22\n\2CD\5\16\b\2DF\3\2\2\2E@\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2H\r\3\2\2\2IG\3\2\2\2JM\5\20\t\2KM\5\4\3\2LJ\3\2\2\2LK\3\2"+
		"\2\2M\17\3\2\2\2NR\7\13\2\2OQ\t\3\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS"+
		"\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\13\2\2V\21\3\2\2\2WY\7\f\2\2XW\3\2\2"+
		"\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\23\3\2\2\2\\Z\3\2\2\2\f\27\31!+\67"+
		"=GLRZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
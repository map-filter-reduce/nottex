// Generated from Nottex.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NottexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_MARKER=1, COMMA=2, FUNCTION_MARKER=3, COLON=4, LPAREN=5, RPAREN=6, 
		LBRACE=7, RBRACE=8, ESCAPED_QUOTE=9, ESCAPED_BACKSLASH=10, BACKSLASH=11, 
		QUOTE=12, PLUS=13, MINUS=14, MULTIP=15, DIVIS=16, WS=17, NUMBER=18, ALPHA=19;
	public static final int
		RULE_markupText = 0, RULE_functionCall = 1, RULE_tagUse = 2, RULE_tagIdens = 3, 
		RULE_text = 4, RULE_funcArgs = 5, RULE_funcArg = 6, RULE_expr = 7, RULE_sub = 8, 
		RULE_factor = 9, RULE_string = 10, RULE_ws = 11;
	public static final String[] ruleNames = {
		"markupText", "functionCall", "tagUse", "tagIdens", "text", "funcArgs", 
		"funcArg", "expr", "sub", "factor", "string", "ws"
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

	@Override
	public String getGrammarFileName() { return "Nottex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NottexParser(TokenStream input) {
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
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterMarkupText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitMarkupText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitMarkupText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkupTextContext markupText() throws RecognitionException {
		MarkupTextContext _localctx = new MarkupTextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_markupText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(27);
					switch (_input.LA(1)) {
					case FUNCTION_MARKER:
						{
						setState(24);
						functionCall();
						}
						break;
					case TAG_MARKER:
						{
						setState(25);
						tagUse();
						}
						break;
					case COMMA:
					case COLON:
					case LPAREN:
					case RPAREN:
					case LBRACE:
					case RBRACE:
					case ESCAPED_QUOTE:
					case ESCAPED_BACKSLASH:
					case BACKSLASH:
					case QUOTE:
					case PLUS:
					case MINUS:
					case MULTIP:
					case DIVIS:
					case WS:
					case NUMBER:
					case ALPHA:
						{
						setState(26);
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
				setState(29); 
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
		public Token ALPHA;
		public List<Token> name = new ArrayList<Token>();
		public FuncArgsContext argumentsNode;
		public TerminalNode FUNCTION_MARKER() { return getToken(NottexParser.FUNCTION_MARKER, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(NottexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NottexParser.RPAREN, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(NottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(NottexParser.ALPHA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(NottexParser.NUMBER, i);
		}
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(FUNCTION_MARKER);
			setState(32);
			((FunctionCallContext)_localctx).ALPHA = match(ALPHA);
			((FunctionCallContext)_localctx).name.add(((FunctionCallContext)_localctx).ALPHA);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==ALPHA) {
				{
				{
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ALPHA) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			ws();
			setState(40);
			match(LPAREN);
			setState(41);
			ws();
			setState(43);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION_MARKER) | (1L << LPAREN) | (1L << QUOTE) | (1L << MINUS) | (1L << NUMBER))) != 0)) {
				{
				setState(42);
				((FunctionCallContext)_localctx).argumentsNode = funcArgs();
				}
			}

			setState(45);
			ws();
			setState(46);
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
		public TerminalNode TAG_MARKER() { return getToken(NottexParser.TAG_MARKER, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(NottexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NottexParser.RBRACE, 0); }
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
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterTagUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitTagUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitTagUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagUseContext tagUse() throws RecognitionException {
		TagUseContext _localctx = new TagUseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(TAG_MARKER);
			setState(49);
			((TagUseContext)_localctx).namesNode = tagIdens();
			setState(50);
			ws();
			setState(51);
			match(LBRACE);
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(52);
				((TagUseContext)_localctx).content = markupText();
				}
				break;
			}
			setState(55);
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
		public Token ALPHA;
		public List<Token> names = new ArrayList<Token>();
		public List<TerminalNode> ALPHA() { return getTokens(NottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(NottexParser.ALPHA, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NottexParser.COMMA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(NottexParser.NUMBER, i);
		}
		public TagIdensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagIdens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterTagIdens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitTagIdens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitTagIdens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagIdensContext tagIdens() throws RecognitionException {
		TagIdensContext _localctx = new TagIdensContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagIdens);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((TagIdensContext)_localctx).ALPHA = match(ALPHA);
			((TagIdensContext)_localctx).names.add(((TagIdensContext)_localctx).ALPHA);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==ALPHA) {
				{
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ALPHA) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					ws();
					setState(65);
					match(COMMA);
					setState(66);
					ws();
					setState(67);
					((TagIdensContext)_localctx).ALPHA = match(ALPHA);
					((TagIdensContext)_localctx).names.add(((TagIdensContext)_localctx).ALPHA);
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUMBER || _la==ALPHA) {
						{
						{
						setState(68);
						_la = _input.LA(1);
						if ( !(_la==NUMBER || _la==ALPHA) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(78);
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

	public static class TextContext extends ParserRuleContext {
		public Token ALPHA;
		public List<Token> content = new ArrayList<Token>();
		public Token NUMBER;
		public Token COMMA;
		public Token COLON;
		public Token QUOTE;
		public Token LPAREN;
		public Token RPAREN;
		public Token LBRACE;
		public Token RBRACE;
		public Token PLUS;
		public Token MINUS;
		public Token MULTIP;
		public Token DIVIS;
		public Token ESCAPED_QUOTE;
		public Token BACKSLASH;
		public Token ESCAPED_BACKSLASH;
		public Token WS;
		public Token _tset121;
		public List<TerminalNode> ALPHA() { return getTokens(NottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(NottexParser.ALPHA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(NottexParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NottexParser.COMMA, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NottexParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NottexParser.COLON, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(NottexParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(NottexParser.QUOTE, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(NottexParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(NottexParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(NottexParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(NottexParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(NottexParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(NottexParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(NottexParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(NottexParser.RBRACE, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NottexParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NottexParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(NottexParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(NottexParser.MINUS, i);
		}
		public List<TerminalNode> MULTIP() { return getTokens(NottexParser.MULTIP); }
		public TerminalNode MULTIP(int i) {
			return getToken(NottexParser.MULTIP, i);
		}
		public List<TerminalNode> DIVIS() { return getTokens(NottexParser.DIVIS); }
		public TerminalNode DIVIS(int i) {
			return getToken(NottexParser.DIVIS, i);
		}
		public List<TerminalNode> ESCAPED_QUOTE() { return getTokens(NottexParser.ESCAPED_QUOTE); }
		public TerminalNode ESCAPED_QUOTE(int i) {
			return getToken(NottexParser.ESCAPED_QUOTE, i);
		}
		public List<TerminalNode> BACKSLASH() { return getTokens(NottexParser.BACKSLASH); }
		public TerminalNode BACKSLASH(int i) {
			return getToken(NottexParser.BACKSLASH, i);
		}
		public List<TerminalNode> ESCAPED_BACKSLASH() { return getTokens(NottexParser.ESCAPED_BACKSLASH); }
		public TerminalNode ESCAPED_BACKSLASH(int i) {
			return getToken(NottexParser.ESCAPED_BACKSLASH, i);
		}
		public List<TerminalNode> WS() { return getTokens(NottexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NottexParser.WS, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
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
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					((TextContext)_localctx)._tset121 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << ESCAPED_QUOTE) | (1L << ESCAPED_BACKSLASH) | (1L << BACKSLASH) | (1L << QUOTE) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIP) | (1L << DIVIS) | (1L << WS) | (1L << NUMBER) | (1L << ALPHA))) != 0)) ) {
						((TextContext)_localctx)._tset121 = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					((TextContext)_localctx).content.add(((TextContext)_localctx)._tset121);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
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
		public List<TerminalNode> COMMA() { return getTokens(NottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NottexParser.COMMA, i);
		}
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((FuncArgsContext)_localctx).funcArg = funcArg();
			((FuncArgsContext)_localctx).argumentNodes.add(((FuncArgsContext)_localctx).funcArg);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					ws();
					setState(86);
					match(COMMA);
					setState(87);
					ws();
					setState(88);
					((FuncArgsContext)_localctx).funcArg = funcArg();
					((FuncArgsContext)_localctx).argumentNodes.add(((FuncArgsContext)_localctx).funcArg);
					}
					} 
				}
				setState(94);
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

	public static class FuncArgContext extends ParserRuleContext {
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
	 
		public FuncArgContext() { }
		public void copyFrom(FuncArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallArgContext extends FuncArgContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallArgContext(FuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterFunctionCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitFunctionCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitFunctionCallArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionArgContext extends FuncArgContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionArgContext(FuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExpressionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExpressionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExpressionArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringArgContext extends FuncArgContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringArgContext(FuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterStringArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitStringArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitStringArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcArg);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case QUOTE:
				_localctx = new StringArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				string();
				}
				break;
			case LPAREN:
			case MINUS:
			case NUMBER:
				_localctx = new ExpressionArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				expr(0);
				}
				break;
			case FUNCTION_MARKER:
				_localctx = new FunctionCallArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSubtractContext extends ExprContext {
		public ExprContext left;
		public SubContext right;
		public TerminalNode MINUS() { return getToken(NottexParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public ExprSubtractContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExprSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExprSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExprSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddContext extends ExprContext {
		public ExprContext left;
		public SubContext right;
		public TerminalNode PLUS() { return getToken(NottexParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public ExprAddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SubExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(101);
			sub(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAddContext(new ExprContext(_parentctx, _parentState));
						((ExprAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104);
						match(PLUS);
						setState(105);
						((ExprAddContext)_localctx).right = sub(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprSubtractContext(new ExprContext(_parentctx, _parentState));
						((ExprSubtractContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107);
						match(MINUS);
						setState(108);
						((ExprSubtractContext)_localctx).right = sub(0);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	 
		public SubContext() { }
		public void copyFrom(SubContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprMinusContext extends SubContext {
		public Token MINUS;
		public List<Token> minuses = new ArrayList<Token>();
		public FactorContext expression;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(NottexParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(NottexParser.MINUS, i);
		}
		public ExprMinusContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExprMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExprMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDivisContext extends SubContext {
		public SubContext left;
		public FactorContext right;
		public TerminalNode DIVIS() { return getToken(NottexParser.DIVIS, 0); }
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprDivisContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExprDivis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExprDivis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExprDivis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubSubExprContext extends SubContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SubSubExprContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterSubSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitSubSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitSubSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultipContext extends SubContext {
		public SubContext left;
		public FactorContext right;
		public TerminalNode MULTIP() { return getToken(NottexParser.MULTIP, 0); }
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprMultipContext(SubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExprMultip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExprMultip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExprMultip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		return sub(0);
	}

	private SubContext sub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubContext _localctx = new SubContext(_ctx, _parentState);
		SubContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_sub, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new ExprMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					((ExprMinusContext)_localctx).MINUS = match(MINUS);
					((ExprMinusContext)_localctx).minuses.add(((ExprMinusContext)_localctx).MINUS);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				setState(120);
				((ExprMinusContext)_localctx).expression = factor();
				}
				break;
			case LPAREN:
			case NUMBER:
				{
				_localctx = new SubSubExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultipContext(new SubContext(_parentctx, _parentState));
						((ExprMultipContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sub);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						match(MULTIP);
						setState(126);
						((ExprMultipContext)_localctx).right = factor();
						}
						break;
					case 2:
						{
						_localctx = new ExprDivisContext(new SubContext(_parentctx, _parentState));
						((ExprDivisContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sub);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128);
						match(DIVIS);
						setState(129);
						((ExprDivisContext)_localctx).right = factor();
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprParensContext extends FactorContext {
		public ExprContext expression;
		public TerminalNode LPAREN() { return getToken(NottexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NottexParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParensContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumberContext extends FactorContext {
		public TerminalNode NUMBER() { return getToken(NottexParser.NUMBER, 0); }
		public ExprNumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitExprNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitExprNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ExprParensContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(LPAREN);
				setState(136);
				((ExprParensContext)_localctx).expression = expr(0);
				setState(137);
				match(RPAREN);
				}
				break;
			case NUMBER:
				_localctx = new ExprNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(NUMBER);
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
		public Token ALPHA;
		public List<Token> content = new ArrayList<Token>();
		public Token NUMBER;
		public Token TAG_MARKER;
		public Token COMMA;
		public Token FUNCTION_MARKER;
		public Token COLON;
		public Token LPAREN;
		public Token RPAREN;
		public Token LBRACE;
		public Token RBRACE;
		public Token PLUS;
		public Token MINUS;
		public Token MULTIP;
		public Token DIVIS;
		public Token ESCAPED_QUOTE;
		public Token BACKSLASH;
		public Token WS;
		public Token ESCAPED_BACKSLASH;
		public Token _tset348;
		public List<TerminalNode> QUOTE() { return getTokens(NottexParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(NottexParser.QUOTE, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(NottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(NottexParser.ALPHA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(NottexParser.NUMBER, i);
		}
		public List<TerminalNode> TAG_MARKER() { return getTokens(NottexParser.TAG_MARKER); }
		public TerminalNode TAG_MARKER(int i) {
			return getToken(NottexParser.TAG_MARKER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NottexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NottexParser.COMMA, i);
		}
		public List<TerminalNode> FUNCTION_MARKER() { return getTokens(NottexParser.FUNCTION_MARKER); }
		public TerminalNode FUNCTION_MARKER(int i) {
			return getToken(NottexParser.FUNCTION_MARKER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NottexParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NottexParser.COLON, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(NottexParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(NottexParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(NottexParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(NottexParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(NottexParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(NottexParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(NottexParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(NottexParser.RBRACE, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NottexParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NottexParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(NottexParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(NottexParser.MINUS, i);
		}
		public List<TerminalNode> MULTIP() { return getTokens(NottexParser.MULTIP); }
		public TerminalNode MULTIP(int i) {
			return getToken(NottexParser.MULTIP, i);
		}
		public List<TerminalNode> DIVIS() { return getTokens(NottexParser.DIVIS); }
		public TerminalNode DIVIS(int i) {
			return getToken(NottexParser.DIVIS, i);
		}
		public List<TerminalNode> ESCAPED_QUOTE() { return getTokens(NottexParser.ESCAPED_QUOTE); }
		public TerminalNode ESCAPED_QUOTE(int i) {
			return getToken(NottexParser.ESCAPED_QUOTE, i);
		}
		public List<TerminalNode> BACKSLASH() { return getTokens(NottexParser.BACKSLASH); }
		public TerminalNode BACKSLASH(int i) {
			return getToken(NottexParser.BACKSLASH, i);
		}
		public List<TerminalNode> WS() { return getTokens(NottexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NottexParser.WS, i);
		}
		public List<TerminalNode> ESCAPED_BACKSLASH() { return getTokens(NottexParser.ESCAPED_BACKSLASH); }
		public TerminalNode ESCAPED_BACKSLASH(int i) {
			return getToken(NottexParser.ESCAPED_BACKSLASH, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(QUOTE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_MARKER) | (1L << COMMA) | (1L << FUNCTION_MARKER) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << ESCAPED_QUOTE) | (1L << ESCAPED_BACKSLASH) | (1L << BACKSLASH) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIP) | (1L << DIVIS) | (1L << WS) | (1L << NUMBER) | (1L << ALPHA))) != 0)) {
				{
				{
				setState(143);
				((StringContext)_localctx)._tset348 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_MARKER) | (1L << COMMA) | (1L << FUNCTION_MARKER) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << ESCAPED_QUOTE) | (1L << ESCAPED_BACKSLASH) | (1L << BACKSLASH) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIP) | (1L << DIVIS) | (1L << WS) | (1L << NUMBER) | (1L << ALPHA))) != 0)) ) {
					((StringContext)_localctx)._tset348 = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((StringContext)_localctx).content.add(((StringContext)_localctx)._tset348);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		public List<TerminalNode> WS() { return getTokens(NottexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NottexParser.WS, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NottexListener ) ((NottexListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NottexVisitor ) return ((NottexVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(WS);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return sub_sempred((SubContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sub_sempred(SubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\4\3\4\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\7\5M\n\5\f\5\16\5P\13\5\3\6\6\6S\n"+
		"\6\r\6\16\6T\3\7\3\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\b\3\b\3"+
		"\b\5\be\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13"+
		"\t\3\n\3\n\6\nw\n\n\r\n\16\nx\3\n\3\n\5\n}\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0085\n\n\f\n\16\n\u0088\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u008f"+
		"\n\13\3\f\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\f\3\f\3\r\7\r\u009b"+
		"\n\r\f\r\16\r\u009e\13\r\3\r\2\4\20\22\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\5\3\2\24\25\4\2\4\4\6\25\4\2\3\r\17\25\u00a9\2\35\3\2\2\2\4!\3\2\2"+
		"\2\6\62\3\2\2\2\b;\3\2\2\2\nR\3\2\2\2\fV\3\2\2\2\16d\3\2\2\2\20f\3\2\2"+
		"\2\22|\3\2\2\2\24\u008e\3\2\2\2\26\u0090\3\2\2\2\30\u009c\3\2\2\2\32\36"+
		"\5\4\3\2\33\36\5\6\4\2\34\36\5\n\6\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\"\7\5\2\2"+
		"\"&\7\25\2\2#%\t\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2"+
		"\2\2(&\3\2\2\2)*\5\30\r\2*+\7\7\2\2+-\5\30\r\2,.\5\f\7\2-,\3\2\2\2-.\3"+
		"\2\2\2./\3\2\2\2/\60\5\30\r\2\60\61\7\b\2\2\61\5\3\2\2\2\62\63\7\3\2\2"+
		"\63\64\5\b\5\2\64\65\5\30\r\2\65\67\7\t\2\2\668\5\2\2\2\67\66\3\2\2\2"+
		"\678\3\2\2\289\3\2\2\29:\7\n\2\2:\7\3\2\2\2;?\7\25\2\2<>\t\2\2\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@N\3\2\2\2A?\3\2\2\2BC\5\30\r\2CD\7"+
		"\4\2\2DE\5\30\r\2EI\7\25\2\2FH\t\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2I"+
		"J\3\2\2\2JM\3\2\2\2KI\3\2\2\2LB\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"O\t\3\2\2\2PN\3\2\2\2QS\t\3\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2U\13\3\2\2\2V^\5\16\b\2WX\5\30\r\2XY\7\4\2\2YZ\5\30\r\2Z[\5\16\b\2["+
		"]\3\2\2\2\\W\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`^\3\2\2"+
		"\2ae\5\26\f\2be\5\20\t\2ce\5\4\3\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\17\3"+
		"\2\2\2fg\b\t\1\2gh\5\22\n\2hq\3\2\2\2ij\f\5\2\2jk\7\17\2\2kp\5\22\n\2"+
		"lm\f\4\2\2mn\7\20\2\2np\5\22\n\2oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2r\21\3\2\2\2sq\3\2\2\2tv\b\n\1\2uw\7\20\2\2vu\3\2\2\2wx\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z}\5\24\13\2{}\5\24\13\2|t\3\2\2\2"+
		"|{\3\2\2\2}\u0086\3\2\2\2~\177\f\6\2\2\177\u0080\7\21\2\2\u0080\u0085"+
		"\5\24\13\2\u0081\u0082\f\5\2\2\u0082\u0083\7\22\2\2\u0083\u0085\5\24\13"+
		"\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7\7\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\b\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008f\7\24\2\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\25\3\2\2\2\u0090\u0094\7\16\2\2\u0091\u0093\t\4\2\2\u0092\u0091\3\2\2"+
		"\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\16\2\2\u0098\27\3\2\2\2\u0099"+
		"\u009b\7\23\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\31\3\2\2\2\u009e\u009c\3\2\2\2\26\35"+
		"\37&-\67?INT^doqx|\u0084\u0086\u008e\u0094\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
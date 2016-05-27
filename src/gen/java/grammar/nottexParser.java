// Generated from nottex.g4 by ANTLR 4.5.3
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
public class nottexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_MARKER=1, COMMA=2, FUNCTION_MARKER=3, COLON=4, LPAREN=5, RPAREN=6, 
		LBRACE=7, RBRACE=8, QUOTE=9, WS=10, NUMBER=11, ALPHA=12;
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
		"LBRACE", "RBRACE", "QUOTE", "WS", "NUMBER", "ALPHA"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitMarkupText(this);
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
					case NUMBER:
					case ALPHA:
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
		public Token ALPHA;
		public List<Token> name = new ArrayList<Token>();
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
		public List<TerminalNode> ALPHA() { return getTokens(nottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(nottexParser.ALPHA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(nottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(nottexParser.NUMBER, i);
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
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitFunctionCall(this);
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
			setState(25);
			match(FUNCTION_MARKER);
			setState(26);
			((FunctionCallContext)_localctx).ALPHA = match(ALPHA);
			((FunctionCallContext)_localctx).name.add(((FunctionCallContext)_localctx).ALPHA);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==ALPHA) {
				{
				{
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ALPHA) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			ws();
			setState(34);
			match(LPAREN);
			setState(35);
			ws();
			setState(37);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION_MARKER) | (1L << QUOTE) | (1L << NUMBER))) != 0)) {
				{
				setState(36);
				((FunctionCallContext)_localctx).argumentsNode = funcArgs();
				}
			}

			setState(39);
			ws();
			setState(40);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitTagUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagUseContext tagUse() throws RecognitionException {
		TagUseContext _localctx = new TagUseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TAG_MARKER);
			setState(43);
			((TagUseContext)_localctx).namesNode = tagIdens();
			setState(44);
			ws();
			setState(45);
			match(LBRACE);
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(46);
				((TagUseContext)_localctx).content = markupText();
				}
				break;
			}
			setState(49);
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
		public List<TerminalNode> ALPHA() { return getTokens(nottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(nottexParser.ALPHA, i);
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
		public List<TerminalNode> NUMBER() { return getTokens(nottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(nottexParser.NUMBER, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitTagIdens(this);
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
			setState(51);
			((TagIdensContext)_localctx).ALPHA = match(ALPHA);
			((TagIdensContext)_localctx).names.add(((TagIdensContext)_localctx).ALPHA);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==ALPHA) {
				{
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ALPHA) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					ws();
					setState(59);
					match(COMMA);
					setState(60);
					ws();
					setState(61);
					((TagIdensContext)_localctx).ALPHA = match(ALPHA);
					((TagIdensContext)_localctx).names.add(((TagIdensContext)_localctx).ALPHA);
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUMBER || _la==ALPHA) {
						{
						{
						setState(62);
						_la = _input.LA(1);
						if ( !(_la==NUMBER || _la==ALPHA) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(67);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(72);
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
		public Token WS;
		public Token _tset121;
		public List<TerminalNode> ALPHA() { return getTokens(nottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(nottexParser.ALPHA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(nottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(nottexParser.NUMBER, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitText(this);
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
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					((TextContext)_localctx)._tset121 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << QUOTE) | (1L << WS) | (1L << NUMBER) | (1L << ALPHA))) != 0)) ) {
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
				setState(76); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitFuncArgs(this);
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
			setState(78);
			((FuncArgsContext)_localctx).funcArg = funcArg();
			((FuncArgsContext)_localctx).argumentNodes.add(((FuncArgsContext)_localctx).funcArg);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					ws();
					setState(80);
					match(COMMA);
					setState(81);
					ws();
					setState(82);
					((FuncArgsContext)_localctx).funcArg = funcArg();
					((FuncArgsContext)_localctx).argumentNodes.add(((FuncArgsContext)_localctx).funcArg);
					}
					} 
				}
				setState(88);
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
	public static class NumberArgContext extends FuncArgContext {
		public TerminalNode NUMBER() { return getToken(nottexParser.NUMBER, 0); }
		public NumberArgContext(FuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterNumberArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitNumberArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitNumberArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallArgContext extends FuncArgContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallArgContext(FuncArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterFunctionCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitFunctionCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitFunctionCallArg(this);
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
			if ( listener instanceof nottexListener ) ((nottexListener)listener).enterStringArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nottexListener ) ((nottexListener)listener).exitStringArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitStringArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcArg);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case QUOTE:
				_localctx = new StringArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				string();
				}
				break;
			case NUMBER:
				_localctx = new NumberArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(NUMBER);
				}
				break;
			case FUNCTION_MARKER:
				_localctx = new FunctionCallArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
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
		public Token WS;
		public Token _tset207;
		public List<TerminalNode> QUOTE() { return getTokens(nottexParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(nottexParser.QUOTE, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(nottexParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(nottexParser.ALPHA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(nottexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(nottexParser.NUMBER, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(QUOTE);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_MARKER) | (1L << COMMA) | (1L << FUNCTION_MARKER) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << WS) | (1L << NUMBER) | (1L << ALPHA))) != 0)) {
				{
				{
				setState(95);
				((StringContext)_localctx)._tset207 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_MARKER) | (1L << COMMA) | (1L << FUNCTION_MARKER) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << WS) | (1L << NUMBER) | (1L << ALPHA))) != 0)) ) {
					((StringContext)_localctx)._tset207 = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((StringContext)_localctx).content.add(((StringContext)_localctx)._tset207);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nottexVisitor ) return ((nottexVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(WS);
					}
					} 
				}
				setState(108);
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
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3\3"+
		"\3\3\3\3\5\3(\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\3"+
		"\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E"+
		"\13\5\7\5G\n\5\f\5\16\5J\13\5\3\6\6\6M\n\6\r\6\16\6N\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\7\tc\n\t\f"+
		"\t\16\tf\13\t\3\t\3\t\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\2\2\13\2\4\6\b\n"+
		"\f\16\20\22\2\5\3\2\r\16\4\2\4\4\6\16\4\2\3\n\f\16u\2\27\3\2\2\2\4\33"+
		"\3\2\2\2\6,\3\2\2\2\b\65\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16^\3\2\2\2\20"+
		"`\3\2\2\2\22l\3\2\2\2\24\30\5\4\3\2\25\30\5\6\4\2\26\30\5\n\6\2\27\24"+
		"\3\2\2\2\27\25\3\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\3\3\2\2\2\33\34\7\5\2\2\34 \7\16\2\2\35\37\t\2\2\2\36\35\3"+
		"\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\5\22"+
		"\n\2$%\7\7\2\2%\'\5\22\n\2&(\5\f\7\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)"+
		"*\5\22\n\2*+\7\b\2\2+\5\3\2\2\2,-\7\3\2\2-.\5\b\5\2./\5\22\n\2/\61\7\t"+
		"\2\2\60\62\5\2\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\n"+
		"\2\2\64\7\3\2\2\2\659\7\16\2\2\668\t\2\2\2\67\66\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:H\3\2\2\2;9\3\2\2\2<=\5\22\n\2=>\7\4\2\2>?\5\22\n\2"+
		"?C\7\16\2\2@B\t\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2F<\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2"+
		"\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PX\5"+
		"\16\b\2QR\5\22\n\2RS\7\4\2\2ST\5\22\n\2TU\5\16\b\2UW\3\2\2\2VQ\3\2\2\2"+
		"WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2ZX\3\2\2\2[_\5\20\t\2\\_\7\r"+
		"\2\2]_\5\4\3\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\17\3\2\2\2`d\7\13\2\2a"+
		"c\t\4\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2"+
		"gh\7\13\2\2h\21\3\2\2\2ik\7\f\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2m\23\3\2\2\2nl\3\2\2\2\17\27\31 \'\619CHNX^dl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from NoTTeX.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NoTTeXParser}.
 */
public interface NoTTeXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(NoTTeXParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(NoTTeXParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(NoTTeXParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(NoTTeXParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(NoTTeXParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(NoTTeXParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#tag_use}.
	 * @param ctx the parse tree
	 */
	void enterTag_use(NoTTeXParser.Tag_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#tag_use}.
	 * @param ctx the parse tree
	 */
	void exitTag_use(NoTTeXParser.Tag_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(NoTTeXParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(NoTTeXParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(NoTTeXParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(NoTTeXParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(NoTTeXParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(NoTTeXParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(NoTTeXParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(NoTTeXParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(NoTTeXParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(NoTTeXParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(NoTTeXParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(NoTTeXParser.WsContext ctx);
}
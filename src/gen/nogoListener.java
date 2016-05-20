// Generated from C:/Users/Kaspar/Dropbox/CODE/Java/akt2016/nottex/src/main/antlr\nogo.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link nogoParser}.
 */
public interface nogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link nogoParser#markup_text}.
	 * @param ctx the parse tree
	 */
	void enterMarkup_text(nogoParser.Markup_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link nogoParser#markup_text}.
	 * @param ctx the parse tree
	 */
	void exitMarkup_text(nogoParser.Markup_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link nogoParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(nogoParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link nogoParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(nogoParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link nogoParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(nogoParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link nogoParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(nogoParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link nogoParser#tag_use}.
	 * @param ctx the parse tree
	 */
	void enterTag_use(nogoParser.Tag_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link nogoParser#tag_use}.
	 * @param ctx the parse tree
	 */
	void exitTag_use(nogoParser.Tag_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link nogoParser#plain}.
	 * @param ctx the parse tree
	 */
	void enterPlain(nogoParser.PlainContext ctx);
	/**
	 * Exit a parse tree produced by {@link nogoParser#plain}.
	 * @param ctx the parse tree
	 */
	void exitPlain(nogoParser.PlainContext ctx);
}
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
	 * Enter a parse tree produced by the {@code ContentAsTag}
	 * labeled alternative in {@link NoTTeXParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContentAsTag(NoTTeXParser.ContentAsTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContentAsTag}
	 * labeled alternative in {@link NoTTeXParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContentAsTag(NoTTeXParser.ContentAsTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContentAsFunction}
	 * labeled alternative in {@link NoTTeXParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContentAsFunction(NoTTeXParser.ContentAsFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContentAsFunction}
	 * labeled alternative in {@link NoTTeXParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContentAsFunction(NoTTeXParser.ContentAsFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContentAsText}
	 * labeled alternative in {@link NoTTeXParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContentAsText(NoTTeXParser.ContentAsTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContentAsText}
	 * labeled alternative in {@link NoTTeXParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContentAsText(NoTTeXParser.ContentAsTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(NoTTeXParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(NoTTeXParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoTTeXParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(NoTTeXParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(NoTTeXParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgTag}
	 * labeled alternative in {@link NoTTeXParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void enterArgTag(NoTTeXParser.ArgTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgTag}
	 * labeled alternative in {@link NoTTeXParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void exitArgTag(NoTTeXParser.ArgTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgFunction}
	 * labeled alternative in {@link NoTTeXParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void enterArgFunction(NoTTeXParser.ArgFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgFunction}
	 * labeled alternative in {@link NoTTeXParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void exitArgFunction(NoTTeXParser.ArgFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgText}
	 * labeled alternative in {@link NoTTeXParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void enterArgText(NoTTeXParser.ArgTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgText}
	 * labeled alternative in {@link NoTTeXParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void exitArgText(NoTTeXParser.ArgTextContext ctx);
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
	 * Enter a parse tree produced by {@link NoTTeXParser#limited}.
	 * @param ctx the parse tree
	 */
	void enterLimited(NoTTeXParser.LimitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoTTeXParser#limited}.
	 * @param ctx the parse tree
	 */
	void exitLimited(NoTTeXParser.LimitedContext ctx);
}
// Generated from nottex.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link nottexParser}.
 */
public interface nottexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link nottexParser#markupText}.
	 * @param ctx the parse tree
	 */
	void enterMarkupText(nottexParser.MarkupTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#markupText}.
	 * @param ctx the parse tree
	 */
	void exitMarkupText(nottexParser.MarkupTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(nottexParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(nottexParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#tagUse}.
	 * @param ctx the parse tree
	 */
	void enterTagUse(nottexParser.TagUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#tagUse}.
	 * @param ctx the parse tree
	 */
	void exitTagUse(nottexParser.TagUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#tagIdens}.
	 * @param ctx the parse tree
	 */
	void enterTagIdens(nottexParser.TagIdensContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#tagIdens}.
	 * @param ctx the parse tree
	 */
	void exitTagIdens(nottexParser.TagIdensContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(nottexParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(nottexParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(nottexParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(nottexParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterStringArg(nottexParser.StringArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitStringArg(nottexParser.StringArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterNumberArg(nottexParser.NumberArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitNumberArg(nottexParser.NumberArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArg(nottexParser.FunctionCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArg(nottexParser.FunctionCallArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(nottexParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(nottexParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link nottexParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(nottexParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link nottexParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(nottexParser.WsContext ctx);
}
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
	 * Enter a parse tree produced by the {@code ExpressionArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArg(nottexParser.ExpressionArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionArg}
	 * labeled alternative in {@link nottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArg(nottexParser.ExpressionArgContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubtract(nottexParser.ExprSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubtract(nottexParser.ExprSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(nottexParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(nottexParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(nottexParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link nottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(nottexParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(nottexParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(nottexParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDivis}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterExprDivis(nottexParser.ExprDivisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDivis}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitExprDivis(nottexParser.ExprDivisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubSubExpr}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSubSubExpr(nottexParser.SubSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubSubExpr}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSubSubExpr(nottexParser.SubSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultip}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterExprMultip(nottexParser.ExprMultipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultip}
	 * labeled alternative in {@link nottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitExprMultip(nottexParser.ExprMultipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link nottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(nottexParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link nottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(nottexParser.ExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link nottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(nottexParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link nottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(nottexParser.ExprNumberContext ctx);
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
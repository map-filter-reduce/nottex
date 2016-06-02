// Generated from Nottex.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NottexParser}.
 */
public interface NottexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NottexParser#markupText}.
	 * @param ctx the parse tree
	 */
	void enterMarkupText(NottexParser.MarkupTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#markupText}.
	 * @param ctx the parse tree
	 */
	void exitMarkupText(NottexParser.MarkupTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link NottexParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(NottexParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(NottexParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NottexParser#tagUse}.
	 * @param ctx the parse tree
	 */
	void enterTagUse(NottexParser.TagUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#tagUse}.
	 * @param ctx the parse tree
	 */
	void exitTagUse(NottexParser.TagUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NottexParser#tagIdens}.
	 * @param ctx the parse tree
	 */
	void enterTagIdens(NottexParser.TagIdensContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#tagIdens}.
	 * @param ctx the parse tree
	 */
	void exitTagIdens(NottexParser.TagIdensContext ctx);
	/**
	 * Enter a parse tree produced by {@link NottexParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(NottexParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(NottexParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link NottexParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(NottexParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(NottexParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterStringArg(NottexParser.StringArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitStringArg(NottexParser.StringArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArg(NottexParser.ExpressionArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArg(NottexParser.ExpressionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArg(NottexParser.FunctionCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArg(NottexParser.FunctionCallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubtract(NottexParser.ExprSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubtract(NottexParser.ExprSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(NottexParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(NottexParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(NottexParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(NottexParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(NottexParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(NottexParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDivis}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterExprDivis(NottexParser.ExprDivisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDivis}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitExprDivis(NottexParser.ExprDivisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubSubExpr}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSubSubExpr(NottexParser.SubSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubSubExpr}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSubSubExpr(NottexParser.SubSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultip}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterExprMultip(NottexParser.ExprMultipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultip}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitExprMultip(NottexParser.ExprMultipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link NottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(NottexParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link NottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(NottexParser.ExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link NottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(NottexParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link NottexParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(NottexParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NottexParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(NottexParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(NottexParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NottexParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(NottexParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NottexParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(NottexParser.WsContext ctx);
}
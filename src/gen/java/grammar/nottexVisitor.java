// Generated from Nottex.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NottexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NottexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NottexParser#markupText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkupText(NottexParser.MarkupTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link NottexParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(NottexParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NottexParser#tagUse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagUse(NottexParser.TagUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NottexParser#tagIdens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagIdens(NottexParser.TagIdensContext ctx);
	/**
	 * Visit a parse tree produced by {@link NottexParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(NottexParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link NottexParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(NottexParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArg(NottexParser.StringArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArg(NottexParser.ExpressionArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallArg}
	 * labeled alternative in {@link NottexParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArg(NottexParser.FunctionCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubtract(NottexParser.ExprSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(NottexParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link NottexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(NottexParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMinus}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(NottexParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDivis}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDivis(NottexParser.ExprDivisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubSubExpr}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSubExpr(NottexParser.SubSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultip}
	 * labeled alternative in {@link NottexParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultip(NottexParser.ExprMultipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link NottexParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParens(NottexParser.ExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link NottexParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(NottexParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NottexParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(NottexParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link NottexParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(NottexParser.WsContext ctx);
}
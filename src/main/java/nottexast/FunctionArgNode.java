package nottexast;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import nottexast.literals.LiteralNode;

@EqualsAndHashCode(callSuper = false)
@Getter
public class FunctionArgNode extends NottexNode {
    private final LiteralNode literalArg;
    private final FunctionCallNode funArg;

    public FunctionArgNode(FunctionCallNode funArg) {
        this.funArg = funArg;
        this.literalArg = null;
    }

    public FunctionArgNode(LiteralNode stringArg) {
        this.literalArg = stringArg;
        this.funArg = null;
    }

    /**
     * Method for checking if FunctionArgNode is holding LiteralNode or FunctionCallNode
     *
     * @return true if is holding FunctionCallNode
     */
    public boolean isFunctionCall() {
        return funArg != null;
    }


    @Override
    public String prettyPrint(String indent) {
        return indent + "Arg: " + "\n" +
                (isFunctionCall() ?
                        funArg.prettyPrint(indent + INDENT) : literalArg.prettyPrint(indent + INDENT));
    }
}

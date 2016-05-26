import nottex_ast.FunctionArgNode;
import nottex_ast.FunctionCallNode;
import nottex_ast.NottexNode;
import nottex_ast.StringNode;
import org.junit.Assert;

public class testUtil {

    public static void assertEquals(NottexNode expected, NottexNode actual) {
        Assert.assertTrue(expected.equals(actual));
    }

    public static FunctionArgNode stringArg(String string) {
        return new FunctionArgNode(new StringNode(string));
    }

    public static FunctionArgNode funcArg(FunctionCallNode func) {
        return new FunctionArgNode(func);
    }

}

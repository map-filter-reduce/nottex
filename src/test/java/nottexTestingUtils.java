import nottex_ast.FunctionArgNode;
import nottex_ast.FunctionCallNode;
import nottex_ast.Node;
import nottex_ast.StringNode;
import org.junit.Assert;

public class nottexTestingUtils {

    public static boolean equalsNodes(Node one, Node two) {
        return one.equals(two);
    }

    public static void assertEqualNodes(Node expected, Node actual) {
        Assert.assertTrue(equalsNodes(expected, actual));
    }

    public static FunctionArgNode stringArg(String string) {
        return new FunctionArgNode(new StringNode(string));
    }

    public static FunctionArgNode funcArg(FunctionCallNode func) {
        return new FunctionArgNode(func);
    }

}

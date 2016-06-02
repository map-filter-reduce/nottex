import nottexast.FunctionArgNode;
import nottexast.FunctionCallNode;
import nottexast.NottexNode;
import nottexast.literals.StringNode;
import org.junit.Assert;

public class TestUtil {

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

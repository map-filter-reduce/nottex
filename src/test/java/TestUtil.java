import nottexast.FunctionArgAstNode;
import nottexast.FunctionCallAstNode;
import nottexast.NottexAstNode;
import nottexast.literals.StringAstNode;
import org.junit.Assert;

public class TestUtil {

    public static void assertEquals(NottexAstNode expected, NottexAstNode actual) {
        Assert.assertTrue(expected.equals(actual));
    }

    public static FunctionArgAstNode stringArg(String string) {
        return new FunctionArgAstNode(new StringAstNode(string));
    }

    public static FunctionArgAstNode funcArg(FunctionCallAstNode func) {
        return new FunctionArgAstNode(func);
    }

}

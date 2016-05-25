import nottex_ast.Node;
import org.junit.Assert;

public class nottexTestingUtils {

    public static boolean equalsNodes(Node one, Node two) {
        return one.equals(two);
    }

    public static void assertEqualNodes(Node expected, Node actual) {
        Assert.assertTrue(equalsNodes(expected, actual));
    }

}

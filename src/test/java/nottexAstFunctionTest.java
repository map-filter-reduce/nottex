import nottex_ast.FunctionCallNode;
import nottex_ast.RootNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.TreeTest.traverseTree;

public class nottexAstFunctionTest {


    @Test
    public void testSimpleNoArgs() {
        String input = "text";
        RootNode expected = new RootNode(
                new FunctionCallNode()
        );
        nottexTestingUtils.assertEqualNodes(expected, traverseTree("::func()"));
    }



}

import nottex_ast.BlockNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.AstParser.parse;

public class NottexAstTextTest {


    @Test
    public void testSimpleText() {
        String input = "text";
        BlockNode expected = new BlockNode(
                new TextNode(input)
        );
        TestUtil.assertEquals(expected, parse(input));
    }


}

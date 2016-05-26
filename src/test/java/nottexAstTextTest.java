import nottex_ast.BlockNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.NotNotttecParser.parse;

public class nottexAstTextTest {


    @Test
    public void testSimpleText() {
        String input = "text";
        BlockNode expected = new BlockNode(
                new TextNode(input)
        );
        testUtil.assertEquals(expected, parse(input));
    }


}

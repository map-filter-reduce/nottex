import nottex_ast.BlockNode;
import nottex_ast.TagUseNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.NotNotttecParser.parse;

public class nottexAstHybridTest {


    @Test
    public void testSimpleTextTag() {
        String input = "text,,tamm{}";
        BlockNode expected = new BlockNode(
                new TextNode("text"),
                new TagUseNode(null, "tamm")
        );
        testUtil.assertEquals(expected, parse(input));
    }

}

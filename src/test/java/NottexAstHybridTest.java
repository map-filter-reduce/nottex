import nottexast.BlockAstNode;
import nottexast.TagUseAstNode;
import nottexast.TextAstNode;
import org.junit.Test;

import static grammar.AstParser.parse;

public class NottexAstHybridTest {


    @Test
    public void testSimpleTextTag() {
        String input = "text,,tamm{}";
        BlockAstNode expected = new BlockAstNode(
                new TextAstNode("text"),
                new TagUseAstNode(null, "tamm")
        );
        TestUtil.assertEquals(expected, parse(input));
    }

}

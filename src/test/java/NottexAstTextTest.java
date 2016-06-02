import nottexast.BlockNode;
import nottexast.TextNode;
import org.junit.Test;

import java.util.Arrays;

import static grammar.AstParser.parse;

public class NottexAstTextTest {

    @Test
    public void testSimpleText1() {
        String input = "text";
        BlockNode expected = new BlockNode(
                new TextNode(input)
        );
        TestUtil.assertEquals(expected, parse(input));
    }

    @Test
    public void testSimpleText2() {
        String input = "text\n\nline";
        BlockNode expected = new BlockNode(
                new TextNode(Arrays.asList("text", "line"))
        );
        TestUtil.assertEquals(expected, parse(input));
    }


}

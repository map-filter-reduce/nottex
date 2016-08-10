import nottexast.BlockAstNode;
import nottexast.TextAstNode;
import org.junit.Test;

import java.util.Arrays;

import static grammar.AstParser.parse;

public class NottexAstTextTest {

    @Test
    public void testSimpleText1() {
        String input = "text";
        BlockAstNode expected = new BlockAstNode(
                new TextAstNode(input)
        );
        TestUtil.assertEquals(expected, parse(input));
    }

    @Test
    public void testSimpleText2() {
        String input = "text\n\nline";
        BlockAstNode expected = new BlockAstNode(
                new TextAstNode(Arrays.asList("text", "line"))
        );
        TestUtil.assertEquals(expected, parse(input));
    }


}

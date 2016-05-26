import nottex_ast.RootNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.NottexParser.parse;

public class nottexAstTextTest {


    @Test
    public void testSimpleText() {
        String input = "text";
        RootNode expected = new RootNode(
                new TextNode(input)
        );
        testUtil.assertEquals(expected, parse(input));
    }


}

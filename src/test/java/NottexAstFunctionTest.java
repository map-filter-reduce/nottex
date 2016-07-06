import nottexast.BlockNode;
import nottexast.FunctionCallNode;
import org.junit.Test;

import static grammar.AstParser.parse;

public class NottexAstFunctionTest {


    @Test
    public void testSimpleNoArgs() {
        String input = "::func()";
        BlockNode expected = new BlockNode(
                new FunctionCallNode("func")
        );
        TestUtil.assertEquals(expected, parse(input));
    }


    @Test
    public void testSimpleArgs1() {
        String input1 = "::func(\"\")";
        BlockNode expected1 = new BlockNode(
                new FunctionCallNode("func", TestUtil.stringArg(""))
        );
        TestUtil.assertEquals(expected1, parse(input1));
    }


    @Test
    public void testSimpleArgs2() {
        String input2 = "::func(\"abc\")";
        BlockNode expected2 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.stringArg("abc"))
        );
        TestUtil.assertEquals(expected2, parse(input2));
    }


    @Test
    public void testSimpleArgs3() {
        String input3 = "::func(\"mam\", \"\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.stringArg("mam"),
                        TestUtil.stringArg(""))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testSimpleArgs4() {
        String input3 = "::func(::fa())";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.funcArg(new FunctionCallNode("fa")))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs5() {
        String input3 = "::func(::fa(), \"af\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.funcArg(new FunctionCallNode("fa")),
                        TestUtil.stringArg("af"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs6() {
        String input3 = "::func(::fa(\"a\"), \"af\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.funcArg(
                                new FunctionCallNode("fa",
                                        TestUtil.stringArg("a"))
                        ),
                        TestUtil.stringArg("af"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testWhitespace1() {
        String input3 = "::func  (  \"af\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.stringArg("af"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testWhitespace2() {
        String input3 = "::func(  \"af \" )";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.stringArg("af "))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testQuoteEscape1() {
        String input3 = "::func(\"af\\\"fas \")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.stringArg("af\"fas "))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testQuoteEscape2() {
        String input3 = "::func(\"\\\"\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.stringArg("\""))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testQuoteEscape3() {
        String input3 = "::func(\"\\\\\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        TestUtil.stringArg("\\"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }
}

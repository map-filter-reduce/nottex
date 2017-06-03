import nottexast.BlockAstNode;
import nottexast.FunctionCallAstNode;
import org.junit.Test;

import static grammar.AstParser.parse;

public class NottexAstFunctionTest {


    @Test
    public void testSimpleNoArgs() {
        String input = "::func()";
        BlockAstNode expected = new BlockAstNode(
                new FunctionCallAstNode("func")
        );
        TestUtil.assertEquals(expected, parse(input));
    }


    @Test
    public void testSimpleArgs1() {
        String input1 = "::func(\"\")";
        BlockAstNode expected1 = new BlockAstNode(
                new FunctionCallAstNode("func", TestUtil.stringArg(""))
        );
        TestUtil.assertEquals(expected1, parse(input1));
    }


    @Test
    public void testSimpleArgs2() {
        String input2 = "::func(\"abc\")";
        BlockAstNode expected2 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.stringArg("abc"))
        );
        TestUtil.assertEquals(expected2, parse(input2));
    }


    @Test
    public void testSimpleArgs3() {
        String input3 = "::func(\"mam\", \"\")";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.stringArg("mam"),
                        TestUtil.stringArg(""))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testSimpleArgs4() {
        String input3 = "::func(::fa())";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.funcArg(new FunctionCallAstNode("fa")))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs5() {
        String input3 = "::func(::fa(), \"af\")";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.funcArg(new FunctionCallAstNode("fa")),
                        TestUtil.stringArg("af"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs6() {
        String input3 = "::func(::fa(\"a\"), \"af\")";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.funcArg(
                                new FunctionCallAstNode("fa",
                                        TestUtil.stringArg("a"))
                        ),
                        TestUtil.stringArg("af"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testWhitespace1() {
        String input3 = "::func  (  \"af\")";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.stringArg("af"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testWhitespace2() {
        String input3 = "::func(  \"af \" )";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.stringArg("af "))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testQuoteEscape1() {
        String input3 = "::func(\"af\\\"fas \")";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.stringArg("af\"fas "))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testQuoteEscape2() {
        String input3 = "::func(\"\\\"\")";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.stringArg("\""))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testQuoteEscape3() {
        String input3 = "::func(\"\\\\\")";
        BlockAstNode expected3 = new BlockAstNode(
                new FunctionCallAstNode("func",
                        TestUtil.stringArg("\\"))
        );
        TestUtil.assertEquals(expected3, parse(input3));
    }
}

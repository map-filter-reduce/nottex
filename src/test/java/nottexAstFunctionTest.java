import nottex_ast.BlockNode;
import nottex_ast.FunctionCallNode;
import org.junit.Test;

import static grammar.AstParser.parse;

public class nottexAstFunctionTest {


    @Test
    public void testSimpleNoArgs() {
        String input = "::func()";
        BlockNode expected = new BlockNode(
                new FunctionCallNode("func")
        );
        testUtil.assertEquals(expected, parse(input));
    }


    @Test
    public void testSimpleArgs1() {
        String input1 = "::func(\"\")";
        BlockNode expected1 = new BlockNode(
                new FunctionCallNode("func", testUtil.stringArg(""))
        );
        testUtil.assertEquals(expected1, parse(input1));
    }


    @Test
    public void testSimpleArgs2() {
        String input2 = "::func(\"abc\")";
        BlockNode expected2 = new BlockNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("abc"))
        );
        testUtil.assertEquals(expected2, parse(input2));
    }


    @Test
    public void testSimpleArgs3() {
        String input3 = "::func(\"mam\", \"\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("mam"),
                        testUtil.stringArg(""))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testSimpleArgs4() {
        String input3 = "::func(::fa())";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        testUtil.funcArg(new FunctionCallNode("fa")))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs5() {
        String input3 = "::func(::fa(), \"af\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        testUtil.funcArg(new FunctionCallNode("fa")),
                        testUtil.stringArg("af"))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs6() {
        String input3 = "::func(::fa(\"a\"), \"af\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        testUtil.funcArg(
                                new FunctionCallNode("fa",
                                        testUtil.stringArg("a"))
                        ),
                        testUtil.stringArg("af"))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testWhitespace1() {
        String input3 = "::func  (  \"af\")";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("af"))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testWhitespace2() {
        String input3 = "::func(  \"af \" )";
        BlockNode expected3 = new BlockNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("af "))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }

}

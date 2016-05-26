import nottex_ast.FunctionCallNode;
import nottex_ast.RootNode;
import org.junit.Test;

import static grammar.NottexParser.parse;

public class nottexAstFunctionTest {


    @Test
    public void testSimpleNoArgs() {
        String input = "::func()";
        RootNode expected = new RootNode(
                new FunctionCallNode("func")
        );
        testUtil.assertEquals(expected, parse(input));
    }


    @Test
    public void testSimpleArgs1() {
        String input1 = "::func(\"\")";
        RootNode expected1 = new RootNode(
                new FunctionCallNode("func", testUtil.stringArg(""))
        );
        testUtil.assertEquals(expected1, parse(input1));
    }


    @Test
    public void testSimpleArgs2() {
        String input2 = "::func(\"abc\")";
        RootNode expected2 = new RootNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("abc"))
        );
        testUtil.assertEquals(expected2, parse(input2));
    }


    @Test
    public void testSimpleArgs3() {
        String input3 = "::func(\"mam\", \"\")";
        RootNode expected3 = new RootNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("mam"),
                        testUtil.stringArg(""))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testSimpleArgs4() {
        String input3 = "::func(::fa())";
        RootNode expected3 = new RootNode(
                new FunctionCallNode("func",
                        testUtil.funcArg(new FunctionCallNode("fa")))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs5() {
        String input3 = "::func(::fa(), \"af\")";
        RootNode expected3 = new RootNode(
                new FunctionCallNode("func",
                        testUtil.funcArg(new FunctionCallNode("fa")),
                        testUtil.stringArg("af"))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }

    @Test
    public void testSimpleArgs6() {
        String input3 = "::func(::fa(\"a\"), \"af\")";
        RootNode expected3 = new RootNode(
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
        RootNode expected3 = new RootNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("af"))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }


    @Test
    public void testWhitespace2() {
        String input3 = "::func(  \"af \" )";
        RootNode expected3 = new RootNode(
                new FunctionCallNode("func",
                        testUtil.stringArg("af "))
        );
        testUtil.assertEquals(expected3, parse(input3));
    }

}

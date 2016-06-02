

import grammar.FunctionReducer;
import nottexast.BlockNode;
import nottexast.TagUseNode;
import nottexast.TextNode;
import nottexast.literals.IntNode;
import nottexast.literals.StringNode;
import org.junit.Test;

import java.util.Arrays;

import static grammar.AstParser.parse;

public class NottexFunctionEvalTest {


    @Test
    public void testSimpleNoArgs() {
        String input = "::testEmpty()";
        BlockNode expected = new BlockNode(
                new StringNode("TEST")
        );
        TestUtil.assertEquals(expected, FunctionReducer.reduceFunctions(parse(input)));
    }


    @Test
    public void testSimpleArgs1() {
        String input1 = "::testUpperCase(\"\")";
        BlockNode expected1 = new BlockNode(
                new StringNode(""));
        TestUtil.assertEquals(expected1, FunctionReducer.reduceFunctions(parse(input1)));
    }


    @Test
    public void testSimpleArgs2() {
        String input2 = "::testUpperCase(\"abc\")";
        BlockNode expected2 = new BlockNode(
                new StringNode("ABC")
        );
        TestUtil.assertEquals(expected2, FunctionReducer.reduceFunctions(parse(input2)));
    }


    @Test
    public void testSimpleArgs3() {
        String input3 = "::testRepeat(\"g\",5)";
        BlockNode expected3 = new BlockNode(
                new StringNode("ggggg")
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }


    @Test
    public void testSimpleArgs4() {
        String input3 = "::testAdd(::testAdd(1,3),5)";
        BlockNode expected3 = new BlockNode(
                new IntNode(9)
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }

    @Test
    public void testSimpleArgs5() {
        String input3 = "::testRepeat(\"af\",::testAdd(1,4))";
        BlockNode expected3 = new BlockNode(
                new StringNode("afafafafaf"));
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }

    @Test
    public void testFunctionInTag6() {
        String input3 = ",,tag{::testRepeat(\"af\",::testAdd(1,4))text}";
        BlockNode expected3 = new BlockNode(
                new TagUseNode(
                        Arrays.asList(
                                new StringNode("afafafafaf"), new TextNode("text")), "tag")
        );

        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }


    @Test
    public void testWhitespace1() {
        String input3 = "::testUpperCase  (  \"af\")";
        BlockNode expected3 = new BlockNode(
                new StringNode("AF")
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }


    @Test
    public void testWhitespace2() {
        String input3 = "::testUpperCase  (  \"af\"  )";
        BlockNode expected3 = new BlockNode(
                new StringNode("AF")
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }

}



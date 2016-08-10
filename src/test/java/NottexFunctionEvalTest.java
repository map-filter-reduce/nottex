

import grammar.FunctionReducer;
import nottexast.BlockAstNode;
import nottexast.TagUseAstNode;
import nottexast.TextAstNode;
import nottexast.literals.IntAstNode;
import nottexast.literals.StringAstNode;
import org.junit.Test;

import java.util.Arrays;

import static grammar.AstParser.parse;

public class NottexFunctionEvalTest {


    @Test
    public void testSimpleNoArgs() {
        String input = "::testEmpty()";
        BlockAstNode expected = new BlockAstNode(
                new StringAstNode("TEST")
        );
        TestUtil.assertEquals(expected, FunctionReducer.reduceFunctions(parse(input)));
    }


    @Test
    public void testSimpleArgs1() {
        String input1 = "::testUpperCase(\"\")";
        BlockAstNode expected1 = new BlockAstNode(
                new StringAstNode(""));
        TestUtil.assertEquals(expected1, FunctionReducer.reduceFunctions(parse(input1)));
    }


    @Test
    public void testSimpleArgs2() {
        String input2 = "::testUpperCase(\"abc\")";
        BlockAstNode expected2 = new BlockAstNode(
                new StringAstNode("ABC")
        );
        TestUtil.assertEquals(expected2, FunctionReducer.reduceFunctions(parse(input2)));
    }


    @Test
    public void testSimpleArgs3() {
        String input3 = "::testRepeat(\"g\",5)";
        BlockAstNode expected3 = new BlockAstNode(
                new StringAstNode("ggggg")
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }


    @Test
    public void testSimpleArgs4() {
        String input3 = "::testAdd(::testAdd(1,3),5)";
        BlockAstNode expected3 = new BlockAstNode(
                new IntAstNode(9)
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }

    @Test
    public void testSimpleArgs5() {
        String input3 = "::testRepeat(\"af\",::testAdd(1,4))";
        BlockAstNode expected3 = new BlockAstNode(
                new StringAstNode("afafafafaf"));
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }

    @Test
    public void testFunctionInTag6() {
        String input3 = ",,tag{::testRepeat(\"af\",::testAdd(1,4))text}";
        BlockAstNode expected3 = new BlockAstNode(
                new TagUseAstNode(
                        Arrays.asList(
                                new StringAstNode("afafafafaf"), new TextAstNode("text")), "tag")
        );

        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }


    @Test
    public void testWhitespace1() {
        String input3 = "::testUpperCase  (  \"af\")";
        BlockAstNode expected3 = new BlockAstNode(
                new StringAstNode("AF")
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }


    @Test
    public void testWhitespace2() {
        String input3 = "::testUpperCase  (  \"af\"  )";
        BlockAstNode expected3 = new BlockAstNode(
                new StringAstNode("AF")
        );
        TestUtil.assertEquals(expected3, FunctionReducer.reduceFunctions(parse(input3)));
    }

}



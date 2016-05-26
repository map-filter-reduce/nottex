import nottex_ast.BlockNode;
import nottex_ast.FunctionCallNode;
import nottex_ast.TagUseNode;
import nottex_ast.TextNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static grammar.AstParser.parse;


public class nottexAstTagTest {

    @Test
    public void emptyTag1() {
        BlockNode expected1 = new BlockNode(
                new TagUseNode(null, "tag")
        );
        testUtil.assertEquals(expected1, parse(",,tag{}"));
    }

    @Test
    public void emptyTag2() {
        BlockNode expected = new BlockNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        testUtil.assertEquals(expected, parse(",,tag1 , tag2  , \n tag3 {}"));
    }

    @Test
    public void emptyTag3() {
        BlockNode expected2 = new BlockNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        testUtil.assertEquals(expected2, parse(",,tag1,tag2,tag3{}"));
    }

    @Test
    public void emptyTag4() {
        BlockNode expected = new BlockNode(
                new TagUseNode(null, "tag1", "tag2", "tag3"),
                new TagUseNode(null, "tag3", "tag5", "tag6")
        );
        testUtil.assertEquals(expected, parse(",,tag1 , tag2  , tag3 {},,tag3 , tag5  , tag6 {}"));
    }

    @Test
    public void tagsWithEmptyTags1() {
        BlockNode expected1 = new BlockNode(
                new TagUseNode(
                        Collections.singletonList(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ))
                        , "tag1", "tag2", "tag3")
        );
        testUtil.assertEquals(expected1, parse(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}}"));

    }

    @Test
    public void tagsWithEmptyTags2() {
        BlockNode expected2 = new BlockNode(
                new TagUseNode(
                        Collections.singletonList(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                )),
                        "tag1", "tag2", "tag3"),
                new TagUseNode(
                        null, "second"
                )
        );
        testUtil.assertEquals(expected2, parse(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}},,second{}"));
    }


    @Test
    public void testTagsWithText1() {
        BlockNode expected1 = new BlockNode(
                new TagUseNode(
                        Collections.singletonList(
                                new TextNode("text")), "tag1")
        );
        testUtil.assertEquals(expected1, parse(",,tag1{text}"));
    }

    @Test
    public void testTagsWithText2() {
        BlockNode expected2 = new BlockNode(
                new TagUseNode(
                        Arrays.asList(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextNode("text")),
                        "tag1", "tag2", "tag3"),
                new TagUseNode(
                        null, "second"
                )
        );
        testUtil.assertEquals(expected2, parse(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}text},,second{}"));
    }

    @Test
    public void testTagsWithText3() {
        BlockNode expected3 = new BlockNode(
                new TagUseNode(
                        Arrays.asList(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextNode("text"),
                                new TagUseNode(
                                        Collections.singletonList(
                                                new TextNode("s")
                                        ), "tag")),
                        "tag1", "tag2", "tag3"),
                new TagUseNode(
                        null, "second"
                )
        );
        testUtil.assertEquals(expected3, parse(",,tag1,tag2,tag3 \n{,,tag4 , tag5,tag6{}text,,tag{s}},,second{}"));
    }

    @Test
    public void testTagsWithText4() {
        BlockNode expected4 = new BlockNode(
                new TagUseNode(
                        Arrays.asList(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextNode("text"),
                                new TagUseNode(
                                        Collections.singletonList(
                                                new TextNode("s")
                                        ), "tag")),
                        "tag1", "tag2", "tag3"),
                new TagUseNode(
                        null, "second"
                )
        );
        testUtil.assertEquals(expected4, parse(",,tag1,tag2,tag3 \n{,,tag4 , tag5,tag6{}text,,tag{s}},,second{}"));
    }

    @Test
    public void testTagFunction1() {
        BlockNode expected1 = new BlockNode(
                new TagUseNode(
                        Collections.singletonList(
                                new FunctionCallNode("fun")), "tag")
        );
        testUtil.assertEquals(expected1, parse(",,tag{::fun()}"));
    }

    @Test
    public void testTagFunction2() {
        BlockNode expected2 = new BlockNode(
                new TagUseNode(
                        Arrays.asList(
                                new TagUseNode(null, "tagBefore"),
                                new FunctionCallNode("fun"),
                                new TagUseNode(null, "tagAfter")
                        )
                        , "tag"));
        testUtil.assertEquals(expected2, parse(",,tag{,,tagBefore{}::fun(),,tagAfter{}}"));
    }

}
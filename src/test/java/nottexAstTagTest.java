import nottex_ast.FunctionCallNode;
import nottex_ast.RootNode;
import nottex_ast.TagUseNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.NotNotttecParser.parse;


public class nottexAstTagTest {

    @Test
    public void emptyTag1() {
        RootNode expected1 = new RootNode(
                new TagUseNode(null, "tag")
        );
        testUtil.assertEquals(expected1, parse(",,tag{}"));
    }

    @Test
    public void emptyTag2() {
        RootNode expected = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        testUtil.assertEquals(expected, parse(",,tag1 , tag2  , \n tag3 {}"));
    }

    @Test
    public void emptyTag3() {
        RootNode expected2 = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        testUtil.assertEquals(expected2, parse(",,tag1,tag2,tag3{}"));
    }

    @Test
    public void emptyTag4() {
        RootNode expected = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3"),
                new TagUseNode(null, "tag3", "tag5", "tag6")
        );
        testUtil.assertEquals(expected, parse(",,tag1 , tag2  , tag3 {},,tag3 , tag5  , tag6 {}"));
    }

    @Test
    public void tagsWithEmptyTags1() {
        RootNode expected1 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ))
                        , "tag1", "tag2", "tag3")
        );
        testUtil.assertEquals(expected1, parse(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}}"));

    }

    @Test
    public void tagsWithEmptyTags2() {
        RootNode expected2 = new RootNode(
                new TagUseNode(
                        new RootNode(
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
        RootNode expected1 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TextNode("text")), "tag1")
        );
        testUtil.assertEquals(expected1, parse(",,tag1{text}"));
    }

    @Test
    public void testTagsWithText2() {
        RootNode expected2 = new RootNode(
                new TagUseNode(
                        new RootNode(
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
        RootNode expected3 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextNode("text"),
                                new TagUseNode(
                                        new RootNode(
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
        RootNode expected4 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextNode("text"),
                                new TagUseNode(
                                        new RootNode(
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
        RootNode expected1 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new FunctionCallNode("fun")), "tag")
        );
        testUtil.assertEquals(expected1, parse(",,tag{::fun()}"));
    }

    @Test
    public void testTagFunction2() {
        RootNode expected2 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TagUseNode(null, "tagBefore"),
                                new FunctionCallNode("fun"),
                                new TagUseNode(null, "tagAfter")
                        )
                        , "tag"));
        testUtil.assertEquals(expected2, parse(",,tag{,,tagBefore{}::fun(),,tagAfter{}}"));
    }

}
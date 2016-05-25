import nottex_ast.FunctionCallNode;
import nottex_ast.RootNode;
import nottex_ast.TagUseNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.TreeTest.traverseTree;


public class nottexAstTagTest {


    @Test
    public void emptyTag1() {
        RootNode expected1 = new RootNode(
                new TagUseNode(null, "tag")
        );
        nottexTestingUtils.assertEqualNodes(expected1, traverseTree(",,tag{}"));
    }

    @Test
    public void emptyTag2() {
        RootNode expected = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        nottexTestingUtils.assertEqualNodes(expected, traverseTree(",,tag1 , tag2  , \n tag3 {}"));
    }

    @Test
    public void emptyTag3() {
        RootNode expected2 = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        nottexTestingUtils.assertEqualNodes(expected2, traverseTree(",,tag1,tag2,tag3{}"));
    }

    @Test
    public void emptyTag4() {
        RootNode expected = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3"),
                new TagUseNode(null, "tag3", "tag5", "tag6")
        );
        nottexTestingUtils.assertEqualNodes(expected, traverseTree(",,tag1 , tag2  , tag3 {},,tag3 , tag5  , tag6 {}"));
    }


    @Test
    public void tagsWithEmptyTags1(){
        RootNode expected1 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TagUseNode(
                                        null, "tag4", "tag5", "tag6"
                                ))
                        , "tag1", "tag2", "tag3")
        );
        nottexTestingUtils.assertEqualNodes(expected1, traverseTree(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}}"));

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
        nottexTestingUtils.assertEqualNodes(expected2, traverseTree(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}},,second{}"));
    }


    @Test
    public void testTagsWithText() {
        RootNode expected1 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TextNode("text")), "tag1")
        );
        nottexTestingUtils.assertEqualNodes(expected1, traverseTree(",,tag1{text}"));


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
        nottexTestingUtils.assertEqualNodes(expected2, traverseTree(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}text},,second{}"));

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
        nottexTestingUtils.assertEqualNodes(expected3, traverseTree(",,tag1,tag2,tag3 \n{,,tag4 , tag5,tag6{}text,,tag{s}},,second{}"));


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
        nottexTestingUtils.assertEqualNodes(expected4, traverseTree(",,tag1,tag2,tag3 \n{,,tag4 , tag5,tag6{}text,,tag{s}},,second{}"));
    }


    @Test
    public void testTagFunction() {

        RootNode expected1 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new FunctionCallNode("fun")), "tag")
        );
        nottexTestingUtils.assertEqualNodes(expected1, traverseTree(",,tag{::fun()}"));

        RootNode expected2 = new RootNode(
                new TagUseNode(
                        new RootNode(
                                new TagUseNode(null, "tagBefore"), new FunctionCallNode("fun"), new TagUseNode(null, "tagAfter")
                        )
                        , "tag"));
        nottexTestingUtils.assertEqualNodes(expected2, traverseTree(",,tag{,,tagBefore{}::fun(),,tagAfter{}}"));


    }


}
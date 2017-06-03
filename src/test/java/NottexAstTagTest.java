import nottexast.*;
import nottexast.BlockAstNode;
import nottexast.FunctionCallAstNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static grammar.AstParser.parse;


public class NottexAstTagTest {

    @Test
    public void emptyTag1() {
        BlockAstNode expected1 = new BlockAstNode(
                new TagUseAstNode(null, "tag")
        );
        TestUtil.assertEquals(expected1, parse(",,tag{}"));
    }

    @Test
    public void emptyTag2() {
        BlockAstNode expected = new BlockAstNode(
                new TagUseAstNode(null, "tag1", "tag2", "tag3")
        );
        TestUtil.assertEquals(expected, parse(",,tag1 , tag2  , \n tag3 {}"));
    }

    @Test
    public void emptyTag3() {
        BlockAstNode expected2 = new BlockAstNode(
                new TagUseAstNode(null, "tag1", "tag2", "tag3")
        );
        TestUtil.assertEquals(expected2, parse(",,tag1,tag2,tag3{}"));
    }

    @Test
    public void emptyTag4() {
        BlockAstNode expected = new BlockAstNode(
                new TagUseAstNode(null, "tag1", "tag2", "tag3"),
                new TagUseAstNode(null, "tag3", "tag5", "tag6")
        );
        TestUtil.assertEquals(expected, parse(",,tag1 , tag2  , tag3 {},,tag3 , tag5  , tag6 {}"));
    }

    @Test
    public void tagsWithEmptyTags1() {
        BlockAstNode expected1 = new BlockAstNode(
                new TagUseAstNode(
                        Collections.singletonList(
                                new TagUseAstNode(
                                        null, "tag4", "tag5", "tag6"
                                ))
                        , "tag1", "tag2", "tag3")
        );
        TestUtil.assertEquals(expected1, parse(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}}"));

    }

    @Test
    public void tagsWithEmptyTags2() {
        BlockAstNode expected2 = new BlockAstNode(
                new TagUseAstNode(
                        Collections.singletonList(
                                new TagUseAstNode(
                                        null, "tag4", "tag5", "tag6"
                                )),
                        "tag1", "tag2", "tag3"),
                new TagUseAstNode(
                        null, "second"
                )
        );
        TestUtil.assertEquals(expected2, parse(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}},,second{}"));
    }


    @Test
    public void testTagsWithText1() {
        BlockAstNode expected1 = new BlockAstNode(
                new TagUseAstNode(
                        Collections.singletonList(
                                new TextAstNode("text")), "tag1")
        );
        TestUtil.assertEquals(expected1, parse(",,tag1{text}"));
    }

    @Test
    public void testTagsWithText2() {
        BlockAstNode expected2 = new BlockAstNode(
                new TagUseAstNode(
                        Arrays.asList(
                                new TagUseAstNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextAstNode("text")),
                        "tag1", "tag2", "tag3"),
                new TagUseAstNode(
                        null, "second"
                )
        );
        TestUtil.assertEquals(expected2, parse(",,tag1,tag2,tag3{,,tag4,tag5,tag6{}text},,second{}"));
    }

    @Test
    public void testTagsWithText3() {
        BlockAstNode expected3 = new BlockAstNode(
                new TagUseAstNode(
                        Arrays.asList(
                                new TagUseAstNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextAstNode("text"),
                                new TagUseAstNode(
                                        Collections.singletonList(
                                                new TextAstNode("s")
                                        ), "tag")),
                        "tag1", "tag2", "tag3"),
                new TagUseAstNode(
                        null, "second"
                )
        );
        TestUtil.assertEquals(expected3, parse(",,tag1,tag2,tag3 \n{,,tag4 , tag5,tag6{}text,,tag{s}},,second{}"));
    }

    @Test
    public void testTagsWithText4() {
        BlockAstNode expected4 = new BlockAstNode(
                new TagUseAstNode(
                        Arrays.asList(
                                new TagUseAstNode(
                                        null, "tag4", "tag5", "tag6"
                                ),
                                new TextAstNode("text"),
                                new TagUseAstNode(
                                        Collections.singletonList(
                                                new TextAstNode("s")
                                        ), "tag")),
                        "tag1", "tag2", "tag3"),
                new TagUseAstNode(
                        null, "second"
                )
        );
        TestUtil.assertEquals(expected4, parse(",,tag1,tag2,tag3 \n{,,tag4 , tag5,tag6{}text,,tag{s}},,second{}"));
    }

    @Test
    public void testTagFunction1() {
        BlockAstNode expected1 = new BlockAstNode(
                new TagUseAstNode(
                        Collections.singletonList(
                                new FunctionCallAstNode("fun")), "tag")
        );
        TestUtil.assertEquals(expected1, parse(",,tag{::fun()}"));
    }

    @Test
    public void testTagFunction2() {
        BlockAstNode expected2 = new BlockAstNode(
                new TagUseAstNode(
                        Arrays.asList(
                                new TagUseAstNode(null, "tagBefore"),
                                new FunctionCallAstNode("fun"),
                                new TagUseAstNode(null, "tagAfter")
                        )
                        , "tag"));
        TestUtil.assertEquals(expected2, parse(",,tag{,,tagBefore{}::fun(),,tagAfter{}}"));
    }

}

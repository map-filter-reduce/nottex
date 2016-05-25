import nottex_ast.RootNode;
import nottex_ast.TagUseNode;
import org.junit.Test;

import static grammar.TreeTest.traverseTree;


public class nottexAstTagTest {





    @Test
    public void testEmptyTags() {
        String input1 = ",,tag{}";
        RootNode expected1 = new RootNode(
                new TagUseNode(null, "tag")
        );
        nottexTestingUtils.assertEqualNodes(expected1, traverseTree(input1));

        String input2 = ",,tag1,tag2,tag3{}";
        RootNode expected2 = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        nottexTestingUtils.assertEqualNodes(expected2, traverseTree(input2));

        String input3 = ",,tag1 , tag2  , \n tag3 {}";
        RootNode expected3 = new RootNode(
                new TagUseNode(null, "tag1", "tag2", "tag3")
        );
        nottexTestingUtils.assertEqualNodes(expected3, traverseTree(input3));


    }



}

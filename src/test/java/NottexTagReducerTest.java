import grammar.Style;
import grammar.StyleType;
import grammar.TagReducer;
import grammar.Text;
import nottexast.BlockNode;
import nottexast.NottexNode;
import nottexast.TagUseNode;
import nottexast.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class NottexTagReducerTest {

    @Test
    public void tagRed() {
        NottexNode root = new BlockNode(
                new TagUseNode(
                        Collections.singletonList(new TextNode(Arrays.asList("Test", "test"))),
                        "red")
        );
        List<Text> textLst = TagReducer.reduceTags(root);
        Assert.assertEquals(1, textLst.size());

        Map<StyleType, Style> expectedStyles = new HashMap<>();
        expectedStyles.put(StyleType.TEXT_COLOR, new Style("red"));

        Assert.assertEquals(expectedStyles, textLst.get(0).getStyles());
        Assert.assertEquals(Arrays.asList("Test", "test"), textLst.get(0).getParagraphs());
    }

    @Test
    public void testNoStyle() throws Exception {
        NottexNode root = new BlockNode(
                new TextNode("Test")
        );
        List<Text> textLst = TagReducer.reduceTags(root);
        Assert.assertEquals(1, textLst.size());

        Map<StyleType, Style> expectedStyles = new HashMap<>();

        Assert.assertEquals(expectedStyles, textLst.get(0).getStyles());
        Assert.assertEquals(Collections.singletonList("Test"), textLst.get(0).getParagraphs());
    }

    @Test
    public void testOverwriteStyles() throws Exception {
        NottexNode root = new BlockNode(
                new TagUseNode(
                        Collections.singletonList(new TagUseNode(
                                Collections.singletonList(new TextNode("Test")),
                                "blue"
                        )),
                        "red")
        );
        List<Text> textLst = TagReducer.reduceTags(root, new HashMap<>());
        Assert.assertEquals(1, textLst.size());

        Map<StyleType, Style> expectedStyles = new HashMap<>();
        expectedStyles.put(StyleType.TEXT_COLOR, new Style("blue"));

        Assert.assertEquals(expectedStyles, textLst.get(0).getStyles());
        Assert.assertEquals(Collections.singletonList("Test"), textLst.get(0).getParagraphs());
    }

    @Test
    public void testMultipleTags() throws Exception {
        NottexNode root = new BlockNode(
                new TagUseNode(
                        Collections.singletonList(new TagUseNode(
                                Collections.singletonList(new TextNode("Test")),
                                "garamond"
                        )),
                        "red")
        );
        List<Text> textLst = TagReducer.reduceTags(root, new HashMap<>());
        Assert.assertEquals(1, textLst.size());

        Map<StyleType, Style> expectedStyles = new HashMap<>();
        expectedStyles.put(StyleType.TEXT_COLOR, new Style("red"));
        expectedStyles.put(StyleType.FONT_FAMILY, new Style("garamond"));

        Assert.assertEquals(expectedStyles, textLst.get(0).getStyles());
        Assert.assertEquals(Collections.singletonList("Test"), textLst.get(0).getParagraphs());
    }
}

import post_processing.style_management.Style;
import post_processing.style_management.StyleType;
import post_processing.style_management.TagReducer;
import post_processing.text_structuring.Text;
import nottexast.*;
import nottexast.BlockAstNode;
import nottexast.NottexAstNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class NottexTagReducerTest {

    @Test
    public void tagRed() {
        NottexAstNode root = new BlockAstNode(
                new TagUseAstNode(
                        Collections.singletonList(new TextAstNode("Test")),
                        "red")
        );
        List<Text> textLst = TagReducer.reduceTags(root);
        Assert.assertEquals(1, textLst.size());

        Map<StyleType, Style> expectedStyles = new HashMap<>();
        expectedStyles.put(StyleType.TEXT_COLOR, new Style("red"));

        Assert.assertEquals(expectedStyles, textLst.get(0).getStyles());
        Assert.assertEquals("Test", textLst.get(0).getContent());
    }

    @Test
    public void testNoStyle() throws Exception {
        NottexAstNode root = new BlockAstNode(
                new TextAstNode("Test")
        );
        List<Text> textLst = TagReducer.reduceTags(root);
        Assert.assertEquals(1, textLst.size());

        Map<StyleType, Style> expectedStyles = new HashMap<>();

        Assert.assertEquals(expectedStyles, textLst.get(0).getStyles());
        Assert.assertEquals("Test", textLst.get(0).getContent());
    }

    @Test
    public void testOverwriteStyles() throws Exception {
        NottexAstNode root = new BlockAstNode(
                new TagUseAstNode(
                        Collections.singletonList(new TagUseAstNode(
                                Collections.singletonList(new TextAstNode("Test")),
                                "blue"
                        )),
                        "red")
        );
        List<Text> textLst = TagReducer.reduceTags(root, new HashMap<>());
        Assert.assertEquals(1, textLst.size());

        Map<StyleType, Style> expectedStyles = new HashMap<>();
        expectedStyles.put(StyleType.TEXT_COLOR, new Style("blue"));

        Assert.assertEquals(expectedStyles, textLst.get(0).getStyles());
        Assert.assertEquals("Test", textLst.get(0).getContent());
    }

    @Test
    public void testMultipleTags() throws Exception {
        NottexAstNode root = new BlockAstNode(
                new TagUseAstNode(
                        Collections.singletonList(new TagUseAstNode(
                                Collections.singletonList(new TextAstNode("Test")),
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
        Assert.assertEquals("Test", textLst.get(0).getContent());
    }
}

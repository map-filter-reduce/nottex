package grammar;

import nottexast.BlockAstNode;
import nottexast.NottexAstNode;
import nottexast.TagUseAstNode;
import nottexast.TextAstNode;

import java.util.*;
import java.util.stream.Collectors;

public class TagReducer {


    /**
     * @param node function-reduced tree
     * @return tag-reduced list
     */
    public static List<Text> reduceTags(NottexAstNode node) {
        return reduceTags(node,new HashMap<>());
    }

    /**
     * @param node function-reduced tree
     * @return tag-reduced list
     */
    public static List<Text> reduceTags(NottexAstNode node, Map<StyleType, Style> styles) {
        List<Text> result = new ArrayList<>();

        if (node instanceof BlockAstNode) {
            ((BlockAstNode) node).getChildren().stream()
                    .map(n -> reduceTags(n, new HashMap<>()))
                    .forEach(result::addAll);

        } else if (node instanceof TagUseAstNode) {
            TagUseAstNode tagUseNode = (TagUseAstNode) node;
            Map<StyleType, Style> styleMap = tagUseNode.getNames().stream()
                    .map(Style::new)
                    .collect(Collectors.toMap(Style::getStyleType, style -> style));

            Map<StyleType, Style> stylesCopy = new HashMap<>(styles);
            stylesCopy.putAll(styleMap);
            tagUseNode.getChildren().stream()
                    .map(useNode -> reduceTags(useNode, stylesCopy))
                    .forEach(result::addAll);

        } else if (node instanceof TextAstNode) {
            TextAstNode textNode = (TextAstNode) node;
            Text text = new Text(textNode.getParagraphs(), styles);
            result.add(text);
        }
        return result;
    }

}

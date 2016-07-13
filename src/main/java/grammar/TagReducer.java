package grammar;

import nottexast.BlockNode;
import nottexast.NottexNode;
import nottexast.TagUseNode;
import nottexast.TextNode;

import java.util.*;
import java.util.stream.Collectors;

public class TagReducer {

    /**
     * @param node function-reduced tree
     * @return tag-reduced list
     */
    public static List<Text> reduceTags(NottexNode node, Map<StyleType, Style> styles) {
        List<Text> result = new ArrayList<>();

        if (node instanceof BlockNode) {
            ((BlockNode) node).getChildren().stream()
                    .map(n -> reduceTags(n, new HashMap<>()))
                    .forEach(result::addAll);

        } else if (node instanceof TagUseNode) {
            TagUseNode tagUseNode = (TagUseNode) node;
            Map<StyleType, Style> styleMap = tagUseNode.getNames().stream()
                    .map(Style::new)
                    .collect(Collectors.toMap(Style::getStyleType, style -> style));

            Map<StyleType, Style> stylesCopy = new HashMap<>(styles);
            stylesCopy.putAll(styleMap);
            tagUseNode.getChildren().stream()
                    .map(useNode -> reduceTags(useNode, stylesCopy))
                    .forEach(result::addAll);

        } else if (node instanceof TextNode) {
            TextNode textNode = (TextNode) node;
            //TODO
        }
        return result;
    }

}

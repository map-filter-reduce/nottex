package grammar;

import nottex_ast.BlockNode;
import nottex_ast.NottexNode;
import nottex_ast.TagUseNode;
import nottex_ast.TextNode;
import nottex_ast.literals.LiteralNode;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.stream.Collectors;

public class XmlTranslator {

    public static Document createDocument(NottexNode node) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootXml = createTag(document);

            document.appendChild(translate(node, rootXml, document));
            return document;
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }


    private static Element createTag(Document document) {
        return document.createElement("ntx");
    }


    private static Element translate(NottexNode nottexNode, Element element, Document document) {
        if (nottexNode instanceof BlockNode) {
            BlockNode node = (BlockNode) nottexNode;

            node.getChildren()
                    .stream()
                    .map(n -> translate(n, element, document))
                    .forEach(element::appendChild);

            return element;

        } else if (nottexNode instanceof TagUseNode) {
            TagUseNode node = (TagUseNode) nottexNode;
            Element tagXml = createTag(document);
            tagXml.setAttribute("class", node.getNames()
                    .stream()
                    .collect(Collectors.joining(" ")));

            node.getChildren()
                    .stream()
                    .map(n -> translate(n, element, document))
                    .forEach(tagXml::appendChild);

            return tagXml;

        } else if (nottexNode instanceof TextNode) {
            TextNode node = (TextNode) nottexNode;
            Element textXml = createTag(document);

            node.getParagraphs()
                    .stream()
                    .forEach(paragraph -> {
                        Element paragraphXml = createTag(document);
                        paragraphXml.setTextContent(paragraph);
                        paragraphXml.setAttribute("class", "p");
                        textXml.appendChild(paragraphXml);
                    });

            return textXml;

        } else if (nottexNode instanceof LiteralNode) {
            LiteralNode node = (LiteralNode) nottexNode;
            Element stringXml = createTag(document);
            stringXml.setTextContent(node.getStringValue());
            return stringXml;

        } else
            throw new AssertionError();
    }

}

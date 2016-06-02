package grammar;

import nottex_ast.BlockNode;
import nottex_ast.NottexNode;
import nottex_ast.TagUseNode;
import nottex_ast.TextNode;
import nottex_ast.literals.LiteralNode;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.stream.Collectors;

/**
 * Class for translating AST into XML tree.
 */
public class XmlTranslator {

    public static Document createDocument(NottexNode node) {
        try {
            File xhtmlFile = new File(XmlTranslator.class.getClassLoader().getResource("template.xhtml").toURI());
            Document document = convertXMLtoDocument(xhtmlFile);

            Node htmlTag = document.getElementsByTagName("html").item(0);
            htmlTag.appendChild(translate(node, document.createElement("body"), document));
            return document;

        } catch (ParserConfigurationException | URISyntaxException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Method converts XHTML to a Document format. Original XHTML file will not be changed during the process.
     */
    private static Document convertXMLtoDocument(File xhtml) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        // http://stackoverflow.com/questions/10728909/infinite-loop-while-parsing-xhtml-using-documentbuilder-parse
        docFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        return docBuilder.parse(xhtml);
    }


    private static Element createTag(Document document) {
        return document.createElement("span");
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


            final int[] i = {1};
            node.getParagraphs()
                    .stream()
                    .forEach(paragraph -> {
                        Element paragraphXml = createTag(document);
                        paragraphXml.setTextContent(paragraph);
                        paragraphXml.setAttribute("class", "p");

                        if (i[0] != node.getParagraphCount())
                            paragraphXml.appendChild(document.createElement("br"));
                        i[0]++;
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

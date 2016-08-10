package pdfgen;

import nottexast.*;
import nottexast.BlockAstNode;
import nottexast.NottexAstNode;
import nottexast.literals.LiteralAstNode;
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

    /**
     * Method for creating XHTML document from NoTTeX AST (that has been reduces)
     *
     * @param node - NoTTeX AST that will be converted to XHTML document
     * @return NoTTeX AST as XHTML Document
     */
    public static Document createDocument(NottexAstNode node) {
        try {
            // Load XHTML template
            File xhtmlFile = new File(XmlTranslator.class.getClassLoader().getResource("template.xhtml").toURI());
            Document document = convertXMLtoDocument(xhtmlFile);

            // Create html tag
            Node htmlTag = document.getElementsByTagName("html").item(0);

            // Create head tag
            Element headTag = document.createElement("head");
            // Add head tag to html tag
            htmlTag.appendChild(headTag);
            // Create style tag
            Element styleTag = document.createElement("style");
            styleTag.setAttribute("type", "text/css");
            // Insert CSS into the style tag
            styleTag.setTextContent(StyleManager.getStyles());
            // Append style tag to html tag
            headTag.appendChild(styleTag);

            // Generate XHTML document from nottexAst
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

    /**
     * Translate nottexAst to XHTML Element
     *
     * @param nottexNode - node that will be translated with all subnodes
     * @param element    - parent element where the translated nodes will be appended
     * @param document   - that is used to create elements
     * @return Element
     */
    private static Element translate(NottexAstNode nottexNode, Element element, Document document) {
        if (nottexNode instanceof BlockAstNode) {
            BlockAstNode node = (BlockAstNode) nottexNode;

            node.getChildren()
                    .stream()
                    .map(n -> translate(n, element, document))
                    .forEach(element::appendChild);

            return element;

        } else if (nottexNode instanceof TagUseAstNode) {
            TagUseAstNode node = (TagUseAstNode) nottexNode;
            Element tagXml = createTag(document);
            tagXml.setAttribute("class", node.getNames()
                    .stream()
                    .collect(Collectors.joining(" ")));

            node.getChildren()
                    .stream()
                    .map(n -> translate(n, element, document))
                    .forEach(tagXml::appendChild);

            return tagXml;

        } else if (nottexNode instanceof TextAstNode) {
            TextAstNode node = (TextAstNode) nottexNode;
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

        } else if (nottexNode instanceof LiteralAstNode) {
            LiteralAstNode node = (LiteralAstNode) nottexNode;
            Element stringXml = createTag(document);
            stringXml.setTextContent(node.getStringRepr());
            return stringXml;

        } else
            throw new AssertionError("Unexpected node found while translating document: " + nottexNode.getClass());
    }

}

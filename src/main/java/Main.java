import com.lowagie.text.DocumentException;
import grammar.AstParser;
import grammar.FunctionReducer;
import nottex_ast.NottexNode;
import org.w3c.dom.Document;
import pdfgen.PDFCreator;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

import static pdfgen.XmlTranslator.createDocument;

public class Main {


    public static void main(String[] args) throws IOException, DocumentException, TransformerException {

        //TODO: line separators not working.
        String input =
                "UUS: ::def(\"red\",\"color:red;font-style:italic\")  ,,red{NoTTeX GRAMMAR TEST}\n\n" +
                        "UUS: 5 + 2 = ::testAdd(5,2) ::testAdd(5,2)::testAdd(5,2)  ühel real\n\n" +
                        "UUS: RIDA ,,footer,juuter,red{ 2016} ,,fffff{}\n\n" +
                        "nasdasdasdasd\n\n\n\n::testAdd(5,2)";


        NottexNode astTree = AstParser.parse(input);
        NottexNode reducedTree = FunctionReducer.reduceFunctions(astTree);
        Document xmlDocument = createDocument(reducedTree);
        PDFCreator.convertDocumentToPDF(xmlDocument, "src\\main\\resources\\test.pdf");

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        //Create XML
        DOMSource source = new DOMSource(xmlDocument);
        StreamResult result = new StreamResult(new File("src\\main\\resources\\test.xhtml"));
        transformer.transform(source, result);
    }
}

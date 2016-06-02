import com.lowagie.text.DocumentException;
import grammar.AstParser;
import grammar.FunctionReducer;
import nottexast.NottexNode;
import org.w3c.dom.Document;
import pdfgen.PDFCreator;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import static pdfgen.XmlTranslator.createDocument;

public class Main {


    public static void main(String[] args) throws IOException, DocumentException, TransformerException {

        compile(args);

//        String input = getFileContent("src\\main\\resources\\input.ntex");
//        NottexNode astTree = AstParser.parse(input);
//        NottexNode reducedTree = FunctionReducer.reduceFunctions(astTree);
//        Document xmlDocument = createDocument(reducedTree);
//        PDFCreator.convertDocumentToPDF(xmlDocument, "src\\main\\resources\\test.pdf");
//
//        Transformer transformer = TransformerFactory.newInstance().newTransformer();
//        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//        //Create XML
//        DOMSource source = new DOMSource(xmlDocument);
//        StreamResult result = new StreamResult(new File("src\\main\\resources\\test.xhtml"));
//        transformer.transform(source, result);
    }

    private static void compile(String[] args) throws IOException, DocumentException, TransformerException {
        String input = getFileContent(args[0]);
        NottexNode astTree = AstParser.parse(input);
        NottexNode reducedTree = FunctionReducer.reduceFunctions(astTree);
        Document xmlDocument = createDocument(reducedTree);
        String inFilename = new File(args[0]).getAbsolutePath();
        String outFilename = inFilename.substring(0, inFilename.lastIndexOf(".")) + ".pdf";
        PDFCreator.convertDocumentToPDF(xmlDocument, outFilename);

        if (false) {
            // Create XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(xmlDocument);
            StreamResult result = new StreamResult(new File("src\\main\\resources\\test.xhtml"));
            transformer.transform(source, result);
        }

    }



    private static String getFileContent(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath)).stream().collect(Collectors.joining("\n"));
    }
}

import com.lowagie.text.DocumentException;
import grammar.AstParser;
import grammar.FunctionReducer;
import nottex_ast.NottexNode;
import org.w3c.dom.Document;
import pdf.PDFCreator;

import java.io.IOException;

import static grammar.XmlTranslator.createDocument;

public class Main {


    public static void main(String[] args) throws IOException, DocumentException {
        String input = ",,tag{Testin funktsiooni::testAdd(2,3)}";
        NottexNode astTree = AstParser.parse(input);
        NottexNode reducedTree = FunctionReducer.reduceFunctions(astTree);
        Document xmlDocument = createDocument(reducedTree);
        PDFCreator.convertDocumentToPDF(xmlDocument, "C:\\Users\\Priit\\Desktop\\test.pdf");
    }
}

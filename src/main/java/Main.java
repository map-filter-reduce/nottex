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

        //TODO: line separators not working.
        String input =
                ",,header{NoTTeX GRAMMAR TEST}\n\n" +
                        " 5 + 2 = ::testAdd(5,2)\n\n" +
                        ",,footer{ 2016}";


        NottexNode astTree = AstParser.parse(input);
        NottexNode reducedTree = FunctionReducer.reduceFunctions(astTree);
        Document xmlDocument = createDocument(reducedTree);
        PDFCreator.convertDocumentToPDF(xmlDocument, "src\\main\\resources\\test.pdf");
    }
}

import com.lowagie.text.DocumentException;
import grammar.AstParser;
import grammar.FunctionReducer;
import nottexast.NottexAstNode;
import org.apache.commons.cli.*;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;


public class Main {

    private static final boolean inProduction = false;

    public static void main(String[] args) throws IOException, DocumentException, TransformerException, ParseException {

        if (inProduction) {
            compile(args);

        } else {
            String input = getFileContent("src\\main\\resources\\input.ntex");
            NottexAstNode astTree = AstParser.parse(input);
            NottexAstNode reducedTree = FunctionReducer.reduceFunctions(astTree);
            //Document xmlDocument = createDocument(reducedTree);
            //PDFCreator.convertDocumentToPDF(xmlDocument, "src\\main\\resources\\test.pdf");

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            //Create XML
            //DOMSource source = new DOMSource(xmlDocument);
            StreamResult result = new StreamResult(new File("src\\main\\resources\\test.xhtml"));
            //transformer.transform(source, result);
        }

    }

    private static void compile(String[] args) throws IOException, DocumentException, TransformerException, ParseException {

        Options options = new Options();
        options.addOption("i", "input-file", true, "Path and full name of input .ntex file.");
        options.addOption("d", "debug", false, "Generates additional debugging files and info.");
        options.addOption("o", "output-file", true, "Path and full name of output .pdf file.");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (!cmd.hasOption("i")) {
            throw new RuntimeException("Missing input file, provide it with flag -i or --input-file.");
        }

        String inFilename = new File(cmd.getOptionValue("i")).getAbsolutePath();
        String input = getFileContent(inFilename);
        String outDefaultFilename = removeFileExtension(inFilename) + ".pdf";
        String outFilename = cmd.getOptionValue("o", outDefaultFilename);

        // Parse & generate output
        NottexAstNode astTree = AstParser.parse(input);
        NottexAstNode reducedTree = FunctionReducer.reduceFunctions(astTree);
        //Document xmlDocument = createDocument(reducedTree);
        //PDFCreator.convertDocumentToPDF(xmlDocument, outFilename);

        // Output debug info
        if (cmd.hasOption("d")) {
            // Create XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
           // DOMSource source = new DOMSource(xmlDocument);
            StreamResult result = new StreamResult(new File(removeFileExtension(outFilename) + ".xhtml"));
            //transformer.transform(source, result);
        }

    }

    private static String removeFileExtension(String filename) {
        return filename.substring(0, filename.lastIndexOf("."));
    }



    private static String getFileContent(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath)).stream().collect(Collectors.joining("\n"));
    }
}

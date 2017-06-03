import com.lowagie.text.DocumentException;
import grammar.AstParser;
import grammar.FunctionReducer;
import lombok.extern.slf4j.Slf4j;
import nottexast.NottexNode;
import org.apache.commons.cli.*;
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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import static pdfgen.XmlTranslator.createDocument;

@Slf4j
public class Main {
    private static final boolean inProduction = false;

    public static void main(String[] args) throws IOException, DocumentException, TransformerException, ParseException {
        if (inProduction) {
            compile(args);
        } else {
            compile(new String[]{"-i", "src/main/resources/input.ntex", "-o", "src/main/resources/test.pdf", "-d"});
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
        log.info("Reading code from file");
        String input = getFileContent(inFilename);
        String outDefaultFilename = removeFileExtension(inFilename) + ".pdf";
        String outFilename = cmd.getOptionValue("o", outDefaultFilename);

        // Parse & generate output
        log.info("Generating AST from code");
        NottexNode astTree = AstParser.parse(input);
        log.info("Evaluating functions");
        NottexNode reducedTree = FunctionReducer.reduceFunctions(astTree);
        log.info("Generating XML");
        Document xmlDocument = createDocument(reducedTree);
        log.info("Generating PDF");
        PDFCreator.convertDocumentToPDF(xmlDocument, outFilename);
        log.info("Done");

        // Output debug info
        if (cmd.hasOption("d")) {
            // Create XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(xmlDocument);
            StreamResult result = new StreamResult(new File(removeFileExtension(outFilename) + ".xhtml"));
            transformer.transform(source, result);
        }

    }

    private static String removeFileExtension(String filename) {
        return filename.substring(0, filename.lastIndexOf("."));
    }


    private static String getFileContent(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath)).stream().collect(Collectors.joining("\n"));
    }
}

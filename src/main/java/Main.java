import com.lowagie.text.DocumentException;
import grammar.AstParser;
import nottexast.NottexAstNode;
import org.apache.commons.cli.*;
import post_processing.functions.FunctionReducer;
import post_processing.pdfgen.Line;
import post_processing.pdfgen.LineCreator;
import post_processing.style_management.TagReducer;
import post_processing.text_structuring.Paragraph;
import post_processing.text_structuring.ParagraphCreator;
import post_processing.text_structuring.Text;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * List<Text> text
 * | ParagraphCreator
 * List<Paragraph> paragraphs
 * | LineCreator -- Measurer (returns Words)
 * List<Line> lines
 *
 * Text: String (may contain whitespace and paragraph delimiters), has defined Styles
 * Paragraph: List<Text>, every Text may contain whitespace but does not contain paragraph delimiters. Each Text has defined Styles.
 * Word: may be whitespace character or string without whitespaces and paragraph delimiters. Has defined Styles, height and length.
 * Line: List<Word>, knows its length and remaining space
 * TODO: class Page
 */
public class Main {

    private static final boolean inProduction = false;

    public static void main(String[] args) throws IOException, DocumentException, TransformerException, ParseException {

        if (inProduction) {
            compile(args);

        } else {
            String input = getFileContent("src\\main\\resources\\input.ntex");
            NottexAstNode astTree = AstParser.parse(input);
            NottexAstNode reducedTree = FunctionReducer.reduceFunctions(astTree);
            List<Text> textLst = TagReducer.reduceTags(reducedTree);
            List<Paragraph> paragraphs = ParagraphCreator.createParagraphs(textLst);
            List<Line> lines = LineCreator.createLines(paragraphs);

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

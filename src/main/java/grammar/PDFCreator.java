package grammar;

import com.lowagie.text.DocumentException;
import org.w3c.dom.Document;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Class for creating PDF for results.
 * <p>
 * Uses Flying Saucer library (available at: https://github.com/flyingsaucerproject/flyingsaucer)
 */

public class PDFCreator {
    /**
     * PConverting Document to the PDF and write to the disk.
     *
     * @param document   to be converted into pdf
     * @param outputPath - where the pdf will be created
     */
    public static void convertDocumentToPDF(Document document, String outputPath) throws IOException, DocumentException {
        ITextRenderer renderer = new ITextRenderer();
        SharedContext sharedContext = renderer.getSharedContext();
        setSharedContext(sharedContext);
        renderer.setDocument(document, null);

        try (OutputStream os = new FileOutputStream(outputPath)) {
            renderer.layout();
            renderer.createPDF(os);
        }
    }


    private static void setSharedContext(SharedContext sharedContext) {
        sharedContext.setPrint(true);
        sharedContext.setInteractive(false);
        sharedContext.getTextRenderer().setSmoothingThreshold(0);
    }
}

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.IOException;

public class Style {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Bruno\\Documents\\Projetos Automação\\ItextExample\\PDF\\Style.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        com.itextpdf.layout.Style author = new com.itextpdf.layout.Style();
        author.setFontColor(Color.BLUE)
                .setFontSize(12f)
                .setItalic();

        Paragraph paragraph1 = new Paragraph();
        paragraph1.add("Hello how are you?").addStyle(author);

        document.add(paragraph1);

        document.close();
        System.out.println("PDF Created");

    }
}

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.IOException;

public class Fonts {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Bruno\\Documents\\Projetos Automação\\ItextExample\\PDF\\Font.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        PdfFont boldFont = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);

        Text text1 = new Text("You are Nice").setFont(font);
        Text text2 = new Text(" Person").setFont(boldFont);

        Paragraph paragraph = new Paragraph()
                .add(text1)
                .add(text2);

        document.add(paragraph);
        document.close();
        System.out.println("PDF Created");

    }
}

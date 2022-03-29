import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.IOException;

public class EmbededFonts {
//    Created a directory called fonts with fonts to use in the project
    public static final String grasping = "fonts\\grasping.ttf";
    public static final String horrendo = "fonts\\horrendo.ttf";

    public static void main(String[] args) throws IOException {
        String path = "D:\\Bruno\\Documents\\Projetos Automação\\ItextExample\\PDF\\EmbededFont.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        PdfFont grasping1 = PdfFontFactory.createFont(grasping, true);
        PdfFont horrendo1 = PdfFontFactory.createFont(horrendo, true);

        Text text1 = new Text("This is Embeded font").setFont(grasping1);
        Text text2 = new Text(" This is another embeded font").setFont(horrendo1);

        Paragraph paragraph = new  Paragraph()
                .add(text1)
                .add(text2);
        document.add(paragraph);

        document.close();
        System.out.println("PDF Created");

    }
}

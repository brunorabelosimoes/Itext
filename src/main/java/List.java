import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import java.io.FileNotFoundException;

public class List {
    public static void main(String[] args) throws FileNotFoundException {

        com.itextpdf.layout.element.List list1 = new com.itextpdf.layout.element.List();

        list1.add("Java");
        list1.add("Android");
        list1.add("Kotlin");
        list1.add("C");

        String path = "D:\\Bruno\\Documents\\Projetos Automação\\ItextExample\\PDF\\FirstPDF.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        document.add(list1);

        document.close();

        System.out.println("Pdf Created");

    }
}

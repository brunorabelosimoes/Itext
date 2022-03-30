import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

import java.io.IOException;

public class TableUsingArray {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Bruno\\Documents\\Projetos Automação\\ItextExample\\PDF\\Table.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        float[] columnWidht = {200f, 50f, 100f};
        Table table = new Table(columnWidht);

        String[] tableheader = {"Item", "Color", "Size"};
        String[] [] itemArray = {
                {"Box", "Red", "Big"},
                {"Bat", "White", "Big"},
                {"Stick", "Black", "Long"},
                {"Toy Gun", "Gray", "Small"},
                {"Ball", "Red", "Small"}
        };

        table.addCell(new Cell().add(tableheader[0]));
        table.addCell(new Cell().add(tableheader[1]));
        table.addCell(new Cell().add(tableheader[2]));

        for (int i=0; i<5; i++) {  /*for row*/
            for (int j = 0; j < 3; j++) /*for collum*/
            {
                table.addCell(new Cell().add(itemArray[i][j]));

            }
        }
        document.add(table);

        document.close();
        System.out.println("PDF Created");

    }
}

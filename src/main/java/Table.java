import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;

import java.io.IOException;

public class Table {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Bruno\\Documents\\Projetos Automação\\ItextExample\\PDF\\Table.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        float columnWidht[] = {200f, 50f, 100f};
        com.itextpdf.layout.element.Table table = new com.itextpdf.layout.element.Table(columnWidht);

        Cell cell_11 = new Cell();
        cell_11.add("Item");
        table.addCell(cell_11);

        table.addCell(new Cell().add("Qty"));
        table.addCell(new Cell().add("Available"));

        table.addCell(new Cell().add("Mango"));
        table.addCell(new Cell().add("2 Kg"));
        table.addCell(new Cell().add("Yes"));

        table.addCell(new Cell().add("Orange"));
        table.addCell(new Cell().add("5 Kg"));
        table.addCell(new Cell().add("No"));

        /*Will add a WARN in console advising the incomplete row */
        table.addCell(new Cell().add("Banana"));

        document.add(table);

        document.close();
        System.out.println("PDF Created");

    }
}

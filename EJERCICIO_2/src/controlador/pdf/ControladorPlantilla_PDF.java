package controlador.pdf;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Fecha: 27/06/2022
 * @author K.G - Thaisncp
 */
public class ControladorPlantilla_PDF {

    public Plantilla_PDF pdf;

    public ControladorPlantilla_PDF(String nombreUsuario, String nombreArchivo) {
        this.pdf = new Plantilla_PDF(nombreUsuario, nombreArchivo);
    }

    public ControladorPlantilla_PDF() {
    }

    public void CrearPlantilla(PageSize formato) throws FileNotFoundException {
        pdf.getTitulo().setTextAlignment(TextAlignment.CENTER).setFontColor(ColorConstants.MAGENTA).setFontSize(25);
        File fichero = new File(pdf.getNombreArchivo() + "-" + pdf.getNombreUsuario() + ".pdf");
        PdfWriter writer = new PdfWriter(fichero); 
        PdfDocument docPDF = new PdfDocument(writer); 
        Document document = new Document(docPDF, formato);
        document.add(new Paragraph("Elaborado por: " + pdf.getNombreUsuario()));
        document.add(new Paragraph("Fecha: " + pdf.getFecha()));
        document.add(new Paragraph("\n"));
        document.close();
        System.out.println("PDF creado");
    }
 
}
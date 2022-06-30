package controlador.pdf;

import com.itextpdf.layout.element.Paragraph;
import java.time.LocalDate;

/**
 * Fecha: 27/06/2022
 * @author K.G - Thaisncp
 */
public class Plantilla_PDF {
    private String nombreUsuario;
    private String fecha;
    private String nombreArchivo;
    private Paragraph titulo;
    
    public Plantilla_PDF(String nombreUsuario,String nombreArchivo) {
        this.nombreUsuario = nombreUsuario;
        LocalDate todaysDate = LocalDate.now();
        this.fecha =todaysDate.toString();
        this.nombreArchivo = nombreArchivo;
        this.titulo=new Paragraph("Calculadora Contable Básica");
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Paragraph getTitulo() {
        return titulo;
    }

    public void setTitulo(Paragraph titulo) {
        this.titulo = titulo;
    }

}

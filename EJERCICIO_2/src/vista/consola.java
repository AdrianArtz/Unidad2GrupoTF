package vista;

import com.itextpdf.layout.element.Image;
import controlador.bienInmueble.ControladorBienInmueble;
import controlador.pdf.ControladorPlantilla_PDF;
import java.io.FileNotFoundException;

/**
 *
 * @author K.G
 */
public class consola {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        ControladorPlantilla_PDF doc = new ControladorPlantilla_PDF("karen", "Archivo");
        Image im = null; 
       //doc.CrearPlantilla(PageSize.A4.rotate());
        ControladorBienInmueble ca= new ControladorBienInmueble();/*
        BienInmueble dato= new BienInmueble(500.152, "Naturaleza", "puiytfrde4axwdy");
        /ca.guardar(dato);
       // dato= new BienInmueble(90000.20, "Incor", "wiiiiiiiiiiiiiiii");
        ca.guardar(dato);
         dato= new BienInmueble(90000.20, "Incor", "wiiiiiiiiiiiiiiii");
         ca.guardar(dato);
         BienInmueble  dato= new BienInmueble(1580.21, "Incor", "blablabla");
         ca.modificar(dato, 2);/*
        */
        ca.delete(0);
       
    }

}

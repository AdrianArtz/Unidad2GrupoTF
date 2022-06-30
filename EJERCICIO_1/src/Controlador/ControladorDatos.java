
package Controlador;

import Modelo.Marca;
import Modelo.Vehiculo;

/**
 *
 * @author hilar_c9usj1g
 */
public class ControladorDatos extends Vehiculo{

    public ControladorDatos(Integer id, Marca marca, String color, String matricula, Double precio, Integer disponibles) {
        super(id, marca, color, matricula, precio, disponibles);
    }

    public ControladorDatos() {
    } 
    
}

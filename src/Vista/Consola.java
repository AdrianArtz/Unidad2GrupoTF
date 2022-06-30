package Vista;

import Controlador.ControladorVehiculos;
import Modelo.Marca;
import Modelo.Vehiculo;

/**
 *
 * @author madelein-samaelhg
 */
public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Vehiculo auto;
        ControladorVehiculos ca = new ControladorVehiculos(Vehiculo.class);
        Marca marca = new Marca("Toyota", "Camioneta");

        try {
            auto = new Vehiculo(0, marca, "Blanco", "PBB-511", 12.000, 2);
            ca.guardar(auto);
            auto = new Vehiculo(1, marca, "Negro", "PBW-9571", 10.000, 3);
            ca.guardar(auto);
            auto = new Vehiculo(2, marca, "Rojo", "LCL-561", 10.000, 5);
            ca.guardar(auto);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}

package Controlador;

// @author samaelhg
import Modelo.Marca;
import Modelo.Vehiculo;
import controlador.tda.lista.ListaEnlazadaServices;

public class ControladorVehiculos {

    private static Integer ID = 0;
    private static ListaEnlazadaServices<Vehiculo> listaVehiculos = new ListaEnlazadaServices<>();

    public static void crearVehiculo(String marca, String tipoVehiculo, String color, String matricula, Double precio, Integer disponibles) {
        listaVehiculos.insertarAlFinal(new Vehiculo(ID, new Marca(marca, tipoVehiculo), color, matricula, precio, disponibles));
        ID++;
    }

    public static void editarVehiculo(Integer BS, String marca, String tipoVehiculo, String color, String matricula, Double precio, Integer disponibles) {
        listaVehiculos.eliminarPosicion(BS);
        listaVehiculos.insertar(new Vehiculo(BS, new Marca(marca, tipoVehiculo), color, matricula, precio, disponibles), BS);
    }
    public static void borrarVehiculo(Integer Id){
        listaVehiculos.eliminarPosicion(Id);
    }
    
    public static String[][] mostrarVehiculos() {
        String listaDatos[][] = new String[listaVehiculos.getSize()][7];
        for (int i = 0; i < listaVehiculos.getSize(); i++) {
            listaDatos[i][0] = "" + listaVehiculos.obtenerDato(i).getId();
            listaDatos[i][1] = "" + listaVehiculos.obtenerDato(i).getMarca();
            listaDatos[i][2] = "" + listaVehiculos.obtenerDato(i).getTipoVehiculo();
            listaDatos[i][3] = "" + listaVehiculos.obtenerDato(i).getColor();
            listaDatos[i][4] = "" + listaVehiculos.obtenerDato(i).getMatricula();
            listaDatos[i][5] = "" + listaVehiculos.obtenerDato(i).getPrecio();
            listaDatos[i][6] = "" + listaVehiculos.obtenerDato(i).getDisponibles();
        }
        return listaDatos;
    }

    public static String[][] mostrarVehiculos2() {
        String listaDatos[][] = new String[listaVehiculos.getSize()][6];
        for (int i = 0; i < listaVehiculos.getSize(); i++) {
            listaDatos[i][0] = "" + listaVehiculos.obtenerDato(i).getMarca();
            listaDatos[i][1] = "" + listaVehiculos.obtenerDato(i).getTipoVehiculo();
            listaDatos[i][2] = "" + listaVehiculos.obtenerDato(i).getColor();
            listaDatos[i][3] = "" + listaVehiculos.obtenerDato(i).getMatricula();
            listaDatos[i][4] = "" + listaVehiculos.obtenerDato(i).getPrecio();
            listaDatos[i][5] = "" + listaVehiculos.obtenerDato(i).getDisponibles();
        }
        return listaDatos;
    }
}

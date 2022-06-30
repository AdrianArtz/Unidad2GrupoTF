package Controlador;

// @author samaelhg
import Modelo.Cliente;
import Modelo.Factura;
import controlador.tda.lista.ListaEnlazadaServices;

public class ControladorClientes {

    private static ListaEnlazadaServices<Cliente> listaClientes = new ListaEnlazadaServices();

    public static void crearCliente(String nombre, String apellido, String identificacion, String email, String telefono, String direccion, Factura factura) {
        listaClientes.insertarAlFinal(new Cliente(telefono, direccion, nombre, apellido, identificacion, email, factura));
    }

}

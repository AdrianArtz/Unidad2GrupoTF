package Controlador;

// @author samaelhg
import Modelo.Compra;
import Modelo.Factura;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.ListaEnlazadaServices;

public class ControladorFacturas {

    private static Integer ID = 0;
    private static ListaEnlazadaServices<Factura> listaFacturas = new ListaEnlazadaServices();
    private static ListaEnlazada<Compra> listaCompras = new ListaEnlazada();

    public static void crearFactura(ListaEnlazada<Compra> listaCompras) {
        listaFacturas.insertarAlFinal(new Factura(ID, listaCompras));
        ID++;
    }

    public static ListaEnlazadaServices<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public static void setListaFacturas(ListaEnlazadaServices<Factura> aListaFacturas) {
        listaFacturas = aListaFacturas;
    }

    public static void setListaCompras(ListaEnlazada<Compra> aListaCompras) {
        listaCompras = aListaCompras;
    }
}

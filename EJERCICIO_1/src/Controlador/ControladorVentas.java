package Controlador;

// @author samaelhg

import Modelo.Compra;
import Modelo.Vehiculo;
import controlador.tda.lista.ListaEnlazadaServices;

public class ControladorVentas {
    
    private static ListaEnlazadaServices<Compra> listaCompras = new ListaEnlazadaServices<>();
    
    public static void hacerVenta(Integer cantidad, Vehiculo vehiculo){
        listaCompras.insertarAlFinal(new Compra(cantidad, vehiculo));
    }
    
    public static double CalcularVenta(int disponibles, int cantidad, double precios){
    double resultado = 0.0;
        if (disponibles < 0) {
            
            System.out.println("Error");
        }else{
            
            resultado = precios * cantidad;
        }
        return resultado;
    }

    public static ListaEnlazadaServices<Compra> getListaCompras() {
        return listaCompras;
    }

    public static void setListaCompras(ListaEnlazadaServices<Compra> aListaCompras) {
        listaCompras = aListaCompras;
    }
}

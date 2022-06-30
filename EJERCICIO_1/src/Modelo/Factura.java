package Modelo;

// @author samaelhg

import controlador.tda.lista.ListaEnlazada;
import java.util.Date;

public class Factura {
    private Cliente cliente;
    private Integer id;
    private Double subTotal;
    private final Double iva = 1.2;
    private Double total;
    private Double precioFinal;
    private ListaEnlazada<Compra> listaCompras;

    public Factura(Integer id, ListaEnlazada<Compra> listaCompras) {
        this.id = id;
        this.listaCompras = listaCompras;
    }
    
    public Double subtotal(){
        this.subTotal = total / (1 + iva);
        return subTotal;
    }
    
    public Double total(Double tot){
        this.total = tot * iva;
        total = total + tot;
        return total;
    }


    
}

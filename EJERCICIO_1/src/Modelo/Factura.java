package Modelo;

// @author samaelhg

import java.util.Date;

public class Factura {
    private Integer id;
    private Double subTotal;
    private final Double iva = 1.2;
    private Double total;
    private Double descuento;
    private Double precioFinal;
    private Compra compra;

    public Factura(Integer id, Compra compra) {
        this.id = id;
        this.compra = compra;
    }


    
}

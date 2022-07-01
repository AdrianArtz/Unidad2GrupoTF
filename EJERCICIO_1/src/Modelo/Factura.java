package Modelo;

// @author samaelhg

import Controlador.tda.lista.ListaEnlazada;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public ListaEnlazada<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ListaEnlazada<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }


    
}

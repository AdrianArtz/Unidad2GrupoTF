package modelo;

import controlador.tda.lista.ListaEnlazadaServices;

/**
 * Fecha:  30/06/2022
 * @author K.G - Thaisncp - ronaldcuenca19
 */
public class Compra {
    private Integer cantidad;
    private ListaEnlazadaServices<BienInmueble> listaBienes;

    public Compra(Integer cantidad, ListaEnlazadaServices<BienInmueble> listaBienes) {
        this.cantidad = cantidad;
        this.listaBienes = listaBienes;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ListaEnlazadaServices<BienInmueble> getListaBienes() {
        return listaBienes;
    }

    public void setListaBienes(ListaEnlazadaServices<BienInmueble> listaBienes) {
        this.listaBienes = listaBienes;
    }
    
}
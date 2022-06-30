package modelo;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp
 */

public class BienInmueble {
    private Double precioSinIva;
    private TiposBienInmueble tipoBienInmueble;
    private String descripcion;

    public BienInmueble(Double precioSinIva, TiposBienInmueble tipoInmueble, String descripcion) {
        this.precioSinIva = precioSinIva;
        this.tipoBienInmueble = tipoInmueble;
        this.descripcion = descripcion;
    }

    public BienInmueble() {
    }

    public Double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(Double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public TiposBienInmueble getTipoBienInmueble() {
        return tipoBienInmueble;
    }

    public void setTipoBienInmueble(TiposBienInmueble tipoBienInmueble) {
        this.tipoBienInmueble = tipoBienInmueble;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
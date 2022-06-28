package modelo;

/**
 * @author K.G
 */
public class BienInmueble {
    private Double precioSinIva;
    private String tipoInmueble;
    private String descripcion;

    public BienInmueble(Double precioSinIva, String tipoInmueble, String descripcion) {
        this.precioSinIva = precioSinIva;
        this.tipoInmueble = tipoInmueble;
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

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
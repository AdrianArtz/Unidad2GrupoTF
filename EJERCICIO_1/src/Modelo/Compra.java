package Modelo;

// @author samaelhg
public class Compra {
    private Integer cantidad;
    private Vehiculo vehiculo;

    public Compra(Integer cantidad, Vehiculo vehiculo) {
        this.cantidad = cantidad;
        this.vehiculo = vehiculo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}

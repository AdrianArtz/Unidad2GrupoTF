package Modelo;

// @author samaelhg
public class Marca {
    private String marca;
    private String tipoVehiculo;

    public Marca(String marca, String tipoVehiculo) {
        this.marca = marca;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
}

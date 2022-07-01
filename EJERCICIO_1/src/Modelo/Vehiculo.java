package Modelo;

// @author samaelhg
public class Vehiculo {

    private Integer id;
    private Marca marca;
    private String matricula;
    private Double precio;
    private String color;
    private Integer disponibles;
    
    public Vehiculo(Integer id, Marca marca, String color, String matricula, Double precio, Integer disponibles) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
        this.disponibles = disponibles;
    }

    public Vehiculo() {
    }
    
    public String getMarca() {
        return marca.getMarca();
    }

    public String getTipoVehiculo() {
        return marca.getTipoVehiculo();
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

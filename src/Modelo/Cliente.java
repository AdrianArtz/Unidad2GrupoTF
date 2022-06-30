package Modelo;

//EJERCICIO 1
//ADRIÁN HERNÁNDEZ, HILARY CALVA, KAREN GONZAGA, RONALD CUENCA
public class Cliente extends Usuario {

    private String telefono;
    private String direccion;

    public Cliente(String telefono, String direccion, String nombre, String apellido, String identificacion, String email) {
        super(nombre, apellido, identificacion, email);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Boolean ingreso(){
        return true;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

}

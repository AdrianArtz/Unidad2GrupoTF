package Modelo;

//EJERCICIO 1
//ADRIÁN HERNÁNDEZ, HILARY CALVA, KAREN GONZAGA, RONALD CUENCA
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String identificacion;
    private String email;

    public Usuario(String nombre, String apellido, String identificacion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

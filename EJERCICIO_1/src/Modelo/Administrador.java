package Modelo;

//EJERCICIO 1
//ADRIÁN HERNÁNDEZ, HILARY CALVA, KAREN GONZAGA, RONALD CUENCA
public class Administrador extends Usuario {
    
    private String username;
    private String password;
    private Cliente cliente;
    
    public Administrador(String username, String password, String nombre, String apellido, String identificacion, String email) {
        super(nombre, apellido, identificacion, email);
        this.username = username;
        this.password = password;
        this.cliente = null;
    }
    
    public Boolean verificarIngreso(String username, String password){
        return this.username.equals(username) && this.password.equals(password);    
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
}

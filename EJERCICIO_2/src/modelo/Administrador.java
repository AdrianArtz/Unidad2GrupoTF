package modelo;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp - ronaldcuenca19
 */
public class Administrador extends Persona{
    private String username;
    private String clave;

    public Administrador(String username, String clave, String nombres, String apellidos, Integer identificador, String email) {
        super(nombres, apellidos, identificador, email);
        this.username = username;
        this.clave = clave;
    }

    public Administrador() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
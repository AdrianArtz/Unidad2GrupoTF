package modelo;

/**
 *
 * @author K.G
 */
public class Administrador extends Persona{
    private String email;
    private String clave;

    public Administrador(String email, String clave, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.email = email;
        this.clave = clave;
    }

    public Administrador() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
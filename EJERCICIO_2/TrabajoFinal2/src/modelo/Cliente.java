package modelo;

/**
 *
 * @author K.G
 */
public class Cliente extends Persona {
    private Integer ID;
    private String direccion;
    private String numeroTelefonico;

    public Cliente(Integer ID, String direccion, String numeroTelefonico, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.ID = ID;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
    }

    public Cliente() {
    }    
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

}
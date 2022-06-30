package modelo;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp
 */
public class Cliente extends Persona {
    private String direccion;
    private String numeroTelefonico;

    public Cliente(String direccion, String numeroTelefonico, String nombres, String apellidos, Integer identificador, String email) {
        super(nombres, apellidos, identificador, email);
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
    }

    public Cliente() {
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
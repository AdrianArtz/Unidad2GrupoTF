package modelo;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private Integer identificador;
    private String email;

    public Persona(String nombres, String apellidos, Integer identificador, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificador = identificador;
        this.email = email;
    }

    public Persona() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
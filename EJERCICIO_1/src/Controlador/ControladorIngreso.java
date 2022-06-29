package Controlador;

// @author samaelhg
import Modelo.Administrador;
import controlador.tda.lista.ListaEnlazadaServices;

public class ControladorIngreso {
   
    private static Administrador adminPrincipal = new Administrador("admin", "admin30", "Adrián", "Hernández", "1106060666", "jandry.hernandez@unl.edu.ec");
    private static Boolean permiso;
    private static ListaEnlazadaServices<Administrador> listaAdmin = new ListaEnlazadaServices<>();
    
    public static boolean verificarIngreso(String username, String password) {

        if (adminPrincipal.verificarIngreso(username, password) == true) {
            return permiso = true;
        } else {
            return permiso = false;
        }

    }

    public static void crearAdmin(String username, String password, String nombre, String apellido, String identificacion, String email) {
        if (permiso == true) {
            listaAdmin.insertarAlFinal(new Administrador(username, password, nombre, apellido, identificacion, email));
            System.out.println("Admin creado con exito");
        } else {
            System.out.println("Usted no tiene permiso para hacer eso");
        }
    }

    
    public static ListaEnlazadaServices<Administrador> getListaAdmin() {
        return listaAdmin;
    }

    public static void setListaAdmin(ListaEnlazadaServices<Administrador> listaAdmin) {
        ControladorIngreso.listaAdmin = listaAdmin;
    }

    public static Boolean getPermiso() {
        return permiso;
    }

    public static void setPermiso(Boolean permiso) {
        ControladorIngreso.permiso = permiso;
    }

}

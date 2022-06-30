package Controlador;

// @author samaelhg
import Controlador.AdaptadorDao.AdaptadorDao;
import Modelo.Marca;
import Modelo.Vehiculo;
import Controlador.tda.ListaEnlazadaServices;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorVehiculos extends AdaptadorDao<Vehiculo> {

    private static Integer ID = 0;
    private static ListaEnlazadaServices<Vehiculo> listaVehiculos = new ListaEnlazadaServices<>();
    private Vehiculo auto = new Vehiculo();
    private Marca marca = new Marca();

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    

    public ControladorVehiculos(Class<Vehiculo> clazz) {
        super(clazz);
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public static ListaEnlazadaServices<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public static void setListaVehiculos(ListaEnlazadaServices<Vehiculo> listaVehiculos) {
        ControladorVehiculos.listaVehiculos = listaVehiculos;
    }

    public static void crearVehiculo(String marca, String tipoVehiculo, String color, String matricula, Double precio, Integer disponibles) {
        listaVehiculos.insertarAlFinal(new Vehiculo(ID, new Marca(marca, tipoVehiculo), color, matricula, precio, disponibles));
        ID++;
    }

    public static void editarVehiculo(Integer BS, String marca, String tipoVehiculo, String color, String matricula, Double precio, Integer disponibles) {
        listaVehiculos.eliminarPosicion(BS);
        listaVehiculos.insertar(new Vehiculo(BS, new Marca(marca, tipoVehiculo), color, matricula, precio, disponibles), BS);
    }

    public static void borrarVehiculo(Integer Id) {
        listaVehiculos.eliminarPosicion(Id);
    }

    public static String[][] mostrarVehiculos() {
        String listaDatos[][] = new String[listaVehiculos.getSize()][7];
        for (int i = 0; i < listaVehiculos.getSize(); i++) {
            listaDatos[i][0] = "" + listaVehiculos.obtenerDato(i).getId();
            listaDatos[i][1] = "" + listaVehiculos.obtenerDato(i).getMarca();
            listaDatos[i][2] = "" + listaVehiculos.obtenerDato(i).getTipoVehiculo();
            listaDatos[i][3] = "" + listaVehiculos.obtenerDato(i).getColor();
            listaDatos[i][4] = "" + listaVehiculos.obtenerDato(i).getMatricula();
            listaDatos[i][5] = "" + listaVehiculos.obtenerDato(i).getPrecio();
            listaDatos[i][6] = "" + listaVehiculos.obtenerDato(i).getDisponibles();
        }
        return listaDatos;
    }

    public static String[][] mostrarVehiculos2() {
        String listaDatos[][] = new String[listaVehiculos.getSize()][6];
        for (int i = 0; i < listaVehiculos.getSize(); i++) {
            listaDatos[i][0] = "" + listaVehiculos.obtenerDato(i).getMarca();
            listaDatos[i][1] = "" + listaVehiculos.obtenerDato(i).getTipoVehiculo();
            listaDatos[i][2] = "" + listaVehiculos.obtenerDato(i).getColor();
            listaDatos[i][3] = "" + listaVehiculos.obtenerDato(i).getMatricula();
            listaDatos[i][4] = "" + listaVehiculos.obtenerDato(i).getPrecio();
            listaDatos[i][5] = "" + listaVehiculos.obtenerDato(i).getDisponibles();
        }
        return listaDatos;
    }

    public Boolean guardar() {
        try {
            guardar(getAuto());
            return true;
        } catch (Exception e) {
            System.out.println("Error en guardar: " + e);
        }
        return false;
    }

    public Boolean modificar(Integer pos) {
        try {
            modificar(getAuto(), pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en modificar: " + e);
        }
        return false;
    }
    
    public Boolean borrar(Integer pos) {
        try {
            eliminar(pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en eliminar: " + e);
        }
        return false;
    }

    public ListaEnlazadaServices<Vehiculo> listado() {
        setListaVehiculos(listar());
        return listaVehiculos;
    }
//
//    public Boolean delete(Integer pos) {
//        try {   
//            eliminar(pos);
//            setListaVehiculos(listar());
//            return true;
//        } catch (Exception e) {
//            System.out.println("Error en modificar: "+e);
//        }
//        return false;
//    }

    public void leer(JTable tableVehiculos) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("Marca");
            tabla.addColumn("Matricula");
            tabla.addColumn("Precio");
            tabla.addColumn("Color");
            tabla.addColumn("Disponibles");
            tableVehiculos.setModel(tabla);
            String datos[] = new String[6];
            for (int i = 0; i < listado().getSize(); i++) {
                datos[0] = String.valueOf(getListaVehiculos().obtenerDato(i).getId());
                datos[1] = getListaVehiculos().getLista().obtenerDato(i).getMarca();
                datos[2] = getListaVehiculos().getLista().obtenerDato(i).getMatricula();
                datos[3] = String.valueOf(getListaVehiculos().getLista().obtenerDato(i).getPrecio());
                datos[4] = getListaVehiculos().getLista().obtenerDato(i).getColor();
                datos[5] = String.valueOf(getListaVehiculos().getLista().obtenerDato(i).getDisponibles());
                tabla.addRow(datos);
                tableVehiculos.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }
}

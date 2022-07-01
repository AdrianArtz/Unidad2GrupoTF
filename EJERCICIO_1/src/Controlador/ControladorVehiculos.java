package Controlador;

// @author samaelhg
import Controlador.AdaptadorDao.AdaptadorDao;
import Controlador.tda.lista.ListaEnlazadaServices;
import Modelo.Marca;
import Modelo.Vehiculo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ControladorVehiculos extends AdaptadorDao<Vehiculo> {
    private Integer ID = 0;
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

    public ListaEnlazadaServices<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ListaEnlazadaServices<Vehiculo> listaVehiculos) {
        ControladorVehiculos.listaVehiculos = listaVehiculos;
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

    public void guardarJSON(String marca, String tipo, String matricula, String color, Double precio, Integer disponibles) {
        ID = listado().getSize();
        System.out.println("XD: "+ID);
        getMarca().setMarca(marca);
        getMarca().setTipoVehiculo(tipo);
        getAuto().setMatricula(matricula);
        getAuto().setColor(color);
        getAuto().setPrecio(precio);
        getAuto().setDisponibles(disponibles);

        Vehiculo auto = new Vehiculo(ID, getMarca(), getAuto().getColor(), getAuto().getMatricula(), getAuto().getPrecio(), getAuto().getDisponibles());
        try {
            guardar(auto);
        } catch (Exception ex) {
        }        
    }
    
    public void modificarJSON(int pos, String marca, String tipo, String matricula, String color, Double precio, Integer disponibles) {
        getMarca().setMarca(marca);
        getMarca().setTipoVehiculo(tipo);
        getAuto().setMatricula(matricula);
        getAuto().setColor(color);
        getAuto().setPrecio(precio);
        getAuto().setDisponibles(disponibles);

        auto = new Vehiculo(pos, getMarca(), getAuto().getColor(), getAuto().getMatricula(), getAuto().getPrecio(), getAuto().getDisponibles());
        try {
            modificar(auto, pos);
        } catch (Exception ex) {
        }        
    }

    public void leer(JTable tableVehiculos) {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            tabla.addColumn("ID");
            tabla.addColumn("Marca");
            tabla.addColumn("Tipo de Vehiculo");
            tabla.addColumn("Color");
            tabla.addColumn("Matricula");
            tabla.addColumn("Precio");
            tabla.addColumn("Disponibles");
            tableVehiculos.setModel(tabla);
            String datos[] = new String[7];
            for (int i = 0; i < listado().getSize(); i++) {
                datos[0] = ""+getListaVehiculos().obtenerDato(i).getId();
                datos[1] = ""+getListaVehiculos().getLista().obtenerDato(i).getMarca();
                datos[2] = ""+getListaVehiculos().getLista().obtenerDato(i).getTipoVehiculo();
                datos[3] = ""+getListaVehiculos().getLista().obtenerDato(i).getColor();
                datos[4] = ""+getListaVehiculos().getLista().obtenerDato(i).getMatricula();
                datos[5] = ""+getListaVehiculos().getLista().obtenerDato(i).getPrecio();
                datos[6] = ""+getListaVehiculos().getLista().obtenerDato(i).getDisponibles();
                tabla.addRow(datos);
                tableVehiculos.setModel(tabla);
            }
        } catch (Exception e) {
            System.out.println("ERROR en cargar: " + e);
        }
    }
}

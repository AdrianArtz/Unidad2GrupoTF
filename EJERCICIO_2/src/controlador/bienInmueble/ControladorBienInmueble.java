package controlador.bienInmueble;

import controlador.dao.AdaptadorDao;
import controlador.tda.lista.ListaEnlazadaServices;
import modelo.BienInmueble;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp
 */
public class ControladorBienInmueble extends AdaptadorDao<BienInmueble>{

    private BienInmueble bienInmueble;
    private ListaEnlazadaServices<BienInmueble> listasInmuebles;

    public ControladorBienInmueble() {
        super(BienInmueble.class);
        listado();
    }

    public ListaEnlazadaServices<BienInmueble> getListasInmuebles() {
        return listasInmuebles;
    }

    public void setListasInmuebles(ListaEnlazadaServices<BienInmueble> listasInmuebles) {
        this.listasInmuebles = listasInmuebles;
    }

    public BienInmueble getBienInmueble() {
        if (this.bienInmueble == null) {
            this.bienInmueble = new BienInmueble();
        }
        return bienInmueble;
    }

    public void setBienInmueble(BienInmueble bienInmueble) {
        this.bienInmueble = bienInmueble;
    }

    public Boolean guardar() {
        try {            
            guardar(getBienInmueble());
            return true;
        } catch (Exception e) {
            System.out.println("ControladorBienInmueble -  guardar : Error en guardar el bien : "+e);
        }
        return false;
    }
    
    public Boolean modificar(Integer pos) {
        try {   
            modificar(getBienInmueble(), pos);
            return true;
        } catch (Exception e) {
            System.out.println("ControladorBienInmueble -  modificar : Error en modificar bien"+e);
        }
        return false;
    }
    
    public ListaEnlazadaServices<BienInmueble> listado() {
        setListasInmuebles(listar());
        return listasInmuebles;
    }

    public Boolean delete(Integer pos) {
        try {   
            eliminar(pos);
            setListasInmuebles(listar());
            return true;
        } catch (Exception e) {
            System.out.println("ControladorBienInmueble - delete:Error en modificar bien"+e);
        }
        return false;
    }
}

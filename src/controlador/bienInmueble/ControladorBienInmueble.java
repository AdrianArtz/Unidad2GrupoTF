package controlador.bienInmueble;

import controlador.dao.AdaptadorDao;
import controlador.tda.lista.ListaEnlazadaServices;
import controlador.tda.lista.exception.PosicionException;
import controlador.utiles.TiposBienInmueble;
import modelo.BienInmueble;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp
 */
public class ControladorBienInmueble extends AdaptadorDao<BienInmueble>{

    private BienInmueble bienInmueble;
    private ListaEnlazadaServices<BienInmueble> listasInmuebles;

    public ControladorBienInmueble() {
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

    public Boolean guardar(Double precio,TiposBienInmueble tipo, String descrip) {
        try {            
            bienInmueble= new BienInmueble( precio,tipo.toString(), descrip);
            guardar(getBienInmueble());
            setListasInmuebles(listar());
            return true;
        } catch (Exception e) {
            System.out.println("ControladorBienInmueble -  guardar : Error en guardar el bien : "+e);
        }
        return false;
    }
    
    public Boolean modificar(Double precio,TiposBienInmueble tipo, String descrip,Integer pos) {
        try {   
            bienInmueble= new BienInmueble( precio,tipo.toString(), descrip);
            modificar(getBienInmueble(), pos);
            setListasInmuebles(listar());
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
    public String[][] tablaListacompleta( ) throws PosicionException, Exception {
        Integer j= listasInmuebles.getLista().getSize();
        String[][] list = new String[j][3];
        for (Integer i = 0; i < j; i++) {
            list[i][0] = "" + listasInmuebles.getLista().obtenerDato(i).getPrecioSinIva();
            list[i][1] = "" + listasInmuebles.getLista().obtenerDato(i).getDescripcion();
            list[i][2] = "" + listasInmuebles.getLista().obtenerDato(i).getTipoInmueble();      
        }
        return list;
    }
}

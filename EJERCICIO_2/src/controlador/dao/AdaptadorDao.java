package controlador.dao;

import controlador.json.ControladorJson;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.ListaEnlazadaServices;
import modelo.BienInmueble;

/**
 * Fecha: 27/06/2022
 * @author K.G - Thaisncp
 * @param <E>
 */
public class AdaptadorDao<T> implements InterfazDao<T> {

    private ControladorJson<T> json;

    public AdaptadorDao() {
        json = new ControladorJson<>();
    }

    @Override
    public void guardar(T dato) throws Exception {
        ListaEnlazada<T> lista;
        try {
            lista = listar().getLista();
             System.out.println("lista llena");
        } catch (Exception e) {
            lista = new ListaEnlazada<>();
            System.out.println("lista vacia");
        }
        if (lista.getSize() != 0) {
            lista.insertar(dato, lista.getSize() - 1);
        } else {
            lista.insertar(dato, 0);
        }
        ListaEnlazadaServices<T> listado = new ListaEnlazadaServices<>();
        listado.setLista(lista);
        json.guardar(( BienInmueble[]) listado.getLista().toArray());
    }

    @Override
    public void modificar(T dato, Integer pos) throws Exception {
        ListaEnlazada<T> lista = listar().getLista();
        lista.modificarDato(pos, dato);
        ListaEnlazadaServices<T> listado = new ListaEnlazadaServices<>();
        listado.setLista(lista);
        json.guardar(( BienInmueble[]) listado.getLista().toArray());
    }

    @Override
    public ListaEnlazadaServices<T> listar() {
        ListaEnlazadaServices<T> listar = new ListaEnlazadaServices<>();
        try {
            listar.getLista().toList((T[]) json.listar());
        } catch (Exception e) {
            System.out.println("lista vacia");
        }
        return listar;
    }

    @Override
    public void eliminar(Integer pos) throws Exception {
        ListaEnlazada<T> lista = listar().getLista();
        lista.eliminarDato(pos);
        ListaEnlazadaServices<T> listado = new ListaEnlazadaServices<>();
        listado.setLista(lista);
        json.guardar(( BienInmueble[]) listado.getLista().toArray());
    }

}

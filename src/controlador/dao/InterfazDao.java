package controlador.dao;

import controlador.tda.lista.ListaEnlazadaServices;

/**
 * Fecha: 27/06/2022
 * @author K.G - Thaisncp
 */
public interface InterfazDao <T> {
    public void guardar(T dato) throws Exception;
    public void modificar(T dato, Integer pos) throws Exception;
    public ListaEnlazadaServices<T> listar();
    public void eliminar(Integer pos) throws Exception;
}

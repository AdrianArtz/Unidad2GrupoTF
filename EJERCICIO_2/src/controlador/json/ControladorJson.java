package controlador.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controlador.tda.lista.ListaEnlazadaServices;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Fecha: 27/06/2022
 * @author K.G - Thaisncp
 * @param <E>
 */
public class ControladorJson<E>{
  
    Gson json_gson = new GsonBuilder().setPrettyPrinting().create();
    String nombreDocumento="datos.json";

    /**
     * Metodo que permite pasar de un string con informacion json a una ListaEnlazadaServices<E>
     * @return ListaEnlazadaServices<E>
     */
    public ListaEnlazadaServices<E> listar() {
        ListaEnlazadaServices<E> deserializar= new ListaEnlazadaServices<>();
        Class<E> clazz = (Class<E>) deserializar.getClass();
        deserializar = (ListaEnlazadaServices<E>) json_gson.fromJson(JsonToString(),clazz);
         System.out.println("Listado correcto");
        return deserializar;
    }
    
    /**
     * Metodo que permite obtener un string de un archivo json  
     * @return String
     */
    public String JsonToString() {
        String stringJson;
        try {
            Reader reader = new InputStreamReader(new FileInputStream(nombreDocumento), "Utf-8");
            int ch = 0;
            StringBuilder sbBuffer = new StringBuilder();
                while ((ch = reader.read()) != -1) {
                    sbBuffer.append((char) ch);
                }
            reader.close();
            stringJson = sbBuffer.toString();
            return stringJson;
        } catch (IOException e) {
            return null;
        }
    }
    
    /**
     * Metodo que permite guardar una ListaEnlazadaServices<E> en un archivo json 
     * @param lista ListaEnlazadaServices<E> a guardar
     * @throws java.lang.Exception  
     */
    public void guardar(ListaEnlazadaServices<E> lista) throws Exception {
        String stringJson = json_gson.toJson(lista);
        FileWriter archivoJson = new FileWriter(nombreDocumento);
        archivoJson.write(stringJson);
        archivoJson.flush();
    }
}
package controlador.tda.lista.exception;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp
 */
public class EstructuraDataVaciaExpetion extends Exception {

    /**
     * Creates a new instance of <code>PilaVaciaExpetion</code> without detail
     * message.
     */
    public EstructuraDataVaciaExpetion() {
    }

    /**
     * Constructs an instance of <code>PilaVaciaExpetion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EstructuraDataVaciaExpetion(String msg) {
        super(msg);
    }
}

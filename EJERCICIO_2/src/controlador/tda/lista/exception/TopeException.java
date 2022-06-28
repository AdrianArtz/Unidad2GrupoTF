package controlador.tda.lista.exception;

/**
 * Fecha:  27/06/2022
 * @author K.G - Thaisncp
 */
public class TopeException extends Exception {

    /**
     * Creates a new instance of <code>TopeException</code> without detail
     * message.
     */
    public TopeException() {
    }

    /**
     * Constructs an instance of <code>TopeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TopeException(String msg) {
        super(msg);
    }
}

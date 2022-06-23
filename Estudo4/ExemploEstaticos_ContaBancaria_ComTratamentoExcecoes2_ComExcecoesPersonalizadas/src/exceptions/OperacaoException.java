/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author mpisc
 */
public class OperacaoException extends Exception {

    /**
     * Creates a new instance of <code>OperacaoException</code> without detail
     * message.
     */
    public OperacaoException() {
    }

    /**
     * Constructs an instance of <code>OperacaoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OperacaoException(String msg) {
        super(msg);
    }
}

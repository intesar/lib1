/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cisco.altcso.exception;

/**
 *
 * @author Intesar Mohammed
 */
public class NoDataFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>NoResultsFoundException</code> without detail message.
     */
    public NoDataFoundException() {
    }

    /**
     * Constructs an instance of <code>NoResultsFoundException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public NoDataFoundException(String msg) {
        super(msg);
    }
}

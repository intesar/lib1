/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cisco.altcso.exception;

/**
 *
 * @author Intesar Mohammed
 */
public class ErrorProcessingRequest extends RuntimeException {

    /**
     * Creates a new instance of <code>ErrorProcessingRequest</code> without detail message.
     */
    public ErrorProcessingRequest() {
    }

    /**
     * Constructs an instance of <code>ErrorProcessingRequest</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ErrorProcessingRequest(String msg) {
        super(msg);
    }
}

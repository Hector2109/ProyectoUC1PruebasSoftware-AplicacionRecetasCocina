/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class ValidacionDTOException extends Exception {
     /**
     * Constructor vacío.
     */
    public ValidacionDTOException() {
    }

    /**
     * Constructor que establece el mensaje de la excepción.
     * @param message de la excepción.
     */
    public ValidacionDTOException(String message) {
        super(message);
    }

    /**
     * Constructor que establece el mensaje y la causa de la excepción.
     * @param message de la excepción.
     * @param cause de la excepción.
     */
    public ValidacionDTOException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor que establece la causa de la excepción.
     * @param cause de la excepción
     */
    public ValidacionDTOException(Throwable cause) {
        super(cause);
    }
    
    /**
     * Constructor que establece el mensaje, la causa, y otros atributos de la excepción.
     * 
     * @param message El mensaje descriptivo de la excepción.
     * @param cause La causa de la excepción.
     * @param enableSuppression Indica si la supresión de excepciones está habilitada o no.
     * @param writableStackTrace Indica si se debe escribir el stack trace en la salida estándar de error.
     */
    public ValidacionDTOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

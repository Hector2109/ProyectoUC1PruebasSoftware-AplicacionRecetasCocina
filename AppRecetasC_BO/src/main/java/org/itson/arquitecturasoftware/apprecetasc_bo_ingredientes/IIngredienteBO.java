/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_ingredientes;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public interface IIngredienteBO {
        /**
     * Método que obtiene los ingredientes de una receta
     * @param receta receta que se desea saber los ingredientes
     * @return ingredientes de la receta
     */
    LinkedList<RecetaDTO> obtenerIngredientesReceta(RecetaDTO receta);
}

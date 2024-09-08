/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_pasos;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_dto.PasoDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public interface IPasoBO {
        /**
     * Retorna los pasos de una receta
     * @param receta receta a considerar
     * @return lista de passos de la receta
     */
    LinkedList<PasoDTO> obtenerPasos(RecetaDTO receta);

}

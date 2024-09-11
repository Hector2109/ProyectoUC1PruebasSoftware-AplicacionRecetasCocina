/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_recetas;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_dto.PasoDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public interface IRecetaBO {

    /**
     * Método el cuál obtiene una receta
     *
     * @param receta receta a obtener
     * @return receta
     * @throws org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException
     */
    RecetaDTO obtenerReceta(RecetaDTO receta) throws ValidacionDTOException;

    /**
     * Retorna las recetas guardadas de un usuario
     *
     * @param usuario usuario al que e le desea obtener las recetas
     * @return lista de recetas guardadas por el usuario
     * @throws org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException
     */
    LinkedList<RecetaDTO> obtieneRecetasGuardadas(UsuarioDTO usuario) throws ValidacionDTOException;

    /**
     * Retorna las recetas favoritas de un usuario
     *
     * @param usuario usuario al que se le desea obtener recetas
     * @return lista de recetas favoritas de usuario
     * @throws org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException
     */
    LinkedList<RecetaDTO> obtieneRecetasFav(UsuarioDTO usuario) throws ValidacionDTOException;
    
    /**
     * Retorna los pasos de una receta.
     * 
     * @param receta
     * @return lista de los pasos de una receta
     * @throws ValidacionDTOException 
     */
    LinkedList<PasoDTO> obtenerPasosDeReceta(RecetaDTO receta) throws ValidacionDTOException;

}

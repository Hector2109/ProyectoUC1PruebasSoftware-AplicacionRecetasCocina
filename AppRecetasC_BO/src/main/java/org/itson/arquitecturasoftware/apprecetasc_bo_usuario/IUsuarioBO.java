/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_usuario;

import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public interface IUsuarioBO {

    /**
     * Retorna un uuario
     *
     * @param usuario usuario que se desea obtener
     * @return usuario
     */
    UsuarioDTO obtenerUsuario(UsuarioDTO usuario);

    /**
     * Añade una receta a favoritos
     *
     * @param receta receta a añadir
     * @return usuario al que se añadio receta
     */
    UsuarioDTO anadirRecetaFav(RecetaDTO receta, UsuarioDTO usuario) throws ValidacionDTOException;
    
    /**
     * Elimina una receta de ls lista de favoritos del usuario
     *
     * @param receta receta para eliminar
     * @return usuario al qaue se le elimino la receta
     */
    UsuarioDTO eliminarRecetaFav(RecetaDTO receta, UsuarioDTO usuario) throws ValidacionDTOException;

    /**
     * Añade una receta a los guardados del usuario
     *
     * @param receta receta a guardar
     * @return Usuario al que se añadio la receta
     */
    UsuarioDTO anadirRecetaGuardada(RecetaDTO receta, UsuarioDTO usuario);

    /**
     * Elimina una receta guardada del usuario
     *
     * @param receta receta a eliminar
     * @return usuario al que se le elimino la receta
     */
    UsuarioDTO eliminarRecetaGuardada(RecetaDTO receta, UsuarioDTO usuario);

}

package org.itson.arquitecturasoftware.apprecetasc_dao_recetas;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Paso;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Usuario;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public interface IRecetaDAO {
    
    /**
     * Método el cuál obtiene una receta
     * @param receta receta a obtener
     * @return receta 
     */
    Receta obtenerReceta(Receta receta);
    
    /**
     * Añade un paso a una receta;
     * @param receta receta a la que se añadirá el paso
     * @param paso paso a añadir
     * @return retorna la receta a la que se añadio el paso
     */
    Receta anadirPaso (Receta receta, Paso paso);
    
    
    /**
     * Retorna las recetas guardadas de un usuario
     * @param usuario usuario al que e le desea obtener las recetas
     * @return lista de recetas guardadas por el usuario
     */
    LinkedList<Receta> obtieneRecetasGuardadas(Usuario usuario);
    
    /**
     * Retorna las recetas favoritas de un usuario
     * @param usuario usuario al que se le desea obtener recetas
     * @return lista de recetas favoritas de usuario
     */
    LinkedList<Receta> obtieneRecetasFav (Usuario usuario);
    
}

package org.itson.arquitecturasoftware.apprecetasc_dao_recetas;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
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
     * @throws org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException en caso de no encontrar la receta.
     */
    Receta obtenerReceta(Receta receta) throws DAOException;
    
    /**
     * Retorna las recetas guardadas de un usuario
     * @param usuario usuario al que e le desea obtener las recetas
     * @return lista de recetas guardadas por el usuario
     * @throws org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException en caso de no encontrar la receta.
     */
    LinkedList<Receta> obtieneRecetasGuardadas(Usuario usuario) throws DAOException;
    
    /**
     * Retorna las recetas favoritas de un usuario
     * @param usuario usuario al que se le desea obtener recetas
     * @return lista de recetas favoritas de usuario
     * @throws org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException en caso de no encontrar la receta.
     */
    LinkedList<Receta> obtieneRecetasFav (Usuario usuario) throws DAOException;
    
    /**
     * Retorna todas las recetas.
     * @return lista de recetas favoritas de usuario
     * @throws org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException en caso de no encontrar las recetas.
     */
    LinkedList<Receta> obtieneRecetas () throws DAOException;
    
    LinkedList <Receta> obtenerRecetas () throws DAOException;
    
    LinkedList <Receta> buscarRecetaNombre (String nombre);
    
    LinkedList <Receta> buscarRecetaTipo (String tipo);
    
    LinkedList <Receta> buscarRecetaTiempo (int minutos);
}

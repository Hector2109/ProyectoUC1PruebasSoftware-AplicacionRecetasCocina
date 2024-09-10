package org.itson.arquitecturasoftware.apprecetasc_dao_usuario;

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
public interface IUsuarioDAO {
    
    /**
     * Retorna un uuario
     * @param usuario usuario que se desea obtener
     * @return usuario
     */
    Usuario obtenerUsuario(Usuario usuario) throws DAOException;
    
    /**
     * Añade una receta a favoritos
     * @param receta receta a añadir
     * @return usuario al que se añadio receta
     */
    Usuario anadiirRecetaFav(Receta receta, Usuario usuario)throws DAOException;
    
    /**
     * Añade la lista de ingredientes de una receta al carrito del usuario
     * @param receta receta del que se desea añadir ingredientes al carro
     * @return usuario al que se le añaden los ingredeintes
     */
    Usuario anadirCarrito(Receta receta, Usuario usuario)throws DAOException;
    
    /**
     * Elimina una receta de ls lista de favoritos del usuario
     * @param receta receta para eliminar
     * @return usuario al qaue se le elimino la receta
     */
    Usuario eliminarRecetaFav(Receta receta, Usuario usuario)throws DAOException;
    
    /**
     * Añade una receta a los guardados del usuario
     * @param receta receta a guardar
     * @return Usuario al que se añadio la receta
     */
    Usuario anadirRecetaGuardada(Receta receta, Usuario usuario)throws DAOException;
    
    /**
     * Elimina una receta guardada del usuario
     * @param receta receta a eliminar
     * @return usuario al que se le elimino la receta
     */
    Usuario eliminarRecetaGuardada (Receta receta, Usuario usuario)throws DAOException;
    
}

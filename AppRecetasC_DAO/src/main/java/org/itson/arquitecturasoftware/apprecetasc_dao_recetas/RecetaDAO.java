package org.itson.arquitecturasoftware.apprecetasc_dao_recetas;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_bdsimulada.Recetas;
import org.itson.arquitecturasoftware.apprecetasc_bdsimulada.Usuarios;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
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
public class RecetaDAO implements IRecetaDAO {

    Recetas recetasBD;
    Usuarios usuariosBD;

    public RecetaDAO() {
        this.recetasBD = new Recetas();
        this.usuariosBD = new Usuarios();
    }

    /**
     * Método para obtener una receta en especifico.
     *
     * @param receta receta.
     * @return una receta
     * @throws DAOException en caso de no encontrar la receta.
     */
    @Override
    public Receta obtenerReceta(Receta receta) throws DAOException {
        if (recetasBD.getRecetas() != null) {
            if (recetasBD.getRecetas().contains(receta)) {
                int index = recetasBD.getRecetas().indexOf(receta);
                return recetasBD.getRecetas().get(index);
            } else {
                throw new DAOException("Error: Contraseña incorrecta");
            }
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }
    }

    /**
     * Método para obtener las recetas guardadas por un usuario.
     * 
     * @param usuario usuario
     * @return recetas guardadas
     * @throws DAOException en caso de no encontrar la receta.
     */
    @Override
    public LinkedList<Receta> obtieneRecetasGuardadas(Usuario usuario) throws DAOException {
        if (usuariosBD.getUsuarios() != null) {
            return usuario.getRecetasGuardadas();
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }

    }

    /**
     * Método 
     * @param usuario usuario
     * @return recetas favoritas del usuario.
     * @throws DAOException en caso de no encontrar la receta.
     */
    @Override
    public LinkedList<Receta> obtieneRecetasFav(Usuario usuario) throws DAOException {
        if (usuariosBD.getUsuarios() != null) {
            return usuario.getRecetasFav();
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }

    }

}

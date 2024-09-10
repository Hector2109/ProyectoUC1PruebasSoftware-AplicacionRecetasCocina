package org.itson.arquitecturasoftware.apprecetasc_dao_pasos;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_bdsimulada.Recetas;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Paso;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class PasoDAO implements IPasoDAO {
    
    Recetas recetasBD;
    
    /**
     * Método para obtener los pasos de una receta.
     * 
     * @param receta receta.
     * @return pasos de una receta
     * @throws DAOException en caso de no encontrar la receta.
     */
    @Override
    public LinkedList<Paso> obtenerPasos(Receta receta) throws DAOException {
        if (recetasBD.getRecetas()!= null) {
            return receta.getPasos();
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }

    }

}

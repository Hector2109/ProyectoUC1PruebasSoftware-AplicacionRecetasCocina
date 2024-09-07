package org.itson.arquitecturasoftware.apprecetasc_dao_pasos;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Paso;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public interface IPasoDAO {
    
    /**
     * Retorna los pasos de una receta
     * @param receta receta a considerar
     * @return lista de passos de la receta
     */
    LinkedList<Paso> obtenerPasos(Receta receta);

}

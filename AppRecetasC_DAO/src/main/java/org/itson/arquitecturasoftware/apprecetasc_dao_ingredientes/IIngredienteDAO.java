package org.itson.arquitecturasoftware.apprecetasc_dao_ingredientes;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public interface IIngredienteDAO {
    
    /**
     * Método que obtiene los ingredientes de una receta
     * @param receta receta que se desea saber los ingredientes
     * @return ingredientes de la receta
     */
    LinkedList<Receta> obtenerIngredientesReceta(Receta receta);
    
}

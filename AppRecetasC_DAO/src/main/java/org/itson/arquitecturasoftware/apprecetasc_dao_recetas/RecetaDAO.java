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
public class RecetaDAO implements IRecetaDAO{

    
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Receta obtenerReceta(Receta receta) {
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinkedList<Receta> obtieneRecetasGuardadas(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinkedList<Receta> obtieneRecetasFav(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

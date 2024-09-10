package org.itson.arquitecturasoftware.apprecetasc_bdsimulada;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Ingrediente;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class Ingredientes {
    
    LinkedList <Ingrediente> ingredientes;
    
    /**
     * tabla de base de datos simulada de ingredientes
     */
    public Ingredientes (){
     
        ingredientes = new LinkedList <Ingrediente>();
        
    }
    
    public void anadirIngrediente(Ingrediente ingrediente){        
        ingredientes.add(ingrediente);        
    }
    
    public boolean eliminatIngrediente (Ingrediente ingrediente){
        return ingredientes.remove(ingrediente);
    }
    
    public LinkedList<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    
    
}

package org.itson.arquitecturasoftware.apprecetasc_bdsimulada;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;


/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class Recetas {
        
    
    LinkedList listaRecetas;
    
    /**
     * Constructor para simular usuarios en BD
     */
    public Recetas(){ 
        LinkedList <Receta> listaRecetas = new LinkedList<>();    
        this.listaRecetas = listaRecetas;
        
        this.listaRecetas.add(new Receta("Pizza", 30, "Italiana", null));
        
        
    }
    
    public LinkedList<Receta> getUsuarios(){
        return listaRecetas;
    }
    
    
    
    
    
}

package org.itson.arquitecturasoftware.apprecetasc_bdsimulada;


import java.awt.List;
import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Usuario;



/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class Usuarios {
    
    
    LinkedList listaUsuarios;
    
    /**
     * Constructor para simular usuarios en BD
     */
    public Usuarios(){ 
        LinkedList <Usuario> listaUsuarios = new LinkedList<>();    
        this.listaUsuarios = listaUsuarios;
        
        this.listaUsuarios.add(new Usuario("vickytona@gmail.com", "camarono", "Vicky"));
        this.listaUsuarios.add(new Usuario("kikuno@gmail.com", "gataonly", "Enrique Rod"));
        this.listaUsuarios.add(new Usuario("chiy@gmail.com", "marinaCT", "Yisus Yastro"));
        this.listaUsuarios.add(new Usuario("betunia@gmail.com", "wachin", "Vicky"));
    }
    
    public LinkedList<Usuario> getUsuarios(){
        return listaUsuarios;
    }
    
    
    
    
    
    
    
}

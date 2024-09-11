package org.itson.arquitecturasoftware.apprecetasc_bo_Control;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_bo_recetas.IRecetaBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_recetas.RecetaBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_usuario.IUsuarioBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_usuario.UsuarioBO;
import org.itson.arquitecturasoftware.apprecetasc_dto.IngredienteDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class ControlBO {
    
    private IUsuarioBO usuarioBO;
    private IRecetaBO recetaBO;
    private boolean sesion;

    /**
     * Constructor de control
     */
    public ControlBO() {
        this.usuarioBO = new UsuarioBO();
        this.recetaBO = new RecetaBO();
        sesion = false;
    }
    
    /**
     * Métododo para iniciar sesión
     * @param usuario usuario
     * @return true si se los datos son correctos
     * @throws ValidacionDTOException en caso de no encontrarlo o la contraseña sea incorrecta
     */
    public boolean iniciarSesion (UsuarioDTO usuario)throws ValidacionDTOException{        
        String contrasenia = usuario.getContrasenia();
        UsuarioDTO usuarioSesion = usuarioBO.obtenerUsuario(usuario);
        if (usuarioSesion!=null){
            String contraseniaSesion = usuarioSesion.getContrasenia();    
            if (contraseniaSesion.equals(contrasenia)){
                return true;
            }else{
                throw new ValidacionDTOException ("Contraseña incorrecta");
            }
        }else{
            throw new ValidacionDTOException ("Usuario no registrado");
        }   
    }
    
    public void cerrarSesion(){
        sesion = false;
    }
    
    /**
     * Añade una receta favorita a un usuario
     * @param usuario usuario
     * @param receta receta
     * @return usuario
     * @throws ValidacionDTOException 
     */
    public UsuarioDTO anadirRecetaFav (UsuarioDTO usuario, RecetaDTO receta) throws ValidacionDTOException{
        
        if (usuarioBO.obtenerUsuario(usuario)!=null){
           if (recetaBO.obtenerReceta(receta)!=null){
               usuarioBO.anadirRecetaFav(obtenerReceta(receta), usuario);
               return usuario;
           }else{
               throw new ValidacionDTOException ("Receta no encontrada");
           } 
        }
        throw new ValidacionDTOException ("Usuario no encontrado");
        
    }
    
    public UsuarioDTO eliminarRecetaFavorita (UsuarioDTO usuario, RecetaDTO receta) throws ValidacionDTOException{
        
        if (usuarioBO.obtenerUsuario(usuario)!=null){
           if (recetaBO.obtenerReceta(receta)!=null){
               usuarioBO.eliminarRecetaFav(obtenerReceta(receta), usuario);
               return usuario;
           }else{
               throw new ValidacionDTOException ("Receta no encontrada");
           } 
        }
        throw new ValidacionDTOException ("Usuario no encontrado");
        
    }
    
    public UsuarioDTO anadirRecetaGuardada (UsuarioDTO usuario, RecetaDTO receta) throws ValidacionDTOException{
        if (usuarioBO.obtenerUsuario(usuario)!=null){
           if (recetaBO.obtenerReceta(receta)!=null){
               usuarioBO.anadirRecetaGuardada(obtenerReceta(receta), usuario);
               return usuario;
           }else{
               throw new ValidacionDTOException ("Receta no encontrada");
           } 
        }
        throw new ValidacionDTOException ("Usuario no encontrado");
    }
    
    public UsuarioDTO eliminarRecetaGuardada (UsuarioDTO usuario, RecetaDTO receta) throws ValidacionDTOException{
        
        if (usuarioBO.obtenerUsuario(usuario)!=null){
           if (recetaBO.obtenerReceta(receta)!=null){
               usuarioBO.eliminarRecetaGuardada(obtenerReceta(receta), usuario);
               return usuario;
           }else{
               throw new ValidacionDTOException ("Receta no encontrada");
           } 
        }
        throw new ValidacionDTOException ("Usuario no encontrado");
        
    }
    
    /**
     * Obtiene una receta especifica
     * @param receta receta a obtener
     * @return receta
     * @throws ValidacionDTOException 
     */
    public RecetaDTO obtenerReceta (RecetaDTO receta) throws ValidacionDTOException{
        
        try {
            return recetaBO.obtenerReceta(receta);
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
        
    }
    
    public LinkedList <RecetaDTO> obtenerRecetasFav (UsuarioDTO usuario) throws ValidacionDTOException{
        
        try {
            usuario = usuarioBO.obtenerUsuario(usuario);
            return recetaBO.obtieneRecetasFav(usuario);
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
        
    }
    
    public LinkedList <RecetaDTO> obtenerRecetasGuardada (UsuarioDTO usuario) throws ValidacionDTOException{
        
        try {
            return recetaBO.obtieneRecetasGuardadas(usuarioBO.obtenerUsuario(usuario));
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
        
    }
    
    
    public LinkedList <IngredienteDTO> obtenerIngrediente (UsuarioDTO usuario)throws ValidacionDTOException{
        try {
            LinkedList <RecetaDTO> recetasGuardadas = obtenerRecetasGuardada(usuario);
            LinkedList <IngredienteDTO> ingredientes = new LinkedList<>();
            
            for (RecetaDTO receta: recetasGuardadas) {
                
                ingredientes.addAll(receta.getIngredientes());
                
            }
            
            return ingredientes;
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException ("No hay recetas guardadas");
        }
    }
    
    public LinkedList <RecetaDTO> obtenerRecetas()throws ValidacionDTOException{
        try {
            return recetaBO.obtenerRecetas();
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
    }
    
    
    public LinkedList <RecetaDTO> buscarRecetaNombre(String nombre){
        
        return recetaBO.buscarRecetaNombre(nombre);
        
    }
    
    
    public LinkedList <RecetaDTO> buscarRecetaTipo(String tipo){
        
        return recetaBO.buscarRecetaTipo(tipo);
        
    }
    
    public LinkedList <RecetaDTO> buscarRecetaDuracion(int minutos){
        
        return recetaBO.buscarRecetaDuracion(minutos);
        
    }
    
    public LinkedList <RecetaDTO> buscarRecetaIngrediente(String ingrediente){
        
        return recetaBO.buscarRecetaIngrediente(ingrediente);
        
    }
    
    
    
    
    
}

package org.itson.arquitecturasoftware.apprecetasc_bo_Control;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_bo_recetas.IRecetaBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_recetas.RecetaBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_usuario.IUsuarioBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_usuario.UsuarioBO;
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
        UsuarioDTO usuarioSesion = usuarioBO.obtenerUsuario(usuario);
        if (usuarioSesion!=null){
            if (usuarioSesion.getContrasenia().equals(usuario.getContrasenia())){
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
               usuarioBO.anadirRecetaFav(receta, usuario);
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
               usuarioBO.anadirRecetaGuardada(receta, usuario);
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
    
    public LinkedList <RecetaDTO> obtenerRecetasFav (UsuarioDTO usuaro) throws ValidacionDTOException{
        
        try {
            return recetaBO.obtieneRecetasFav(usuaro);
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
        
    }
    
    public LinkedList <RecetaDTO> obtenerRecetasGuardada (UsuarioDTO usuaro) throws ValidacionDTOException{
        
        try {
            return recetaBO.obtieneRecetasGuardadas(usuaro);
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
        
    }
    
    
    
    
    
    
    
}

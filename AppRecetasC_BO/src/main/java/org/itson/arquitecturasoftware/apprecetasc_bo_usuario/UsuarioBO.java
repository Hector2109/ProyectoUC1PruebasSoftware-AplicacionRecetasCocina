/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_usuario;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
import org.itson.arquitecturasoftware.apprecetasc_dao_usuario.UsuarioDAO;
import org.itson.arquitecturasoftware.apprecetasc_dto.IngredienteDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.PasoDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Ingrediente;
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
public class UsuarioBO implements IUsuarioBO{

    UsuarioDAO usuarioDAO;
    
    public UsuarioBO(){
        usuarioDAO = new UsuarioDAO();
    }
    
    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO obtenerUsuario(UsuarioDTO usuario) {
        Usuario user = new Usuario(
                usuario.getCorreo(), 
                usuario.getContrasenia(), 
                usuario.getNombre()
        );
        
        try {
            usuarioDAO.obtenerUsuario(user);
        } catch (DAOException ex) {
            Logger.getLogger(UsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LinkedList<RecetaDTO> recetasEncontradas = new LinkedList<>();
        
        for (Receta receta : user.getRecetasFav()) {
            LinkedList<PasoDTO> pasosEncontrados = new LinkedList<>();
            LinkedList<IngredienteDTO> ingredientesEncontrados = new LinkedList<>();
            
            for (Paso paso : receta.getPasos()) {
                pasosEncontrados.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
            }
            
            for (Ingrediente ingrediente : receta.getIngredientes()) {
                ingredientesEncontrados.add(new IngredienteDTO(ingrediente.getNombre(),ingrediente.getCantidad(),ingrediente.getTipoCantidad()));
            }
            
            
            RecetaDTO recetaDTO = new RecetaDTO(
                    receta.getNombre(), 
                    receta.getDuracion(), 
                    receta.getTipo(),
                    pasosEncontrados,
                    ingredientesEncontrados
            );
            
            recetasEncontradas.add(recetaDTO);
        }
        
        LinkedList<RecetaDTO> recetasGuardadasE = new LinkedList<>();
        
        for (Receta receta : user.getRecetasGuardadas()) {
            LinkedList<PasoDTO> pasosEncontradosG = new LinkedList<>();
            LinkedList<IngredienteDTO> ingredientesEncontradosG = new LinkedList<>();
            
            for (Paso paso : receta.getPasos()) {
                pasosEncontradosG.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
            }
            
            for (Ingrediente ingrediente : receta.getIngredientes()) {
                ingredientesEncontradosG.add(new IngredienteDTO(ingrediente.getNombre(),ingrediente.getCantidad(),ingrediente.getTipoCantidad()));
            }
            
            RecetaDTO recetaDTO = new RecetaDTO(
                    receta.getNombre(), 
                    receta.getDuracion(), 
                    receta.getTipo(), 
                    pasosEncontradosG,
                    ingredientesEncontradosG
            );
            
            recetasEncontradas.add(recetaDTO);
        }
        
        usuario.setRecetasFav(recetasEncontradas);
        usuario.setRecetasGuardadas(recetasGuardadasE);
        
        return usuario;
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO anadirRecetaFav(RecetaDTO receta, UsuarioDTO usuario)  throws ValidacionDTOException{
        try {
            usuarioDAO.anadiirRecetaFav(new Receta(receta.getNombre()), new Usuario (usuario.getCorreo()));
            return obtenerUsuario(usuario);
        } catch (DAOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
    }
    

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO eliminarRecetaFav(RecetaDTO receta, UsuarioDTO usuario) throws ValidacionDTOException{
        try {
            usuarioDAO.eliminarRecetaFav(new Receta(receta.getNombre()), new Usuario(usuario.getCorreo()));
            return obtenerUsuario(usuario);
        } catch (DAOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO anadirRecetaGuardada(RecetaDTO receta, UsuarioDTO usuario) throws ValidacionDTOException{
        try {
            usuarioDAO.anadirRecetaGuardada(new Receta(receta.getNombre()), new Usuario(usuario.getCorreo()));
            return obtenerUsuario(usuario);
        } catch (DAOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO eliminarRecetaGuardada(RecetaDTO receta, UsuarioDTO usuario) throws ValidacionDTOException{
        try {
            usuarioDAO.eliminarRecetaGuardada(new Receta(receta.getNombre()), new Usuario(usuario.getCorreo()));
            return obtenerUsuario(usuario);
        } catch (DAOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
    }

}

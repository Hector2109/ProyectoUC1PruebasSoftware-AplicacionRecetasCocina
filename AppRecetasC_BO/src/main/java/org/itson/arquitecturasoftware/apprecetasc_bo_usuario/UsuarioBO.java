/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_usuario;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
import org.itson.arquitecturasoftware.apprecetasc_dao_usuario.UsuarioDAO;
import org.itson.arquitecturasoftware.apprecetasc_dto.PasoDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;
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
            
            for (Paso paso : receta.getPasos()) {
                pasosEncontrados.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
            }
            
            RecetaDTO recetaDTO = new RecetaDTO(
                    receta.getNombre(), 
                    receta.getDuracion(), 
                    receta.getTipo(), 
                    pasosEncontrados
            );
            
            recetasEncontradas.add(recetaDTO);
        }
        
        LinkedList<RecetaDTO> recetasGuardadasE = new LinkedList<>();
        
        for (Receta receta : user.getRecetasGuardadas()) {
            LinkedList<PasoDTO> pasosEncontradosG = new LinkedList<>();
            
            for (Paso paso : receta.getPasos()) {
                pasosEncontradosG.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
            }
            
            RecetaDTO recetaDTO = new RecetaDTO(
                    receta.getNombre(), 
                    receta.getDuracion(), 
                    receta.getTipo(), 
                    pasosEncontradosG
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
    public UsuarioDTO anadiirRecetaFav(RecetaDTO receta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO anadirCarrito(RecetaDTO receta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO eliminarRecetaFav(RecetaDTO receta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO anadirRecetaGuardada(RecetaDTO receta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO eliminarRecetaGuardada(RecetaDTO receta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

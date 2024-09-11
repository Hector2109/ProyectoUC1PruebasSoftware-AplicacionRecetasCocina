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
    public UsuarioDTO obtenerUsuario(UsuarioDTO usuario) throws ValidacionDTOException{
        try {
            Usuario user = usuarioDAO.obtenerUsuario(new Usuario(usuario.getCorreo(), usuario.getContrasenia()));
            LinkedList<RecetaDTO> recetasEncontradas = new LinkedList<>();

            for (Receta receta : user.getRecetasFav()) {
                LinkedList<PasoDTO> pasosEncontrados = new LinkedList<>();
                LinkedList<IngredienteDTO> ingredientesEncontrados = new LinkedList<>();

                for (Paso paso : receta.getPasos()) {
                    pasosEncontrados.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
                }

                for (Ingrediente ingrediente : receta.getIngredientes()) {
                    ingredientesEncontrados.add(new IngredienteDTO(ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getTipoCantidad()));
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
                    ingredientesEncontradosG.add(new IngredienteDTO(ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getTipoCantidad()));
                }

                RecetaDTO recetaDTO = new RecetaDTO(
                        receta.getNombre(),
                        receta.getDuracion(),
                        receta.getTipo(),
                        pasosEncontradosG,
                        ingredientesEncontradosG
                );

                recetasGuardadasE.add(recetaDTO);
            }

            usuario.setRecetasFav(recetasEncontradas);
            usuario.setRecetasGuardadas(recetasGuardadasE);
            usuario.setNombre(user.getNombre());
            usuario.setContrasenia(user.getContrasenia());
            usuario.setCorreo(user.getCorreo());
            
            return usuario;
        } catch (DAOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
    }

    /**
     * {@inheritDoc}     * 
     */
    @Override
    public UsuarioDTO anadirRecetaFav(RecetaDTO receta, UsuarioDTO usuario)  throws ValidacionDTOException{
        try {
            usuarioDAO.anadiirRecetaFav(recetaDTOAEntidad(receta), new Usuario (usuario.getCorreo()));
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
            usuarioDAO.eliminarRecetaFav(recetaDTOAEntidad(receta), new Usuario(usuario.getCorreo()));
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
            usuarioDAO.anadirRecetaGuardada(recetaDTOAEntidad(receta), new Usuario(usuario.getCorreo()));
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
            usuarioDAO.eliminarRecetaGuardada(recetaDTOAEntidad(receta), new Usuario(usuario.getCorreo()));
            return obtenerUsuario(usuario);
        } catch (DAOException ex) {
            throw new ValidacionDTOException (ex.getMessage());
        }
    }
    
    /**
     * Metodo el cual convierte una recetaDTO a receta entidad.
     * @param recetaDTO recetaDTO a convertir.
     * @return receta entidad.
     */
    public Receta recetaDTOAEntidad(RecetaDTO recetaDTO) {
        LinkedList<Paso> pasosEncontrados = new LinkedList<>();
        LinkedList<Ingrediente> ingredientesEncontrados = new LinkedList<>();

        for (PasoDTO pasoDTO : recetaDTO.getPasos()) {
            pasosEncontrados.add(new Paso(pasoDTO.getNumero(), pasoDTO.getDescripcion()));
        }

        for (IngredienteDTO ingredienteDTO : recetaDTO.getIngredientes()) {
            ingredientesEncontrados.add(new Ingrediente(ingredienteDTO.getNombre(), ingredienteDTO.getCantidad(), ingredienteDTO.getTipoCantidad()));
        }

        Receta receta = new Receta(
                recetaDTO.getNombre(),
                recetaDTO.getDuracion(),
                recetaDTO.getTipo(),
                pasosEncontrados,
                ingredientesEncontrados
        );
        return receta;
    }
    
//    /**
//     * Metodo que se encarga de convertir una lista de recetasDTO a
//     * recetas entidad.
//     * @param recetasDTO lista de recetasDTO.
//     * @return lista de recetas entidas.
//     */
//    public LinkedList<Receta> recetasDTOAEntidad(LinkedList<RecetaDTO> recetasDTO){
//        LinkedList<Receta> recetasEncontradas = new LinkedList<>();
//
//            for (RecetaDTO recetaDTO : recetasDTO) {
//                LinkedList<Paso> pasosEncontrados = new LinkedList<>();
//                LinkedList<Ingrediente> ingredientesEncontrados = new LinkedList<>();
//
//                for (PasoDTO pasoDTO : recetaDTO.getPasos()) {
//                    pasosEncontrados.add(new Paso(pasoDTO.getNumero(), pasoDTO.getDescripcion()));
//                }
//
//                for (IngredienteDTO ingredienteDTO : recetaDTO.getIngredientes()) {
//                    ingredientesEncontrados.add(new Ingrediente(ingredienteDTO.getNombre(), ingredienteDTO.getCantidad(), ingredienteDTO.getTipoCantidad()));
//                }
//
//                Receta receta = new Receta(
//                        recetaDTO.getNombre(),
//                        recetaDTO.getDuracion(),
//                        recetaDTO.getTipo(),
//                        pasosEncontrados,
//                        ingredientesEncontrados
//                );
//
//                recetasEncontradas.add(receta);
//            }
//        return recetasEncontradas;
//    }

}

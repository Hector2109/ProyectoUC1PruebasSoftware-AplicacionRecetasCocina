/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitecturasoftware.apprecetasc_bo_recetas;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
import org.itson.arquitecturasoftware.apprecetasc_dao_recetas.RecetaDAO;
import org.itson.arquitecturasoftware.apprecetasc_dto.IngredienteDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.PasoDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Ingrediente;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Paso;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class RecetaBO implements IRecetaBO{
    
    RecetaDAO recetaDAO;
    
   public RecetaBO(){
       recetaDAO = new RecetaDAO();
   }

    @Override
    public RecetaDTO obtenerReceta(RecetaDTO receta) {
        Receta recetaEntidad = new Receta(
            receta.getNombre(),
            receta.getDuracion(),
            receta.getTipo());
        
        try {
        Receta recetaObtenida = recetaDAO.obtenerReceta(recetaEntidad);
        
        LinkedList<PasoDTO> pasosEncontrados = new LinkedList<>();
        for (Paso paso : recetaObtenida.getPasos()) {
            pasosEncontrados.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
        }

        LinkedList<IngredienteDTO> ingredientesEncontrados = new LinkedList<>();
        for (Ingrediente ingrediente : recetaObtenida.getIngredientes()) {
            ingredientesEncontrados.add(new IngredienteDTO(ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getTipoCantidad()));
        }

        RecetaDTO recetaCompletaDTO = new RecetaDTO(
            recetaObtenida.getNombre(),
            recetaObtenida.getDuracion(),
            recetaObtenida.getTipo(),
            pasosEncontrados,
            ingredientesEncontrados
        );

        return recetaCompletaDTO;

    } catch (DAOException ex) {
        Logger.getLogger(RecetaBO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return null;     
    }

    @Override
    public LinkedList<RecetaDTO> obtieneRecetasGuardadas(UsuarioDTO usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<RecetaDTO> obtieneRecetasFav(UsuarioDTO usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

package org.itson.arquitecturasoftware.apprecetasc_bo_recetas;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
import org.itson.arquitecturasoftware.apprecetasc_dao_recetas.RecetaDAO;
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
public class RecetaBO implements IRecetaBO{
    
    RecetaDAO recetaDAO;
    
   public RecetaBO(){
       recetaDAO = new RecetaDAO();
   }

    /**
     * Método el cuál obtiene una receta
     *
     * @param receta receta a obtener
     * @return receta
     * @throws
     * org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException
     */
    @Override
    public RecetaDTO obtenerReceta(RecetaDTO receta) throws ValidacionDTOException {
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
            throw new ValidacionDTOException("Error: No se pudo obtener la receta.");
        }
    }

    /**
     * Retorna las recetas guardadas de un usuario
     *
     * @param usuario usuario al que e le desea obtener las recetas
     * @return lista de recetas guardadas por el usuario
     * @throws
     * org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException
     */
    @Override
    public LinkedList<RecetaDTO> obtieneRecetasGuardadas(UsuarioDTO usuario) throws ValidacionDTOException {
        Usuario user = new Usuario(
                usuario.getCorreo(),
                usuario.getContrasenia(),
                usuario.getNombre(),
                recetasDTOAEntidad(usuario.getRecetasGuardadas()),
                "guardadas"
        );

        LinkedList<RecetaDTO> recetasGuardadasDTO = new LinkedList<>();

        try {
            
            LinkedList<Receta> recetasGuardadas = recetaDAO.obtieneRecetasGuardadas(user);
            for (Receta receta : recetasGuardadas) {
                LinkedList<PasoDTO> pasosDTO = new LinkedList<>();
                for (Paso paso : receta.getPasos()) {
                    pasosDTO.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
                }

                LinkedList<IngredienteDTO> ingredientesDTO = new LinkedList<>();
                for (Ingrediente ingrediente : receta.getIngredientes()) {
                    ingredientesDTO.add(new IngredienteDTO(ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getTipoCantidad()));
                }

                RecetaDTO recetaDTO = new RecetaDTO(
                        receta.getNombre(),
                        receta.getDuracion(),
                        receta.getTipo(),
                        pasosDTO,
                        ingredientesDTO
                );

                recetasGuardadasDTO.add(recetaDTO);
            }

            return recetasGuardadasDTO;

        } catch (DAOException ex) {
            throw new ValidacionDTOException("No hay recetas guardadas.");
        }
    }
     
    /**
     * Retorna las recetas favoritas de un usuario
     *
     * @param usuario usuario al que se le desea obtener recetas
     * @return lista de recetas favoritas de usuario
     * @throws org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException
     */
    @Override
    public LinkedList<RecetaDTO> obtieneRecetasFav(UsuarioDTO usuario) throws ValidacionDTOException {
        Usuario user = new Usuario(usuario.getCorreo(), 
                usuario.getContrasenia(), 
                usuario.getNombre(), 
                recetasDTOAEntidad(usuario.getRecetasFav()),
                "favoritas"
        );

        LinkedList<RecetaDTO> recetasFavDTO = new LinkedList<>();

        try {
            
            LinkedList<Receta> recetasFav = recetaDAO.obtieneRecetasFav(user);
            for (Receta receta : recetasFav) {
                LinkedList<PasoDTO> pasosDTO = new LinkedList<>();
                for (Paso paso : receta.getPasos()) {
                    pasosDTO.add(new PasoDTO(paso.getNumero(), paso.getDescripcion()));
                }

                LinkedList<IngredienteDTO> ingredientesDTO = new LinkedList<>();
                for (Ingrediente ingrediente : receta.getIngredientes()) {
                    ingredientesDTO.add(new IngredienteDTO(ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getTipoCantidad()));
                }

                RecetaDTO recetaDTO = new RecetaDTO(
                        receta.getNombre(),
                        receta.getDuracion(),
                        receta.getTipo(),
                        pasosDTO,
                        ingredientesDTO
                );

                recetasFavDTO.add(recetaDTO);
            }

            return recetasFavDTO;

        } catch (DAOException ex) {
            throw new ValidacionDTOException("No hay recetas favoritas.");
        }
    }

    /**
     * Retorna los pasos de una receta.
     * 
     * @param receta
     * @return lista de los pasos de una receta
     * @throws ValidacionDTOException 
     */
    @Override
    public LinkedList<PasoDTO> obtenerPasosDeReceta(RecetaDTO receta) throws ValidacionDTOException {
        try {
            LinkedList<PasoDTO> pasosReceta = obtenerReceta(receta).getPasos();

            return pasosReceta;
            
        } catch (ValidacionDTOException ex) {
            throw new ValidacionDTOException("No hay recetas favoritas.");
        }
    }
    
    /**
     * Metodo que se encarga de convertir una lista de recetasDTO a recetas
     * entidad.
     *
     * @param recetasDTO lista de recetasDTO.
     * @return lista de recetas entidas.
     */
    private LinkedList<Receta> recetasDTOAEntidad(LinkedList<RecetaDTO> recetasDTO) {
        LinkedList<Receta> recetasEncontradas = new LinkedList<>();

        for (RecetaDTO recetaDTO : recetasDTO) {
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

            recetasEncontradas.add(receta);
        }
        return recetasEncontradas;
    }
      
}

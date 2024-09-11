package org.itson.arquitecturasoftware.apprecetasc_dao_recetas;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.apprecetasc_bdsimulada.Recetas;
import org.itson.arquitecturasoftware.apprecetasc_bdsimulada.Usuarios;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
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
public class RecetaDAO implements IRecetaDAO {

    Recetas recetasBD;
    Usuarios usuariosBD;

    public RecetaDAO() {
        this.recetasBD = new Recetas();
        this.usuariosBD = new Usuarios();
    }

    /**
     * Método para obtener una receta en especifico.
     *
     * @param receta receta.
     * @return una receta
     * @throws DAOException en caso de no encontrar la receta.
     */
    @Override
    public Receta obtenerReceta(Receta receta) throws DAOException {
        if (recetasBD.getRecetas() != null) {
            if (recetasBD.getRecetas().contains(receta)) {
                int index = recetasBD.getRecetas().indexOf(receta);
                return recetasBD.getRecetas().get(index);
            } else {
                throw new DAOException("Error: No se encontró ninguna receta");
            }
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }
    }

    /**
     * Método para obtener las recetas guardadas por un usuario.
     * 
     * @param usuario usuario
     * @return recetas guardadas
     * @throws DAOException en caso de no encontrar la receta.
     */
    @Override
    public LinkedList<Receta> obtieneRecetasGuardadas(Usuario usuario) throws DAOException {
        if (usuariosBD.getUsuarios() != null) {
            return usuario.getRecetasGuardadas();
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }

    }

    /**
     * Método 
     * @param usuario usuario
     * @return recetas favoritas del usuario.
     * @throws DAOException en caso de no encontrar la receta.
     */
    @Override
    public LinkedList<Receta> obtieneRecetasFav(Usuario usuario) throws DAOException {
        if (usuariosBD.getUsuarios() != null) {
            return usuario.getRecetasFav();
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }

    }

    /**
     * Método para obtener todas las recetas de la base de datos.
     * 
     * @return todas las recetas.
     * @throws DAOException en caso de no encontrar las recetas.
     */
    @Override
    public LinkedList<Receta> obtieneRecetas() throws DAOException {
        if (recetasBD.getRecetas() != null) {
            return recetasBD.getRecetas();
        } else {
            throw new DAOException("Error: No se encontró ninguna receta");
        }
    }

    @Override
    public LinkedList<Receta> obtenerRecetas() throws DAOException {
        if (recetasBD.getRecetas()!=null){
            return recetasBD.getRecetas();
        }else{
            throw new DAOException ("Error: No hay recetas en la base de datos");
        }
    }

    @Override
    public LinkedList<Receta> buscarRecetaNombre(String nombre) {
        try {
            LinkedList <Receta> recetas = obtenerRecetas();
            LinkedList <Receta> recetasNombre = new LinkedList<>();
            
            
            for (Receta receta: recetas) {
                
                if (receta.getNombre().equalsIgnoreCase(nombre)){
                    recetasNombre.add(receta);
                }
                
            }
            
            return recetasNombre;
        } catch (DAOException ex) {
            return null;
        }
    }

    @Override
    public LinkedList<Receta> buscarRecetaTipo(String tipo) {
        try {
            LinkedList <Receta> recetas = obtenerRecetas();
            LinkedList <Receta> recetasTipo = new LinkedList<>();
            
            
            for (Receta receta: recetas) {
                
                if (receta.getTipo().equalsIgnoreCase(tipo)){
                    recetasTipo.add(receta);
                }
                
            }
            
            return recetasTipo;
        } catch (DAOException ex) {
            return null;
        }
    }

    @Override
    public LinkedList<Receta> buscarRecetaTiempo(int minutos) {
        try {
            LinkedList <Receta> recetas = obtenerRecetas();
            LinkedList <Receta> recetasTipo = new LinkedList<>();
            
            
            for (Receta receta: recetas) {
                
                if ((receta.getDuracion()<=minutos+5) && (receta.getDuracion()>=minutos-5)){
                    recetasTipo.add(receta);
                }
                
            }
            
            return recetasTipo;
        } catch (DAOException ex) {
            return null;
        }
    }

    @Override
    public LinkedList<Receta> buscarRecetaIngrediente(String ingrediente) {
        try {
            LinkedList <Receta> recetas = obtenerRecetas();
            LinkedList <Receta> recetasIngrediente = new LinkedList<>();
            
            
            for (Receta receta: recetas) {
                
                LinkedList <Ingrediente> ingredientes = receta.getIngredientes();
                
                for (Ingrediente ingredienteR: ingredientes) {
                    if (ingredienteR.getNombre().equalsIgnoreCase(ingrediente)){
                        recetasIngrediente.add(receta);
                        break;
                    }
                }
                
            }
            
            return recetasIngrediente;
        } catch (DAOException ex) {
            return null;
        }
    }
    
    
    
    
    


}

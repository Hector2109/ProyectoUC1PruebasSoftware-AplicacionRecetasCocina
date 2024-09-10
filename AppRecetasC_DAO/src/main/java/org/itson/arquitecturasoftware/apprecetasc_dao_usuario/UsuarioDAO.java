package org.itson.arquitecturasoftware.apprecetasc_dao_usuario;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_bdsimulada.Usuarios;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Ingrediente;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Usuario;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class UsuarioDAO implements IUsuarioDAO{

    Usuarios usuariosBD;

    public UsuarioDAO() {
        
        usuariosBD = new Usuarios();
        
    }
    
    
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario obtenerUsuario(Usuario usuario) throws DAOException{
        
        if (usuariosBD.getUsuarios()!=null){
            if (usuariosBD.getUsuarios().contains(usuario)){  
                int index = usuariosBD.getUsuarios().indexOf(usuario);
                return usuariosBD.getUsuarios().get(index);
            }else{
                throw new DAOException ("Error: Usuario no encontrado");
            }
        }else{
            throw new DAOException ("Error: No se añadio ningún usuario");
        }
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario anadiirRecetaFav(Receta receta, Usuario usuario) throws DAOException{
        usuario = obtenerUsuario(usuario);
        
        if (!usuario.getRecetasFav().contains(receta)){
            usuario.getRecetasFav().add(receta);
            usuariosBD.getUsuarios().set(usuariosBD.getUsuarios().indexOf(usuario), usuario);
            return usuario;
        }else{
            throw new DAOException ("Error: receta ya se encuentra n favoritos");
        }
        
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario anadirCarrito(Receta receta, Usuario usuario) throws DAOException{
        
        usuario = obtenerUsuario(usuario);
        LinkedList <Ingrediente> ingredientes = usuario.getIngredientes();
        ingredientes.addAll(receta.getIngredientes());
        usuario.setIngredientes(ingredientes);
        usuariosBD.getUsuarios().set(usuariosBD.getUsuarios().indexOf(usuario), usuario);
        return usuario;
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario eliminarRecetaFav(Receta receta, Usuario usuario) throws DAOException{
        usuario = obtenerUsuario(usuario);
        
        if (!usuario.getRecetasFav().contains(receta)){
            usuario.getRecetasFav().remove(receta);
            usuariosBD.getUsuarios().set(usuariosBD.getUsuarios().indexOf(usuario), usuario);
            return usuario;
        }
        
        throw new DAOException ("Error: La receta no se encuentra en favoritas");
    }
    
    /**
     * {@inheritDoc}
     */  
    @Override
    public Usuario anadirRecetaGuardada(Receta receta, Usuario usuario) throws DAOException{
        
        usuario = obtenerUsuario(usuario);
        LinkedList<Receta> recetas = usuario.getRecetasGuardadas();
        
        if (!recetas.contains(receta)){
            recetas.add(receta);
            usuario.setRecetasGuardadas(recetas);
            usuariosBD.getUsuarios().set(usuariosBD.getUsuarios().indexOf(usuario), usuario);
            anadirCarrito(receta, usuario);
            return usuario;
        }
        
        throw new DAOException ("Error: La receta ya se encuentra guardada");
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario eliminarRecetaGuardada(Receta receta, Usuario usuario) throws DAOException{
        
        usuario = obtenerUsuario(usuario);
        LinkedList<Receta> recetas = usuario.getRecetasGuardadas();
        
        if (!recetas.contains(receta)){
            recetas.remove(receta);
            usuario.getIngredientes().removeAll(receta.getIngredientes());
            return usuario;
        }
        
        throw new DAOException ("Error: La receta no se encuentra guardada");
    }
    
    
    
}

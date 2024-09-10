package org.itson.arquitecturasoftware.apprecetasc_dao_usuario;

import org.itson.arquitecturasoftware.apprecetasc_bdsimulada.Usuarios;
import org.itson.arquitecturasoftware.apprecetasc_dao_Exception.DAOException;
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
        usuario.getRecetasFav().add(receta);
        usuariosBD.getUsuarios().set(usuariosBD.getUsuarios().indexOf(usuario), usuario);
        return usuario;
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario anadirCarrito(Receta receta, Usuario usuario) throws DAOException{
        usuario = obtenerUsuario(usuario);
        usuario.getRecetasGuardadas().add(receta);
        
        usuariosBD.getUsuarios().set(usuariosBD.getUsuarios().indexOf(usuario), usuario);
        return usuario;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario eliminarRecetaFav(Receta receta, Usuario usuario) throws DAOException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * {@inheritDoc}
     */
    
    @Override
    public Usuario anadirRecetaGuardada(Receta receta, Usuario usuario) throws DAOException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Usuario eliminarRecetaGuardada(Receta receta, Usuario usuario) throws DAOException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

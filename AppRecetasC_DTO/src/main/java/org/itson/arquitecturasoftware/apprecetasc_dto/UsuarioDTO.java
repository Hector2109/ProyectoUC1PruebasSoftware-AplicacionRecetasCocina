package org.itson.arquitecturasoftware.apprecetasc_dto;

import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class UsuarioDTO {
    
    String correo; //correo del UsuarioDTO
    String contrasenia; //contraseña del UsuarioDTO
    String nombre; //nombre del UsuarioDTO
    LinkedList <RecetaDTO> recetasFav;
    LinkedList <RecetaDTO> recetasGuardadas;
    

    /**
     * Constructor que inicializa los atributos del UsuarioDTO
     * @param correo correo del UsuarioDTO
     * @param contrasenia contraseña del UsuarioDTO
     * @param nombre nombre del UsuarioDTO
     */
    public UsuarioDTO(String correo, String contrasenia, String nombre) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        recetasFav = new LinkedList<>();
        recetasGuardadas = new LinkedList<>();
        
    }

    public UsuarioDTO(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;  
    }
    
    /**
     * Retorna correo del UsuarioDTO
     * @return correo del UsuarioDTO
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Modifica correo del UsuarioDTO
     * @param correo correo del UsuarioDTO
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Retorna contraseñad el UsuarioDTO
     * @return contraseña del UsuarioDTO
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Modifica contraseña del UsuarioDTO
     * @param contrasenia contraseña del UsuarioDTO
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Retorna nombre del UsuarioDTO
     * @return nombre del UsuarioDTO
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica nombre del UsuarioDTO
     * @param nombre nombre del UsuarioDTO
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna las recetas favoritas del UsuarioDTO
     * @return lista de las recetas favoritas del UsuarioDTO
     */
    public LinkedList<RecetaDTO> getRecetasFav() {
        return recetasFav;
    }

    /**
     * Modifica la lista de recetas favoritas del UsuarioDTO
     * @param recetasFav lsita de recitas favoritas del UsuarioDTO
     */
    public void setRecetasFav(LinkedList<RecetaDTO> recetasFav) {
        this.recetasFav = recetasFav;
    }

    /**
     * Retorna las recetas guardadas del UsuarioDTO
     * @return lista de las recetas guardadas del UsuarioDTO
     */
    public LinkedList<RecetaDTO> getRecetasGuardadas() {
        return recetasGuardadas;
    }

    /**
     * Modifica la lista de recetas guardadas del UsuarioDTO
     * @param recetasGuardadas lista de recetas guardadas del UsuarioDTO
     */
    public void setRecetasGuardadas(LinkedList<RecetaDTO> recetasGuardadas) {
        this.recetasGuardadas = recetasGuardadas;
    }
    
    /**
     * retorna el hash de la receta
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.correo);
        return hash;
    }

    /**
     * Este método evalua si una receta es igual a otra.
     * @param obj
     * @return true or false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        return Objects.equals(this.correo, other.correo);
    }
    
    
    
    
    
    
    
    
}

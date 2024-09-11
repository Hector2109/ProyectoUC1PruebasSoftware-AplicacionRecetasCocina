package org.itson.arquitecturasoftware.apprecetasc_entidad;

import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class Usuario {
    
    String correo; //correo del usuario
    String contrasenia; //contraseña del usuario
    String nombre; //nombre del usuario
    LinkedList <Receta> recetasFav;
    LinkedList <Receta> recetasGuardadas;
    LinkedList <Ingrediente> ingredientes;
    

    /**
     * Constructor que inicializa los atributos del usuario
     * @param correo correo del usuario
     * @param contrasenia contraseña del usuario
     * @param nombre nombre del usuario
     */
    public Usuario(String correo, String contrasenia, String nombre) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        recetasFav = new LinkedList<>();
        recetasGuardadas = new LinkedList<>();
        ingredientes = new LinkedList<>();
    }

    /**
     * Constructor que inicializa un usuario con su correo
     * @param correo correo usuario
     */
    public Usuario(String correo) {
        this.correo = correo;
    }
    
    

    /**
     * Retorna correo del usuario
     * @return correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Modifica correo del usuario
     * @param correo correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Retorna contraseñad el usuario
     * @return contraseña del usuario
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Modifica contraseña del usuario
     * @param contrasenia contraseña del usuario
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Retorna nombre del usuario
     * @return nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica nombre del usuario
     * @param nombre nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna las recetas favoritas del usuario
     * @return lista de las recetas favoritas del usuario
     */
    public LinkedList<Receta> getRecetasFav() {
        return recetasFav;
    }

    /**
     * Modifica la lista de recetas favoritas del usuario
     * @param recetasFav lsita de recitas favoritas del usuario
     */
    public void setRecetasFav(LinkedList<Receta> recetasFav) {
        this.recetasFav = recetasFav;
    }

    /**
     * Retorna las recetas guardadas del usuario
     * @return lista de las recetas guardadas del usuario
     */
    public LinkedList<Receta> getRecetasGuardadas() {
        return recetasGuardadas;
    }

    /**
     * Modifica la lista de recetas guardadas del usuario
     * @param recetasGuardadas lista de recetas guardadas del usuario
     */
    public void setRecetasGuardadas(LinkedList<Receta> recetasGuardadas) {
        this.recetasGuardadas = recetasGuardadas;
    }

    public LinkedList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(LinkedList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.correo, other.correo);
    }
    
    
    
    
    
    
    
    
}

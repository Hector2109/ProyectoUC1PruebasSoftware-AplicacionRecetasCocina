package org.itson.arquitecturasoftware.apprecetasc_entidad;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.correo);
        return hash;
    }

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

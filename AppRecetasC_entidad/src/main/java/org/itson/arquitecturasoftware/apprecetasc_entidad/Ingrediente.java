package org.itson.arquitecturasoftware.apprecetasc_entidad;

import java.util.Objects;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class Ingrediente {
    
    String nombre; //nombre del ingrediente
    float cantidad; // cantidad del ingrediente
    String tipoCantidad; // unidad de medición para cantidad

    
    /**
     * Constructor de ingrediente
     * @param nombre nombre del ingrediente
     * @param cantidad cantidad del ingrediente
     * @param tipoCantidad // unidad de medición para cantidad
     */
    public Ingrediente(String nombre, float cantidad, String tipoCantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoCantidad = tipoCantidad;
    }

    /**
     * Retorna nombre del ingrediente
     * @return nombre del ingrediente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * modifica nombre del ingrediente
     * @param nombre nombre del ingrediente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna cantidad del ingrediente
     * @return cantidad del ingrediente
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * Modifica cantidad del ingrediente
     * @param cantidad cantidad del ingrediente
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Retorna tipo de unidad de medición del ingrediente
     * @return cunidad de medición para el ingrediente
     */
    public String getTipoCantidad() {
        return tipoCantidad;
    }

    /**
     * modifica el tipo de medición del ingrediente
     * @param tipoCantidad tipo de medición del ingrediente
     */
    public void setTipoCantidad(String tipoCantidad) {
        this.tipoCantidad = tipoCantidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
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
        final Ingrediente other = (Ingrediente) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    
    
    
    
    
}

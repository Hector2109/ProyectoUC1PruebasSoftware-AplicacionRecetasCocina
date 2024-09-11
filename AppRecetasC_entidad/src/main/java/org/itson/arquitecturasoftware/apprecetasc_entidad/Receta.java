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
public class Receta {
    
   String nombre; //nombre de la receta
   int duracion; //duración en minutos de la receta
   String tipo; //tipo de receta.
   LinkedList <Ingrediente> ingredientes;
   LinkedList <Paso> pasos;

   /**
    * Consructor de objeto receta
    * @param nombre nombre de la receta
    * @param duracion duración en minutos de la receta
    * @param tipo tipo de receta
    */
    public Receta(String nombre, int duracion, String tipo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
    }
   
   /**
    * Consructor de objeto receta
    * @param nombre nombre de la receta
    * @param duracion duración en minutos de la receta
    * @param tipo tipo de receta
    * @param pasos pasos de la receta
    * @param ingredientes ingredientes de la receta
    */
    public Receta(String nombre, int duracion, String tipo, LinkedList <Paso> pasos, LinkedList<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
        this.pasos = pasos;
        this.ingredientes = ingredientes;
    }

    /** 
     * Cosntructo de objeto rectea, que solo recibe el nombre.
     * @param nombre nombre de la receta.
     */
    public Receta(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna nombre de la receta
     * @return nombre de la receta
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
     * Retorna duración en minutos de la receta
     * @return duración de la receta
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Modifica duración de la receta
     * @param duracion duración de la receta
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Retorna el tipo de la receta
     * @return tipo de receta
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Modifica tipo de la receta
     * @param tipo tipo de la receta
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna los pasos a seguir de la receta
     * @return pasos de la receta
     */
    public LinkedList<Paso> getPasos() {
        return pasos;
    }

    /**
     * Modifica la lista de pasosd e la receta
     * @param pasos lista de pasos de la receta
     */
    public void setPasos(LinkedList<Paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * Retorna los ingredientes de la receta
     * @return ingredientes ingredientes de la receta
     */
    public LinkedList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * Modica los ingredietnes de la receta
     * @param ingredientes ingredientes de la receta
     */
    public void setIngredientes(LinkedList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nombre);
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
        final Receta other = (Receta) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    
   
   
    
}

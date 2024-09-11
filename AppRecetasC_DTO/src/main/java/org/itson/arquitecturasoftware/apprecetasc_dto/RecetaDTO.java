package org.itson.arquitecturasoftware.apprecetasc_dto;

import java.util.LinkedList;

/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class RecetaDTO {
    
   String nombre; //nombre de la receta
   int duracion; //duración en minutos de la receta
   String tipo; //tipo de receta.
   LinkedList <PasoDTO> pasos;
   LinkedList <IngredienteDTO> ingredientes;

   /**
    * Consructor de objeto receta
    * @param nombre nombre de la receta
    * @param duracion duración en minutos de la receta
    * @param tipo tipo de receta
    * @param pasos pasos de la receta
    * @param ingredientes ingredientes de la receta
    */
    public RecetaDTO(String nombre, int duracion, String tipo, LinkedList <PasoDTO> pasos, LinkedList <IngredienteDTO> ingredientes) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
        this.pasos = pasos;
        this.ingredientes = ingredientes;
    }
    
    public RecetaDTO(String nombre) {
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
     * Modifica nombre de la receta
     * @param nombre nombre de la receta
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
    public LinkedList<PasoDTO> getPasos() {
        return pasos;
    }

    /**
     * Modifica la lista de pasos de la receta
     * @param pasos lista de pasos de la receta
     */
    public void setPasos(LinkedList<PasoDTO> pasos) {
        this.pasos = pasos;
    }

    /**
     * Retorna los ingredientes de la receta
     * @return ingredientes de la receta
     */
    public LinkedList<IngredienteDTO> getIngredientes() {
        return ingredientes;
    }

    /**
     * Modifica la lista de los ingredientes de la receta
     * @param ingredientes lista de los pasos de la receta
     */
    public void setIngredientes(LinkedList<IngredienteDTO> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
    
   
   
    
}

package org.itson.arquitecturasoftware.apprecetasc_bdsimulada;

import java.util.LinkedList;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Ingrediente;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Paso;
import org.itson.arquitecturasoftware.apprecetasc_entidad.Receta;


/**
 *
 * @author Hector Espinoza
 * @author Jesus Castro
 * @author Enrique Rodriguez
 * @author Victoria Vega
 */
public class Recetas {
        
    
    LinkedList listaRecetas;
    
    /**
     * Constructor para simular usuarios en BD
     */
    public Recetas(){ 
        LinkedList <Receta> listaRecetas = new LinkedList<>();    
        this.listaRecetas = listaRecetas;
        
        //Receta Pizza Margarita
        
            //Lista de pasos
        LinkedList <Paso> listaPasosPizza = new LinkedList<>();
        listaPasosPizza.add(new Paso(1, "Precalienta el horno a 220°C."));
        listaPasosPizza.add(new Paso(2, "Estira la masa y cúbrela con salsa de tomate."));
        listaPasosPizza.add(new Paso(3, "Añade mozzarella y hojas de albahaca."));
        listaPasosPizza.add(new Paso(4, "Rocía con aceite de oliva y una pizca de sal."));
        
            //Lista ingredientes
        LinkedList <Ingrediente> listaIngredientesPizza = new LinkedList<>();
        listaIngredientesPizza.add(new Ingrediente("Masa para pizza", 250, "gramos"));
        listaIngredientesPizza.add(new Ingrediente("Salsa de tomate", 150, "gramos"));
        listaIngredientesPizza.add(new Ingrediente("mozzarella", 250, "gramos"));
        listaIngredientesPizza.add(new Ingrediente("Hojas de albahaca", 3, "piezas"));
        listaIngredientesPizza.add(new Ingrediente("Aceite de oliva", 10, "mililitros"));
        listaIngredientesPizza.add(new Ingrediente("Sal", 10, "gramos"));
        
        this.listaRecetas.add(new Receta("Pizza Margarita", 30, "Italiana", listaPasosPizza, listaIngredientesPizza));
        
        //Guacamole a la bisu
            //Lista de pasos
        LinkedList <Paso> listaPasosGuacamole = new LinkedList<>();
        listaPasosGuacamole.add(new Paso(1, "Aplasta los aguacates en un bol."));
        listaPasosGuacamole.add(new Paso(2, "Añade tomate y cebolla picados."));
        listaPasosGuacamole.add(new Paso(3, "Agrega jugo de limón, cilantro, sal y pimienta al gusto."));
        listaPasosGuacamole.add(new Paso(4, "Mezcla bien y sirve."));
        
            //Lista ingredientes
        LinkedList <Ingrediente> listaIngredientesGuacamole = new LinkedList<>();
        listaIngredientesGuacamole.add(new Ingrediente("Aguacate", 2, "´piezas"));
        listaIngredientesGuacamole.add(new Ingrediente("Tomate", 1, "piezas"));
        listaIngredientesGuacamole.add(new Ingrediente("Cebolla", 1, "piezas"));
        listaIngredientesGuacamole.add(new Ingrediente("Jugo de limón", 1, "piezas"));
        listaIngredientesGuacamole.add(new Ingrediente("Cilantro picado", 10, "mililitros"));
        listaIngredientesGuacamole.add(new Ingrediente("Sal", 10, "gramos"));
        listaIngredientesGuacamole.add(new Ingrediente("Pimienta", 10, "gramos"));
        this.listaRecetas.add(new Receta("Guacamole a la bisu", 10, "Mexicana", listaPasosGuacamole, listaIngredientesGuacamole));
        
        //Pasta Toro.rar
            //Lista de pasos
        LinkedList <Paso> listaPasosPasta = new LinkedList<>();
        listaPasosPasta.add(new Paso(1, "Cocina "));
        listaPasosPasta.add(new Paso(2, "Añade tomate y cebolla picados."));
        listaPasosPasta.add(new Paso(3, "Agrega jugo de limón, cilantro, sal y pimienta al gusto."));
        listaPasosPasta.add(new Paso(4, "Mezcla bien y sirve."));
        
            //Lista ingredientes
        LinkedList <Ingrediente> listaIngredientesPasta = new LinkedList<>();
        listaIngredientesPasta.add(new Ingrediente("Aguacate", 2, "´piezas"));
        listaIngredientesPasta.add(new Ingrediente("Tomate", 1, "piezas"));
        listaIngredientesPasta.add(new Ingrediente("Cebolla", 1, "piezas"));
        listaIngredientesPasta.add(new Ingrediente("Jugo de limón", 1, "piezas"));
        listaIngredientesPasta.add(new Ingrediente("Cilantro picado", 10, "mililitros"));
        listaIngredientesPasta.add(new Ingrediente("Sal", 10, "gramos"));
        listaIngredientesPasta.add(new Ingrediente("Pimienta", 10, "gramos"));
        this.listaRecetas.add(new Receta("Pasta Toro.rar", 30, "Italiana", listaPasosPasta, null));
        
        //
        this.listaRecetas.add(new Receta("Pizza", 30, "Italiana", null, null));
        
        //
        this.listaRecetas.add(new Receta("Pizza", 30, "Italiana", null, null));
        
        //
        this.listaRecetas.add(new Receta("Pizza", 30, "Italiana", null, null));
        
        //
        this.listaRecetas.add(new Receta("Pizza", 30, "Italiana", null, null));
        
        
    }

    
    public LinkedList<Receta> getUsuarios(){
        return listaRecetas;
    }
    
    
    
    
    
}

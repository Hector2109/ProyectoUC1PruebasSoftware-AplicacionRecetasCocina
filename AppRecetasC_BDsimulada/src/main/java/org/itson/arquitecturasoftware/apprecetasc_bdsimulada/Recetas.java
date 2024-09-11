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
        listaIngredientesGuacamole.add(new Ingrediente("Aguacate", 2, "piezas"));
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
        listaPasosPasta.add(new Paso(1, "Cocina la pasta según las instrucciones."));
        listaPasosPasta.add(new Paso(2, "En una sartén, saltea el ajo en aceite de oliva hasta dorar."));
        listaPasosPasta.add(new Paso(3, "Añade la pasta cocida, perejil, sal y pimienta."));
        listaPasosPasta.add(new Paso(4, "Mezcla bien y sirve."));
        
            //Lista ingredientes
        LinkedList <Ingrediente> listaIngredientesPasta = new LinkedList<>();
        listaIngredientesPasta.add(new Ingrediente("Pasta", 200, "gramos"));
        listaIngredientesPasta.add(new Ingrediente("Dientes de ajo", 3, "piezas"));
        listaIngredientesPasta.add(new Ingrediente("Aceite de oliva", 10, "mililitro"));
        listaIngredientesPasta.add(new Ingrediente("Perejil picado", 1, "piezas"));
        listaIngredientesPasta.add(new Ingrediente("Sal", 10, "gramos"));
        listaIngredientesPasta.add(new Ingrediente("Pimienta", 10, "gramos"));
        this.listaRecetas.add(new Receta("Pasta Toro.rar", 25, "Milo Origins", listaPasosPasta, listaIngredientesPasta));
        
        
        //Ensalada Amy
            //Lista de pasos
        LinkedList <Paso> listaPasosEnsalada = new LinkedList<>();
        listaPasosEnsalada.add(new Paso(1, "Corta los tomates y la mozzarella en rodajas."));
        listaPasosEnsalada.add(new Paso(2, "Colócalos alternados en un plato."));
        listaPasosEnsalada.add(new Paso(3, "Añade albahaca, aceite de oliva, sal y pimienta."));
        listaPasosEnsalada.add(new Paso(4, "Sirve fresca."));
        
            //Lista ingredientes
        LinkedList <Ingrediente> listaIngredientesEnsalada = new LinkedList<>();
        listaIngredientesEnsalada.add(new Ingrediente("Tomates", 2, "piezas"));
        listaIngredientesEnsalada.add(new Ingrediente("Mozzarella", 200, "gramos"));
        listaIngredientesEnsalada.add(new Ingrediente("Hojas de albahaca", 3, "piezas"));
        listaIngredientesEnsalada.add(new Ingrediente("Aceite de oliva", 10, "mililitros"));
        listaIngredientesEnsalada.add(new Ingrediente("Sal", 10, "gramos"));
        listaIngredientesEnsalada.add(new Ingrediente("Pimienta", 10, "gramos"));
        this.listaRecetas.add(new Receta("Pizza", 35, "Guasave core", listaPasosEnsalada, listaIngredientesEnsalada));
        
        
        //Tostadas de Aguacate a la touna
            //Lista de pasos
        LinkedList <Paso> listaPasosTostada = new LinkedList<>();
        listaPasosTostada.add(new Paso(1, "Tosta el pan."));
        listaPasosTostada.add(new Paso(2, "Aplasta el aguacate y esparce sobre el pan."));
        listaPasosTostada.add(new Paso(3, "Cocina un huevo a tu gusto y colócalo encima."));
        listaPasosTostada.add(new Paso(4, "Añade sal, pimienta y un chorrito de limón."));
        
            //Lista ingredientes
        LinkedList <Ingrediente> listaIngredientesTostada = new LinkedList<>();
        listaIngredientesTostada.add(new Ingrediente("Rebanada de pan", 2, "piezas"));
        listaIngredientesTostada.add(new Ingrediente("Aguacate", 3, "piezas"));
        listaIngredientesTostada.add(new Ingrediente("Huevo", 10, "piezas"));
        listaIngredientesTostada.add(new Ingrediente("Limón", 10, "piezas"));
        listaIngredientesTostada.add(new Ingrediente("Sal", 10, "gramos"));
        listaIngredientesTostada.add(new Ingrediente("Pimienta", 10, "gramos"));
        this.listaRecetas.add(new Receta("Tostadas de Aguacate a la touna", 30, "Italiana", listaPasosTostada, listaIngredientesTostada));
        
        
        //Pollo a la domitsu
            //Lista de pasos
        LinkedList <Paso> listaPasosPollo = new LinkedList<>();
        listaPasosPollo.add(new Paso(1, "Cocina las pechugas en cubos en una sartén con aceite."));
        listaPasosPollo.add(new Paso(2, "Añade la cebolla picada y sofríe."));
        listaPasosPollo.add(new Paso(3, "Agrega el curry y la leche de coco."));
        listaPasosPollo.add(new Paso(4, "Cocina a fuego bajo por 10 minutos. Sirve con arroz."));
        
            //Lista ingredientes
        LinkedList <Ingrediente> listaIngredientesPollo = new LinkedList<>();
        listaIngredientesPollo.add(new Ingrediente("Pechuga de pollo", 2, "piezas"));
        listaIngredientesPollo.add(new Ingrediente("Cebolla", 1, "piezas"));
        listaIngredientesPollo.add(new Ingrediente("Leche de coco", 200, "mililitros"));
        listaIngredientesPollo.add(new Ingrediente("Curry en polvo", 2, "cucharadas"));
        listaIngredientesPollo.add(new Ingrediente("Sal", 10, "gramos"));
        listaIngredientesPollo.add(new Ingrediente("Pimienta", 10, "gramos"));
        this.listaRecetas.add(new Receta("Pizza", 30, "Italiana", listaPasosPollo, listaIngredientesPollo));
        
        
        
    }

    
    public LinkedList<Receta> getRecetas(){
        return listaRecetas;
    }
    
    
    
    
    
}

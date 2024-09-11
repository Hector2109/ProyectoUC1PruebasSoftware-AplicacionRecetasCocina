/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.isw.pruebassoftware.app.recetas.cocina.uc1;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author Hector Espinoza
 */
public class ImageLoader {
    private static final Map<String, ImageIcon> imagenesRecetas = new HashMap<>();

    // Bloque estático para cargar imágenes una sola vez
    static {
        imagenesRecetas.put("Guacamole a la bisu", new ImageIcon("src/main/img/guacaBizu.jpeg"));
        imagenesRecetas.put("Pasta Toro.rar", new ImageIcon("src/main/img/pastaToro.jpg"));
        imagenesRecetas.put("Pizza", new ImageIcon("src/main/img/pizza.jpg"));
        imagenesRecetas.put("Pizza Margarita", new ImageIcon("src/main/img/pizzaMarga.jpg"));
        imagenesRecetas.put("Pizza Guasave", new ImageIcon("src/main/img/pizzaguasa.jpg"));
        imagenesRecetas.put("Tostadas de Aguacate a la touna", new ImageIcon("src/main/img/toistadasAgua.jpg"));
        // Añade más recetas e imágenes según necesites
    }

    // Método para obtener la imagen basada en el nombre de la receta
    public static ImageIcon obtenerImagen(String nombreReceta) {
        return imagenesRecetas.getOrDefault(nombreReceta, new ImageIcon("img/default.png"));  // Imagen por defecto si no se encuentra
    }
}

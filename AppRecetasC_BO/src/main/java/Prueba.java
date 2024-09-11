
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.apprecetasc_bo_Control.ControlBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_dto.IngredienteDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;



/**
 *
 * @author Hector Espinoza
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControlBO control = new ControlBO();
        
        RecetaDTO receta = new RecetaDTO("Pizza Margarita", 0, null, null, null);
        
        UsuarioDTO usuario = new UsuarioDTO("betunia@gmail.com", "as", "Vicky");
        
//        try {
//            System.out.println(control.iniciarSesion(usuario));
//        } catch (ValidacionDTOException ex) {
//            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
//        try {
//            receta = control.obtenerReceta(receta);
//            LinkedList <IngredienteDTO> ingredientes = receta.getIngredientes();
//            
//            for (int i = 0; i < ingredientes.size(); i++) {
//                System.out.println(ingredientes.get(i).getNombre());
//            }
//            
//        } catch (ValidacionDTOException ex) {
//            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            control.anadirRecetaFav(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"), receta);
            LinkedList <RecetaDTO> recetasDTO;
            
            recetasDTO = control.obtenerRecetasFav(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"));
            
            for (int i = 0; i < recetasDTO.size(); i++) {
                System.out.println(recetasDTO.get(i).getNombre());
            }
            
        } catch (ValidacionDTOException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

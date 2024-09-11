
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
        RecetaDTO receta2 = new RecetaDTO("Guacamole a la bisu", 0, null, null, null);
        RecetaDTO receta3 = new RecetaDTO("Pasta Toro.rar", 0, null, null, null);
        
        UsuarioDTO usuario = new UsuarioDTO("betunia@gmail.com", "as", "Vicky");
        

            LinkedList <RecetaDTO> recetasDTO = control.buscarRecetaIngrediente("sal");
            
            for (RecetaDTO recetaDTO: recetasDTO) {
                System.out.println(recetaDTO.getNombre());
            }
            
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
//        try {
//            control.anadirRecetaGuardada(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"), receta);
//            control.anadirRecetaGuardada(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"), receta2);
//            control.anadirRecetaGuardada(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"), receta3);
//            
//            LinkedList <IngredienteDTO> ingredientes = control.obtenerIngrediente(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"));
//            
//            for (IngredienteDTO ingrediente: ingredientes) {
//                System.out.println(ingrediente.getNombre());
//            }





//            LinkedList <RecetaDTO> recetasDTO;
//            
//            recetasDTO = control.obtenerRecetasGuardada(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"));
//            System.out.println("-----Antes------");
//            for (int i = 0; i < recetasDTO.size(); i++) {
//                System.out.println(recetasDTO.get(i).getNombre());
//            }
//            
//            control.eliminarRecetaGuardada(new UsuarioDTO("betunia@gmail.com", "wachin", "Vicky"), receta);
//           
//            System.out.println("-----Depois------");
//            for (int i = 0; i < recetasDTO.size(); i++) {
//                System.out.println(recetasDTO.get(i).getNombre());
//            }
            
//        } catch (ValidacionDTOException ex) {
//            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
}

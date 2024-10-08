/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.isw.pruebassoftware.app.recetas.cocina.uc1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.arquitecturasoftware.apprecetasc_bo_Control.ControlBO;
import org.itson.arquitecturasoftware.apprecetasc_bo_excepcionesDTO.ValidacionDTOException;
import org.itson.arquitecturasoftware.apprecetasc_dto.IngredienteDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.PasoDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.RecetaDTO;
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;

/**
 *
 * @author Jesus
 */
public class DlgReceta extends javax.swing.JDialog {

    ControlBO control;
    RecetaDTO receta;
    UsuarioDTO usuario;
    int decision;
    
    /**
     * Creates new form DlgReceta
     */
    public DlgReceta(java.awt.Dialog parent, boolean modal, ControlBO control, RecetaDTO receta, UsuarioDTO usuario, int decision) {
        super(parent, modal);
        initComponents();
        this.control = control;
        this.receta = receta;
        this.usuario = usuario;
        mostrarDetalles();
        txtPasos.setEditable(false);
        txtIngredientes.setEditable(false);
        this.decision = decision;
        
        if (this.decision == ConstantesGUI.GUARDADAS){
            btnGuardarReceta.setText("Eliminar de guardadas");
        } else if(this.decision == ConstantesGUI.FAVORITAS){
             btnFavoritos.setText("Eliminar de favoritas");
        }
        
        
    }
    
    private void mostrarDetalles() {
        // Configurar los componentes con los datos de la receta
        lblNombreReceta.setText("Nombre: " + receta.getNombre());

        // Construir el texto de los ingredientes
        StringBuilder ingredientesText = new StringBuilder();
        for (IngredienteDTO ingredientes : receta.getIngredientes()) {
            ingredientesText.append(ingredientes.getNombre())
                            .append("    ")
                            .append(ingredientes.getCantidad())
                            .append(" ")
                            .append(ingredientes.getTipoCantidad())
                            .append("\n");
        }
        txtIngredientes.setText(ingredientesText.toString());
        
        StringBuilder pasosText = new StringBuilder();
        for (PasoDTO paso : receta.getPasos()) {
            pasosText.append(paso.getNumero())
                            .append("    ")
                            .append(paso.getDescripcion())
                            .append("\n");
        }
        txtPasos.setText(pasosText.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarReceta = new javax.swing.JButton();
        btnFavoritos = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblNombreReceta = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblPa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPasos = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIngredientes = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarReceta.setBackground(new java.awt.Color(92, 157, 157));
        btnGuardarReceta.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        btnGuardarReceta.setText("Guardar receta");
        btnGuardarReceta.setBorderPainted(false);
        btnGuardarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRecetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 649, 279, 46));

        btnFavoritos.setBackground(new java.awt.Color(92, 157, 157));
        btnFavoritos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        btnFavoritos.setText("Agregar a favoritos");
        btnFavoritos.setBorderPainted(false);
        btnFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritosActionPerformed(evt);
            }
        });
        getContentPane().add(btnFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 710, 279, 64));

        btnRegresar.setBackground(new java.awt.Color(92, 157, 157));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 787, 279, 48));

        lblNombreReceta.setFont(new java.awt.Font("Segoe UI Emoji", 1, 32)); // NOI18N
        lblNombreReceta.setText("Informacion");
        getContentPane().add(lblNombreReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        lbl.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl.setText("Ingredientes:");
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        lblPa.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblPa.setText("Pasos:");
        getContentPane().add(lblPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 204));

        txtPasos.setBackground(new java.awt.Color(255, 255, 204));
        txtPasos.setColumns(20);
        txtPasos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        txtPasos.setRows(5);
        jScrollPane2.setViewportView(txtPasos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 970, 270));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));

        txtIngredientes.setBackground(new java.awt.Color(255, 255, 204));
        txtIngredientes.setColumns(20);
        txtIngredientes.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txtIngredientes.setRows(5);
        jScrollPane1.setViewportView(txtIngredientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 970, 230));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receta.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        DlgMenuPlatillos menuPlatillos = new DlgMenuPlatillos (this, true, control, usuario);
        dispose();
        menuPlatillos.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritosActionPerformed
        try {
            if (decision == ConstantesGUI.NORMAL) {
                control.anadirRecetaFav(usuario, receta);
                JOptionPane.showMessageDialog(rootPane, "Receta establecida como favoritas con exito!", "Alerta!!", JOptionPane.INFORMATION_MESSAGE);
            } else if (decision == ConstantesGUI.FAVORITAS){
                control.eliminarRecetaFavorita(usuario, receta);
                JOptionPane.showMessageDialog(rootPane, "Receta eliminada de favoritos con exito!", "Alerta!!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ValidacionDTOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFavoritosActionPerformed

    private void btnGuardarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRecetaActionPerformed
        try {
            if (decision==ConstantesGUI.NORMAL){
                control.anadirRecetaGuardada(usuario, receta);
                JOptionPane.showMessageDialog(null, "Receta guardada con exito!", "Alerta!!", JOptionPane.INFORMATION_MESSAGE);
            }else if (decision==ConstantesGUI.GUARDADAS){
                control.eliminarRecetaGuardada(usuario, receta);
                JOptionPane.showMessageDialog(rootPane, "Receta rliminada de guardados con exito!", "Alerta!!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ValidacionDTOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarRecetaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFavoritos;
    private javax.swing.JButton btnGuardarReceta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblNombreReceta;
    private javax.swing.JLabel lblPa;
    private javax.swing.JTextArea txtIngredientes;
    private javax.swing.JTextArea txtPasos;
    // End of variables declaration//GEN-END:variables
}

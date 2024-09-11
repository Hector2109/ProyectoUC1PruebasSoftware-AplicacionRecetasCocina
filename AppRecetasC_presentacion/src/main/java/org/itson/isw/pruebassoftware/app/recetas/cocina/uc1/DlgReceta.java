/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.isw.pruebassoftware.app.recetas.cocina.uc1;

/**
 *
 * @author Jesus
 */
public class DlgReceta extends javax.swing.JDialog {

    /**
     * Creates new form DlgReceta
     */
    public DlgReceta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        btnAñadirCarro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
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

        btnAñadirCarro.setBackground(new java.awt.Color(92, 157, 157));
        btnAñadirCarro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        btnAñadirCarro.setText("Agregar ingrediente al\n carroxxx"
        );
        btnAñadirCarro.setBorderPainted(false);
        btnAñadirCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCarroActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadirCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 710, 279, 64));

        btnRegresar.setBackground(new java.awt.Color(92, 157, 157));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorderPainted(false);
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 787, 279, 48));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receta.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarRecetaActionPerformed

    private void btnAñadirCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirCarroActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirCarro;
    private javax.swing.JButton btnGuardarReceta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}

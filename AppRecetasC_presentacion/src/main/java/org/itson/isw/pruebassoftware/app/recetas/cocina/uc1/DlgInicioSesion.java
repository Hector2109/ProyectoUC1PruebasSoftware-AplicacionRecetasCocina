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
import org.itson.arquitecturasoftware.apprecetasc_dto.UsuarioDTO;

/**
 *
 * @author Jesus
 */
public class DlgInicioSesion extends javax.swing.JDialog {

    ControlBO control;
    UsuarioDTO usuario;
    
    /**
     * Creates new form DlgInicioSesion
     */
    public DlgInicioSesion(java.awt.Frame parent, boolean modal, ControlBO control) {
        super(parent, modal);
        initComponents();
        this.control = control;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorreo = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 428, 68));

        txtContrasenia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        txtContrasenia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 428, 67));

        btnRegresar.setBackground(new java.awt.Color(92, 157, 157));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 32)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 720, 280, 60));

        btnIniciarSesion.setBackground(new java.awt.Color(92, 157, 157));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 32)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 720, 330, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciarSesion.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmPrincipal principal = new FrmPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        try {
            control.iniciarSesion(new UsuarioDTO(txtCorreo.getText(), txtContrasenia.getText()));
            this.usuario = new UsuarioDTO(txtCorreo.getText(), txtContrasenia.getText());
            DlgMenuUsuario menu = new DlgMenuUsuario(this, true, control, usuario);
            dispose();
            menu.setVisible(true);
            
        } catch (ValidacionDTOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}

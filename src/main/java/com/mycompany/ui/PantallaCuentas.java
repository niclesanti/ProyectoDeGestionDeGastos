/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ui;

import javax.swing.ImageIcon;

/**
 *
 * @author nicle
 */
public class PantallaCuentas extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCuentas
     */
    public PantallaCuentas() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/com/mycompany/images/miBilletera.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jPanelImagen = new javax.swing.JPanel();
        jLabelImagenMenuTransacciones = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jLabelMenuCuentasBancarias = new javax.swing.JLabel();
        jButtonNueva = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Billetera - Cuentas");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagenMenuTransacciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenMenuTransacciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/images/funciones.png"))); // NOI18N
        jPanelImagen.add(jLabelImagenMenuTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 400));

        jPanelBG.add(jPanelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        jLabelBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/images/back.png"))); // NOI18N
        jLabelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack.setPreferredSize(new java.awt.Dimension(40, 15));
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });
        jPanelBG.add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 30, 20));

        jLabelMenuCuentasBancarias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMenuCuentasBancarias.setText("CUENTAS BANCARIAS");
        jPanelBG.add(jLabelMenuCuentasBancarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jButtonNueva.setBackground(new java.awt.Color(52, 84, 61));
        jButtonNueva.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNueva.setText("NUEVA");
        jButtonNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaActionPerformed(evt);
            }
        });
        jPanelBG.add(jButtonNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 230, 30));

        jButtonRemover.setBackground(new java.awt.Color(52, 84, 61));
        jButtonRemover.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemover.setText("REMOVER");
        jButtonRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        jPanelBG.add(jButtonRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jButtonNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevaActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNueva;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelImagenMenuTransacciones;
    private javax.swing.JLabel jLabelMenuCuentasBancarias;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelImagen;
    // End of variables declaration//GEN-END:variables
}

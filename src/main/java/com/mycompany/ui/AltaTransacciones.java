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
public class AltaTransacciones extends javax.swing.JFrame {

    /**
     * Creates new form AltaTransacciones
     */
    public AltaTransacciones() {
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
        jLabelBack = new javax.swing.JLabel();
        jLabelNuevaTransaccion = new javax.swing.JLabel();
        jComboBoxTipos = new javax.swing.JComboBox<>();
        jLabelTipo = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jComboBoxDescripciones = new javax.swing.JComboBox<>();
        jButtonAceptar = new javax.swing.JButton();
        jLabelCuenta = new javax.swing.JLabel();
        jComboBoxCuentas = new javax.swing.JComboBox<>();
        jComboBoxMonedas = new javax.swing.JComboBox<>();
        jLabelMoneda = new javax.swing.JLabel();
        jButtonNuevaDescripcion = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabelMonto = new javax.swing.JLabel();
        jButtonNuevaMoneda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Billetera - Nueva transaccion");
        setUndecorated(true);
        setResizable(false);

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBG.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabelNuevaTransaccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNuevaTransaccion.setText("NUEVA TRANSACCIÓN");
        jPanelBG.add(jLabelNuevaTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jComboBoxTipos.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxTipos.setEditable(true);
        jComboBoxTipos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxTipos.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo" }));
        jComboBoxTipos.setToolTipText("Seleccionar tipo");
        jComboBoxTipos.setBorder(null);
        jComboBoxTipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxTipos.setName(""); // NOI18N
        jPanelBG.add(jComboBoxTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 320, 30));

        jLabelTipo.setText("TIPO");
        jPanelBG.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabelFecha.setText("FECHA");
        jPanelBG.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jDateChooserFecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDateChooserFecha.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBG.add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 320, 30));

        jComboBoxCategorias.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxCategorias.setEditable(true);
        jComboBoxCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxCategorias.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoria" }));
        jComboBoxCategorias.setToolTipText("Seleccionar Categoria");
        jComboBoxCategorias.setBorder(null);
        jComboBoxCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCategorias.setName(""); // NOI18N
        jPanelBG.add(jComboBoxCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 320, 30));

        jLabelCategoria.setText("CATEGORIA");
        jPanelBG.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabelDescripcion.setText("DESCRIPCION");
        jPanelBG.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jComboBoxDescripciones.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxDescripciones.setEditable(true);
        jComboBoxDescripciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxDescripciones.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxDescripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar descripcion" }));
        jComboBoxDescripciones.setToolTipText("Seleccionar descripcion");
        jComboBoxDescripciones.setBorder(null);
        jComboBoxDescripciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxDescripciones.setName(""); // NOI18N
        jPanelBG.add(jComboBoxDescripciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 220, 30));

        jButtonAceptar.setBackground(new java.awt.Color(52, 84, 61));
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanelBG.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 110, 30));

        jLabelCuenta.setText("CUENTA");
        jPanelBG.add(jLabelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jComboBoxCuentas.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxCuentas.setEditable(true);
        jComboBoxCuentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxCuentas.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar cuenta" }));
        jComboBoxCuentas.setToolTipText("Seleccionar Cuenta");
        jComboBoxCuentas.setBorder(null);
        jComboBoxCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCuentas.setName(""); // NOI18N
        jPanelBG.add(jComboBoxCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 320, 30));

        jComboBoxMonedas.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxMonedas.setEditable(true);
        jComboBoxMonedas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxMonedas.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar moneda" }));
        jComboBoxMonedas.setToolTipText("Seleccionar moneda");
        jComboBoxMonedas.setBorder(null);
        jComboBoxMonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMonedas.setName(""); // NOI18N
        jPanelBG.add(jComboBoxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 220, 30));

        jLabelMoneda.setText("MONEDA");
        jPanelBG.add(jLabelMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jButtonNuevaDescripcion.setBackground(new java.awt.Color(52, 84, 61));
        jButtonNuevaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevaDescripcion.setText("NUEVA");
        jButtonNuevaDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevaDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaDescripcionActionPerformed(evt);
            }
        });
        jPanelBG.add(jButtonNuevaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 290, 80, 30));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanelBG.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 320, 30));

        jLabelMonto.setText("MONTO");
        jPanelBG.add(jLabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jButtonNuevaMoneda.setBackground(new java.awt.Color(52, 84, 61));
        jButtonNuevaMoneda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevaMoneda.setText("NUEVA");
        jButtonNuevaMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevaMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaMonedaActionPerformed(evt);
            }
        });
        jPanelBG.add(jButtonNuevaMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 80, 30));

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
        PantallaTransacciones transaccionesPantalla = new PantallaTransacciones();
        transaccionesPantalla.setVisible(true);
        transaccionesPantalla.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonNuevaDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaDescripcionActionPerformed
        // TODO add your handling code here:
        AltaDescripcion nuevaDescripcion = new AltaDescripcion();
        nuevaDescripcion.setVisible(true);
        nuevaDescripcion.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonNuevaDescripcionActionPerformed

    private void jButtonNuevaMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevaMonedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonNuevaDescripcion;
    private javax.swing.JButton jButtonNuevaMoneda;
    private javax.swing.JComboBox<String> jComboBoxCategorias;
    private javax.swing.JComboBox<String> jComboBoxCuentas;
    private javax.swing.JComboBox<String> jComboBoxDescripciones;
    private javax.swing.JComboBox<String> jComboBoxMonedas;
    private javax.swing.JComboBox<String> jComboBoxTipos;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCuenta;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMoneda;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelNuevaTransaccion;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

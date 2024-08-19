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
public class BuscarTransacciones extends javax.swing.JFrame {

    /**
     * Creates new form BuscarTransacciones
     */
    public BuscarTransacciones() {
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
        jLabelBuscarTransaccion = new javax.swing.JLabel();
        jComboBoxTipos = new javax.swing.JComboBox<>();
        jLabelTipo = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jComboBoxDescripciones = new javax.swing.JComboBox<>();
        jButtonVer = new javax.swing.JButton();
        jLabelCuenta = new javax.swing.JLabel();
        jComboBoxCuentas = new javax.swing.JComboBox<>();
        jComboBoxMonedas = new javax.swing.JComboBox<>();
        jLabelMoneda = new javax.swing.JLabel();
        jPanelTitulosTransacciones = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPaneTransacciones = new javax.swing.JScrollPane();
        jTableTransacciones = new javax.swing.JTable();
        jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Billetera - Buscar transaccion");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 490));
        setResizable(false);

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBG.setPreferredSize(new java.awt.Dimension(600, 490));
        jPanelBG.setRequestFocusEnabled(false);
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

        jLabelBuscarTransaccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBuscarTransaccion.setText("BUSCAR TRANSACCIÓN");
        jPanelBG.add(jLabelBuscarTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jComboBoxTipos.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxTipos.setEditable(true);
        jComboBoxTipos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxTipos.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo" }));
        jComboBoxTipos.setToolTipText("Seleccionar tipo");
        jComboBoxTipos.setBorder(null);
        jComboBoxTipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxTipos.setName(""); // NOI18N
        jPanelBG.add(jComboBoxTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 30));

        jLabelTipo.setText("TIPO");
        jPanelBG.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabelFecha.setText("FECHA");
        jPanelBG.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jDateChooserFecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDateChooserFecha.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBG.add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 240, 30));

        jComboBoxCategorias.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxCategorias.setEditable(true);
        jComboBoxCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxCategorias.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoria" }));
        jComboBoxCategorias.setToolTipText("Seleccionar Categoria");
        jComboBoxCategorias.setBorder(null);
        jComboBoxCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCategorias.setName(""); // NOI18N
        jPanelBG.add(jComboBoxCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 240, 30));

        jLabelCategoria.setText("CATEGORIA");
        jPanelBG.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabelDescripcion.setText("DESCRIPCION");
        jPanelBG.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jComboBoxDescripciones.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxDescripciones.setEditable(true);
        jComboBoxDescripciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxDescripciones.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxDescripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar descripcion" }));
        jComboBoxDescripciones.setToolTipText("Seleccionar descripcion");
        jComboBoxDescripciones.setBorder(null);
        jComboBoxDescripciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxDescripciones.setName(""); // NOI18N
        jPanelBG.add(jComboBoxDescripciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 240, 30));

        jButtonVer.setBackground(new java.awt.Color(52, 84, 61));
        jButtonVer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVer.setText("VER");
        jButtonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        jPanelBG.add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 110, 30));

        jLabelCuenta.setText("CUENTA");
        jPanelBG.add(jLabelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jComboBoxCuentas.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxCuentas.setEditable(true);
        jComboBoxCuentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxCuentas.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar cuenta" }));
        jComboBoxCuentas.setToolTipText("Seleccionar Cuenta");
        jComboBoxCuentas.setBorder(null);
        jComboBoxCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCuentas.setName(""); // NOI18N
        jPanelBG.add(jComboBoxCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 240, 30));

        jComboBoxMonedas.setBackground(new java.awt.Color(166, 197, 175));
        jComboBoxMonedas.setEditable(true);
        jComboBoxMonedas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxMonedas.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar moneda" }));
        jComboBoxMonedas.setToolTipText("Seleccionar moneda");
        jComboBoxMonedas.setBorder(null);
        jComboBoxMonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMonedas.setName(""); // NOI18N
        jPanelBG.add(jComboBoxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 240, 30));

        jLabelMoneda.setText("MONEDA");
        jPanelBG.add(jLabelMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jPanelTitulosTransacciones.setBackground(new java.awt.Color(52, 84, 61));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("TIPO");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("CATEGORIA");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("FECHA");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("MONEDA");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("MONTO");

        javax.swing.GroupLayout jPanelTitulosTransaccionesLayout = new javax.swing.GroupLayout(jPanelTitulosTransacciones);
        jPanelTitulosTransacciones.setLayout(jPanelTitulosTransaccionesLayout);
        jPanelTitulosTransaccionesLayout.setHorizontalGroup(
            jPanelTitulosTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitulosTransaccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTitulosTransaccionesLayout.setVerticalGroup(
            jPanelTitulosTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitulosTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBG.add(jPanelTitulosTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 510, 30));

        jScrollPaneTransacciones.setBackground(new java.awt.Color(239, 239, 239));
        jScrollPaneTransacciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPaneTransacciones.setForeground(new java.awt.Color(52, 84, 61));
        jScrollPaneTransacciones.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTableTransacciones.setBackground(new java.awt.Color(234, 242, 235));
        jTableTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TIPO", "CATEGORIA", "FECHA", "MONEDA", "MONTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTransacciones.setSelectionForeground(new java.awt.Color(164, 235, 180));
        jScrollPaneTransacciones.setViewportView(jTableTransacciones);

        jPanelBG.add(jScrollPaneTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 528, 154));

        jButtonAceptar.setBackground(new java.awt.Color(52, 84, 61));
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanelBG.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 110, 30));

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
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
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

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarTransacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JComboBox<String> jComboBoxCategorias;
    private javax.swing.JComboBox<String> jComboBoxCuentas;
    private javax.swing.JComboBox<String> jComboBoxDescripciones;
    private javax.swing.JComboBox<String> jComboBoxMonedas;
    private javax.swing.JComboBox<String> jComboBoxTipos;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelBuscarTransaccion;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCuenta;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMoneda;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelTitulosTransacciones;
    private javax.swing.JScrollPane jScrollPaneTransacciones;
    private javax.swing.JTable jTableTransacciones;
    // End of variables declaration//GEN-END:variables
}

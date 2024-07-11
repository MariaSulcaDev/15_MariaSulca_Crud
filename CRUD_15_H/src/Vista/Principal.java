
package Vista;

import Conexion_Db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
   Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    DefaultTableModel modelo;
    int Id;
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_Id_MaríaSulca = new javax.swing.JTextField();
        txt_Nombres_MaríaSulca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_Apellidos_MaríaSulca = new javax.swing.JTextField();
        txt_Correo_MaríaSulca = new javax.swing.JTextField();
        txt_Telefono_MaríaSulca = new javax.swing.JTextField();
        txtF_FechaEntrada_MaríaSulca = new javax.swing.JFormattedTextField();
        txtF_Salida_MaríaSulca = new javax.swing.JFormattedTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner2 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_Comentarios_MaríaSulca = new javax.swing.JTextArea();
        txt_Estado_MaríaSulca = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        txt_Total_MaríaSulca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_Agregar_MaríaSulca = new javax.swing.JButton();
        btn_Modificar_MaríaSulca = new javax.swing.JButton();
        btn_Eliminar_MaríaSulca = new javax.swing.JButton();
        btn_Nuevo_MaríaSulca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("id:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Correo:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Fecha de Entrada:");

        jLabel8.setText("Fecha de salida:");

        jLabel9.setText("Tipo de Habitación:");

        jLabel10.setText("Habitaciones:");

        jLabel11.setText("Número de personas:");

        jLabel12.setText("Comentarios:");

        jLabel13.setText("Paga con:");

        jLabel14.setText("Estado:");

        txt_Id_MaríaSulca.setEditable(false);
        txt_Id_MaríaSulca.setEnabled(false);

        txt_Nombres_MaríaSulca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombres_MaríaSulcaActionPerformed(evt);
            }
        });

        jLabel15.setText("Total:");

        txtF_FechaEntrada_MaríaSulca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        txtF_Salida_MaríaSulca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtF_Salida_MaríaSulca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_Salida_MaríaSulcaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble", "Familiar", "Matrimonial" }));

        txtA_Comentarios_MaríaSulca.setColumns(20);
        txtA_Comentarios_MaríaSulca.setRows(5);
        jScrollPane1.setViewportView(txtA_Comentarios_MaríaSulca);

        txt_Estado_MaríaSulca.setEditable(false);
        txt_Estado_MaríaSulca.setEnabled(false);

        jRadioButton1.setText("Tarjeta de Crédito");

        jRadioButton2.setText("Yape");

        jRadioButton3.setText("Efectivo");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_Nombres_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(txt_Apellidos_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_Correo_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtF_Salida_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(txtF_FechaEntrada_MaríaSulca)
                        .addComponent(txt_Id_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Telefono_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_Total_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(txt_Estado_MaríaSulca, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Id_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_Nombres_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_Apellidos_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5))
                            .addComponent(txt_Correo_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Telefono_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtF_FechaEntrada_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtF_Salida_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11))
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_Total_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_Estado_MaríaSulca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de Datos"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombres", "Apellidos", "Correo", "Telefono", "Entrada", "Salida", "Tipo de Habitacion", "Habitaciones", "Personas", "Pago con", "Total", "Estado", "Comentarios"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btn_Agregar_MaríaSulca.setText("Agregar");
        btn_Agregar_MaríaSulca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Agregar_MaríaSulcaActionPerformed(evt);
            }
        });

        btn_Modificar_MaríaSulca.setText("Midificar");
        btn_Modificar_MaríaSulca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Modificar_MaríaSulcaActionPerformed(evt);
            }
        });

        btn_Eliminar_MaríaSulca.setText("Eliminar");
        btn_Eliminar_MaríaSulca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_MaríaSulcaActionPerformed(evt);
            }
        });

        btn_Nuevo_MaríaSulca.setText("Nuevo");
        btn_Nuevo_MaríaSulca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Nuevo_MaríaSulcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_Agregar_MaríaSulca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btn_Modificar_MaríaSulca)
                .addGap(44, 44, 44)
                .addComponent(btn_Eliminar_MaríaSulca)
                .addGap(51, 51, 51)
                .addComponent(btn_Nuevo_MaríaSulca)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar_MaríaSulca)
                    .addComponent(btn_Modificar_MaríaSulca)
                    .addComponent(btn_Eliminar_MaríaSulca)
                    .addComponent(btn_Nuevo_MaríaSulca))
                .addContainerGap())
        );

        jLabel1.setText("RESERVA DE HABITACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void txt_Nombres_MaríaSulcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombres_MaríaSulcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombres_MaríaSulcaActionPerformed

    private void txtF_Salida_MaríaSulcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_Salida_MaríaSulcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_Salida_MaríaSulcaActionPerformed

    private void btn_Agregar_MaríaSulcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Agregar_MaríaSulcaActionPerformed
        // TODO add your handling code here:
        H_Agregar_MaríaSulca();
        H_Listar_MaríaSulca();
        H_Limpiar_MaríaSulca();
    }//GEN-LAST:event_btn_Agregar_MaríaSulcaActionPerformed

    private void btn_Modificar_MaríaSulcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Modificar_MaríaSulcaActionPerformed
        // TODO add your handling code here:
        H_Listar_MaríaSulca();
        H_Modificar_MaríaSulca();
        H_Limpiar_MaríaSulca();
    }//GEN-LAST:event_btn_Modificar_MaríaSulcaActionPerformed

    private void btn_Eliminar_MaríaSulcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_MaríaSulcaActionPerformed
        // TODO add your handling code here:
        H_Eliminar_MaríaSulca();
        H_Listar_MaríaSulca();
        H_LimpiarCampos_MaríaSulca();
    }//GEN-LAST:event_btn_Eliminar_MaríaSulcaActionPerformed

    private void btn_Nuevo_MaríaSulcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Nuevo_MaríaSulcaActionPerformed
        // TODO add your handling code here:
        H_LimpiarCampos_MaríaSulca();
    }//GEN-LAST:event_btn_Nuevo_MaríaSulcaActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = TablaDatos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            // Obtener los valores de la fila seleccionada
            DefaultTableModel modeloTabla = (DefaultTableModel) TablaDatos.getModel();
            txt_Id_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 0).toString()); // ID
            txt_Nombres_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 1).toString()); // Fecha
            txt_Apellidos_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 2).toString()); // Nombre
            txt_Correo_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 3).toString()); // Descripción
            txt_Telefono_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 4).toString()); // Tipo de Fecha
            txtF_FechaEntrada_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 5).toString()); // Activo
            txtF_FechaEntrada_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 5).toString()); // Activo
            txtF_FechaEntrada_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 5).toString()); // Activo
            txtF_FechaEntrada_MaríaSulca.setText(modeloTabla.getValueAt(filaSeleccionada, 5).toString()); // Activo
        
       }      
    }//GEN-LAST:event_TablaDatosMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
void H_Listar_MaríaSulca() {
    String sql = "SELECT * FROM registro";
    try {
        cn = con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sql);
        Object[] datos = new Object[13];
        modelo = (DefaultTableModel) TablaDatos.getModel();
        modelo.setRowCount(0);
        while (rs.next()) {
            datos[0] = rs.getInt("id");
            datos[1] = rs.getString("nombres");
            datos[2] = rs.getString("apellidos");
            datos[3] = rs.getString("correo");
            datos[4] = rs.getString("telefono");
            datos[5] = rs.getString("fecha_entrada");
            datos[6] = rs.getString("fecha_salida");
            datos[7] = rs.getString("tipo_habitacion");
            datos[8] = rs.getString("numero_habitacion");
            datos[9] = rs.getString("numero_personas");
            datos[10] = rs.getString("peticion");
            datos[11] = rs.getString("forma_pago");
            datos[12] = rs.getString("total");
            datos[13] = rs.getString("estado");
            modelo.addRow(datos);
        }
        TablaDatos.setModel(modelo);
    } catch (SQLException e) {
        System.out.println("Error en Listar: " + e.getMessage());
        e.printStackTrace();
    }
}



    void H_Agregar_MaríaSulca() {
        String nombres = txt_Nombres_MaríaSulca.getText();
        String apellidos = txt_Apellidos_MaríaSulca.getText();
        String correo = txt_Correo_MaríaSulca.getText();
        String telefono = txt_Telefono_MaríaSulca.getText();
        String total = txt_Total_MaríaSulca.getText();
        String estado = txt_Estado_MaríaSulca.getText();
        String comentario = txtA_Comentarios_MaríaSulca.getText();

        if (nombres.equals("") || apellidos.equals("") || correo.equals("") || telefono.equals("") || total.equals("") || estado.equals("") || comentario.equals("")) {
            JOptionPane.showMessageDialog(null, "Completar todos los campos");
        } else {
            String sql = "INSERT INTO registro(nombres, apellidos, correo, telefono, fecha_entrada, fecha_salida, tipo_habitacion, numero_habitacion, numero_personas, peticion, forma_pago, total, estado)"
                    + " VALUES ('" + nombres + "', '" + apellidos + "', " + correo + ", '" + telefono + "',  '" + total + "',  '" + estado + "',  '" + comentario + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Registro agregado");
                H_Limpiar_MaríaSulca();
                H_Listar_MaríaSulca();
                H_LimpiarCampos_MaríaSulca();
            } catch (SQLException e) {
                System.out.println("Error en Agregar: " + e);
            }
        }
    }

    void H_Modificar_MaríaSulca() {
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un registro para editar.");
        } else {
            String nombres = txt_Nombres_MaríaSulca.getText();
            String apellidos = txt_Apellidos_MaríaSulca.getText();
            String correo = txt_Correo_MaríaSulca.getText();
            String telefono = txt_Telefono_MaríaSulca.getText();
            String total = txt_Total_MaríaSulca.getText();
            String estado = txt_Estado_MaríaSulca.getText();
            String comentario = txtA_Comentarios_MaríaSulca.getText();


            if (nombres.equals("") || apellidos.equals("") || correo.equals("") || telefono.equals("") || total.equals("") || estado.equals("") || comentario.equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
            } else {
                String sql = "UPDATE registro SET nombres='" + nombres + "', apellidos='" + apellidos + "', correo=" + correo + ", telefono='" + telefono + ", total='" + total + ", estado='" + estado + ", peticion='" + comentario +  "' WHERE id=" + Id;
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Registro actualizado");
                    H_Limpiar_MaríaSulca();
                    H_Listar_MaríaSulca();
                    H_LimpiarCampos_MaríaSulca();
                } catch (SQLException e) {
                    System.out.println("Error en Modificar: " + e);
                }
            }
        }
    }

    void H_Eliminar_MaríaSulca() {
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un registro para eliminar.");
        } else {
            int id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            String sql = "DELETE FROM registro WHERE id=" + id;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                H_Limpiar_MaríaSulca();
                H_Listar_MaríaSulca();
                H_LimpiarCampos_MaríaSulca();
            } catch (SQLException e) {
                System.out.println("Error en Eliminar: " + e);
            }
        }
    }

    void H_Limpiar_MaríaSulca() {
        while (TablaDatos.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    void H_LimpiarCampos_MaríaSulca() {
        txt_Id_MaríaSulca.setText("");
        txt_Nombres_MaríaSulca.setText("");
        txt_Apellidos_MaríaSulca.setText("");
        txt_Correo_MaríaSulca.setText("");
        txtF_FechaEntrada_MaríaSulca.setText("");
        txtF_Salida_MaríaSulca.setText("");
        txt_Total_MaríaSulca.setText("");
        txtA_Comentarios_MaríaSulca.setText("");
        txt_Estado_MaríaSulca.setText("");
    }

    

            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_Agregar_MaríaSulca;
    private javax.swing.JButton btn_Eliminar_MaríaSulca;
    private javax.swing.JButton btn_Modificar_MaríaSulca;
    private javax.swing.JButton btn_Nuevo_MaríaSulca;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea txtA_Comentarios_MaríaSulca;
    private javax.swing.JFormattedTextField txtF_FechaEntrada_MaríaSulca;
    private javax.swing.JFormattedTextField txtF_Salida_MaríaSulca;
    private javax.swing.JTextField txt_Apellidos_MaríaSulca;
    private javax.swing.JTextField txt_Correo_MaríaSulca;
    private javax.swing.JTextField txt_Estado_MaríaSulca;
    private javax.swing.JTextField txt_Id_MaríaSulca;
    private javax.swing.JTextField txt_Nombres_MaríaSulca;
    private javax.swing.JTextField txt_Telefono_MaríaSulca;
    private javax.swing.JTextField txt_Total_MaríaSulca;
    // End of variables declaration//GEN-END:variables
}

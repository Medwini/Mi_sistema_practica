/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Datos.DFactura;
import Logica.LConexion;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmNueva extends javax.swing.JFrame {

    //Función de la tabla
    DefaultTableModel miNueva;
    LConexion con = new LConexion();
    Connection cn = con.getConexion();
    int x, i;

    public void sumarTotal() {
        DecimalFormat ft = new DecimalFormat();

        double Pago1 = 0, TotalParcial = 0;

        Pago1 = Double.parseDouble(TxtPrecioMax1.getText());

        TotalParcial = Pago1;
        String Total = String.valueOf(TotalParcial);
        TxtTotal.setText(Total);
    }

    public FrmNueva() {
        initComponents();

        //Desactivar la opción de edición
        TxtTotal.setEnabled(false);
        TxtClasf1.setEnabled(false);
        TxtPrecioMin1.setEnabled(false);
        TxtPrecioMax1.setEnabled(false);
        TxtPrecioMax1.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        TxtRefPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BoxClasificacion = new javax.swing.JComboBox();
        TxtFecha = new com.toedter.calendar.JDateChooser();
        TxtClasf1 = new javax.swing.JTextField();
        TxtPrecioMin1 = new javax.swing.JTextField();
        TxtPrecioMax1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        TxtNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        BtnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        BtnGuardar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        TxtRefPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRefPagoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Referencia de Pago:");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUEVA FACTURA");

        TxtTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtTotalMouseClicked(evt);
            }
        });
        TxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTotalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("TOTAL:");

        BtnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        BtnCancelar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        BtnLimpiar.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Clasificación:");

        BoxClasificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BoxClasificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Impresión a color", "Impresión B/N", "Copia", "Trabajo de Inglés", "Renovación de Licencia", "Renovación del RIF", "Escaneo", "Edición", "Otro documento", "Plastificación" }));
        BoxClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxClasificacionActionPerformed(evt);
            }
        });

        TxtFecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Precio:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha-esbozada-apuntando-hacia-abajo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Por favor, genera el total de la factura e ingresa la referencia de pago.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtClasf1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel7))
                    .addComponent(BoxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPrecioMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrecioMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(165, 165, 165)))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtNombre)
                    .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(TxtRefPago))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(251, 251, 251))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(269, 269, 269))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrecioMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtClasf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrecioMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRefPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtNombreActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed

        TxtNombre.setText("");
        TxtFecha.setDate(null);
        TxtRefPago.setText("");
        TxtTotal.setText(null);
        TxtClasf1.setText("");
        TxtPrecioMax1.setText("0");
        TxtPrecioMin1.setText("");
        TxtPrecioMax1.setEnabled(false);

    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BoxClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxClasificacionActionPerformed

        //Agregar datos a la tabla        
        if (BoxClasificacion.getSelectedItem() == "Impresión a color") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Impresión a color");
            TxtPrecioMax1.setText("850000");
            TxtPrecioMin1.setText("850000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Impresión B/N") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Impresión B/N");
            TxtPrecioMax1.setText("500000");
            TxtPrecioMin1.setText("500000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Copia") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Copia");
            TxtPrecioMax1.setText("200000");
            TxtPrecioMin1.setText("200000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Trabajo de Inglés") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Trabajo de Inglés");
            TxtPrecioMax1.setText("2000000");
            TxtPrecioMin1.setText("2000000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Renovación de Licencia") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Renovación de Licencia");
            TxtPrecioMax1.setText("1000000");
            TxtPrecioMin1.setText("1000000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Renovación del RIF") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Renovación del RIF");
            TxtPrecioMax1.setText("500000");
            TxtPrecioMin1.setText("500000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Escaneo") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Escaneo");
            TxtPrecioMax1.setText("50000");
            TxtPrecioMin1.setText("50000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Edición") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Edición");
            TxtPrecioMax1.setText("50000");
            TxtPrecioMin1.setText("50000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Otro documento") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Otro documento");
            TxtPrecioMax1.setText("1000");
            TxtPrecioMin1.setText("1000");
            TxtPrecioMax1.setEnabled(true);
        }
        if (BoxClasificacion.getSelectedItem() == "Plastificación") {
            TxtClasf1.setText("");
            TxtPrecioMax1.setText("0");
            TxtPrecioMin1.setText("");
            TxtClasf1.setText("Plastificación");
            TxtPrecioMax1.setText("100000");
            TxtPrecioMin1.setText("100000");
            TxtPrecioMax1.setEnabled(true);
        }
        //miNueva.addRow(new Object[]{"Impresiones", "", ""});
    }//GEN-LAST:event_BoxClasificacionActionPerformed
    
    private void TxtRefPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRefPagoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TxtRefPagoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        if (TxtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre del cliente o escriba 'Desconocido'.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (TxtRefPago.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese la referencia del pago.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (TxtTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor genere el total de la factura.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }

        try {
            // TODO add your handling code here:

            DecimalFormat ft = new DecimalFormat();
            PreparedStatement dts = cn.prepareStatement("INSERT INTO Factura (NumFact,Nombre,Fecha, TipoT, PrecioMax, Total, RefPago) VALUES (?,?,?,?,?,?,?)");

            Calendar cal;

            cal = TxtFecha.getCalendar();
            int aa, mm, dd;

            aa = cal.get(Calendar.YEAR) - 1900;
            mm = cal.get(Calendar.MONTH);
            dd = cal.get(Calendar.DAY_OF_MONTH);

            DFactura misDatos = new DFactura();

            misDatos.Nombre = TxtNombre.getText();
            misDatos.RefPago = TxtRefPago.getText();
            misDatos.TipoT = TxtClasf1.getText();
            misDatos.setFecha(new Date(aa, mm, dd));
            misDatos.PrecioMax = Double.parseDouble(TxtPrecioMax1.getText());
            misDatos.Total = Double.parseDouble(TxtTotal.getText());

            dts.setString(1, misDatos.getNumFact());
            dts.setString(2, misDatos.getNombre());
            dts.setDate(3, misDatos.getFecha());
            dts.setString(4, misDatos.getTipoT());
            dts.setDouble(5, misDatos.PrecioMax);
            dts.setDouble(6, misDatos.Total);
            dts.setString(7, misDatos.getRefPago());

            dts.executeUpdate();

            JOptionPane.showMessageDialog(this, "Dato guardado con exito", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se guardó el dato correctamente por: " + ex, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(FrmNueva.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTotalActionPerformed
        // TODO add your handling code here:
        sumarTotal();
    }//GEN-LAST:event_TxtTotalActionPerformed

    private void TxtTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTotalMouseClicked
        // TODO add your handling code here:
        sumarTotal();
    }//GEN-LAST:event_TxtTotalMouseClicked

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
            java.util.logging.Logger.getLogger(FrmNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNueva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BoxClasificacion;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JTextField TxtClasf1;
    private com.toedter.calendar.JDateChooser TxtFecha;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPrecioMax1;
    private javax.swing.JTextField TxtPrecioMin1;
    private javax.swing.JTextField TxtRefPago;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author VictorMTA
 */
public class Pago extends javax.swing.JFrame {

    /**
     * Creates new form Pago
     */
    public Pago() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        txtPlaca5 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPlaca6 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPlaca7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPlaca8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPlaca9 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtPlaca10 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("RomanT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAGOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 2, 12)); // NOI18N
        jLabel23.setText("Folio");

        txtPlaca5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtPlaca5.setBorder(null);
        txtPlaca5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlaca5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca5ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Yu Gothic", 2, 12)); // NOI18N
        jLabel25.setText("Hora");

        txtPlaca6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtPlaca6.setBorder(null);
        txtPlaca6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlaca6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca6ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 2, 12)); // NOI18N
        jLabel24.setText("Fecha");

        txtPlaca7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtPlaca7.setBorder(null);
        txtPlaca7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlaca7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca7ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 2, 12)); // NOI18N
        jLabel26.setText("Costo Total $:");

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel27.setText("Hora");

        jLabel28.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel28.setText("Costos Adicionales:");

        txtPlaca8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtPlaca8.setBorder(null);
        txtPlaca8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlaca8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca8ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel16.setText("Lista de Servicios Terminados");

        txtPlaca9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtPlaca9.setBorder(null);
        txtPlaca9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlaca9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca9ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Yu Gothic", 2, 12)); // NOI18N
        jLabel29.setText("Dueño");

        txtPlaca10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtPlaca10.setBorder(null);
        txtPlaca10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlaca10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca10ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 2, 12)); // NOI18N
        jLabel30.setText("Placa de auto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlaca8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlaca6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPlaca5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPlaca7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtPlaca10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPlaca9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtPlaca5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtPlaca6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtPlaca7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtPlaca10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPlaca9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(txtPlaca8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlaca5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca5ActionPerformed

    private void txtPlaca6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca6ActionPerformed

    private void txtPlaca7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca7ActionPerformed

    private void txtPlaca8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca8ActionPerformed

    private void txtPlaca9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca9ActionPerformed

    private void txtPlaca10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca10ActionPerformed

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
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPlaca10;
    private javax.swing.JTextField txtPlaca5;
    private javax.swing.JTextField txtPlaca6;
    private javax.swing.JTextField txtPlaca7;
    private javax.swing.JTextField txtPlaca8;
    private javax.swing.JTextField txtPlaca9;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest5;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Satellite L40-A
 */
public class TabelPelanggan extends javax.swing.JFrame {
     private DefaultTableModel model;
    /**
     * Creates new form TabelPelanggan
     */
    public TabelPelanggan() {
        initComponents();
    }
    public void InitTable(){
      model = new DefaultTableModel();
      model.addColumn("Nama");
      model.addColumn("No Telpon");
       model.addColumn("Kota Asal");
      mytabel.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_Nama = new javax.swing.JTextField();
        txt_NoTelp = new javax.swing.JTextField();
        txt_Kota = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mytabel = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tbl_tambah = new javax.swing.JButton();
        tbl_simpan = new javax.swing.JButton();
        tbl_update = new javax.swing.JButton();
        tbl_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 204));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Tabel Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 204));

        txt_Kota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "samarinda", "balikpapan", "bontang", "tenggarong" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("No Telpon");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Kota Asal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_NoTelp)
                    .addComponent(txt_Nama)
                    .addComponent(txt_Kota, 0, 240, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Kota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21))
        );

        mytabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "No Telpon", "Kota Asal"
            }
        ));
        mytabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mytabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mytabel);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        tbl_tambah.setBackground(new java.awt.Color(255, 102, 204));
        tbl_tambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_tambah.setText("Tambah");
        tbl_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_tambahActionPerformed(evt);
            }
        });
        jPanel4.add(tbl_tambah);

        tbl_simpan.setBackground(new java.awt.Color(255, 102, 204));
        tbl_simpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_simpan.setText("Simpan");
        tbl_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_simpanActionPerformed(evt);
            }
        });
        jPanel4.add(tbl_simpan);

        tbl_update.setBackground(new java.awt.Color(255, 102, 204));
        tbl_update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_update.setText("Update");
        tbl_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_updateActionPerformed(evt);
            }
        });
        jPanel4.add(tbl_update);

        tbl_hapus.setBackground(new java.awt.Color(255, 102, 204));
        tbl_hapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_hapus.setText("Hapus");
        tbl_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_hapusActionPerformed(evt);
            }
        });
        jPanel4.add(tbl_hapus);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_tambahActionPerformed
        // TODO add your handling code here:
        txt_Nama.setEnabled(true);
        txt_NoTelp.setEnabled(true);
        txt_Kota.setEnabled(true);
        
        tbl_simpan.setEnabled(true);
        
        
       
        
        txt_Nama.setText("");
        txt_NoTelp.setText("");
        txt_Nama.requestFocus();
       
         tbl_tambah.setEnabled(false);
    }//GEN-LAST:event_tbl_tambahActionPerformed

    private void tbl_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_updateActionPerformed
        // TODO add your handling code here:
        int baris = mytabel.getSelectedRow();
        
        mytabel.setValueAt(txt_Nama.getText(), baris, 0);
        mytabel.setValueAt(txt_NoTelp.getText(), baris, 1);
        mytabel.setValueAt(txt_Kota.getSelectedItem(), baris, 2);
       
        tbl_simpan.setEnabled(true);
    }//GEN-LAST:event_tbl_updateActionPerformed

    private void tbl_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_hapusActionPerformed
        // TODO add your handling code here:
         int baris = mytabel.getSelectedRow();
        model.removeRow(baris);
        
       tbl_tambah.setEnabled(true);
        tbl_update.setEnabled(false);
         tbl_hapus.setEnabled(false);
    }//GEN-LAST:event_tbl_hapusActionPerformed

    private void tbl_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_simpanActionPerformed
        // TODO add your handling code here:
       Object[] data = new Object[3];
       data[0] = txt_Nama.getText();
       data[1] = txt_NoTelp.getText();
       data[2] = txt_Kota.getSelectedItem().toString();
       
       model.addRow(data);
       
       tbl_tambah.setEnabled(true);
    }//GEN-LAST:event_tbl_simpanActionPerformed

    private void mytabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mytabelMouseClicked
        // TODO add your handling code here:
         int baris = mytabel.getSelectedRow();
        
        String nama_edit = mytabel.getValueAt(baris,0).toString();
        String notelp_edit = mytabel.getValueAt(baris,1).toString();
        String kota_edit = mytabel.getValueAt(baris,2).toString();
        
        txt_Nama.setText(nama_edit);
        txt_NoTelp.setText(notelp_edit);
        txt_Kota.setSelectedItem(kota_edit);
        
        tbl_update.setEnabled(true);
        tbl_hapus.setEnabled(true);
         tbl_tambah.setEnabled(false);
         tbl_simpan.setEnabled(false);
    }//GEN-LAST:event_mytabelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txt_Nama.setEnabled(false);
        txt_NoTelp.setEnabled(false);
        txt_Kota.setEnabled(false);
        
        tbl_simpan.setEnabled(false);
        tbl_update.setEnabled(false);
        tbl_hapus.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mytabel;
    private javax.swing.JButton tbl_hapus;
    private javax.swing.JButton tbl_simpan;
    private javax.swing.JButton tbl_tambah;
    private javax.swing.JButton tbl_update;
    private javax.swing.JComboBox txt_Kota;
    private javax.swing.JTextField txt_Nama;
    private javax.swing.JTextField txt_NoTelp;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest6;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Satellite L40-A
 */
public class FormDataBuku extends javax.swing.JFrame { //method penghubung form dengan database
    private DefaultTableModel model;
    private Connection con = koneksi.getConnection();
    private Statement stt;
    private ResultSet rss;
    int baris;
    
    public FormDataBuku() {
        initComponents();
    }
    
    private void InitTable(){               //method yang digunakan dalam pendeklasrasian kolom-kolom pada table
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("JUDUL");
        model.addColumn("PENULIS");
        model.addColumn("HARGA");
        
        jTable1.setModel(model);
    }

    private void TampilData(){        //method yang digunakan untuk menampilkan isi dari kolom yang telah diisi sesuai dengan urutan array seperti pada sintaks
      try{
          String sql = "SELECT * FROM buku";
          stt = con.createStatement();
          rss = stt.executeQuery(sql);
          while(rss.next()){
              Object[] o = new Object[4];
              o[0] = rss.getInt("id");
              o[1] = rss.getString("judul");
              o[2] = rss.getString("penulis");
              o[3] = rss.getInt("harga");
              model.addRow(o);
          }
      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
    }
    
    private void TambahData(String judul, String penulis, String harga){  //method yang berperan dalam penambahan data, 
        try{                                                              //yang mana id sendiri akan terisi secara otomatis dan berurut
            String sql = 
                    "INSERT INTO buku VALUES(NULL,' "+judul+" ',' "+penulis+" ',"+harga+")";
            stt = con.createStatement();
            stt.executeUpdate(sql);
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void HapusData(String id, int baris){ //method yang digunakan untuk menghapus data dari table buku  dengan Query sql
        try{

            String sql = "DELETE FROM buku WHERE id ="+id;
            stt = con.createStatement();
            stt.executeUpdate(sql);
            model.removeRow(baris);

        }catch(SQLException e){
            System.out.println(e.getMessage());
                           
        }
    }
    
    private void UbahData(String id,String judul, String penulis, String harga){ //method mengubah data dengan query sql
        try{

            String sql = "UPDATE buku SET judul='"+judul+"',"+"penulis='"+penulis+"',harga='"+harga+"' WHERE id="+id;
            stt = con.createStatement();
            stt.executeUpdate(sql);
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
     private void SearchbyID(){ //mencari data dengan id
        try{
            String sqli =
                    "SELECT *FROM buku WHERE id = "+txt_cari.getText();
            stt = con.createStatement();
          rss = stt.executeQuery(sqli);
             while(rss.next()){
              Object[] o = new Object[4];
              o[0] = rss.getInt("id");
              o[1] = rss.getString("judul");
              o[2] = rss.getString("penulis");
              o[3] = rss.getInt("harga");
              model.addRow(o);
          }
        }catch(SQLException e){
            System.out.println(e.getMessage());
         }
     }


private void SearchbyJUDUL(){  //mencari data dengan kata kunci judul dengan query sql
        try{
            String sqlj = 
                    "SELECT *FROM buku WHERE judul = "+txt_cari.getText();
            stt = con.createStatement();
             rss = stt.executeQuery(sqlj);
            while(rss.next()){
                Object[] o = new Object[4];
              o[0] = rss.getInt("id");
              o[1] = rss.getString("judul");
              o[2] = rss.getString("penulis");
              o[3] = rss.getInt("harga");
              model.addRow(o);
          }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

 private void SearchbyPENULIS(){  //mencari data dengan kata kunci penulis dengan query sql
        try{
            String sqlp = 
                    "SELECT *FROM buku WHERE penulis = "+txt_cari.getText();
            stt = con.createStatement();
            rss = stt.executeQuery(sqlp);
             while(rss.next()){
                Object[] o = new Object[4];
              o[0] = rss.getInt("id");
              o[1] = rss.getString("judul");
              o[2] = rss.getString("penulis");
              o[3] = rss.getInt("harga");
              model.addRow(o);
          }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
         }
     }
 
 private void SearchbyHARGA(){  //mebcari data dengan kata kunci harga dengan query sql
        try{
            String sqlh =
                    "SELECT * FROM buku WHERE harga = "+txt_cari.getText();
            stt = con.createStatement();
            rss = stt.executeQuery(sqlh);
             while(rss.next()){
                Object[] o = new Object[4];
              o[0] = rss.getInt("id");
              o[1] = rss.getString("judul");
              o[2] = rss.getString("penulis");
              o[3] = rss.getInt("harga");
              model.addRow(o);
          }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
         }
     }
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_judul = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_penulis = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_cari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        BTNCari = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Form Data Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(124, 124, 124))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 204));

        txt_judul.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_judulCaretUpdate(evt);
            }
        });

        txt_harga.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_hargaCaretUpdate(evt);
            }
        });

        txt_penulis.setForeground(new java.awt.Color(255, 255, 255));
        txt_penulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Felix Siauw", "Asma Nadia", "Dewi Lestari" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Judul");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Penulis");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_penulis, javax.swing.GroupLayout.Alignment.TRAILING, 0, 305, Short.MAX_VALUE)
                    .addComponent(txt_judul, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_harga))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btn_simpan.setBackground(new java.awt.Color(255, 153, 204));
        btn_simpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel4.add(btn_simpan);

        btn_ubah.setBackground(new java.awt.Color(255, 153, 204));
        btn_ubah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ubah.setForeground(new java.awt.Color(255, 255, 255));
        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ubah);

        btn_hapus.setBackground(new java.awt.Color(255, 153, 204));
        btn_hapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel4.add(btn_hapus);

        btn_keluar.setBackground(new java.awt.Color(255, 153, 204));
        btn_keluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_keluar.setForeground(new java.awt.Color(255, 255, 255));
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_keluar);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });

        jLabel5.setText("Search :");

        jLabel6.setText("By :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "JUDUL", "PENULIS", "HARGA" }));

        BTNCari.setBackground(new java.awt.Color(255, 153, 204));
        BTNCari.setText("CARI");
        BTNCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNCari, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       InitTable(); //pemanggilan method
       TampilData();//pemanggilan method tampilan
    }//GEN-LAST:event_formComponentShown

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
   
       String judul = txt_judul.getText();
       String penulis = txt_penulis.getSelectedItem().toString();
       String harga = txt_harga.getText();
       TambahData(judul,penulis,harga);
        InitTable();//refresh
       TampilData();//refresh
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
         try{
             int baris =  jTable1.getSelectedRow();  // menjalankan method hapus dan mengganti nilai sebelumnya dengan nilai yang baru
             String id =  jTable1.getValueAt(baris,0).toString();
             HapusData(id,baris);
             JOptionPane.showMessageDialog(null,"Penghapusan Data Berhasil");             
         }catch(Exception e){
              JOptionPane.showMessageDialog(null,"Penghapusan Data Gagal"); 
         }
           txt_judul.setText("");
           txt_harga.setText("");
           InitTable();//refresh
           TampilData();//refresh
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
      // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();   // menjalankan method UbahData dan mengganti nilai sebelumnya dengan nilai yang baru
        
        jTable1.setValueAt(txt_judul.getText(), baris,1);
        jTable1.setValueAt(txt_penulis.getSelectedItem(),baris,2);
        jTable1.setValueAt(txt_harga.getText(),baris,3);
        
        String id = jTable1.getValueAt(baris,0).toString();
        String judul = jTable1.getValueAt(baris,1).toString();
        String penulis = jTable1.getValueAt(baris,2).toString();
        String harga = jTable1.getValueAt(baris,3).toString();
        UbahData(id,judul,penulis,harga);
        
        txt_judul.setText(judul);
        txt_penulis.setSelectedItem(penulis);
        txt_harga.setText(harga);
        
        JOptionPane.showMessageDialog(null, "Perubahan Data Berhasil");
        
        txt_judul.setText("");
        txt_harga.setText("");
        
        
    }//GEN-LAST:event_btn_ubahActionPerformed

   
          
    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
     
         
    }//GEN-LAST:event_txt_cariActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris  = jTable1.getSelectedRow();  //  mengganti nilai sebelumnya dengan nilai yang baru ada maupun tidak ada penggantian nilai.
        
        String judul = jTable1.getValueAt(baris,1).toString();
        String penulis = jTable1.getValueAt(baris,2).toString();
        String harga = jTable1.getValueAt(baris,3).toString();
        
        txt_judul.setText(judul);
        txt_penulis.setSelectedItem(penulis);
        txt_harga.setText(harga);
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void BTNCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCariActionPerformed
        // TODO add your handling code here:
        if(txt_cari.getText().equals("")){       // pengisian nilai ke kolom txt_cari 
            JOptionPane.showMessageDialog(null, "isi pencarian");  //kolom tidak boleh kosong
        }
        else{
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            if(jComboBox1.getSelectedItem().equals("ID")){  //berdasarkan id
                SearchbyID(); 
                }
            else if(jComboBox1.getSelectedItem().equals("JUDUL")){  //berdasarkan judul
                SearchbyJUDUL();
                }
            else if(jComboBox1.getSelectedItem().equals("PENULIS")){  ///berdasarkan penulis
                SearchbyPENULIS();
                }
            else if(jComboBox1.getSelectedItem().equals("HARGA")){  //berdasarkan harga
                SearchbyHARGA();
                }
        }
        txt_cari.setText("");
    }//GEN-LAST:event_BTNCariActionPerformed

    private void txt_judulCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_judulCaretUpdate
        // TODO add your handling code here:
        if(txt_judul.getText().equals("")||txt_harga.getText().equals("")){  //digunakan agar field tidak kosong saat ingin 
            btn_simpan.setEnabled(false);                                   //menyimpan data
        }
        else{
            btn_simpan.setEnabled(true);
        }
          
    }//GEN-LAST:event_txt_judulCaretUpdate

    private void txt_hargaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_hargaCaretUpdate
        // TODO add your handling code here:
          if(txt_judul.getText().equals("")||txt_harga.getText().equals("")){
            btn_simpan.setEnabled(false);     //tombol simpan tidak aktif jika field yang ada belum terisi 
        }
        else{
            btn_simpan.setEnabled(true);      //tombol simpan akan aktf apabila field sudah semua terisi
        }
    }//GEN-LAST:event_txt_hargaCaretUpdate

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txt_judul.setText("");    //mengosongkan field pada saat menjalankan form
        txt_harga.setText("");
        txt_cari.setText("");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JComboBox txt_penulis;
    // End of variables declaration//GEN-END:variables
}

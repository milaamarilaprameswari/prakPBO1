/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabungan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class daftar extends javax.swing.JFrame {
    Connection con= null;
    PreparedStatement pst= null;
    /**
     * Creates new form daftar
     */
    public daftar() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtnim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtjurusan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtangkatan = new javax.swing.JTextField();
        cbhari = new javax.swing.JComboBox<>();
        cbbulan = new javax.swing.JComboBox<>();
        cbtahun = new javax.swing.JComboBox<>();
        jtnama = new javax.swing.JTextField();
        jttempatlahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("NAMA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 80, 34, 16);
        jPanel1.add(jtnim);
        jtnim.setBounds(220, 190, 280, 22);

        jLabel3.setText("TEMPAT LAHIR");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 120, 86, 16);
        jPanel1.add(jtjurusan);
        jtjurusan.setBounds(220, 230, 280, 22);

        jLabel4.setText("TANGGAL LAHIR");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 160, 92, 16);

        jtangkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtangkatanActionPerformed(evt);
            }
        });
        jPanel1.add(jtangkatan);
        jtangkatan.setBounds(220, 270, 280, 22);

        cbhari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HARI", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbhari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhariActionPerformed(evt);
            }
        });
        jPanel1.add(cbhari);
        cbhari.setBounds(220, 150, 70, 22);

        cbbulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BULAN", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbbulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbulanActionPerformed(evt);
            }
        });
        jPanel1.add(cbbulan);
        cbbulan.setBounds(300, 150, 110, 22);

        cbtahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAHUN", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", " " }));
        jPanel1.add(cbtahun);
        cbtahun.setBounds(420, 150, 80, 22);

        jtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(jtnama);
        jtnama.setBounds(220, 70, 280, 22);
        jPanel1.add(jttempatlahir);
        jttempatlahir.setBounds(220, 110, 280, 22);

        jLabel5.setText("NIM");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 200, 22, 16);

        jLabel6.setText("ANGKATAN");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 280, 63, 16);

        jLabel1.setText("FORMULIR PENDAFTARAN ANGGOTA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 30, 330, 16);

        jLabel7.setText("JURUSAN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 240, 53, 16);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 330, 77, 25);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("BATAL");
        jPanel1.add(jButton2);
        jButton2.setBounds(290, 330, 69, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtangkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtangkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtangkatanActionPerformed

    private void jtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnamaActionPerformed
        
    }//GEN-LAST:event_jtnamaActionPerformed

    private void cbbulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbulanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String query= "INSERT INTO `daftaranggota.`(`Nama`, `TempatLahir`, `TanggalLahir`, `NIM`, `Jurusan`, `Angkatan`) VALUES (?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/anggota", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, jtnama.getText());
            pst.setString(2, jttempatlahir.getText());
            pst.setString(3, cbhari.getSelectedItem().toString() + " " + cbbulan.getSelectedItem().toString() +" "+cbtahun.getSelectedItem().toString());
            pst.setString(4, jtnim.getText());
            pst.setString(5, jtjurusan.getText());
            pst.setString(6, jtangkatan.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Register Successfully");
            jtnama.setText("");
            jttempatlahir.setText("");
            cbhari.setSelectedItem("HARI");
            cbbulan.setSelectedItem("BULAN");
            cbtahun.setSelectedItem("TAHUN");
            jtnim.setText("");
            jtjurusan.setText("");
            jtangkatan.setText("");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbhariActionPerformed

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
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbulan;
    private javax.swing.JComboBox<String> cbhari;
    private javax.swing.JComboBox<String> cbtahun;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtangkatan;
    private javax.swing.JTextField jtjurusan;
    private javax.swing.JTextField jtnama;
    private javax.swing.JTextField jtnim;
    private javax.swing.JTextField jttempatlahir;
    // End of variables declaration//GEN-END:variables
}

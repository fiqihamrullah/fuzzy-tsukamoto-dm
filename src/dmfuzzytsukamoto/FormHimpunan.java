/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormHimpunan.java
 *
 *  
 */

package dmfuzzytsukamoto;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fiqih Amrullah
 */
public class FormHimpunan extends javax.swing.JDialog
{
       List<Variable> listvariable;
       List<Himpunan> listhimpunan;
       int idxrow;
       Himpunan himpterpilih;
    /** Creates new form FormHimpunan */
    public FormHimpunan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Util.TengahWindow(this);
        fillDataComboVariable();
    }
    
     public void fillDataComboVariable()
    {
        DataProcessor dp = new DataProcessor();
        listvariable = dp.loadListVariable();
        for(int i=0;i<listvariable.size();i++) 
        {
            jCmbVariable.addItem(listvariable.get(i).getNmVar());
        }
    }
     
    
     
     public void loadDataHimpunan(int idvar)
     {
        DataProcessor dp = new DataProcessor();
        listhimpunan = dp.loadListHimpunan(idvar);
        String header[] = new String[] {"No","Nama Himpunan","Batas Bawah","Batas Tengah","Batas Akhir","Fungsi"};
        jTblViewHimpunan.setModel(TableViewer.ConvertHimpunanListToTableModel(listhimpunan, header));
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNmHimpunan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtBatasBawah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtBatasAtas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtBatasTengah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCmbFungsi = new javax.swing.JComboBox();
        jBtnPerbaiki = new javax.swing.JButton();
        jBtnSimpan = new javax.swing.JButton();
        jBtnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblViewHimpunan = new javax.swing.JTable();
        jBtnTutup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCmbVariable = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Nama Himpunan:");

        jLabel4.setText("Batas Bawah:");

        jTxtBatasBawah.setText("0");

        jLabel5.setText("Batas Atas:");

        jTxtBatasAtas.setText("0");

        jLabel6.setText("Batas Tengah:");

        jTxtBatasTengah.setText("0");

        jLabel7.setText("Fungsi:");

        jCmbFungsi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Linier Turun", "Segitiga", "Linier Naik" }));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel4)
                                .add(jTxtBatasBawah, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(18, 18, 18)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jTxtBatasTengah, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(18, 18, 18)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jTxtBatasAtas)
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jtxtNmHimpunan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(90, 90, 90)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel7)
                    .add(jCmbFungsi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel7))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtxtNmHimpunan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jCmbFungsi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(jLabel6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTxtBatasBawah, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTxtBatasTengah, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTxtBatasAtas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jBtnPerbaiki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/pencil_16.png"))); // NOI18N
        jBtnPerbaiki.setText("Perbaiki");
        jBtnPerbaiki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPerbaikiActionPerformed(evt);
            }
        });

        jBtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/save_16.png"))); // NOI18N
        jBtnSimpan.setText("Simpan");
        jBtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSimpanActionPerformed(evt);
            }
        });

        jBtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/trash_16.png"))); // NOI18N
        jBtnHapus.setText("Hapus");
        jBtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHapusActionPerformed(evt);
            }
        });

        jTblViewHimpunan.setModel(new javax.swing.table.DefaultTableModel(
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
        jTblViewHimpunan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblViewHimpunanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTblViewHimpunan);

        jBtnTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/exit.png"))); // NOI18N
        jBtnTutup.setText("Tutup");
        jBtnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTutupActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Variabel :");

        jCmbVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbVariableActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel8.setText("Entri Himpunan");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 317, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCmbVariable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(jBtnSimpan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jBtnPerbaiki, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jBtnHapus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(21, 21, 21)))
                .add(24, 24, 24))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jBtnTutup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jCmbVariable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jBtnSimpan, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .add(jBtnPerbaiki, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jBtnHapus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jBtnTutup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jBtnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTutupActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_jBtnTutupActionPerformed

private void jCmbVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbVariableActionPerformed
// TODO add your handling code here:
    loadDataHimpunan(listvariable.get(jCmbVariable.getSelectedIndex()).getIdVar());
}//GEN-LAST:event_jCmbVariableActionPerformed

private void jBtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSimpanActionPerformed
// TODO add your handling code here:
    Himpunan himp = new Himpunan();
    himp.getVar().setIdVar(listvariable.get(jCmbVariable.getSelectedIndex()).getIdVar());
    himp.setNmhimp(jtxtNmHimpunan.getText());
    himp.setBatasbawah(Integer.parseInt(jTxtBatasBawah.getText()));
    himp.setBatastengah(Integer.parseInt(jTxtBatasTengah.getText()));
    himp.setBatasakhir(Integer.parseInt(jTxtBatasAtas.getText()));
    himp.setFungsi(jCmbFungsi.getSelectedIndex());
    DataProcessor dp = new DataProcessor();
    dp.SimpanHimpunan(himp);
    loadDataHimpunan(listvariable.get(jCmbVariable.getSelectedIndex()).getIdVar());
    JOptionPane.showMessageDialog(this, "Data Himpunan Berhasil Disimpan!","Sukses",JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jBtnSimpanActionPerformed

private void jBtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHapusActionPerformed
// TODO add your handling code here:
    int respon = JOptionPane.showConfirmDialog(this,"Apakah Anda yakin akan menghapus himpunan tersebut?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if (respon == JOptionPane.YES_NO_OPTION)
    {
        DataProcessor dp = new DataProcessor();
        dp.HapusHimpunan(listhimpunan.get(idxrow));
        loadDataHimpunan(listvariable.get(jCmbVariable.getSelectedIndex()).getIdVar());
        JOptionPane.showMessageDialog(this, "Data Himpunan Tersebut Berhasil Dihapus!","Sukses",JOptionPane.INFORMATION_MESSAGE);
    }
}//GEN-LAST:event_jBtnHapusActionPerformed

private void jTblViewHimpunanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblViewHimpunanMouseClicked
// TODO add your handling code here:
    idxrow = jTblViewHimpunan.rowAtPoint(evt.getPoint());
    
}//GEN-LAST:event_jTblViewHimpunanMouseClicked

private void jBtnPerbaikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPerbaikiActionPerformed
// TODO add your handling code here:
    if (jBtnPerbaiki.getText().equals("Perbaiki")) 
    {
        himpterpilih = listhimpunan.get(idxrow);
        jtxtNmHimpunan.setText(himpterpilih.getNmhimp());
        jTxtBatasBawah.setText(String.valueOf( himpterpilih.getBatasbawah()));
        jTxtBatasTengah.setText(String.valueOf( himpterpilih.getBatastengah()));
        jTxtBatasAtas.setText(String.valueOf( himpterpilih.getBatasakhir()));
        jCmbFungsi.setSelectedIndex(himpterpilih.getFungsi());
        jBtnPerbaiki.setText("OK");
    }else {
         jBtnPerbaiki.setText("Perbaiki");
         Himpunan himp = new Himpunan();
         himp.getVar().setIdVar(listvariable.get(jCmbVariable.getSelectedIndex()).getIdVar());
         himp.setNmhimp(jtxtNmHimpunan.getText());
         himp.setBatasbawah(Integer.parseInt(jTxtBatasBawah.getText()));
         himp.setBatastengah(Integer.parseInt(jTxtBatasTengah.getText()));
         himp.setBatasakhir(Integer.parseInt(jTxtBatasAtas.getText()));
         himp.setFungsi(jCmbFungsi.getSelectedIndex());
         himp.setIdHimp(himpterpilih.getIdHimp());
         DataProcessor dp = new DataProcessor();
         dp.PerbaikiHimpunan(himp);
         loadDataHimpunan(listvariable.get(jCmbVariable.getSelectedIndex()).getIdVar());
         JOptionPane.showMessageDialog(this, "Data Himpunan Berhasil Diperbaharui!","Sukses",JOptionPane.INFORMATION_MESSAGE);
    }
    
}//GEN-LAST:event_jBtnPerbaikiActionPerformed

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
            java.util.logging.Logger.getLogger(FormHimpunan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHimpunan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHimpunan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHimpunan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormHimpunan dialog = new FormHimpunan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnHapus;
    private javax.swing.JButton jBtnPerbaiki;
    private javax.swing.JButton jBtnSimpan;
    private javax.swing.JButton jBtnTutup;
    private javax.swing.JComboBox jCmbFungsi;
    private javax.swing.JComboBox jCmbVariable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblViewHimpunan;
    private javax.swing.JTextField jTxtBatasAtas;
    private javax.swing.JTextField jTxtBatasBawah;
    private javax.swing.JTextField jTxtBatasTengah;
    private javax.swing.JTextField jtxtNmHimpunan;
    // End of variables declaration//GEN-END:variables

}

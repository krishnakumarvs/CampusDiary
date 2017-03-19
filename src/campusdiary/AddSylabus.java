/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * AddSylabus.java
 *
 * Created on Dec 10, 2016, 7:13:34 PM
 */
package campusdiary;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AddSylabus extends javax.swing.JFrame {

    /**
     * Creates new form AddSylabus
     */
    public AddSylabus() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadSubject();
        loadbranch();

    }

    private void clearText() {
        revcode.setText("");
        mod1.setText("");
        mod2.setText("");
        mod3.setText("");
        mod4.setText("");
        refer.setText("");
    }

    private void loadSubject() {
        String sql = "select subject_code from tbl_subjects";
        Dbcon db = new Dbcon();
        ResultSet rs = db.select(sql);
        try {
            while (rs.next()) {
                String subname = rs.getString(1);
                sub.addItem(subname);

            }
        } catch (Exception e) {
            System.out.println("subname");
        }
    }

    private void loadbranch() {
        try {
            String sql = "select * from tbl_branches";
            Dbcon db = new Dbcon();
            ResultSet rs = db.select(sql);
            while (rs.next()) {
                String br = rs.getString(2);
                branch.addItem(br);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AddSylabus.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jLabel2 = new javax.swing.JLabel();
        revcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        branch = new javax.swing.JComboBox();
        sem = new javax.swing.JComboBox();
        sub = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        subname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        refer = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mod1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        mod2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        mod3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        mod4 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText(" ADD SYLLABUS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 36, 509, 27));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Revision Code       ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 123, -1, -1));
        getContentPane().add(revcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 117, 210, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Branch                 ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 178, 116, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Semester ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 397, 116, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Subject  Code       ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 227, 116, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Subject Name       ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 297, 116, -1));

        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 177, 210, -1));

        sem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--select--", "semester 1", "semster 2", "semester 3", "semester 4", "semester 5", "semester 6" }));
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });
        getContentPane().add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 396, 218, -1));

        sub.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subItemStateChanged(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 240, 210, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Module 1              ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 122, 116, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Module 3              ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 346, 116, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Module 2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 241, 116, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Module 4              ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 469, 116, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 571, -1, -1));

        subname.setEditable(false);
        subname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subnameActionPerformed(evt);
            }
        });
        getContentPane().add(subname, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 296, 210, -1));

        refer.setColumns(20);
        refer.setRows(5);
        jScrollPane1.setViewportView(refer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 466, 218, 62));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Reference");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 466, 114, -1));

        mod1.setColumns(20);
        mod1.setRows(5);
        jScrollPane2.setViewportView(mod1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 113, 253, 63));

        mod2.setColumns(20);
        mod2.setRows(5);
        jScrollPane3.setViewportView(mod2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 227, 253, 63));

        mod3.setColumns(20);
        mod3.setRows(5);
        jScrollPane4.setViewportView(mod3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 346, 253, 62));

        mod4.setColumns(20);
        mod4.setRows(5);
        jScrollPane5.setViewportView(mod4);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 453, 253, 63));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 571, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        jLabel12.setText(" ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String revision = revcode.getText();
    String branchname = branch.getSelectedItem().toString();
    String semestar = sem.getSelectedItem().toString();
    String subjectcode = sub.getSelectedItem().toString();
    String subject = subname.getText();
    String module1 = mod1.getText();
    String module2 = mod2.getText();
    String module3 = mod3.getText();
    String module4 = mod4.getText();
    String reference = refer.getText();
    if (revision.equals("") || branchname.equals("") || semestar.equals("") || subject.equals("") || subjectcode.equals("") || module1.equals("") || module2.equals("") || module3.equals("") || module4.equals("")) {
        JOptionPane.showMessageDialog(this, "enter the values");
    } else {
        try {
            Dbcon db = new Dbcon();
            String sql2 = "select * from tbl_sylabus where revision_code='" + revision + "'";
            ResultSet rs2 = db.select(sql2);
            if (rs2.next()) {
                JOptionPane.showMessageDialog(this, "revision already exits");
            } else {
                String sql = "insert into tbl_sylabus(revision_code,branch,semester,subject_code,subject_name,module_1,module_2,module_3,module_4,reference)values('" + revision + "','" + branchname + "','" + semestar + "','" + subjectcode + "','" + subject + "','" + module1 + "','" + module2 + "','" + module3 + "','" + module4 + "','" + reference + "')";
                int ins = db.insert(sql);
                if (ins > 0) {
                    JOptionPane.showMessageDialog(this, "successfully inserted");
                    clearText();
                } else {
                    JOptionPane.showMessageDialog(this, "try again");
                }
            }
        } catch (SQLException e) {
            System.out.println("error due to sql exception");
        }

    }

}//GEN-LAST:event_jButton1ActionPerformed

private void subItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subItemStateChanged

    String subc = sub.getSelectedItem().toString();
    Dbcon db = new Dbcon();
    ResultSet rs = db.select("select subject_name from tbl_subjects where subject_code ='" + subc + "'");
    try {
        if (rs.next()) {
            subname.setText(rs.getString("subject_name"));
        }
        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(AddSylabus.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_subItemStateChanged

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semActionPerformed

    private void subnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subnameActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AddSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddSylabus().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox branch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea mod1;
    private javax.swing.JTextArea mod2;
    private javax.swing.JTextArea mod3;
    private javax.swing.JTextArea mod4;
    private javax.swing.JTextArea refer;
    private javax.swing.JTextField revcode;
    private javax.swing.JComboBox sem;
    private javax.swing.JComboBox sub;
    private javax.swing.JTextField subname;
    // End of variables declaration//GEN-END:variables
}

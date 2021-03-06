/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * AddCollege.java
 *
 * Created on Nov 27, 2016, 8:28:00 PM
 */
package campusdiary;

import db.Dbcon;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AddCollege extends javax.swing.JFrame {

    /**
     * Creates new form AddCollege
     */
    public AddCollege() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadBranches();
    }

    private void clearText() {
        college.setText("");
        location.setText("");
    }

    private void loadBranches() {
        Dbcon db = new Dbcon();

        String ar = "select * from tbl_branches;";
        ResultSet rs = db.select(ar);
        try {
            while (rs.next()) {
                allBranches.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCollege.class.getName()).log(Level.SEVERE, null, ex);
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
        college = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        location = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        selectedOne = new java.awt.List();
        jButton2 = new javax.swing.JButton();
        allBranches = new java.awt.List();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("ADD COLLEGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 48, -1));

        college.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeActionPerformed(evt);
            }
        });
        getContentPane().add(college, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 264, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Allocating Branches");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 129, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        location.setColumns(20);
        location.setRows(5);
        jScrollPane1.setViewportView(location);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 264, 121));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));
        getContentPane().add(selectedOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 164, 198));

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, 31));

        allBranches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBranchesActionPerformed(evt);
            }
        });
        getContentPane().add(allBranches, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 164, 198));

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, 31));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 660, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String name = college.getText();
    String location1 = location.getText();
    String pass = generatePassword(8);
    String branches = "";
    int i;
    String[] items = selectedOne.getItems();
    for (i = 0; i < items.length; i++) {
        branches = branches + items[i] + ",";
    }
    if (name.equals("") || location1.equals("") || branches.equals("")) {
        JOptionPane.showMessageDialog(this, "enter the values");
    } else {

        
        try {
            Dbcon db = new Dbcon();
            String sql3 = "select * from tbl_colleges where name='" + name + "'";
            ResultSet rs3 = db.select(sql3);
            if (rs3.next()) {
                JOptionPane.showMessageDialog(this, "college already exits");
            } else {
                String sql = "insert into tbl_colleges(name,location,branches,password)values('" + name + "','" + location1 + "','" + branches + "','" + pass + "');";
                int ins = db.insert(sql);
                if (ins > 0) {
                    JOptionPane.showMessageDialog(this, "successfully inserted");
                } else {
                    JOptionPane.showMessageDialog(this, "try again");
                }
            }
        } catch (SQLException e) {
            System.out.println("error due to sql exception");
        }
    }
    clearText();
}//GEN-LAST:event_jButton1ActionPerformed

    public static String generatePassword(int len) {
        SecureRandom rnd = new SecureRandom();
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return (sb.toString());
    }

private void collegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeActionPerformed

}//GEN-LAST:event_collegeActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String selectedItem = allBranches.getSelectedItem();
    System.out.println(selectedItem);
    if (selectedItem == null) {
        JOptionPane.showMessageDialog(this, "select item");
    } else {
        allBranches.remove(selectedItem);
        selectedOne.add(selectedItem);
    }

    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String selectedlist = selectedOne.getSelectedItem();
    if (selectedlist == null) {
        JOptionPane.showMessageDialog(this, "select item");
    } else {
        selectedOne.remove(selectedlist);
        allBranches.add(selectedlist);
    }
}//GEN-LAST:event_jButton3ActionPerformed

    private void allBranchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBranchesActionPerformed

        String select = allBranches.getSelectedItem();
        if (select == null) {
            JOptionPane.showMessageDialog(this, "select any one");

        } else {
            selectedOne.remove(select);
            allBranches.add(select);
        }
    }//GEN-LAST:event_allBranchesActionPerformed

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
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddCollege().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List allBranches;
    private javax.swing.JTextField college;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea location;
    private java.awt.List selectedOne;
    // End of variables declaration//GEN-END:variables
}

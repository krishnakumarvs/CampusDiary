/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import db.Dbcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class UpdateCollegeProfile extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCollegeProfile
     */
    public UpdateCollegeProfile() {
        initComponents();
    }
public UpdateCollegeProfile(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
        Dbcon db=new Dbcon();
        String sql1="select college_name from tbl_login where college_id='"+id+"'";
        ResultSet rs1=db.select(sql1);
        System.out.println(sql1);
        if(rs1.next()){
            String colname=rs1.getString(1);
        String sql="select * from tbl_colleges where name='"+colname+"'";
        ResultSet rs=db.select(sql);
        System.out.println(sql);
        if(rs.next()){
            collegeid.setText(rs.getString("id"));
            college.setText(rs.getString("name"));
            phone.setText(rs.getString("contact_no"));
            mail.setText(rs.getString("email"));
            site.setText(rs.getString("web_site"));
        }
        }
    } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"error in listing");
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

        jLabel2 = new javax.swing.JLabel();
        collegeid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        college = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        site = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 115, 48, -1));

        collegeid.setEditable(false);
        collegeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeidActionPerformed(evt);
            }
        });
        getContentPane().add(collegeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 109, 261, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE COLLEGE PROFILE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 40, 352, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 167, 48, -1));

        college.setEditable(false);
        college.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeActionPerformed(evt);
            }
        });
        getContentPane().add(college, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 167, 261, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Contact Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 226, -1, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 232, 261, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 291, 48, -1));

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 291, 261, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Website");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 349, 71, -1));

        site.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteActionPerformed(evt);
            }
        });
        getContentPane().add(site, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 349, 261, 29));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 422, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 422, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void collegeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeidActionPerformed

    }//GEN-LAST:event_collegeidActionPerformed

    private void collegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collegeActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void siteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String id=collegeid.getText();
        String name=college.getText();
        String contactno=phone.getText();
        String email=mail.getText();
        String website=site.getText();
        if(id.equals("")||name.equals("")||contactno.equals("")||email.equals("")||website.equals("")){
            JOptionPane.showMessageDialog(this,"please enter the values");
        }else{
            Dbcon db=new Dbcon();
            String sql="update tbl_colleges set name='"+name+"',contact_no='"+contactno+"',email='"+email+"',web_site='"+website+"' where id='"+id+"'";
            int rs=db.update(sql);
            if(rs>0){
                JOptionPane.showMessageDialog(this,"successfully updated");
                       StaffHomePage staffhome = new StaffHomePage();
                        staffhome.setVisible(true);
                        this.dispose();        // TODO add your handling code here:

            }else{
                JOptionPane.showMessageDialog(this,"updation failed");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       StaffHomePage staffhome = new StaffHomePage();
        staffhome.setVisible(true);
        this.dispose();        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCollegeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCollegeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCollegeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCollegeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCollegeProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField college;
    private javax.swing.JTextField collegeid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField site;
    // End of variables declaration//GEN-END:variables
}

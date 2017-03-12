/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * UpdateTimeTable.java
 *
 * Created on Dec 11, 2016, 3:02:48 AM
 */
package campusdiary;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UpdateTimeTable extends javax.swing.JFrame {

    /**
     * Creates new form UpdateTimeTable
     */
    public UpdateTimeTable() {
        initComponents();
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

    public UpdateTimeTable(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
        loadbranch();
        loadSubject();
        Dbcon db = new Dbcon();
        String sql = "select * from tbl_time_table where id='" + id + "'";
        ResultSet rs = db.select(sql);
        try {
            while (rs.next()) {
                timetableid.setText(rs.getString(1));
                code.setText(rs.getString(2));
                branch.setSelectedItem(rs.getString("branch"));
                sem.setSelectedItem(rs.getString("semester"));
                sub.setSelectedItem(rs.getString("subject_code"));
                
                String temp = rs.getString("time");
                String split[] = temp.split(":");
                String hour_s = split[0];
                int hour_i = Integer.parseInt(hour_s);
                String minit_s = split[1];
                int minit_i = Integer.parseInt(minit_s);
                String meridian = split[2];
                System.out.println(hour_i);
                hour.setValue(hour_i);
                mint.setValue(minit_i);
                am.setText(meridian);
                System.out.println("Date milli value " + rs.getString("date_milli"));
                
                if(rs.getString("date_milli")!=null) {
                    long milli = Long.parseLong(rs.getString("date_milli"));
                    Date prevDate = new Date(milli);
                    date1.setDate(prevDate);
                }
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "error in viewing");
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

        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sub = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        subname = new javax.swing.JTextField();
        date1 = new org.jdesktop.swingx.JXDatePicker();
        hour = new javax.swing.JSpinner();
        mint = new javax.swing.JSpinner();
        am = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        timetableid = new javax.swing.JTextField();
        branch = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Time");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 360, 48, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Branch");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 196, 80, 22));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE TIME TABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 23, 317, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 308, 76, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 257, 64, -1));

        sem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--select--", "semester 1", "semester 2", "semester 3", "semester 4", "semester 5", "semester 6" }));
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });
        getContentPane().add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 256, 240, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Revision Code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 143, 94, 20));

        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        getContentPane().add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 144, 240, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Subject Code");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 422, -1, -1));

        sub.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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
        getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 415, 246, 32));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Subject Name");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 491, 100, -1));

        subname.setEditable(false);
        getContentPane().add(subname, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 481, 246, 29));

        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });
        getContentPane().add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 306, 246, 34));

        hour.setModel(new javax.swing.SpinnerNumberModel(1, 0, 12, 1));
        getContentPane().add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 359, 48, -1));

        mint.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        getContentPane().add(mint, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 358, 48, -1));

        am.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        am.setText("am");
        am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amActionPerformed(evt);
            }
        });
        getContentPane().add(am, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 358, 54, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 93, -1, -1));

        timetableid.setEditable(false);
        timetableid.setText(" ");
        getContentPane().add(timetableid, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 92, 240, -1));

        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 196, 240, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String idd = timetableid.getText();
    String rev = code.getText();
    String branchname = branch.getSelectedItem().toString();
    String semester = sem.getSelectedItem().toString();
    String date = date1.getDate().toString();
    String time1 = hour.getValue().toString();
    String time2 = mint.getValue().toString();
    String amm = am.getText();
    String time = time1 + ":" + time2 + ":" + amm;
    String subcode = sub.getSelectedItem().toString();
    String subname1 = subname.getText();

    int t = sem.getSelectedIndex();
    if (idd.equals("") || rev.equals("") || date1.getDate() == null || t == 0 || time.equals("")) {

        JOptionPane.showMessageDialog(this, "enter the values");
    } else {
        try {
            Dbcon db = new Dbcon();
            long milli = date1.getDate().getTime();
            String sql = "update tbl_time_table set revision_code='" + rev + "',branch='" + branchname + "',semester='" + semester + "',subject_code='" + subcode + "',subject_name='" + subname1 + "',date='" + date + "',time='" + time + "' , date_milli='" + milli + "' where id='" + idd + "'";
            System.out.println(sql);
            int ins = db.update(sql);
            if (ins > 0) {
                JOptionPane.showMessageDialog(this, "successfully inserted");
                ViewTimeTable timetable = new ViewTimeTable();
                timetable.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "try again");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error in updation");
        }
}//GEN-LAST:event_jButton2ActionPerformed
    }
private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed


}//GEN-LAST:event_semActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void subItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subItemStateChanged

        String item = sub.getSelectedItem().toString();
        String sql = "select subject_name from tbl_subjects where subject_code='" + item + "'";
        Dbcon db = new Dbcon();
        ResultSet rs = db.select(sql);
        try {
            if (rs.next()) {
                String name = rs.getString(1);
                subname.setText(name);

            }
        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_subItemStateChanged

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date1ActionPerformed

    private void amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amActionPerformed
        String value = am.getText();
        if (value.equals("am")) {
            am.setText("pm");
        } else {
            am.setText("am");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_amActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewTimeTable timetable = new ViewTimeTable();
        timetable.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UpdateTimeTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton am;
    private javax.swing.JComboBox branch;
    private javax.swing.JTextField code;
    private org.jdesktop.swingx.JXDatePicker date1;
    private javax.swing.JSpinner hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner mint;
    private javax.swing.JComboBox sem;
    private javax.swing.JComboBox sub;
    private javax.swing.JTextField subname;
    private javax.swing.JTextField timetableid;
    // End of variables declaration//GEN-END:variables
}

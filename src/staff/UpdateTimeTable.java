/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class UpdateTimeTable extends javax.swing.JFrame {

    /**
     * Creates new form AddTimeTable
     */
    public UpdateTimeTable() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void loadbranch() {
        try {
            String sql = "select * from tbl_branches;";
            Dbcon db = new Dbcon();
            ResultSet rs = db.select(sql);
            while (rs.next()) {
                String br = rs.getString(2);
                branch.addItem(br);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadsubject() {
        String sql = "select * from tbl_subjects;";
        Dbcon db = new Dbcon();
        ResultSet rs = db.select(sql);
        try {
            while (rs.next()) {
                String sub = rs.getString(2);
                subjectCode.addItem(sub);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AddTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public UpdateTimeTable(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
        loadbranch();
        loadsubject();
        try {
            Dbcon db=new Dbcon();
        String sql="select * from tbl_series_time_table where id='"+id+"'";
        ResultSet rs=db.select(sql);
        if(rs.next()){
            seriesid.setText(rs.getString(1));
            branch.setSelectedItem(2);
            semester.setSelectedItem(rs.getString(3));
            subjectCode.setSelectedItem(rs.getString(4));
            
            String temp=rs.getString("time");
            String split[]=temp.split(":");
            String hr=split[0];
            int hor=Integer.parseInt(hr);
            String min=split[1];
            int minit=Integer.parseInt(min);
            String am=split[2];
           hour.setValue(hor);
           minute.setValue(minit);
           meridian.setText(am);
           
           long milli=Long.parseLong(rs.getString("date_milli"));
           Date ndate=new Date(milli);
           date.setDate(ndate);
        }
        } catch (Exception e) {
            e.printStackTrace();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        branch = new javax.swing.JComboBox<>();
        semester = new javax.swing.JComboBox<>();
        date = new org.jdesktop.swingx.JXDatePicker();
        hour = new javax.swing.JSpinner();
        minute = new javax.swing.JSpinner();
        meridian = new javax.swing.JButton();
        subjectCode = new javax.swing.JComboBox<>();
        subjectName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        seriesid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("SERIES TIME TABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 36, 246, 27));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Branch");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 192, 53, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Semester");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 248, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 417, 45, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 475, 70, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Subject Code");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 302, 82, -1));

        back.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 537, -1, -1));

        submit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        submit.setText("UPDATE");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 537, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Subject Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 359, 104, -1));

        branch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 191, 216, -1));

        semester.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "semester 1", "semester 2", "semester 3", "semester 4", "semester 5", "semester 6" }));
        getContentPane().add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 245, 216, -1));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 411, 216, -1));

        hour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        getContentPane().add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 469, -1, -1));

        minute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        getContentPane().add(minute, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 469, 53, -1));

        meridian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        meridian.setText("am");
        meridian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meridianActionPerformed(evt);
            }
        });
        getContentPane().add(meridian, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 471, -1, -1));

        subjectCode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        subjectCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectCodeItemStateChanged(evt);
            }
        });
        subjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCodeActionPerformed(evt);
            }
        });
        getContentPane().add(subjectCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 299, 216, -1));

        subjectName.setEditable(false);
        subjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectNameActionPerformed(evt);
            }
        });
        getContentPane().add(subjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 353, 216, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Id");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 139, -1, -1));

        seriesid.setEditable(false);
        getContentPane().add(seriesid, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 133, 216, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        jLabel9.setAutoscrolls(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 520, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String id=seriesid.getText();
        String branches=branch.getSelectedItem().toString();
        String sem=semester.getSelectedItem().toString();
        String subcode=subjectCode.getSelectedItem().toString();
        String subject=subjectName.getText();
        String da = date.getDate().toString();
        String hr = hour.getValue().toString();
        String mi = minute.getValue().toString();
        String me = meridian.getText();
        String ti = hr + ":" + mi + ":" + me ;
        if(date.getDate()==null||ti.equals("")){
            JOptionPane.showMessageDialog(this,"please enter the values");
        }else{
        Dbcon db=new Dbcon();
        String sql="update tbl_series_time_table set branch='"+branches+"',semester='"+sem+"',subject_code='"+subcode+"',subject_name='"+subject+"',date='"+da+"',time='"+ti+"' where id='"+id+"'";
        int r=db.update(sql);
        if(r>0){
            JOptionPane.showMessageDialog(this,"updation success");
            ViewTimetable timetable=new ViewTimetable();
        timetable.setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"updation failed");
        }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       ViewTimetable timetable=new ViewTimetable();
        timetable.setVisible(true);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void meridianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meridianActionPerformed
        // TODO add your handling code here:
        String me = meridian.getText();
        if(me.equals("am")){
            meridian.setText("pm");
        }else{
            meridian.setText("am");
        }
    }//GEN-LAST:event_meridianActionPerformed

    private void subjectCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectCodeItemStateChanged

        try {
            // TODO add your handling code here:
            String subc = subjectCode.getSelectedItem().toString();
            Dbcon db = new Dbcon();
            ResultSet rs = db.select("select subject_name from tbl_subjects where subject_code ='" + subc + "'");
            if(rs.next()){
                subjectName.setText(rs.getString("subject_name"));
            }

        } catch (SQLException ex) {
            System.out.println("error in listing");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectCodeItemStateChanged

    private void subjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectCodeActionPerformed

    private void subjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectNameActionPerformed

    }//GEN-LAST:event_subjectNameActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> branch;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JSpinner hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton meridian;
    private javax.swing.JSpinner minute;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JTextField seriesid;
    private javax.swing.JComboBox<String> subjectCode;
    private javax.swing.JTextField subjectName;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}

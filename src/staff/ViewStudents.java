/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewStudents.java
 *
 * Created on Dec 24, 2016, 10:49:26 AM
 */
package staff;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kakes
 */
public class ViewStudents extends javax.swing.JFrame {

    DefaultTableModel mode1 = null;
    String id;

    /** Creates new form ViewStudents */
    public ViewStudents() {
        initComponents();
         this.setLocationRelativeTo(null);
        viewstudent();
    }

    private void viewstudent()  {
        try {
            updatebutton.setEnabled(false);
            deletebutton.setEnabled(false);
            Dbcon db = new Dbcon();
            String sql = "select *from tbl_student";
            ResultSet rs = db.select(sql);
            mode1 = (DefaultTableModel) viewStudent.getModel();
            String arr[] = new String[11];
            while (rs.next()) {
             String id = rs.getString("id") ;
             String na = rs.getString("name") ;
             String ad = rs.getString("address") ;
             String dob = rs.getString("dob");
             String gd = rs.getString("gender"); 
             String gn = rs.getString("guardian_name");
             String ph = rs.getString("phone_no");
             String em = rs.getString("email");
             String pd = rs.getString("password") ;
             String br = rs.getString("branch"); 
             String adm = rs.getString("admission_date"); 
             
              arr[0]=id;
              arr[1]=na;
              arr[2]=ad;
              arr[3]=dob;
              arr[4]=gd;
              arr[5]=gn;
              arr[6]=ph;
              arr[7]=em;
              arr[8]=pd;
              arr[9]=br;
              arr[10]=adm;
              mode1.addRow(arr);


                                                                      
                                              
                                              
                                              
                                      
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewStudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        back2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        updatebutton.setText("UPDATE");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        deletebutton.setText("DELETE");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        viewStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Address", "DOB", "Gender", "GuardianName", "PhNo", "Email", "Password", "Branch", "admissionDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewStudent);
        if (viewStudent.getColumnModel().getColumnCount() > 0) {
            viewStudent.getColumnModel().getColumn(0).setMinWidth(0);
            viewStudent.getColumnModel().getColumn(0).setPreferredWidth(0);
            viewStudent.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("VIEW STUDENT");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        back2.setText("BACK");
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(back2)
                        .addGap(64, 64, 64)
                        .addComponent(updatebutton)
                        .addGap(29, 29, 29)
                        .addComponent(deletebutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(390, 390, 390)
                    .addComponent(back)
                    .addContainerGap(390, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updatebutton)
                        .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(back)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
     UpdateStudent student=new UpdateStudent(id);
    student.setVisible(true);
    this.dispose();
}//GEN-LAST:event_updatebuttonActionPerformed

private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
Dbcon db=new Dbcon();
String sql="delete from tbl_student where id='"+id+"'";
int r=db.insert(sql);
if(r>0){
     JOptionPane.showMessageDialog(this,"successfully deleted");
     ViewStudents student=new ViewStudents();
     student.setVisible(true);
     this.dispose();
}else{
     JOptionPane.showMessageDialog(this,"detetion failed");
}
}//GEN-LAST:event_deletebuttonActionPerformed

private void viewStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStudentMouseClicked

    mode1=(DefaultTableModel)viewStudent.getModel();
    if(mode1.getValueAt(viewStudent.getSelectedRow(),0).toString().equals("")){
        JOptionPane.showMessageDialog(this,"no data selected");
        
    }
    else
    {
        id=mode1.getValueAt(viewStudent.getSelectedRow(),0).toString();
        
        updatebutton.setEnabled(true);
            deletebutton.setEnabled(true);
    }
    // TODO add your handling code here:
}//GEN-LAST:event_viewStudentMouseClicked

private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        StaffHomePage hp = new StaffHomePage();
        hp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_backActionPerformed

private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        StaffHomePage hp = new StaffHomePage();
        hp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_back2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewStudents().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton back2;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updatebutton;
    private javax.swing.JTable viewStudent;
    // End of variables declaration//GEN-END:variables
}

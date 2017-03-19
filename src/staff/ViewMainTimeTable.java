/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import campusdiary.*;
import db.Dbcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static staff.StaffLogin.collegeId;

/**
 *
 * @author HP
 */
public class ViewMainTimeTable extends javax.swing.JFrame {
    
    String id;
    DefaultTableModel model=null;
    /**
     * Creates new form ViewTimeTable
     */
    public ViewMainTimeTable() {
        initComponents();
        this.setLocationRelativeTo(null);
        viewtimetable();
    }

    private void viewtimetable(){
        try {
            
        Dbcon db=new Dbcon();
        model=(DefaultTableModel)timetable.getModel();
        String array[]=new String[9];
        String sql="select * from tbl_time_table";
        ResultSet rs=db.select(sql);
        while(rs.next()){
            String id=rs.getString(1);
            String code=rs.getString(2);
            String branch=rs.getString(3);
            String sem=rs.getString(4);
            String subcode=rs.getString(5);
            String sub=rs.getString(6);
            String date=rs.getString(7);
            String time=rs.getString(8);
           
            array[0]=id;
            array[1]=code;
            array[2]=branch;
            array[3]=sem;
            array[4]=subcode;
            array[5]=sub;
            array[6]=date;
            array[7]=time;
          
            model.addRow(array);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"error in viewing timetable");
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

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        timetable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("VIEW TIME TABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 29, -1, -1));

        timetable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Revision_code", "Branch", "Semester", "Subject_code", "Subject", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        timetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(timetable);
        if (timetable.getColumnModel().getColumnCount() > 0) {
            timetable.getColumnModel().getColumn(0).setMinWidth(0);
            timetable.getColumnModel().getColumn(0).setPreferredWidth(0);
            timetable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 93, 818, 226));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 910, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 StaffHomePage hp = new StaffHomePage();
                        hp.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void timetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timetableMouseClicked

        model=(DefaultTableModel)timetable.getModel();
    if(model.getValueAt(timetable.getSelectedRow(),0).toString().equals("")){
        JOptionPane.showMessageDialog(this,"no data selected");
        
    }
    else
    {
        id=model.getValueAt(timetable.getSelectedRow(),0).toString();
    }
    }//GEN-LAST:event_timetableMouseClicked

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
            java.util.logging.Logger.getLogger(ViewMainTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMainTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMainTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMainTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMainTimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable timetable;
    // End of variables declaration//GEN-END:variables
}
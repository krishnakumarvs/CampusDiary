/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campusdiary;

import db.Dbcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewFeedBack extends javax.swing.JFrame {
    
    DefaultTableModel model=null;
    String id;
    /**
     * Creates new form ViewFeedBack
     */
    public ViewFeedBack() {
        initComponents();
        this.setLocationRelativeTo(null);
        viewfeedback();
    }
    private void viewfeedback(){
        try {
            delete_button.setEnabled(false);
            Dbcon db=new Dbcon();
            String sql="select * from tbl_feedback where owner='STAFF'";
            ResultSet rs=db.select(sql);
            System.out.println(sql);
            model=(DefaultTableModel)feedback.getModel();
            String array[]=new String[7];
            while(rs.next()){
                 String id=rs.getString(1);
                 String own=rs.getString(2);
                 
                 String title=rs.getString(4);
                 String date=rs.getString(5);
                 String note=rs.getString(6);
                 String coll_id=rs.getString(7);
                   array[0]=id;
                    array[1]=own; 
                    array[2]=title;
                    array[3]=date;
                    array[4]=note;
                    array[5]=coll_id;
                    model.addRow(array);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"error in viewing");
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

        jButton4 = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedback = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 324, -1, -1));

        delete_button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 324, -1, -1));

        feedback.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        feedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Owner", "Title", "Date", "Description", "College_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(feedback);
        if (feedback.getColumnModel().getColumnCount() > 0) {
            feedback.getColumnModel().getColumn(0).setMinWidth(0);
            feedback.getColumnModel().getColumn(0).setPreferredWidth(0);
            feedback.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 149, 646, 139));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FEED BACK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 43, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
                   Dbcon db =new Dbcon();
        String sql="delete from tbl_feedback where id='"+id+"'";
        int r=db.insert(sql);
        if(r>0){
            JOptionPane.showMessageDialog(this,"successfully deleted");
                        ViewFeedBack feedback=new ViewFeedBack();
                           feedback.setVisible(true);
                    this.dispose();

        }else{
            JOptionPane.showMessageDialog(this,"deletion failed");
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void feedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMouseClicked
            model=(DefaultTableModel)feedback.getModel();
    if(model.getValueAt(feedback.getSelectedRow(),0).toString().equals("")){
        JOptionPane.showMessageDialog(this,"no data selected");
        
    }
    else
    {
        id=model.getValueAt(feedback.getSelectedRow(),0).toString();
         delete_button.setEnabled(true);
    }
    }//GEN-LAST:event_feedbackMouseClicked

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
            java.util.logging.Logger.getLogger(ViewFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFeedBack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_button;
    private javax.swing.JTable feedback;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

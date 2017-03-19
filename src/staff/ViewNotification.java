/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import db.Dbcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewNotification extends javax.swing.JFrame {
    
    DefaultTableModel model=null;
    String id;
    /**
     * Creates new form ViewNotification
     */
    public ViewNotification() {
        initComponents();
        this.setLocationRelativeTo(null);
        viewnotification();
    }
    private void viewnotification(){
        try {
             update_button.setEnabled(false);
             delete_button.setEnabled(false);
             Dbcon db =new Dbcon();
             model=(DefaultTableModel)notification.getModel();
             String array[]=new String[7];
             String sql="select * from tbl_notifications where college_id='"+StaffLogin.collegeId+"' AND (audience='All' OR audience='staff only')";
             ResultSet rs=db.select(sql);
             System.out.println(sql);
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
            System.out.println("error in viewing");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        notification = new javax.swing.JTable();
        back1 = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("VIEW NOTIFICATIONS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 29, -1, -1));

        notification.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        notification.setModel(new javax.swing.table.DefaultTableModel(
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
        notification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(notification);
        if (notification.getColumnModel().getColumnCount() > 0) {
            notification.getColumnModel().getColumn(0).setMinWidth(0);
            notification.getColumnModel().getColumn(0).setPreferredWidth(0);
            notification.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 748, 205));

        back1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back1.setText("BACK");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 307, -1, -1));

        update_button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 307, -1, -1));

        delete_button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 307, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        StaffHomePage staffhome = new StaffHomePage();
        staffhome.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_back1ActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        UpdateNotification notify=new UpdateNotification(id);
        notify.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        Dbcon db =new Dbcon();
        String sql="delete from tbl_notifications where id='"+id+"'";
        int r=db.insert(sql);
        if(r>0){
            JOptionPane.showMessageDialog(this,"successfully deleted");
             ViewNotification notify=new ViewNotification();
        notify.setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"deletion failed");
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void notificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationMouseClicked
         model=(DefaultTableModel)notification.getModel();
    if(model.getValueAt(notification.getSelectedRow(),0).toString().equals("")){
        JOptionPane.showMessageDialog(this,"no data selected");
        
    }
    else
    {
        id=model.getValueAt(notification.getSelectedRow(),0).toString();
        
        update_button.setEnabled(true);
            delete_button.setEnabled(true);
    }
    }//GEN-LAST:event_notificationMouseClicked

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
            java.util.logging.Logger.getLogger(ViewNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNotification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notification;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}

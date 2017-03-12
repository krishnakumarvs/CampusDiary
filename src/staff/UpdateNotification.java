/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import db.Dbcon;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class UpdateNotification extends javax.swing.JFrame {

    /**
     * Creates new form UpdateNotification
     */
    public UpdateNotification() {
        initComponents();
    }
     public UpdateNotification(String id) {
        initComponents();
        this.setLocationRelativeTo(null);
         try {
        Dbcon db=new Dbcon();
        String sql="select * from tbl_notifications where id='"+id+"'";
        ResultSet rs=db.select(sql);
        System.out.println(sql);
        if(rs.next()){
            notifyid.setText(rs.getString(1));
            title.setText(rs.getString(4));
            description.setText(rs.getString(6));
            audience.setSelectedItem(rs.getString(3));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        audience = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        notifyid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE NOTIFICATIONS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 321, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Audience");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 378, -1, 30));

        audience.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        audience.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--select--", "student only", "staff only", "all" }));
        audience.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                audienceInputMethodTextChanged(evt);
            }
        });
        audience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audienceActionPerformed(evt);
            }
        });
        getContentPane().add(audience, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 382, 286, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tittle");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 194, 65, 20));

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 286, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Description");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 275, -1, -1));

        description.setColumns(20);
        description.setRows(5);
        jScrollPane3.setViewportView(description);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 248, 286, 104));

        submit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        submit.setText("UPDATE");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 449, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 132, 35, -1));

        notifyid.setEditable(false);
        notifyid.setText(" ");
        getContentPane().add(notifyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 132, 286, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 449, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void audienceInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_audienceInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_audienceInputMethodTextChanged

    private void audienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_audienceActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String id=notifyid.getText();
        String tt = title.getText();
        String note= description.getText();
        String pry =audience.getSelectedItem().toString();
        Date date= new Date();
        long milliiii =  System.currentTimeMillis();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(milliiii);
        String temp = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH);
        int i=audience.getSelectedIndex();
        if(tt.equals("")||note.equals("")||i==0){
            JOptionPane.showMessageDialog(this, "enter the values");
        }else{
            Dbcon db = new Dbcon();
            String sql = "update tbl_notifications set audience='"+pry+"',title='"+tt+"',date='"+temp+"',description='"+note+"' where id='"+id+"'";
            int ins= db.update(sql);
            if(ins>0){
                JOptionPane.showMessageDialog(this, "successfully inserted");
                ViewNotification notify=new ViewNotification();
                notify.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "try again");
            }

            

        }
    }//GEN-LAST:event_submitActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         ViewNotification notify=new ViewNotification();
        notify.setVisible(true);
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
            java.util.logging.Logger.getLogger(UpdateNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateNotification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox audience;
    private javax.swing.JTextArea description;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField notifyid;
    private javax.swing.JButton submit;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}

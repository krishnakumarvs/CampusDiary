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
public class ViewSylabus extends javax.swing.JFrame {

        DefaultTableModel model=null;
    String id;
    /**
     * Creates new form ViewSylabus
     */
    public ViewSylabus() {
        initComponents();
        this.setLocationRelativeTo(null);
        viewsylabus();
    }
    private void viewsylabus(){
        try {
             update_button.setEnabled(false);
        delete_button.setEnabled(false);
        Dbcon db=new Dbcon();
        model = (DefaultTableModel)sylabus.getModel();
        String array[]=new String[11];
        String sql="select * from tbl_sylabus";
        ResultSet rs=db.select(sql);
        while(rs.next()){
            String id = rs.getString(1);
            String code=rs.getString(2);
            String branch=rs.getString(3);
            String sem=rs.getString(4);
            String subcode=rs.getString(5);
            String sub=rs.getString(6);
            String mod1=rs.getString(7);
            String mod2=rs.getString(8);
            String mod3=rs.getString(9);
            String mod4=rs.getString(10);
            String refe=rs.getString(11);
            
            array[0]=id;
            array[1]=code;
            array[2]=branch;
            array[3]=sem;
            array[4]=subcode;
            array[5]=sub;
            array[6]=mod1;
            array[7]=mod2;
            array[8]=mod3;
            array[9]=mod4;
            array[10]=refe;
            model.addRow(array);
        }
        } catch (Exception e) {
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
        delete_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sylabus = new javax.swing.JTable();
        update_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("VIEW SYLABUS");

        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        sylabus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Revision_code", "Branch", "Semester", "Subject_code", "Subject", "Module1", "Module2", "Module3", "Module4", "References"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sylabus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sylabusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sylabus);
        if (sylabus.getColumnModel().getColumnCount() > 0) {
            sylabus.getColumnModel().getColumn(0).setMinWidth(0);
            sylabus.getColumnModel().getColumn(0).setPreferredWidth(0);
            sylabus.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jButton6)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(update_button)
                                .addGap(33, 33, 33)
                                .addComponent(delete_button))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(delete_button)
                    .addComponent(update_button))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
         Dbcon db =new Dbcon();
        String sql="delete from tbl_sylabus where id='"+id+"'";
        int r=db.insert(sql);
        if(r>0){
            JOptionPane.showMessageDialog(this,"successfully deleted");
                ViewSylabus sylabus=new ViewSylabus();
                   sylabus.setVisible(true);
                    this.dispose();

        }else{
            JOptionPane.showMessageDialog(this,"deletion failed");
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        UpdateSylabus sylabus=new UpdateSylabus(id);
        sylabus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update_buttonActionPerformed

    private void sylabusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sylabusMouseClicked

          model=(DefaultTableModel)sylabus.getModel();
    if(model.getValueAt(sylabus.getSelectedRow(),0).toString().equals("")){
        JOptionPane.showMessageDialog(this,"no data selected");
        
    }
    else
    {
        id=model.getValueAt(sylabus.getSelectedRow(),0).toString();
         delete_button.setEnabled(true);
         update_button.setEnabled(true);
    }
    }//GEN-LAST:event_sylabusMouseClicked

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
            java.util.logging.Logger.getLogger(ViewSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSylabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSylabus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_button;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sylabus;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}

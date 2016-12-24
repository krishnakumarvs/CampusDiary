/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewTimetable.java
 *
 * Created on Dec 24, 2016, 12:17:34 PM
 */
package staff;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;
import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kakes
 */
public class ViewTimetable extends javax.swing.JFrame {
    DefaultTableModel mode1=null;
String id;    
    
    
    /** Creates new form ViewTimetable */
    public ViewTimetable() {
        initComponents();
         this.setLocationRelativeTo(null);
        viewtimetable();
    }
private void viewtimetable(){
    updateButton.setEnabled(false);
    deleteButton.setEnabled(false);
     Dbcon db = new Dbcon();
            String sql = "select *from tbl_series_time_table";
            ResultSet rs = db.select(sql);
            mode1 = (DefaultTableModel) viewTimeTable.getModel();
            String arr[] = new String[8];
        try {
            while (rs.next()) {
             String id = rs.getString("id") ;
             
             String br = rs.getString("branch") ;
             String se = rs.getString("semester");
             String sc = rs.getString("subject_code"); 
             String sn = rs.getString("subject_name");
             String ph = rs.getString("date");
             String em = rs.getString("time");
            
              
             
              arr[0]=id;
              
              arr[1]=br;
              arr[2]=se;
              arr[3]=sc;
              arr[4]=sn;
              arr[5]=ph;
              arr[6]=em;
              
              
              mode1.addRow(arr);
}       } catch (SQLException ex) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        viewTimeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        back2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "branch", "semester", "subjectcode", "subjectname", "date", "time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTimeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewTimeTable);
        viewTimeTable.getColumnModel().getColumn(0).setMinWidth(0);
        viewTimeTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        viewTimeTable.getColumnModel().getColumn(0).setMaxWidth(0);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36));
        jLabel1.setText(" TIME TABLE");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        back2.setText("Back");
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
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_deleteButtonActionPerformed

private void viewTimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTimeTableMouseClicked

    mode1=(DefaultTableModel)viewTimeTable.getModel();
    if(mode1.getValueAt(viewTimeTable.getSelectedRow(),0).toString().equals("")){
        JOptionPane.showMessageDialog(this,"no data selected");
        
    }
    else
    {
        id=mode1.getValueAt(viewTimeTable.getSelectedRow(),0).toString();
        
        updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
    }
    
    
    // TODO add your handling code here:
}//GEN-LAST:event_viewTimeTableMouseClicked

private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        StaffHomePage hp = new StaffHomePage();
        hp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_back2ActionPerformed

private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
int row =viewTimeTable.getSelectedRow();
String row1=(String) viewTimeTable.getValueAt(row, 0);
System.out.println(row1);
String sql = "select * from tbl_series_time_table where id ='" + row1 + "';";
        Dbcon d = new Dbcon();
        ResultSet rs = d.select(sql);
        try {
            if(rs.next()) {
                            UpdateTimeTable us = new UpdateTimeTable();
                            us.setVisible(true);
                            this.dispose();
                        }
            else{
                JOptionPane.showMessageDialog(this, "select any row");
            }
                // TODO add your handling code here:
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    // TODO add your handling code here:
}//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewTimetable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back2;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable viewTimeTable;
    // End of variables declaration//GEN-END:variables
}

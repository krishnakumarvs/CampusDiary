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
public class ViewOtherCollegeNews extends javax.swing.JFrame {

    /**
     * Creates new form ViewOtherCollegeNews
     */
    DefaultTableModel model=null;
    String id;
    public ViewOtherCollegeNews() {
        initComponents();
        this.setLocationRelativeTo(null);
        viewnews();
    }
    private void viewnews(){
        try {
             
             Dbcon db =new Dbcon();
             model=(DefaultTableModel)news.getModel();
             String array[]=new String[7];
             String sql="select * from tbl_news";
             ResultSet rs=db.select(sql);
             System.out.println(sql);
             while(rs.next()){
                 String id=rs.getString(1);
                 String title=rs.getString(2);
                 String note=rs.getString(3);
                 String photos=rs.getString(4);
                 String ownid=rs.getString(5);
                 String ownertype=rs.getString(6);
                 String audien=rs.getString(7);
                 
                 
                   array[0]=id;
                    array[1]=title;
                    array[2]=note;
                    array[3]=photos;
                    array[4]=ownid;
                    array[5]=ownertype;
                    array[6]=audien;
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        news = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 463, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("OTHER COLLEGE NEWS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 31, -1, -1));

        news.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        news.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title ", "Description", "Photos", "Owner_id", "OwnerType", "Audience"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        news.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(news);
        if (news.getColumnModel().getColumnCount() > 0) {
            news.getColumnModel().getColumn(0).setMinWidth(0);
            news.getColumnModel().getColumn(0).setPreferredWidth(0);
            news.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, 621, 193));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\CampusDiary\\img\\staff.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StaffHomePage staff=new StaffHomePage();
        staff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsMouseClicked
         model=(DefaultTableModel)news.getModel();
    if(model.getValueAt(news.getSelectedRow(),0).toString().equals("")){
        JOptionPane.showMessageDialog(this,"no data selected");
        
    }
    else
    {
        id=model.getValueAt(news.getSelectedRow(),0).toString();
        
       
    }
    }//GEN-LAST:event_newsMouseClicked

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
            java.util.logging.Logger.getLogger(ViewOtherCollegeNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOtherCollegeNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOtherCollegeNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOtherCollegeNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOtherCollegeNews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable news;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.frames;

import com.project.model.Location;
import com.project.util.dbdetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author Hansi
 */
public class RoomBuilding extends javax.swing.JFrame {
private static Connection con;
     
    
     private PreparedStatement b1;
     private PreparedStatement b2;
     private PreparedStatement b3;
     private PreparedStatement b4;
     private PreparedStatement ps11;
    /**
     * Creates new form RoomBuilding
     */
    public RoomBuilding() {
        initComponents();
        
         ArrayList arr2 = getbuil();
        for(Object x:arr2){
          rLocation.addItem((String) x);
          
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rName = new javax.swing.JTextField();
        rLocation = new javax.swing.JComboBox<String>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        preview = new javax.swing.JButton();
        bName1 = new javax.swing.JTextField();
        bId = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 0));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(95, 62, 25));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Rooms and Locations");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Building Name");

        bid.setText(" ");
        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Add Buildings");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Cancel");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Add Room");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Room Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Room Location");

        rName.setText(" ");

        rLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLocationActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 0));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        preview.setBackground(new java.awt.Color(95, 73, 57));
        preview.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        preview.setForeground(new java.awt.Color(255, 153, 0));
        preview.setText("Preview");
        preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewActionPerformed(evt);
            }
        });

        bName1.setText(" ");
        bName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bName1ActionPerformed(evt);
            }
        });

        bId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bId.setText("Building Id");

        rid.setText(" ");
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Room Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(27, 27, 27)
                                    .addComponent(jButton2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rName)
                                            .addComponent(rLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rid))
                                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(127, 127, 127)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bId, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(369, Short.MAX_VALUE)
                    .addComponent(bName1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(117, 117, 117)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bId))
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(37, 37, 37)
                .addComponent(preview, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(243, 243, 243)
                    .addComponent(bName1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList getbuil(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps11 = con.prepareStatement("select name from build");
             
             ResultSet rs11 = ps11.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
          return arr;  
    }
    public int getbuilNo(String x){
    try {
             int id_x;
             
             con = dbdetail.getCon();
               
             String sql ="select id from build where name=?";

             b3 = con.prepareStatement(sql);
             b3.setString(1, x);
             ResultSet rs2 = b3.executeQuery();
             
             while(rs2.next()) {
                 
                 id_x=rs2.getInt(1);
                  
                 
                 return id_x;
                 
             }
             
             con.close();
              
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
        
       return 0;
    }
    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    private void previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewActionPerformed
        // TODO add your handling code here:
        Preview p = new Preview();
        p.setVisible(true);
    }//GEN-LAST:event_previewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        int id=Integer.parseInt(bId.getText());
        int id = buildId();
//       int id = Integer.parseInt(bid.getText());
        String bname = bName1.getText(); 
        
        System.out.println(id+bname);
        addBuilding(id,bname);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bName1ActionPerformed

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ridActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       String name = rName.getText();
       int id = roomId();
       String location=(String) rLocation.getSelectedItem();
//        String location = "new building";
        System.out.println(name+id+location);
//                
       int loc = getbuilNo(location);
        
        addRoom(id,name,loc);
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mainframe p = new mainframe();
        p.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rLocationActionPerformed

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
            java.util.logging.Logger.getLogger(RoomBuilding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomBuilding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomBuilding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomBuilding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomBuilding().setVisible(true);
            }
        });
    }
    
    private void addBuilding(int id, String bname){
        System.out.println(id+bname);
        
    try {
        con = dbdetail.getCon();
        b1 = con.prepareStatement("insert into build(id,name) values(?,?) ");
         b1.setInt(1,id);
         b1.setString(2,bname);
         b1.execute();
         con.setAutoCommit(false);
         con.close();
            
            RoomBuilding rb = new RoomBuilding();
            rb.setVisible(true);
            this.dispose();
    } catch (SQLException ex) {
        Logger.getLogger(RoomBuilding.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }
    
    private void addRoom(int id,String name,int bid){
        
        
    try {
        con = dbdetail.getCon();
        b2 = con.prepareStatement("insert into room(id,name,bid) values(?,?,?)");
        b2.setInt(1, id);
        b2.setString(2, name);
        b2.setInt(3, bid);
         b2.execute();
         con.setAutoCommit(false);
         con.close();
         
          RoomBuilding rb = new RoomBuilding();
            rb.setVisible(true);
            this.dispose();
             
    } catch (SQLException ex) {
        Logger.getLogger(RoomBuilding.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
   /* private int getLocationId(String name){
         try {
             int x;
             
             con = dbdetail.getCon();
               
             String sql ="select * from build where name LIKE '%\"+name+\"%'";
//             b3 = con.prepareStatement("select * from build where name LIKE '%\"+name+\"%'");
//             b3.setString(1, name);
             b3 = con.prepareStatement(sql);
             ResultSet rs2 = b3.executeQuery();
             
             while(rs2.next()) {
                 
                 x=rs2.getInt(1);
                  
                 
                 return x;
                 
             }
             
             con.close();
              
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
        
       return 0;
    }*/
     public int buildId() {
        
         try {
             int x;
             
             con = dbdetail.getCon();
             
             b4 = con.prepareStatement("select id from build where id >= all (select id from build)");
             
             ResultSet rs2 = b4.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getInt(1);
                 x++;
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
             return 0; 
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return 0;
        
    }
     
     public int roomId() {
        
         try {
             int x;
             
             con = dbdetail.getCon();
             
             b4 = con.prepareStatement("select id from room where id >= all (select id from room)");
             
             ResultSet rs2 = b4.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getInt(1);
                 x++;
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
             return 0; 
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return 0;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bId;
    private javax.swing.JTextField bName1;
    private javax.swing.JTextField bid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton preview;
    private javax.swing.JComboBox<String> rLocation;
    private javax.swing.JTextField rName;
    private javax.swing.JTextField rid;
    // End of variables declaration//GEN-END:variables
}

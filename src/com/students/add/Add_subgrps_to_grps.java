/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.add;

import com.project.frames.lecturers;
import com.project.util.dbdetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vnaso
 */
public class Add_subgrps_to_grps extends javax.swing.JFrame {

    /**
     * Creates new form Add_subgrps_to_grps
     */
    Connection con = null;
    
    PreparedStatement ps11 = null;
    PreparedStatement ps = null;
     PreparedStatement ps1 = null;
    public Add_subgrps_to_grps() {
        initComponents();
        
        //Main Group
        ArrayList arr4 = getgroup();
        for(Object x:arr4){
          g1.addItem(x);
          }
        
        //Sub Group
        ArrayList arr5 = getsubgrp();
        for(Object x:arr5){
          sg2_1.addItem(x);
          }
    }
    private ArrayList getsubgrp(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps11 = con.prepareStatement("select subno from subNo");
             
             ResultSet rs11 = ps11.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
          return arr;  
    
    }
    private String getgrpName(int gid){
        
        String grp_name="";
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps11 = con.prepareStatement("select grpid from students where stuid=?");
             ps11.setInt(1,gid);
             
             ResultSet rs11 = ps11.executeQuery();
             
             while (rs11.next()) {
                 
                 grp_name=rs11.getString(1);
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
          return grp_name;  
    
    }
    //Main Group
    private ArrayList getgroup(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps11 = con.prepareStatement("select stuid from students");
             
             ResultSet rs11 = ps11.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
          return arr;  
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sg1 = new javax.swing.JComboBox();
        gsubid = new javax.swing.JTextField();
        subgroupID = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        g1 = new javax.swing.JComboBox();
        sg2_1 = new javax.swing.JComboBox();
        gsubid1 = new javax.swing.JTextField();
        subgroupID1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        gsubid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gsubidMouseClicked(evt);
            }
        });

        subgroupID.setBackground(new java.awt.Color(0, 153, 102));
        subgroupID.setForeground(new java.awt.Color(255, 255, 255));
        subgroupID.setText("Generate Sub-Group ID");
        subgroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subgroupIDActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Grp ID");

        gsubid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gsubid1MouseClicked(evt);
            }
        });

        subgroupID1.setBackground(new java.awt.Color(0, 153, 102));
        subgroupID1.setForeground(new java.awt.Color(255, 255, 255));
        subgroupID1.setText("Generate Sub-Group ID");
        subgroupID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subgroupID1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sub Grp");

        jLabel3.setText("Sub Grp Genaration");

        jButton1.setText("Add Subgrp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gsubid1)
                            .addComponent(sg2_1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g1, 0, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(subgroupID1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(sg2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(subgroupID1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gsubid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gsubidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gsubidMouseClicked
        
    }//GEN-LAST:event_gsubidMouseClicked

    private void subgroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgroupIDActionPerformed
       
    }//GEN-LAST:event_subgroupIDActionPerformed

    private void gsubid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gsubid1MouseClicked
        
    }//GEN-LAST:event_gsubid1MouseClicked

    private void subgroupID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgroupID1ActionPerformed
       String gid_s=(String) g1.getSelectedItem();
       int gid=Integer.parseInt(gid_s);
       
        String grp_name=getgrpName(gid);
        
        String gid2_s=(String) sg2_1.getSelectedItem();
       int gid2=Integer.parseInt(gid2_s);
       
        gsubid1.setText(grp_name+"."+gid2);
    }//GEN-LAST:event_subgroupID1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=getId();
        String gid_s=(String) g1.getSelectedItem();
       int gid=Integer.parseInt(gid_s);
       String subgrp=gsubid1.getText();
        add(id,gid,subgrp);
    }//GEN-LAST:event_jButton1ActionPerformed
    private int getId(){
        int x=0;
        try {
            
            
            ps1 = con.prepareStatement("select id from subgrp where id >= all (select id from subgrp)");

            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()) {

                x=rs1.getInt(1);
                x++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Add_subgrps_to_grps.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    private void add(int x,int y,String z){
        try {
            
            String q = "INSERT INTO subgrp (id,grpId,subgrp) values (?,?,?)";
            ps = con.prepareStatement(q);
            ps.setInt(1, x);
            ps.setInt(2,y);
            ps.setString(3,z);
            

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data Save Successfully");
            check_backup ob4=new  check_backup();
            ob4.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Add_subgrps_to_grps.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
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
            java.util.logging.Logger.getLogger(Add_subgrps_to_grps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_subgrps_to_grps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_subgrps_to_grps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_subgrps_to_grps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_subgrps_to_grps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox g1;
    private javax.swing.JTextField gsubid;
    private javax.swing.JTextField gsubid1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox sg1;
    private javax.swing.JComboBox sg2_1;
    private javax.swing.JButton subgroupID;
    private javax.swing.JButton subgroupID1;
    // End of variables declaration//GEN-END:variables
}

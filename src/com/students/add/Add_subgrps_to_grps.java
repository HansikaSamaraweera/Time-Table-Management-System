/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.add;

import com.project.frames.lecturers;
import com.project.util.dbdetail;
import com.students.services.students;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        //display details
        show_students();
        
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
    
    public ArrayList<students> subgroupList()
    {
        ArrayList<students> studentstListForY1=new ArrayList<>();
        try{
            con = (Connection) dbdetail.getCon();
            String query="select * from students";
            
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery(query);
            
            students addStdy1;
            
            while(rs.next()){
                addStdy1=new students(rs.getInt("stuid"),rs.getString("year"),rs.getString("semester"),rs.getString("programme"),rs.getInt("grpno"),rs.getString("grpid"),rs.getInt("subgno"),rs.getString("subgid"));
                studentstListForY1.add(addStdy1);
    
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return studentstListForY1;

    }
    
    //display
    public void show_students(){
        ArrayList<students> list=subgroupList();
        DefaultTableModel model=(DefaultTableModel)mainlist.getModel();
        
        Object[] row=new Object[2];
        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getgrpid();
            model.addRow(row);
            
        }
    }
    
    
    public void executeSQLQuery(String query,String message){
        con = (Connection) dbdetail.getCon();
        Statement st;
        
        try{
            st=con.createStatement();
            if(st.executeUpdate(query)==1)
            {
                DefaultTableModel model=(DefaultTableModel)mainlist.getModel();
                model.setRowCount(0);
                show_students();
                
                JOptionPane.showMessageDialog(null,"Data"+message+"Successfully");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Data Not"+message);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //Sub Group
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        g1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        sg2_1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        gsubid1 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        subgroupID1 = new javax.swing.JButton();
        lbn6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainlist = new javax.swing.JTable();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel4.setText("Generate Sub Group ID");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Main Group ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Sub Group Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sub Group ID");

        gsubid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gsubid1MouseClicked(evt);
            }
        });

        Add.setBackground(new java.awt.Color(102, 0, 255));
        Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/add.jpg"))); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
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

        lbn6.setBackground(new java.awt.Color(255, 255, 255));
        lbn6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbn6.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(g1, 0, 187, Short.MAX_VALUE)
                                    .addComponent(sg2_1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gsubid1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subgroupID1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbn6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sg2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gsubid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subgroupID1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbn6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        mainlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Main Group ID"
            }
        ));
        jScrollPane1.setViewportView(mainlist);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gsubidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gsubidMouseClicked
        
    }//GEN-LAST:event_gsubidMouseClicked

    private void subgroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgroupIDActionPerformed
       
    }//GEN-LAST:event_subgroupIDActionPerformed

    private void gsubid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gsubid1MouseClicked
            lbn6.setText("");
    }//GEN-LAST:event_gsubid1MouseClicked

    private void subgroupID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgroupID1ActionPerformed
       String gid_s=(String) g1.getSelectedItem();
       int gid=Integer.parseInt(gid_s);
       
       String grp_name=getgrpName(gid);
        
       String gid2_s=(String) sg2_1.getSelectedItem();
       int gid2=Integer.parseInt(gid2_s);
       
       gsubid1.setText(grp_name+"."+gid2);
    }//GEN-LAST:event_subgroupID1ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        int id=getId();
        String gid_s=(String) g1.getSelectedItem();
        int gid=Integer.parseInt(gid_s);
        String subgrp=gsubid1.getText();
        add(id,gid,subgrp);
    }//GEN-LAST:event_AddActionPerformed
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
        return x;
    }
    private void add(int x,int y,String z){
        if(gsubid1.getText().trim().isEmpty()){
            //JOptionPane.showMessageDialog(null,"Error!!!...Please Fill the Fields..."); 
            lbn6.setText("This Field is Required");
        }
        else{
        try {
            
            String q = "INSERT INTO subgrp (id,grpId,subgrp) values (?,?,?)";
            ps = con.prepareStatement(q);
            ps.setInt(1, x);
            ps.setInt(2,y);
            ps.setString(3,z);
            

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data Save Successfully");
            ViewStudents view=new ViewStudents();
            view.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Add_subgrps_to_grps.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton Add;
    private javax.swing.JComboBox g1;
    private javax.swing.JTextField gsubid;
    private javax.swing.JTextField gsubid1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbn6;
    private javax.swing.JTable mainlist;
    private javax.swing.JComboBox sg1;
    private javax.swing.JComboBox sg2_1;
    private javax.swing.JButton subgroupID;
    private javax.swing.JButton subgroupID1;
    // End of variables declaration//GEN-END:variables
}

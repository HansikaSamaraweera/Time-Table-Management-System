/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sessions.notavailable;

import com.project.model.DayDetails;
import com.project.util.dbdetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OSHANI
 */
public class generatett extends javax.swing.JFrame {
private static Connection con;
    private PreparedStatement ps2;
    private PreparedStatement ps5;
    private PreparedStatement ps3;
    private PreparedStatement p7;
    private PreparedStatement ps8;
    private PreparedStatement ps9;
    /**
     * Creates new form generatett
     */
    public generatett() {
        initComponents();
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
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        s_tt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jButton1.setText("GENARATE STRUCTURE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("View Student IDS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel8.setText("Generate Time Table For SubGroup");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Add Sudent Group ID");

        s_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_idActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Time Table ID");

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("GENARATE STRUCTURE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("View Time Table for Students");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(69, 69, 69)
                .addComponent(jLabel12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s_tt)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(s_tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id_stu=Integer.parseInt(s_id.getText());
        int ttid_stu=Integer.parseInt(s_tt.getText());
        //System.out.println(id);
        //genaratettstructureStudent(id_stu,ttid_stu);
        //JOptionPane.showMessageDialog(null, "Succseesfully Created the table.You can View it from View Students Time Tables by providung the Students id");
        int r_i = stutablecheck(id_stu);
        if(r_i==-90){
            JOptionPane.showMessageDialog(null, "Table has Alredy Created.");
        }else{
            genaratettstructureStudent(id_stu,ttid_stu);
            JOptionPane.showMessageDialog(null, "Succseesfully Created the table.You can View it from Students Time Tables by providung the Students id");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int id_stu=Integer.parseInt(s_id.getText());
        int ttid_stu=Integer.parseInt(s_tt.getText());
        //System.out.println(id);
        //genaratettstructureStudent(id_stu,ttid_stu);
        //JOptionPane.showMessageDialog(null, "Succseesfully Created the table.You can View it from View Students Time Tables by providung the Students id");
        int r_i = stutablecheck(id_stu);
        if(r_i==-90){
            JOptionPane.showMessageDialog(null, "Table has Alredy Created.");
        }else{
            genaratettstructureStudent(id_stu,ttid_stu);
            JOptionPane.showMessageDialog(null, "Succseesfully Created the table.You can View it from Students Time Tables by providung the Students id");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        /*ViewStudents ob3=new ViewStudents();
        ob3.setVisible(true);*/
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        DisplaySubGroupTimetable ob4=new DisplaySubGroupTimetable();
        ob4.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed
private int stutablecheck(int id){
        
         try {
             
             
             con = dbdetail.getCon();
             
             ps5 = con.prepareStatement("select * from stu_sub_timetable where id =?");
             ps5.setInt(1, id);
             ResultSet rs2 = ps5.executeQuery();
             
             while (rs2.next()) {
                 
                 
                 
                 
                 return (-90);
                 
             }
             
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }
private void genaratettstructureStudent(int stu_id,int stu_timetabletype){
       DayDetails object=new DayDetails();
       object=getOneDetail(stu_timetabletype);
       
       int time=Integer.parseInt(object.getTime());
         String Monday = String.valueOf(object.getMonday());
         String Tuesday = String.valueOf(object.getTuesday());
         String Wednesday = String.valueOf(object.getWednesday());
         String Thursday = String.valueOf(object.getThursday());
         String Friday = String.valueOf(object.getFriday());
         String Saturday = String.valueOf(object.getSaturday());
         String Sunday = String.valueOf(object.getSunday());
       
       
       if(time==0){
           time=5;
       }
       
       String timeslot=object.getTimeslot();
       
       if(timeslot.equals("One hour")){
       
           for(int i=0;i<time;i++){
            int k22=getStudent_index();
            
                float xx=(float) (8.30+i);
               addtotableStudentStruct(k22,stu_id,xx, Monday, Sunday, Sunday, Thursday, Friday, Sunday, Sunday);
               
           }
            String name=gettinngStudentName(stu_id);
             int x_id=get_timetable_index();
             CreatedTableRecords(x_id, "Student", stu_id,name);
       }
       else if(timeslot.equals("30 minutes")){
           for(int i=0;i<time*2;i++){
               int k122=getStudent_index();
            
              float xx1=(float) (8.50+i*0.5);
              
                if(xx1%1==0){
                }
                else{
                    xx1=(float) (xx1-0.20);
                }
                addtotableStudentStruct(k122,stu_id,xx1, Monday, Sunday, Sunday, Thursday, Friday, Sunday, Sunday);
           }
           String name=gettinngStudentName(stu_id);
             int x_id=get_timetable_index();
             CreatedTableRecords(x_id, "Student", stu_id,name);
       }
       else{
           for(int i=0;i<time;i++){
           
           }
       }
       
    }
    private void genaratettstructureLectuer(int lec_id,int lec_timetabletype){
       DayDetails object=new DayDetails();
       object=getOneDetail(lec_timetabletype);
       
       int time=Integer.parseInt(object.getTime());
         String Monday = String.valueOf(object.getMonday());
         String Tuesday = String.valueOf(object.getTuesday());
         String Wednesday = String.valueOf(object.getWednesday());
         String Thursday = String.valueOf(object.getThursday());
         String Friday = String.valueOf(object.getFriday());
         String Saturday = String.valueOf(object.getSaturday());
         String Sunday = String.valueOf(object.getSunday());
       
       
       if(time==0){
           time=5;
       }
       
       String timeslot=object.getTimeslot();
       
       if(timeslot.equals("One hour")){
       
           for(int i=0;i<time;i++){
            int k=get_lec_index();
            
                float xx=(float) (8.30+i);
               addtotableLectuerStruct(k,lec_id,xx, Monday, Sunday, Sunday, Thursday, Friday, Sunday, Sunday);
               
           }
       }
       else if(timeslot.equals("30 minutes")){
           for(int i=0;i<time*2;i++){
               int k1=get_lec_index();
            
              float xx1=(float) (8.50+i*0.5);
              
                if(xx1%1==0){
                }
                else{
                    xx1=(float) (xx1-0.20);
                }
                addtotableLectuerStruct(k1,lec_id,xx1, Monday, Sunday, Sunday, Thursday, Friday, Sunday, Sunday);
           }
       }
       else{
           for(int i=0;i<time;i++){
           
           }
       }
       
    }
    private void genaratettstructure(int id,int timetabletype){
       DayDetails object=new DayDetails();
       object=getOneDetail(timetabletype);
       
       int time=Integer.parseInt(object.getTime());
         String Monday = String.valueOf(object.getMonday());
         String Tuesday = String.valueOf(object.getTuesday());
         String Wednesday = String.valueOf(object.getWednesday());
         String Thursday = String.valueOf(object.getThursday());
         String Friday = String.valueOf(object.getFriday());
         String Saturday = String.valueOf(object.getSaturday());
         String Sunday = String.valueOf(object.getSunday());
       
       
       if(time==0){
           time=5;
       }
       
       String timeslot=object.getTimeslot();
       
       if(timeslot.equals("One hour")){
       
           for(int i=0;i<time;i++){
            int k=getraw_index();
            
                float xx=(float) (8.30+i);
               addtotableSt(k,id,xx, Monday, Sunday, Sunday, Thursday, Friday, Sunday, Sunday);
               
           }
            String name=gettinnglocationName(id);
             int x_id=get_timetable_index();
             CreatedTableRecords(x_id, "Location", id,name);
       }
       else if(timeslot.equals("30 minutes")){
           for(int i=0;i<time*2;i++){
               int k1=getraw_index();
            
              float xx1=(float) (8.50+i*0.5);
              
                if(xx1%1==0){
                }
                else{
                    xx1=(float) (xx1-0.20);
                }
                addtotableSt(k1,id,xx1, Monday, Sunday, Sunday, Thursday, Friday, Sunday, Sunday);
           }
           String name=gettinnglocationName(id);
             int x_id=get_timetable_index();
             CreatedTableRecords(x_id, "Location", id,name);
       }
       else{
           for(int i=0;i<time;i++){
           
           }
       }
       
    }
  
    private void addtotableSt(int id,int roomid,float timeslot,String mon,String tue,String wed,String thur,String fri,String sat,String sun){
         try {
            
             con = dbdetail.getCon();
             ps3 = con.prepareStatement("insert into room_timetable(id,roomid,timeslot,mon,tue,wed,thur,fri,sat,sun) values(?,?,?,?,?,?,?,?,?,?) ");
             ps3.setInt(1, id);
             ps3.setInt(2, roomid);
             ps3.setFloat(3,timeslot);
             ps3.setString(4,mon);
             ps3.setString(5,tue);
             ps3.setString(6,wed);
             ps3.setString(7,thur);
             ps3.setString(8,fri);
             ps3.setString(9,sat);
             ps3.setString(10,sun);
            
             ps3.execute();
             System.out.println("hello");
             
             
             
             con.setAutoCommit(false);
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    private void addtotableLectuerStruct(int id,int lecid,float timeslot,String mon,String tue,String wed,String thur,String fri,String sat,String sun){
         try {
            
             con = dbdetail.getCon();
             ps3 = con.prepareStatement("insert into lec_timetable(id,lecid,timeslot,mon,tue,wed,thur,fri,sat,sun) values(?,?,?,?,?,?,?,?,?,?) ");
             ps3.setInt(1, id);
             ps3.setInt(2, lecid);
             ps3.setFloat(3,timeslot);
             ps3.setString(4,mon);
             ps3.setString(5,tue);
             ps3.setString(6,wed);
             ps3.setString(7,thur);
             ps3.setString(8,fri);
             ps3.setString(9,sat);
             ps3.setString(10,sun);
            
             ps3.execute();
             System.out.println("hello");
             
             
             
             con.setAutoCommit(false);
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    private void addtotableStudentStruct(int id,int stuid,float timeslot,String mon,String tue,String wed,String thur,String fri,String sat,String sun){
         try {
            
             con = dbdetail.getCon();
             ps3 = con.prepareStatement("insert into stu_sub_timetable(did,id,timeslot,mon,tue,wed,thur,fri,sat,sun) values(?,?,?,?,?,?,?,?,?,?) ");
             ps3.setInt(1, id);
             ps3.setInt(2, stuid);
             ps3.setFloat(3,timeslot);
             ps3.setString(4,mon);
             ps3.setString(5,tue);
             ps3.setString(6,wed);
             ps3.setString(7,thur);
             ps3.setString(8,fri);
             ps3.setString(9,sat);
             ps3.setString(10,sun);
            
             ps3.execute();
             System.out.println("hello");
             
             
             
             
             con.setAutoCommit(false);
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    private void CreatedTableRecords(int id,String tabletype,int tt_id,String name){
         try {
            
             con = dbdetail.getCon();
             ps3 = con.prepareStatement("insert into timetableLog(id,tabletype,tt_id,name) values(?,?,?,?) ");
             ps3.setInt(1, id);
             ps3.setString(2, tabletype);
             ps3.setInt(3, tt_id);
             ps3.setString(4,name);
             
             ps3.execute();
             System.out.println("hello");
             
             
             
             con.setAutoCommit(false);
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    private String gettinngStudentName(int id){
     try {
             String x;
             
             con = dbdetail.getCon();
             
             ps5 = con.prepareStatement("select subgrp from subgrp where id =?");
             ps5.setInt(1, id);
             ResultSet rs2 = ps5.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getString(1);
                
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
            
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         return "notfound"; 
    }
    private String gettinnglocationName(int id){
     try {
             String x;
             
             con = dbdetail.getCon();
             
             ps5 = con.prepareStatement("select name from room where id =?");
             ps5.setInt(1, id);
             ResultSet rs2 = ps5.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getString(1);
                
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
            
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         return "notfound"; 
    }
     private int getStudent_index(){
     try {
             int x;
             
             con = dbdetail.getCon();
             
             ps5 = con.prepareStatement("select did from stu_sub_timetable where did >= all (select did from stu_sub_timetable)");
             
             ResultSet rs2 = ps5.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getInt(1);
                 x++;
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
             return 0; 
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return 0;
    
    }
     private int get_timetable_index(){
     try {
             int x;
             
             con = dbdetail.getCon();
             
             ps5 = con.prepareStatement("select id from timetableLog where id >= all (select id from timetableLog)");
             
             ResultSet rs2 = ps5.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getInt(1);
                 x++;
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
             return 0; 
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return 0;
    
    }
    private int getraw_index(){
     try {
             int x;
             
             con = dbdetail.getCon();
             
             ps5 = con.prepareStatement("select id from room_timetable where id >= all (select id from room_timetable)");
             
             ResultSet rs2 = ps5.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getInt(1);
                 x++;
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
             return 0; 
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return 0;
    
    }
    private int get_lec_index(){
     try {
             int x;
             
             con = dbdetail.getCon();
             
             ps5 = con.prepareStatement("select id from lec_timetable where id >= all (select id from lec_timetable)");
             
             ResultSet rs2 = ps5.executeQuery();
             
             while (rs2.next()) {
                 
                 x=rs2.getInt(1);
                 x++;
                 
                 return x;
                 
             }
             
             con.close();
             
             
             
             return 0; 
         } catch (SQLException ex) {
             Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return 0;
    
    }
  private DayDetails getOneDetail(int id){
         DayDetails ar=new DayDetails();
        try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select Did,nodays,monday,tuesday,wednesday,thursday,friday,saturday,sunday,time,timeslot from Details where DId=?");
             ps2.setInt(1, id);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                 
                ar.setId(rs11.getInt(1));
                ar.setNodays(rs11.getInt(2));
                 ar.setMonday(rs11.getString(3));
                ar.setTuesday(rs11.getString(4));
                ar.setWednesday(rs11.getString(5));
                ar.setThursday(rs11.getString(6));
                ar.setFriday(rs11.getString(7));
                ar.setSaturday(rs11.getString(8));
                ar.setSunday(rs11.getString(9));
                ar.setTime(rs11.getString(10));
                ar.setTimeslot(rs11.getString(11));
               
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(generatett.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
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
            java.util.logging.Logger.getLogger(generatett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generatett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generatett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generatett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generatett().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField s_id;
    private javax.swing.JTextField s_tt;
    // End of variables declaration//GEN-END:variables
}
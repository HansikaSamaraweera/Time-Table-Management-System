/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.s2;

import com.project.frames.Lecturer_view;
import com.project.frames.ViewWorkingDays_new;
import com.project.frames.WorkingDays_new;
import com.project.model.DayDetails;
import com.project.model.Lecturer;
import com.project.model.Session;
import com.project.util.dbdetail;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author vnaso
 */
public class ViewSessions extends javax.swing.JFrame {

    /**
     * Creates new form ViewSessions
     */
    private static Connection con;
    private PreparedStatement ps1;
    private PreparedStatement ps2;
    private PreparedStatement ps3;
    public ViewSessions() {
        initComponents();
        show_sessions();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        session_view_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loc_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AddSession = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        C_ID = new javax.swing.JComboBox();
        R_ID = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        session_view_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SESSION", "STATUS"
            }
        ));
        session_view_table.setRowHeight(130);
        session_view_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                session_view_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(session_view_table);
        if (session_view_table.getColumnModel().getColumnCount() > 0) {
            session_view_table.getColumnModel().getColumn(0).setMaxWidth(50);
            session_view_table.getColumnModel().getColumn(1).setResizable(false);
            session_view_table.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Genarate Time Table Structure ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("YOU HAVE SELECTED SESSION");

        SID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Add Location ID");

        AddSession.setText("Add Session");
        AddSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSessionActionPerformed(evt);
            }
        });

        jLabel4.setText("ADD DATE COLUMN ID");

        jLabel5.setText("Time Table creation for Students");

        jLabel6.setText("ADD RAW ID");

        C_ID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mon", "tue", "wed", "thur", "fri", "sat", "sun" }));

        jLabel7.setText("Make Sure Raw ID is belong to session, students");

        jButton2.setText("View Creted Tables");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loc_id))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C_ID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(AddSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(R_ID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(C_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(R_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddSession)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void session_view_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_session_view_tableMouseClicked
        // TODO add your handling code here:
        int i=session_view_table.getSelectedRow();
         TableModel model=session_view_table.getModel();
        String id=model.getValueAt(i,0).toString();
        try{
        int y=Integer.parseInt(id);
        JOptionPane.showMessageDialog(null, "You Have Selected Session:"+y);
        SID.setText(id);
        }catch(Exception e){}
        
    }//GEN-LAST:event_session_view_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSessionActionPerformed
        // TODO add your handling code here:
        int y=calledByAddSessions();
        if(y==-77){
        JOptionPane.showMessageDialog(null, "Students table has not created yet.Plese create it and try again.");
        }else if(y==-79){
        JOptionPane.showMessageDialog(null, "Location table has not created yet.Plese create it and try again.");
        }
        else if(y==-34){
        JOptionPane.showMessageDialog(null, "location and students time slots are not matching");
        }else if(y==-900){
            JOptionPane.showMessageDialog(null, "Not enough time slots for for the duration in students time table or Yoour Raw ID is not correct");
        }else if(y==-800){
            JOptionPane.showMessageDialog(null, "Not enough time slots for for the duration in location time table");
        }
        
    }//GEN-LAST:event_AddSessionActionPerformed
    private int calledByAddSessions(){
    try{
            
        String hh=loc_id.getText();
        //getting location id by input
        int locationID=Integer.parseInt(hh);
        //getting session id by input
        int sessionID=Integer.parseInt(SID.getText());
        
       
        Session ob=new Session();
        ob=getOneDetailSession(sessionID);
        
        int duration=ob.getDuration();
        
        //lectuer handling
        String lec=ob.getLec();
        String[] arrLec = lec.split(",");
        
        for(String jj:arrLec){
        System.out.println("spliit array"+jj);
        
        }
        
        //getting the student group by
        int sudentgroupID=getOneDetaillStudent(ob.getS_grp());
        //checking if the time table created
        int yy=findStudentHasCreatedTheTable(sudentgroupID);
        if(yy==-1){
            return -77;
        }
        int locyy=findLocationHasCreatedTheTable(locationID);
        if(locyy==-1){
            return -79;
        }
        JOptionPane.showMessageDialog(null, "Checking Whether all the time table has created, is succedded.Other parts are proceeding");
        //System.out.println("group idddddddd"+sudentgroupID);
        
        ///***************************************************************************************************
        //ADDING DETAILS FIRSTLY IN STUDENT TIME TABLE
        
        //getting the input data for raw id and column id by that user inserted.
        String columnId=(String) C_ID.getSelectedItem();
        int rawid=(int) R_ID.getValue();
        
        //getting the details(session) that need to store in time table 
        String sessionDeatils=ob.getLec()+ob.getS_grp()+ob.getSub_grp()+ob.getSubject_c()+ob.getTag()+","+locationID;
        
        //getting the table format(1 hour or 30 min) and timslot
        float[] checkts= getTimeSlots(rawid);
        
        float timeslott=checkts[1];
        //System.out.println("displaying time sloooots"+timeslott);
        
        //checking wheather room tt has the same time slot and timeslot type
        //JOptionPane.showMessageDialog(null, timeslott);
        float[] checks_location=getTimeSlotsLoc(timeslott,locationID);
        
        //returning if not available time slots
        if(checks_location[0]==-100){
         return -34;
        }
        
        //checking whether the students,locations,lectuers slots are available else add
        
        //checking students
        if(checkts[0]==-1){
        
            for(int y=0;y<duration;y++){
            String rrr=checkIfFree(y+rawid,columnId,locationID,sessionDeatils,sudentgroupID);    
            System.out.println("checkfree  "+y+rrr);
            if(!rrr.equalsIgnoreCase("Yes")){
               //int s=Integer.parseInt("ttt");
                return -900;
            }
            
            }
            
        
        }else{
            for(int y=0;y<duration*2;y++){
             String rrr1=checkIfFree(y+rawid,columnId,locationID,sessionDeatils,sudentgroupID);        
             System.out.println("checkfree  "+y+"*******"+rrr1);
             if(!rrr1.equalsIgnoreCase("Yes")){
               //int s=Integer.parseInt("ttt");
                 return -900;
            }
            }
            
             }
        JOptionPane.showMessageDialog(null, "Checking Whether students table has all the time slots available, is succedded.Other parts are proceeding");
        //checking locations
         if(checks_location[0]==-1){
        
            for(int y=0;y<duration;y++){
            int no1=(int) (y+checks_location[1]);    
            String rrr = checkIfFreeLocation(no1,columnId,locationID,sessionDeatils,locationID);    
            System.out.println("checkfree  "+y+rrr);
            if(!rrr.equalsIgnoreCase("Yes")){
               //int s=Integer.parseInt("ttt");
                return -800;
            }
            
            }
            
        
        }else{
            for(int y=0;y<duration*2;y++){
             int no2=(int) (y+checks_location[1]);    
             String rrr1 = checkIfFreeLocation(no2,columnId,locationID,sessionDeatils,locationID);        
             System.out.println("checkfree  "+y+"*******"+rrr1);
             if(!rrr1.equalsIgnoreCase("Yes")){
               //int s=Integer.parseInt("ttt");
                 return -800;
            }
            }
            
        }
        JOptionPane.showMessageDialog(null, "Checking Whether location table has all the time slots available, is succedded.Other parts are proceeding");
        //Need to add after all checking students,locations,lecturers
        //After checking adding students
        if(checkts[0]==-1){
        
            
            for(int y=0;y<duration;y++){
            
            AddSeesionstott(y+rawid,columnId,locationID,sessionDeatils,sudentgroupID);
            }
        
        }else{
            
            
            for(int y=0;y<duration*2;y++){
            
            AddSeesionstott(y+rawid,columnId,locationID,sessionDeatils,sudentgroupID);
            }
            
        
        
        }
        JOptionPane.showMessageDialog(null, "Students time table is Updated.Other parts are proceeding");
        //Addning locations
        if(checks_location[0]==-1){
            for(int y=0;y<duration;y++){
            int no1=(int) (y+checks_location[1]);
            AddSeesionstottLocation(no1,columnId,locationID,sessionDeatils,locationID);
            }
        
        }else{
            
            
            for(int y=0;y<duration*2;y++){
            int no2=(int) (y+checks_location[1]);
            AddSeesionstottLocation(no2,columnId,locationID,sessionDeatils,locationID);
            }
            
        
        
        }
         JOptionPane.showMessageDialog(null, "Locations time table is Updated.");
        
        }catch(Exception e){
        
        }
    
    return 0;
    }
    
    private float[] getTimeSlotsLoc(float timeslott,int locationID){
       // JOptionPane.showMessageDialog(null, "INSIDE getTimeSlotLoc");
        int k1=-78;
        float k2=0;
        float re[]=new float[2];
    try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select id from room_timetable where roomid=? and timeslot=?");
             ps2.setInt(1, locationID);
             ps2.setFloat(2, timeslott);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                 //JOptionPane.showMessageDialog(null, "INSIDE getTimeSlotLoc 1st while loop");
              k1=rs11.getInt(1);
              re[1]=k1;
                
            }
             if(k1==-78){
                 re[0]=-100;
             return re;
             }
             ps3 = con.prepareStatement("select timeslot from stu_timetable where id=?");
             ps3.setInt(1,k1+1);
            ResultSet rs12 = ps3.executeQuery();
             while (rs12.next()) {
                 
              k2=rs12.getFloat(1);
               
                
            }
            
            re[0]=timeslott-k2;
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("checking time slottttt"+re);
        return re;
        
    
    }
    /*public static float round(float d, int decimalPlace) {
    BigDecimal bd = new BigDecimal(Float.toString(d));
    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
    return bd.floatValue();
    }*/
    
    private float[] getTimeSlots(int id){
        float k1=0;
        float k2=0;
        float[] re=new float[2];
    try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select timeslot from stu_timetable where id=?");
             ps2.setInt(1, id);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                 
              k1=rs11.getFloat(1);
              
              //JOptionPane.showMessageDialog(null, k1);
              
              re[1]=k1; 
                
            }
             
             ps3 = con.prepareStatement("select timeslot from stu_timetable where id=?");
             ps3.setInt(1, id+1);
            ResultSet rs12 = ps3.executeQuery();
             while (rs12.next()) {
                 
              k2=rs12.getFloat(1);
               
                
            }
            
            re[0]=k1-k2;
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("checking time slottttt"+re);
        return re;
        
    
    }
   /* private float next(int id){
    
    }*/
    private void AddSeesionstott(int rid,String cid,int loc,String session,int stuid){

        /*
        sql = "UPDATE diseaseinfo"
      + " SET `" + colname + "` = ?"
      + " WHERE companyname = 'mycom' AND diseaseName = ?";
        
        preparedStmt.setString(1, attrData);
        preparedStmt.setString(2, medname);
        */
         try {
                       String  sql = "UPDATE stu_timetable"
                        + " SET `" + cid + "` = ?"
                        + " WHERE id = ? AND stuid=?";
                        con = dbdetail.getCon();
                        
                        //ps3 = con.prepareStatement("UPDATE stu_timetable SET mon=?,tue=? where id=? ");
                        ps3 = con.prepareStatement(sql);
                        ps3.setString(1,session);
                        ps3.setInt(2,rid);
                        ps3.setInt(3,stuid);
                        
                        
                        
                       
                        ps3.execute();
                        //System.out.println("hello");
        
            con.setAutoCommit(false);
            con.close();
         } catch (Exception ex) {
             
             Logger.getLogger(WorkingDays_new.class.getName()).log(Level.SEVERE, null, ex);
         
         }
   
    
    }
    private void AddSeesionstottLocation(int rid,String cid,int loc,String session,int locId){

       
         try {
                       String  sql = "UPDATE room_timetable"
                        + " SET `" + cid + "` = ?"
                        + " WHERE id = ? AND roomid=?";
                        con = dbdetail.getCon();
                        
                        //ps3 = con.prepareStatement("UPDATE stu_timetable SET mon=?,tue=? where id=? ");
                        ps3 = con.prepareStatement(sql);
                        ps3.setString(1,session);
                        ps3.setInt(2,rid);
                        ps3.setInt(3,locId);
                        
                        
                        
                       
                        ps3.execute();
                        //System.out.println("hello");
        
            con.setAutoCommit(false);
            con.close();
         } catch (Exception ex) {
             
             Logger.getLogger(WorkingDays_new.class.getName()).log(Level.SEVERE, null, ex);
         
         }
   
    
    }
    private String checkIfFree(int rid,String cid,int loc,String session,int stuid){
            String ret="";
            int k=0;
        /*
        sql = "UPDATE diseaseinfo"
      + " SET `" + colname + "` = ?"
      + " WHERE companyname = 'mycom' AND diseaseName = ?";
        
        preparedStmt.setString(1, attrData);
        preparedStmt.setString(2, medname);
        */
         try {
                      /* String  sql = "SELECT"+cid+"From  stu_timetable"
                        + " WHERE id = ? AND stuid=?";
                        con = dbdetail.getCon();*/
                        
                        //ps3 = con.prepareStatement("UPDATE stu_timetable SET mon=?,tue=? where id=? ");
                        con = dbdetail.getCon();
                        ps3 = con.prepareStatement("select mon,tue,wed,thur,fri,sat,sun from stu_timetable where id = ? AND stuid=?");
                        ps3.setInt(1,rid);
                        ps3.setInt(2,stuid);
                        
                        if(cid.equals("mon")){
                        k=1;
                        }else if(cid.equals("tue")){
                        k=2;
                        }else if(cid.equals("wed")){
                        k=3;
                        }else if(cid.equals("thur")){
                        k=4;
                        }else if(cid.equals("fri")){
                        k=5;
                        }else if(cid.equals("sat")){
                        k=6;
                        }else if(cid.equals("sun")){
                        k=7;
                        }
                        
                        ResultSet rs11 = ps3.executeQuery();
                        while (rs11.next()) {
                 
                        ret=rs11.getString(k);
                        
                
                        }
                        
                        
                        
        
            con.setAutoCommit(false);
            con.close();
         } catch (Exception ex) {
             
             Logger.getLogger(WorkingDays_new.class.getName()).log(Level.SEVERE, null, ex);
         
         }
    return ret;
    
    }
    private String checkIfFreeLocation(int rid,String cid,int loc,String session,int stuid){
            String ret="";
            int k=0;
      
         try {
                       con = dbdetail.getCon();
                        ps3 = con.prepareStatement("select mon,tue,wed,thur,fri,sat,sun from room_timetable where id = ? AND roomid=?");
                        ps3.setInt(1,rid);
                        ps3.setInt(2,stuid);
                        
                        if(cid.equals("mon")){
                        k=1;
                        }else if(cid.equals("tue")){
                        k=2;
                        }else if(cid.equals("wed")){
                        k=3;
                        }else if(cid.equals("thur")){
                        k=4;
                        }else if(cid.equals("fri")){
                        k=5;
                        }else if(cid.equals("sat")){
                        k=6;
                        }else if(cid.equals("sun")){
                        k=7;
                        }
                        
                        ResultSet rs11 = ps3.executeQuery();
                        while (rs11.next()) {
                 
                        ret=rs11.getString(k);
                        
                
                        }
                        
                        
                        
        
            con.setAutoCommit(false);
            con.close();
         } catch (Exception ex) {
             
             Logger.getLogger(WorkingDays_new.class.getName()).log(Level.SEVERE, null, ex);
         
         }
    return ret;
    
    }
    private int getOneDetaillStudent(String name){
        
        try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select stuid from students where grpid=?");
             ps2.setString(1, name);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                 
              int k=rs11.getInt(1);
               return k;
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    } 
    private Session getOneDetailSession(int id){
        Session ar=new Session();
        try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select id,lec,tag,s_grp,sub_grp,subject_c,no_students,duration from sessions where id=?");
             ps2.setInt(1, id);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                 
                ar.setId(rs11.getInt(1));
                ar.setLec(rs11.getString(2));
                 ar.setTag(rs11.getString(3));
                ar.setS_grp(rs11.getString(4));
                ar.setSub_grp(rs11.getString(5));
                ar.setSubject_c(rs11.getString(6));
                ar.setN0_students(rs11.getInt(7));
                ar.setDuration(rs11.getInt(8));
                
               
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
    }
    private int findStudentHasCreatedTheTable(int id){
        
        try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select * from stu_timetable where stuid=?");
             ps2.setInt(1, id);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                 
              
               return 890;
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    } 
    private int findLocationHasCreatedTheTable(int id){
        
        try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select * from room_timetable where roomid=?");
             ps2.setInt(1, id);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                 
              
               return 890;
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
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
            java.util.logging.Logger.getLogger(ViewSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSessions().setVisible(true);
            }
        });
    }
    
    private void show_sessions(){
    DefaultTableModel model1 =(DefaultTableModel)session_view_table.getModel();
    
        /*model1.setColumnIdentifiers(new Object[] {
                "Column 1", "Column 2", "Column 3" });

        JTable table = new JTable(model1);
        table.setRowHeight(300);*/
        Object[] row=new Object[10];
        
        ArrayList<Session> ar= getsessions();
        
        for(Object x:ar){
            Session object=new Session();
            object = (Session) x;
            
        row[0]=object.getId();    
        //lec,tag,s_grp,sub_grp,subject_c,no_students,duration
        String sess="<html>"+"<br>"+object.getLec()+"<br>"+object.getTag()+"<br>"+object.getS_grp()+"<br>"+object.getSub_grp()+"<br>"+object.getSubject_c()+"<br>"+"No of Students"+object.getN0_students()+"<br>"+"Duration"+object.getDuration()+"<br>"+"</html>";
        row[1]=sess;
        
       
        model1.addRow(row);
        }
}
    
private ArrayList getsessions(){
     ArrayList arr=new ArrayList();
        try {
           
            
            con = dbdetail.getCon();
            ps1 = con.prepareStatement("select id,lec,tag,s_grp,sub_grp,subject_c,no_students,duration from sessions");
            ResultSet rs12 = ps1.executeQuery();
            
            while (rs12.next()) {
                //name+emmid+faculty+department+center+building+level+rank123
                Session ar=new Session();
                ar.setId(rs12.getInt(1));
                ar.setLec(rs12.getString(2));
                ar.setTag(rs12.getString(3));
                ar.setS_grp(rs12.getString(4));
                ar.setSub_grp(rs12.getString(5));
                ar.setSubject_c(rs12.getString(6));
                ar.setN0_students(rs12.getInt(7));
                ar.setDuration(rs12.getInt(8));
                
                
                arr.add(ar);
                
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ViewSessions.class.getName()).log(Level.SEVERE, null, ex);
        }
    return arr;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSession;
    private javax.swing.JComboBox C_ID;
    private javax.swing.JSpinner R_ID;
    private javax.swing.JLabel SID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loc_id;
    private javax.swing.JTable session_view_table;
    // End of variables declaration//GEN-END:variables
}

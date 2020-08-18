/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.add;


import com.project.frames.mainframe;
import com.project.util.dbdetail;
import com.students.services.students;
import com.students.update.EditStudents_Year1;
import com.students.update.EditStudents_Year2;
import com.students.update.EditStudents_Year3;
import com.students.update.EditStudents_Year4;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author ACER
 */
public class ViewStudents extends javax.swing.JFrame {
    //database connection
    Connection con = null;
    
        PreparedStatement ps2;
        PreparedStatement ps3;
    /**
     * Creates new form view
     */
    public ViewStudents() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        //View year 1 Details
        show_students_year1();
        
        //View year 2 Details
        show_students_year2();
        
        //View year 3 Details
        show_students_year3();
        
        //View year 4 Details
        show_students_year4();
        
        y1id.setVisible(false);
        y2id.setVisible(false);
        y3id.setVisible(false);
        y4id.setVisible(false);
        
    }
    
    /*
    --------------------------------------
    -               Year 1               -
    -                                    -
    --------------------------------------
    */
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Students List For Year 1
    -------------------------------------------------------------------------------------------------------------------------
    */
    public ArrayList<students> studentlist_Year1()
    {
        ArrayList<students> studentstListForY1=new ArrayList<>();
        try{
            con = (Connection) dbdetail.getCon();
            String query="select * from students where year='Y1'";
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
    
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Display Students details of Year1
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void show_students_year1(){
        ArrayList<students> list=studentlist_Year1();
        DefaultTableModel model=(DefaultTableModel)viewtable_y1.getModel();
        
        Object[] row=new Object[8];
        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getay();
            row[2]=list.get(i).getas();
            row[3]=list.get(i).getprogramme();
            row[4]=list.get(i).getgrpno();
            row[5]=list.get(i).getgrpid();
            row[6]=list.get(i).getsubno();
            row[7]=list.get(i).getsubid();
            model.addRow(row);
            
        }
    }
    
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Execute Query Year1
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void executeSQLQuery_year1(String query,String message){
        con = (Connection) dbdetail.getCon();
        Statement st;
        
        try{
            st=con.createStatement();
            if(st.executeUpdate(query)==1)
            {
                DefaultTableModel model=(DefaultTableModel)viewtable_y1.getModel();
                model.setRowCount(0);
                show_students_year1();
                
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
    
    
    /*
    --------------------------------------
    -               Year 2               -
    -                                    -
    --------------------------------------
    */
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Students List For Year 2
    -------------------------------------------------------------------------------------------------------------------------
    */
     public ArrayList<students> studentlist_Year2()
    {
        ArrayList<students> studentstListForY2=new ArrayList<>();
        try{
            con = (Connection) dbdetail.getCon();
            String query="select * from students where year='Y2'";
            Statement st2=con.createStatement();
            ResultSet rs2=st2.executeQuery(query);
            
            students addStdy2;
            
            while(rs2.next()){
                addStdy2=new students(rs2.getInt("stuid"),rs2.getString("year"),rs2.getString("semester"),rs2.getString("programme"),rs2.getInt("grpno"),rs2.getString("grpid"),rs2.getInt("subgno"),rs2.getString("subgid"));
                studentstListForY2.add(addStdy2);
                
                
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return studentstListForY2;

    }
     
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Display Students details of Year2
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void show_students_year2(){
        ArrayList<students> list2=studentlist_Year2();
        DefaultTableModel model2=(DefaultTableModel)viewtable_y2.getModel();
        
        Object[] data=new Object[8];
        
        for(int i=0;i<list2.size();i++){
            data[0]=list2.get(i).getid();
            data[1]=list2.get(i).getay();
            data[2]=list2.get(i).getas();
            data[3]=list2.get(i).getprogramme();
            data[4]=list2.get(i).getgrpno();
            data[5]=list2.get(i).getgrpid();
            data[6]=list2.get(i).getsubno();
            data[7]=list2.get(i).getsubid();
            model2.addRow(data);
            
        }
    }
    
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Execute Query Year2
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void executeSQLQuery_year2(String query,String message){
        con = (Connection) dbdetail.getCon();
        Statement st2;
        
        try{
            st2=con.createStatement();
            if(st2.executeUpdate(query)==1)
            {
                DefaultTableModel model=(DefaultTableModel)viewtable_y2.getModel();
                model.setRowCount(0);
                show_students_year2();
                
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
    
    
    /*
    --------------------------------------
    -               Year 3               -
    -                                    -
    --------------------------------------
    */

    /*
    -------------------------------------------------------------------------------------------------------------------------
    Students List For Year 3
    -------------------------------------------------------------------------------------------------------------------------
    */
    public ArrayList<students> studentlist_Year3()
    {
        ArrayList<students> studentstListForY3=new ArrayList<>();
        try{
            con = (Connection) dbdetail.getCon();
            String query="select * from students where year='Y3'";
            Statement st3=con.createStatement();
            ResultSet rs5=st3.executeQuery(query);
            
            students addStdy3;
            
            while(rs5.next()){
                addStdy3=new students(rs5.getInt("stuid"),rs5.getString("year"),rs5.getString("semester"),rs5.getString("programme"),rs5.getInt("grpno"),rs5.getString("grpid"),rs5.getInt("subgno"),rs5.getString("subgid"));
                studentstListForY3.add(addStdy3);
                
                
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return studentstListForY3;

    }
    
     /*
    -------------------------------------------------------------------------------------------------------------------------
    Display Students details of Year3
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void show_students_year3(){
        ArrayList<students> list3=studentlist_Year3();
        DefaultTableModel model3=(DefaultTableModel)viewtable_y3.getModel();
        
        Object[] row_3=new Object[8];
        
        for(int i=0;i<list3.size();i++){
            row_3[0]=list3.get(i).getid();
            row_3[1]=list3.get(i).getay();
            row_3[2]=list3.get(i).getas();
            row_3[3]=list3.get(i).getprogramme();
            row_3[4]=list3.get(i).getgrpno();
            row_3[5]=list3.get(i).getgrpid();
            row_3[6]=list3.get(i).getsubno();
            row_3[7]=list3.get(i).getsubid();
            model3.addRow(row_3);
            
        }
    }
    
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Execute Query Year3
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void executeSQLQuery_year3(String query,String message){
        con = (Connection) dbdetail.getCon();
        Statement st3;
        
        try{
            st3=con.createStatement();
            if(st3.executeUpdate(query)==1)
            {
                DefaultTableModel model=(DefaultTableModel)viewtable_y3.getModel();
                model.setRowCount(0);
                show_students_year3();
                
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
    
    
    
    /*
    --------------------------------------
    -               Year 4               -
    -                                    -
    --------------------------------------
    */  
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Students List For Year 4
    -------------------------------------------------------------------------------------------------------------------------
    */
    public ArrayList<students> studentlist_Year4()
    {
        ArrayList<students> studentstListForY4=new ArrayList<>();
        try{
            con = (Connection) dbdetail.getCon();
            String query="select * from students where year='Y4'";
            Statement st4=con.createStatement();
            ResultSet rs8=st4.executeQuery(query);
            
            students addStdy4;
            
            while(rs8.next()){
                addStdy4=new students(rs8.getInt("stuid"),rs8.getString("year"),rs8.getString("semester"),rs8.getString("programme"),rs8.getInt("grpno"),rs8.getString("grpid"),rs8.getInt("subgno"),rs8.getString("subgid"));
                studentstListForY4.add(addStdy4);
                
                
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return studentstListForY4;

    }

     /*
    -------------------------------------------------------------------------------------------------------------------------
    Display Students details of Year4
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void show_students_year4(){
        ArrayList<students> list4=studentlist_Year4();
        DefaultTableModel model4=(DefaultTableModel)viewtable_y4.getModel();
        
        Object[] row_data=new Object[8];
        
        for(int i=0;i<list4.size();i++){
            row_data[0]=list4.get(i).getid();
            row_data[1]=list4.get(i).getay();
            row_data[2]=list4.get(i).getas();
            row_data[3]=list4.get(i).getprogramme();
            row_data[4]=list4.get(i).getgrpno();
            row_data[5]=list4.get(i).getgrpid();
            row_data[6]=list4.get(i).getsubno();
            row_data[7]=list4.get(i).getsubid();
            model4.addRow(row_data);
            
        }
    }
    
    /*
    -------------------------------------------------------------------------------------------------------------------------
    Execute Query Year4
    -------------------------------------------------------------------------------------------------------------------------
    */
    
    public void executeSQLQuery_year4(String query,String message){
        con = (Connection) dbdetail.getCon();
        Statement st45;
        
        try{
            st45=con.createStatement();
            if(st45.executeUpdate(query)==1)
            {
                DefaultTableModel model=(DefaultTableModel)viewtable_y4.getModel();
                model.setRowCount(0);
                show_students_year4();
                
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
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abcd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        edity1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewtable_y4 = new javax.swing.JTable();
        dy1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        viewtable_y2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dy3 = new javax.swing.JButton();
        edity3 = new javax.swing.JButton();
        edity4 = new javax.swing.JButton();
        dy4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        viewtable_y1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        viewtable_y3 = new javax.swing.JTable();
        dy2 = new javax.swing.JButton();
        edit_year2 = new javax.swing.JButton();
        y2id = new javax.swing.JLabel();
        y3id = new javax.swing.JLabel();
        y4id = new javax.swing.JLabel();
        y1id = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        abcd.setText("Edit");
        abcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abcdActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\EducationEdit\\src\\Images\\icons8-search-20.png")); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1668, 1321));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        edity1.setBackground(new java.awt.Color(255, 255, 255));
        edity1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-create-25.png"))); // NOI18N
        edity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edity1ActionPerformed(evt);
            }
        });

        viewtable_y4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Year", "Semester", "Programme", "Group No", "Group ID", "Sub-Group No", "Sub-Group ID"
            }
        ));
        viewtable_y4.setSelectionBackground(new java.awt.Color(153, 0, 153));
        viewtable_y4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtable_y4MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(viewtable_y4);
        if (viewtable_y4.getColumnModel().getColumnCount() > 0) {
            viewtable_y4.getColumnModel().getColumn(0).setMinWidth(0);
            viewtable_y4.getColumnModel().getColumn(0).setPreferredWidth(0);
            viewtable_y4.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        dy1.setBackground(new java.awt.Color(255, 255, 255));
        dy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-trash-25.png"))); // NOI18N
        dy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dy1ActionPerformed(evt);
            }
        });

        viewtable_y2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Year", "Semester", "Programme", "Group No", "Group ID", "Sub-Group No", "Sub-Group ID"
            }
        ));
        viewtable_y2.setGridColor(new java.awt.Color(0, 153, 102));
        viewtable_y2.setSelectionBackground(new java.awt.Color(153, 0, 153));
        viewtable_y2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtable_y2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(viewtable_y2);
        if (viewtable_y2.getColumnModel().getColumnCount() > 0) {
            viewtable_y2.getColumnModel().getColumn(0).setMinWidth(0);
            viewtable_y2.getColumnModel().getColumn(0).setPreferredWidth(0);
            viewtable_y2.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Year 2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Year 3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("Year 1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("Year 4");

        dy3.setBackground(new java.awt.Color(255, 255, 255));
        dy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-trash-25.png"))); // NOI18N
        dy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dy3ActionPerformed(evt);
            }
        });

        edity3.setBackground(new java.awt.Color(255, 255, 255));
        edity3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-create-25.png"))); // NOI18N
        edity3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edity3ActionPerformed(evt);
            }
        });

        edity4.setBackground(new java.awt.Color(255, 255, 255));
        edity4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-create-25.png"))); // NOI18N
        edity4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edity4ActionPerformed(evt);
            }
        });

        dy4.setBackground(new java.awt.Color(255, 255, 255));
        dy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-trash-25.png"))); // NOI18N
        dy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dy4ActionPerformed(evt);
            }
        });

        viewtable_y1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Year", "Semester", "Programme", "Group No", "Group ID", "Sub-Group No", "Sub-Group ID"
            }
        ));
        viewtable_y1.setGridColor(new java.awt.Color(0, 153, 102));
        viewtable_y1.setSelectionBackground(new java.awt.Color(153, 0, 153));
        viewtable_y1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        viewtable_y1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtable_y1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(viewtable_y1);
        if (viewtable_y1.getColumnModel().getColumnCount() > 0) {
            viewtable_y1.getColumnModel().getColumn(0).setMinWidth(0);
            viewtable_y1.getColumnModel().getColumn(0).setPreferredWidth(0);
            viewtable_y1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        viewtable_y3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Year", "Semester", "Programme", "Group No", "Group ID", "Sub-Group No", "Sub-Group ID"
            }
        ));
        viewtable_y3.setSelectionBackground(new java.awt.Color(153, 0, 153));
        viewtable_y3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtable_y3MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(viewtable_y3);
        if (viewtable_y3.getColumnModel().getColumnCount() > 0) {
            viewtable_y3.getColumnModel().getColumn(0).setMinWidth(0);
            viewtable_y3.getColumnModel().getColumn(0).setPreferredWidth(0);
            viewtable_y3.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        dy2.setBackground(new java.awt.Color(255, 255, 255));
        dy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-trash-25.png"))); // NOI18N
        dy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dy2ActionPerformed(evt);
            }
        });

        edit_year2.setBackground(new java.awt.Color(255, 255, 255));
        edit_year2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-create-25.png"))); // NOI18N
        edit_year2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_year2ActionPerformed(evt);
            }
        });

        y1id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        y1id.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(edity4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dy4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(edit_year2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dy2)))
                .addGap(4, 4, 4))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(y1id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(y2id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 582, Short.MAX_VALUE)
                        .addComponent(edity1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dy1)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(y4id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(78, 78, 78)
                                .addComponent(y3id)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edity3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dy3)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(y1id, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edity1)
                    .addComponent(dy1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(y2id, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(edit_year2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dy2)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(y3id))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dy3)
                    .addComponent(edity3))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(y4id, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edity4)
                    .addComponent(dy4))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 720, 930));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Time Table");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(541, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(355, 355, 355))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        jPanel10.setBackground(new java.awt.Color(102, 0, 102));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Main Menu");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(962, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 1010));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel8.setText("View Students");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 203, 50));

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edity1ActionPerformed
        EditStudents_Year1 edy1=new EditStudents_Year1();
        edy1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int selectedForEdit = viewtable_y1.getSelectedRow();
        TableModel model=viewtable_y1.getModel();
        if(selectedForEdit==-1){
            JOptionPane.showMessageDialog(null,"No row selected!!!");
        }
        else{
           edy1.setVisible(true); 
        }
        
        String idd=model.getValueAt(selectedForEdit,0).toString();
        String y=model.getValueAt(selectedForEdit,1).toString();
        String s= model.getValueAt(selectedForEdit,2).toString();
        String p=model.getValueAt(selectedForEdit,3).toString();
        int gn=(int) model.getValueAt(selectedForEdit,4);
        int sn=(int) model.getValueAt(selectedForEdit,6);

        edy1.id.setText(idd);
        edy1.ay.setText(y);
        if(s.equals("S1")){
            edy1.s1.setSelected(true);
        }
        else{
            edy1.s2.setSelected(true);
        }
        edy1.pro.setSelectedItem(p);
        edy1.gno.setValue(gn);
        edy1.subno.setValue(sn);
        

    }//GEN-LAST:event_edity1ActionPerformed

    private void viewtable_y4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtable_y4MouseClicked
        int i=viewtable_y4.getSelectedRow();
        TableModel model=viewtable_y4.getModel();
        y4id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_viewtable_y4MouseClicked

    private void viewtable_y2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtable_y2MouseClicked
        int i=viewtable_y2.getSelectedRow();
        TableModel model=viewtable_y2.getModel();
        y2id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_viewtable_y2MouseClicked

    private void abcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abcdActionPerformed
        
    }//GEN-LAST:event_abcdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

    }//GEN-LAST:event_btnSearchActionPerformed

    private void dy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dy1ActionPerformed
        int id= Integer.parseInt(y1id.getText());
        System.out.print(id);
        try {
            con = (Connection) dbdetail.getCon();
            ps2=con.prepareStatement("delete from students where stuid=?");
            ps2.setInt(1,id);
            ps2.execute();
            JOptionPane.showConfirmDialog(null, "Are you want to delete this item?");
            ViewStudents ad=new ViewStudents();
            ad.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(ViewStudents.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_dy1ActionPerformed

    private void dy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dy3ActionPerformed
        int id= Integer.parseInt(y3id.getText());
        System.out.print(id);
        try {
            con = (Connection) dbdetail.getCon();
            ps2=con.prepareStatement("delete from students where stuid=?");
            ps2.setInt(1,id);
            ps2.execute();
            JOptionPane.showConfirmDialog(null, "Are you want to delete this item?");
            ViewStudents ad=new ViewStudents();
            ad.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(ViewStudents.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_dy3ActionPerformed

    private void viewtable_y1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtable_y1MouseClicked
        int i=viewtable_y1.getSelectedRow();
        TableModel model=viewtable_y1.getModel();
        y1id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_viewtable_y1MouseClicked

    private void viewtable_y3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtable_y3MouseClicked
        int i=viewtable_y3.getSelectedRow();
        TableModel model=viewtable_y3.getModel();
        y3id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_viewtable_y3MouseClicked

    private void edit_year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_year2ActionPerformed
        EditStudents_Year2 edy2=new EditStudents_Year2();
        edy2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int selectedForEdit = viewtable_y2.getSelectedRow();
        TableModel model=viewtable_y2.getModel();
        if(selectedForEdit==-1){
            JOptionPane.showMessageDialog(null,"No row selected!!!");
        }
        else{
           edy2.setVisible(true); 
        }

        String idd=model.getValueAt(selectedForEdit,0).toString();
        String y=model.getValueAt(selectedForEdit,1).toString();
        String s= model.getValueAt(selectedForEdit,2).toString();
        String p=model.getValueAt(selectedForEdit,3).toString();
        int gn=(int) model.getValueAt(selectedForEdit,4);
        int sn=(int) model.getValueAt(selectedForEdit,6);

        edy2.id.setText(idd);
        edy2.ay.setText(y);
        if(s.equals("S1")){
            edy2.s1.setSelected(true);
        }
        else{
            edy2.s2.setSelected(true);
        }
        edy2.pro.setSelectedItem(p);
        edy2.gno.setValue(gn);
        edy2.subno.setValue(sn);
    }//GEN-LAST:event_edit_year2ActionPerformed

    private void edity3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edity3ActionPerformed
       EditStudents_Year3 edy3=new EditStudents_Year3();
       edy3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int selectedForEdit = viewtable_y3.getSelectedRow();
        TableModel model=viewtable_y3.getModel();
        if(selectedForEdit==-1){
            JOptionPane.showMessageDialog(null,"No row selected!!!");
        }
        else{
           edy3.setVisible(true); 
        }

        String idd=model.getValueAt(selectedForEdit,0).toString();
        String y=model.getValueAt(selectedForEdit,1).toString();
        String s= model.getValueAt(selectedForEdit,2).toString();
        String p=model.getValueAt(selectedForEdit,3).toString();
        int gn=(int) model.getValueAt(selectedForEdit,4);
        int sn=(int) model.getValueAt(selectedForEdit,6);

        edy3.id.setText(idd);
        edy3.ay.setText(y);
        if(s.equals("S1")){
            edy3.s1.setSelected(true);
        }
        else{
            edy3.s2.setSelected(true);
        }
        edy3.pro.setSelectedItem(p);
        edy3.gno.setValue(gn);
        edy3.subno.setValue(sn);
    }//GEN-LAST:event_edity3ActionPerformed

    private void edity4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edity4ActionPerformed
        EditStudents_Year4 edy4=new EditStudents_Year4();
        edy4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int selectedForEdit = viewtable_y4.getSelectedRow();
        TableModel model=viewtable_y4.getModel();
        if(selectedForEdit==-1){
            JOptionPane.showMessageDialog(null,"No row selected!!!");
        }
        else{
           edy4.setVisible(true); 
        }

        String idd=model.getValueAt(selectedForEdit,0).toString();
        String y=model.getValueAt(selectedForEdit,1).toString();
        String s= model.getValueAt(selectedForEdit,2).toString();
        String p=model.getValueAt(selectedForEdit,3).toString();
        int gn=(int) model.getValueAt(selectedForEdit,4);
        int sn=(int) model.getValueAt(selectedForEdit,6);

        edy4.id.setText(idd);
        edy4.ay.setText(y);
        if(s.equals("S1")){
            edy4.s1.setSelected(true);
        }
        else{
            edy4.s2.setSelected(true);
        }
        edy4.pro.setSelectedItem(p);
        edy4.gno.setValue(gn);
        edy4.subno.setValue(sn);
    }//GEN-LAST:event_edity4ActionPerformed

    private void dy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dy2ActionPerformed
       int id= Integer.parseInt(y2id.getText());
        System.out.print(id);
        try {
            con = (Connection) dbdetail.getCon();
            ps2=con.prepareStatement("delete from students where stuid=?");
            ps2.setInt(1,id);
            ps2.execute();
            JOptionPane.showConfirmDialog(null, "Are you want to delete this item?");
            ViewStudents ad=new ViewStudents();
            ad.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(ViewStudents.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_dy2ActionPerformed

    private void dy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dy4ActionPerformed
        int id= Integer.parseInt(y4id.getText());
        System.out.print(id);
        try {
            con = (Connection) dbdetail.getCon();
            ps2=con.prepareStatement("delete from students where stuid=?");
            ps2.setInt(1,id);
            ps2.execute();
            JOptionPane.showConfirmDialog(null, "Are you want to delete this item?");
            ViewStudents ad=new ViewStudents();
            ad.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(ViewStudents.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_dy4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        mainframe ob=new mainframe();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abcd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton dy1;
    private javax.swing.JButton dy2;
    private javax.swing.JButton dy3;
    private javax.swing.JButton dy4;
    private javax.swing.JButton edit_year2;
    private javax.swing.JButton edity1;
    private javax.swing.JButton edity3;
    private javax.swing.JButton edity4;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable viewtable_y1;
    private javax.swing.JTable viewtable_y2;
    private javax.swing.JTable viewtable_y3;
    private javax.swing.JTable viewtable_y4;
    private javax.swing.JLabel y1id;
    private javax.swing.JLabel y2id;
    private javax.swing.JLabel y3id;
    private javax.swing.JLabel y4id;
    // End of variables declaration//GEN-END:variables
}

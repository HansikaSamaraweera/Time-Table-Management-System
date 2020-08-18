/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.frames;

import com.project.model.Lecturer;
import com.project.util.dbdetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vnaso
 */
public class Lecturer_view extends javax.swing.JFrame {

    /**
     * Creates new form Lecturer_view
     */
    private static Connection con;
    private PreparedStatement ps1;
    private PreparedStatement ps2;
    private PreparedStatement ps3;
    private PreparedStatement ps26;
    public Lecturer_view() {
        initComponents();
        show_lec();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lecView = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edit_id = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        fac = new javax.swing.JComboBox();
        dep = new javax.swing.JTextField();
        cen = new javax.swing.JComboBox();
        buil = new javax.swing.JComboBox();
        levelCombo = new javax.swing.JComboBox();
        rank = new javax.swing.JLabel();
        rankbtn = new javax.swing.JButton();
        updateLec = new javax.swing.JButton();
        DeleteLec = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setText("Main Menu");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 255)));

        lecView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "EID", "Faculty", "Department", "Building", "Center", "Level", "Rank"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lecView);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("   View Lecturers");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enter ID");

        edit_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_idActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/view.png"))); // NOI18N
        jButton3.setText("Display Details");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Employee ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Faculty");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Center");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Building");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Level");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Rank");

        fac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Faculty Of Computing", "Faculty Of Engineering", " " }));
        fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facActionPerformed(evt);
            }
        });

        cen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Malabe", "Metro", "Kandy", "Jaffna" }));

        buil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Main Building", "Engineering Building", "New Building" }));

        levelCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", " " }));
        levelCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelComboActionPerformed(evt);
            }
        });

        rank.setText("Rank");

        rankbtn.setText("Genarate Rank");
        rankbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankbtnActionPerformed(evt);
            }
        });

        updateLec.setBackground(new java.awt.Color(102, 0, 255));
        updateLec.setForeground(new java.awt.Color(255, 255, 255));
        updateLec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/edit.png"))); // NOI18N
        updateLec.setText("Update");
        updateLec.setBorder(null);
        updateLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLecActionPerformed(evt);
            }
        });

        DeleteLec.setBackground(new java.awt.Color(102, 0, 255));
        DeleteLec.setForeground(new java.awt.Color(255, 255, 255));
        DeleteLec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/delete.jpg"))); // NOI18N
        DeleteLec.setText("Delete");
        DeleteLec.setBorder(null);
        DeleteLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(levelCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rankbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eid)
                    .addComponent(nm)
                    .addComponent(dep))
                .addGap(144, 144, 144))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateLec, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteLec, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(buil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(levelCombo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rank, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankbtn))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateLec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteLec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(edit_id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edit_id, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(102, 0, 102));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setText("Main Menu");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 125, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_idActionPerformed
        // TODO add your handling code here:
        //display();
    }//GEN-LAST:event_edit_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(edit_id.getText());
        display(x);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facActionPerformed

    private void levelComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelComboActionPerformed

    private void rankbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankbtnActionPerformed
        try{
            String empid = eid.getText();

            int count=empid.length();
            System.out.print("len"+count);

            String level= (String) levelCombo.getSelectedItem();

            float id = Float.parseFloat(empid);

            if(count==6 && !level.equals("Select")){

                String dis=level+"."+empid;
                rank.setText(dis);

            }else {
                System.out.println("inside");
                Error ob123=new Error();
                ob123.setVisible(true);
            }

        }catch(Exception e){
            System.out.println("inside");
            Error ob123=new Error();
            ob123.setVisible(true);

        }
    }//GEN-LAST:event_rankbtnActionPerformed

    private void DeleteLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLecActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(edit_id.getText());
        deletelec(id);
        
    }//GEN-LAST:event_DeleteLecActionPerformed

    private void updateLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLecActionPerformed
        // TODO add your handling code here:
        String check=rank();
        if(check.equals("crct")){
        try{
        String name= nm.getText();
        int emmid=Integer.parseInt(eid.getText());
        String faculty=(String) fac.getSelectedItem();
        String department=dep.getText();
        String center=(String) cen.getSelectedItem();
        String building=(String) buil.getSelectedItem();
        int level =Integer.parseInt((String) levelCombo.getSelectedItem());
        String rank123= rank.getText();
        int id=Integer.parseInt(edit_id.getText());
            editlecturer(id,name,emmid,faculty,department,center,building,level,rank123);
        
        }catch(Exception e){
        Error ob =new Error();
        ob.setVisible(true);
        }
        }
    }//GEN-LAST:event_updateLecActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        mainframe ob=new mainframe();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        mainframe ob=new mainframe();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed
    private void deletelec(int id){
        try {
            con = dbdetail.getCon();
            ps26=con.prepareStatement("delete from lec where id=?");
            ps26.setInt(1,id);
            ps26.execute();
            
            Lecturer_view ob=new Lecturer_view();
            ob.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void editlecturer(int id,String name,int emmid,String faculty,String department,String center,String building,int level,String rank_y){
                
         try {
                        System.out.println("hello1");    
                        con = dbdetail.getCon();
                        //UPDATE addEvent5 SET ename = ? ,information=?,schools=?,noSeats=?, noStudents=?, noTeachers=?, materials=? WHERE eid=? 
                       // ps3 = con.prepareStatement("insert into lec(name,emmid,faculty,department,center,building,level,rank123) values(?,?,?,?,?,?,?,?) where id=? ");
                        ps3 = con.prepareStatement("UPDATE lec SET name=?,emmid=?,faculty=?,department=?,center=?,building=?,level=?,rank123=?  where id=? ");
                        ps3.setString(1,name);
                        ps3.setInt(2, emmid);
                        ps3.setString(3, faculty);
                        ps3.setString(4, department);
                        ps3.setString(5, center);
                        ps3.setString(6, building);
                        ps3.setInt(7, level);
                        ps3.setString(8, rank_y);
                        ps3.setInt(9, id);
                        ps3.execute();
                        System.out.println("hello");
        
            con.setAutoCommit(false);
            con.close();
         } catch (SQLException ex) {
             Logger.getLogger(lecturers.class.getName()).log(Level.SEVERE, null, ex);
         }
     Lecturer_view ob=new Lecturer_view();
     ob.setVisible(true);
     this.dispose();
       
    
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
            java.util.logging.Logger.getLogger(Lecturer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecturer_view().setVisible(true);
            }
        });
    }
    
    private void show_lec(){
    DefaultTableModel model1 =(DefaultTableModel)lecView.getModel();
        Object[] row=new Object[10];
        
        ArrayList<Lecturer> ar= getLecs();
        
        for(Object x:ar){
            Lecturer object=new Lecturer();
            object = (Lecturer) x;
         row[0]=object.getId();    
        row[1]=object.getName();
        row[2]=object.getEmmid();
        row[3]=object.getFaculty();
        row[4]=object.getDepartment();
        row[5]=object.getBuiding();
        row[6]=object.getCenter();
        row[7]=object.getLevel();
        row[8]=object.getRank123();
       
        model1.addRow(row);
        }
}
    private ArrayList<Lecturer> getLecs(){
         ArrayList arr=new ArrayList();
        try {
           
            
            
            con = dbdetail.getCon();
            ps1 = con.prepareStatement("select name,emmid,faculty,department,center,building,level,rank123,id from lec");
            ResultSet rs12 = ps1.executeQuery();
            
            while (rs12.next()) {
                //name+emmid+faculty+department+center+building+level+rank123
                Lecturer ar=new Lecturer();
                ar.setName(rs12.getString(1));
                ar.setEmmid(rs12.getInt(2));
                ar.setFaculty(rs12.getString(3));
                ar.setDepartment(rs12.getString(4));
                ar.setCenter(rs12.getString(5));
                ar.setBuiding(rs12.getString(6));
                ar.setLevel(rs12.getInt(7));
                ar.setRank123(rs12.getString(8));
                ar.setId(rs12.getInt(9));
                
                arr.add(ar);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    private void display(int id){
    //getOneLec(id);
    Lecturer object=new Lecturer();
    object = getOneLec(id);
    
        nm.setText(object.getName());
        String eid1 = String.valueOf(object.getEmmid());
        eid.setText(eid1);
        fac.setSelectedItem(object.getFaculty());
        dep.setText(object.getDepartment());
        cen.setSelectedItem(object.getCenter());
        buil.setSelectedItem(object.getBuiding());
        
        String level1 = String.valueOf(object.getLevel());
        levelCombo.setSelectedItem(level1);
        /*String rank1 = String.valueOf(object.getRank123());
        rank.setText(rank1);*/
        rank.setText(object.getRank123());
        
    
    }
     private Lecturer getOneLec(int id){
         Lecturer ar=new Lecturer();
        try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select name,emmid,faculty,department,center,building,level,rank123,id from lec where id=?");
             ps2.setInt(1, id);
            ResultSet rs11 = ps2.executeQuery();
             while (rs11.next()) {
                //name+emmid+faculty+department+center+building+level+rank123
                
                ar.setName(rs11.getString(1));
                ar.setEmmid(rs11.getInt(2));
                ar.setFaculty(rs11.getString(3));
                ar.setDepartment(rs11.getString(4));
                ar.setCenter(rs11.getString(5));
                ar.setBuiding(rs11.getString(6));
                ar.setLevel(rs11.getInt(7));
                ar.setRank123(rs11.getString(8));
                ar.setId(rs11.getInt(9));
               
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
    }
     private String rank(){
    try{
          String empid = eid.getText();  
          
          int count=empid.length();
          System.out.print("len"+count);
          
          String level= (String) levelCombo.getSelectedItem();
          
          float id = Float.parseFloat(empid);
          
          if(count==6 && !level.equals("Select")){
          
          String dis=level+"."+empid;
            rank.setText(dis);
            return "crct";
         
          }else {
              System.out.println("inside");
          Error ob123=new Error();
          ob123.setVisible(true);
          }
            
         }catch(Exception e){
             System.out.println("inside");
          Error ob123=new Error();
          ob123.setVisible(true);
          
         }
    return "flse";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteLec;
    private javax.swing.JComboBox buil;
    private javax.swing.JComboBox cen;
    private javax.swing.JTextField dep;
    private javax.swing.JTextField edit_id;
    private javax.swing.JTextField eid;
    private javax.swing.JComboBox fac;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lecView;
    private javax.swing.JComboBox levelCombo;
    private javax.swing.JTextField nm;
    private javax.swing.JLabel rank;
    private javax.swing.JButton rankbtn;
    private javax.swing.JButton updateLec;
    // End of variables declaration//GEN-END:variables
}

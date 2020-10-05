/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sessions.notavailable;


import com.project.frames.mainframe;
import com.project.s2.DisplayStudentsTimetable;
import com.project.s2.GenarateTimeTableStructure;
import com.project.util.dbdetail;
import com.students.add.ViewStudents;
import java.awt.Dimension;
import java.awt.Toolkit;
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
 * @author OSHANI
 */
public class Group extends javax.swing.JFrame {
    Connection con = null;
    
    PreparedStatement ps = null;
    PreparedStatement ps1;
    PreparedStatement ps2;
    PreparedStatement ps11;
    PreparedStatement ps10;
    PreparedStatement ps3;
    /**
     * Creates new form Group
     */
    public Group() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
         //Main Group ID
        ArrayList arr2 = getGroupID();
        for(Object x:arr2){
          gid.addItem((String) x);
          }
    }

    //Main Group ID
    private ArrayList getGroupID(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps11 = con.prepareStatement("select stuid from students");
             
             ResultSet rs11 = ps11.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gid = new javax.swing.JComboBox<>();
        ADD = new javax.swing.JButton();
        day_select = new javax.swing.JComboBox<>();
        time = new javax.swing.JComboBox<>();
        viewLectures = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        MAIN = new javax.swing.JButton();
        generatetimetablestructure = new javax.swing.JButton();
        view_student_timetable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel7.setText("Not Available");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 218, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lecturer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, -1));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sub Group");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 100, 120, -1));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 0, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Main Group");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 120, -1));

        jPanel6.setBackground(new java.awt.Color(102, 0, 102));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sessions");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 100, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Time");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 24));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Group ID");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 70, 24));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Day");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 40, 24));

        jPanel7.add(gid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, -1));

        ADD.setBackground(new java.awt.Color(102, 0, 255));
        ADD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/add.jpg"))); // NOI18N
        ADD.setText("Add");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel7.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 160, 40));

        day_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mon", "tue", "wed", "thur", "fri", "sat", "sun" }));
        jPanel7.add(day_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 240, -1));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.3", "9.3", "10.3", "11.3", "12.3", "1.3", "2.3", "3.3", "4.5", "5.3", "6.3", "7.0" }));
        jPanel7.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 240, -1));

        viewLectures.setBackground(new java.awt.Color(0, 153, 102));
        viewLectures.setForeground(new java.awt.Color(255, 255, 255));
        viewLectures.setText("View Student IDs");
        viewLectures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLecturesActionPerformed(evt);
            }
        });
        jPanel7.add(viewLectures, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 130, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 600, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 700, 510));

        jPanel5.setBackground(new java.awt.Color(102, 0, 102));

        MAIN.setBackground(new java.awt.Color(204, 204, 255));
        MAIN.setText("Main Menu");
        MAIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        MAIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAINActionPerformed(evt);
            }
        });

        generatetimetablestructure.setBackground(new java.awt.Color(255, 255, 255));
        generatetimetablestructure.setText("Generate Timetable Structure");
        generatetimetablestructure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        generatetimetablestructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatetimetablestructureActionPerformed(evt);
            }
        });

        view_student_timetable.setBackground(new java.awt.Color(255, 255, 255));
        view_student_timetable.setText("View Student Timetable");
        view_student_timetable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        view_student_timetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_student_timetableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generatetimetablestructure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(view_student_timetable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generatetimetablestructure, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(view_student_timetable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Lecture l=new Lecture();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Session se=new Session();
        se.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Group g=new Group();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Subgroup g2=new Subgroup();
        g2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try {
            String grpid=(String)gid.getSelectedItem();
            String tim2=(String)time.getSelectedItem();
            String cid=(String) day_select.getSelectedItem();
          
            con = (Connection) dbdetail.getCon();
            
            
            String  sql = "UPDATE stu_timetable"
                        + " SET `" + cid + "` = ?"
                        + " WHERE timeslot = ? AND stuid=?";
                        con = dbdetail.getCon();
                        
            ps1 = con.prepareStatement(sql);
            ps1.setString(1, "Not Available");
            ps1.setString(2,tim2);
            ps1.setString(3, grpid);
            
            /*if(mon.isSelected()){
                Monday = "Not Available";     
            }
            ps1.setString(3, Monday);
            if(tue.isSelected()){
                Tuesday = "Not Available";     
            }
            ps1.setString(4, Tuesday);   
            if(wed.isSelected()){
                Wednesday = "Not Available";     
            }
            ps1.setString(5, Wednesday);
            if(thur.isSelected()){
                Thursday = "Not Available";     
            }
            ps1.setString(6, Thursday);
            if(fri.isSelected()){
                Friday = "Not Available";     
            }
            ps1.setString(7, Friday);  
            if(sat.isSelected()){
                Saturday = "Not Available";     
            }
            ps1.setString(8, Saturday);    
            if(sun.isSelected()){
                Sunday = "Not Available";     
            }
            ps1.setString(9, Sunday);*/

            ps1.execute();
            JOptionPane.showMessageDialog(null, "Data Update Successful");

            Group add=new  Group();
            this.setVisible(false);
            add.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void MAINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAINActionPerformed
        mainframe ob=new mainframe();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MAINActionPerformed

    private void generatetimetablestructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatetimetablestructureActionPerformed
        GenarateTimeTableStructure ob9=new GenarateTimeTableStructure();
        ob9.setVisible(true);
    }//GEN-LAST:event_generatetimetablestructureActionPerformed

    private void view_student_timetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_student_timetableActionPerformed
        DisplayStudentsTimetable ob1=new DisplayStudentsTimetable();
        ob1.setVisible(true);
    }//GEN-LAST:event_view_student_timetableActionPerformed

    private void viewLecturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLecturesActionPerformed
        ViewStudents ob=new ViewStudents();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewLecturesActionPerformed

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
            java.util.logging.Logger.getLogger(Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Group().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton MAIN;
    private javax.swing.JComboBox<String> day_select;
    private javax.swing.JButton generatetimetablestructure;
    private javax.swing.JComboBox<String> gid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JButton viewLectures;
    private javax.swing.JButton view_student_timetable;
    // End of variables declaration//GEN-END:variables
}
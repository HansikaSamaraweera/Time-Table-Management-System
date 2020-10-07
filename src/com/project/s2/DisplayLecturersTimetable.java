/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.s2;

import com.project.frames.ViewWorkingDays_new;
import com.project.model.DayDetails;
import com.project.model.LectuersStructure;
import com.project.model.Lecturer;
import com.project.model.RoomStructure;
import com.project.model.StudentStructure;
import com.project.util.dbdetail;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vnaso
 */
public class DisplayLecturersTimetable extends javax.swing.JFrame {

    /**
     * Creates new form DisplayTimetable
     */
     private static Connection con;
    private PreparedStatement ps1;
    public DisplayLecturersTimetable() {
        initComponents();
        makeFrameFullSize(this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        roomstructure_tab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        r_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        show_room_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        roomstructure_tab.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        roomstructure_tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Raw ID", "ID", "Time Slot", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomstructure_tab.setRowHeight(100);
        jScrollPane1.setViewportView(roomstructure_tab);
        if (roomstructure_tab.getColumnModel().getColumnCount() > 0) {
            roomstructure_tab.getColumnModel().getColumn(0).setMaxWidth(30);
            roomstructure_tab.getColumnModel().getColumn(1).setMaxWidth(30);
            roomstructure_tab.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jLabel1.setText("Lectuerer ID");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Lectuerer Time Table");

        show_room_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show_room_name, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(r_id, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_room_name, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeFrameFullSize(JFrame aFrame)
{
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    aFrame.setSize(screenSize.width, screenSize.height);
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //new method
        int lid=Integer.parseInt(r_id.getText());
        getLectuerName(lid);
        DefaultTableModel model1 =(DefaultTableModel)roomstructure_tab.getModel();
        
        while (model1.getRowCount() > 0){
        for (int i = 0; i < model1.getRowCount(); ++i){
            model1.removeRow(i);
        }
        }
        
        
        Object[] row=new Object[10];
        
        ArrayList<LectuersStructure> ar= getStudentStr(lid);
        
        for(Object x:ar){
            LectuersStructure object=new LectuersStructure();
            object = (LectuersStructure) x;
         row[0]=object.getId();    
        row[1]=object.getLec();
        row[2]=object.getTimeslot();
        row[3]=object.getMon();
        row[4]=object.getTue();
        row[5]=object.getWed();
        row[6]=object.getThur();
        row[7]=object.getFri();
        row[8]=object.getSat();
        row[9]=object.getSun();
       
        model1.addRow(row);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   private void getLectuerName(int rid){
         try {
             con = dbdetail.getCon();
             ps1 = con.prepareStatement("select name from lec where id=?");
             ps1.setInt(1,rid);
             ResultSet rs12 = ps1.executeQuery();
             
             while (rs12.next()) {
                 //name+emmid+faculty+department+center+building+level+rank123
                 
                 show_room_name.setText(rs12.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(DisplayLecturersTimetable.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
    private ArrayList<LectuersStructure> getStudentStr(int rid){
         ArrayList arr=new ArrayList();
        try {
            con = dbdetail.getCon();
            ps1 = con.prepareStatement("select id,lecid,timeslot,mon,tue,wed,thur,fri,sat,sun from lec_timetable where lecid=?");
            ps1.setInt(1,rid);
            ResultSet rs12 = ps1.executeQuery();
            
            while (rs12.next()) {
                //name+emmid+faculty+department+center+building+level+rank123
                LectuersStructure ar=new LectuersStructure();
                ar.setId(rs12.getInt(1));
                ar.setLec(rs12.getInt(2));
                ar.setTimeslot(rs12.getFloat(3));
                ar.setMon(rs12.getString(4));
                ar.setTue(rs12.getString(5));
                ar.setWed(rs12.getString(6));
                ar.setThur(rs12.getString(7));
                ar.setFri(rs12.getString(8));
                ar.setSat(rs12.getString(9));
                ar.setSun(rs12.getString(10));
                arr.add(ar);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DisplayLecturersTimetable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
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
            java.util.logging.Logger.getLogger(DisplayLecturersTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayLecturersTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayLecturersTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayLecturersTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayLecturersTimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField r_id;
    private javax.swing.JTable roomstructure_tab;
    private javax.swing.JLabel show_room_name;
    // End of variables declaration//GEN-END:variables
}

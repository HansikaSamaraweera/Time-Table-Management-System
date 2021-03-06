/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.sessions;


import com.project.frames.Lecturer_view;
import com.project.frames.mainframe;
import com.project.model.Session;
import com.project.parallelSession.ParallelSession;
import com.project.s2.ViewSessions;
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
import javax.swing.JOptionPane;

/**
 *
 * @author OSHANI
 */
public class NOTOVERLAPSESSION extends javax.swing.JFrame {
    Connection con = null;
    
    PreparedStatement ps = null;
    PreparedStatement ps11;
    PreparedStatement ps12;
    PreparedStatement ps1;
    PreparedStatement ps29;
    PreparedStatement ps9;
    PreparedStatement ps2;
    /**
     * Creates new form NOTOVERLAPSESSION
     */
    public NOTOVERLAPSESSION() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        
        displayId();
        
        //Database Connection
        con = (Connection) dbdetail.getCon();
        
        //SESSION 1
        ArrayList arr2 = getId_s1();
        for(Object x:arr2){
          s1.addItem((String) x);
          }
        
        //SESSION2
        ArrayList arr4 = getId_s2();
        for(Object y:arr4){
          s2.addItem((String) y);
          }
    }
    
    private ArrayList getId_s1(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps11 = con.prepareStatement("select id from sessions");
             
             ResultSet rs11 = ps11.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(NOTOVERLAPSESSION.class.getName()).log(Level.SEVERE, null, ex);
         }
          return arr;  
    
    }

    private ArrayList getId_s2(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps11 = con.prepareStatement("select id from sessions");
             
             ResultSet rs11 = ps11.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(NOTOVERLAPSESSION.class.getName()).log(Level.SEVERE, null, ex);
         }
          return arr;  
    
    }
    
    private int displayId(){
         con = dbdetail.getCon();
         try {
             ps12= con.prepareStatement("select npid from notOverlap where npid >= all (select npid from notOverlap)");
             ResultSet rs12 = ps12.executeQuery();
             int x=0;
            while (rs12.next()) {
                
                x=rs12.getInt(1);
                x++;
                
                
            }
            String y=String.valueOf(x);
            nid.setText(y);
            
            return x;
         } catch (SQLException ex) {
             Logger.getLogger(NOTOVERLAPSESSION.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
           
           return -99; 
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
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        s2 = new javax.swing.JComboBox<>();
        s1 = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nid = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        time = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        main = new javax.swing.JButton();
        parallel = new javax.swing.JButton();
        notoverlap = new javax.swing.JButton();
        consecutive = new javax.swing.JButton();
        viewLectures2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel7.setText("Not Overlap Sessions");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 260, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Add  Session ID 2");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, 24));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Add Session ID 1");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 24));

        jPanel7.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, -1));

        jPanel7.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 260, -1));

        add.setBackground(new java.awt.Color(102, 0, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/add.jpg"))); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel7.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 120, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText(" ID");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, 24));
        jPanel7.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 260, 20));

        view.setBackground(new java.awt.Color(102, 0, 255));
        view.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/view.png"))); // NOI18N
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel7.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 130, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Day");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 50, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Time");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mon", "tue", "wed", "thur", "fri", "sat", "sun" }));
        jPanel7.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 260, -1));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.3", "9.3", "10.3", "11.3", "12.3", "1.3", "2.3", "3.3", "4.5", "5.3", "6.3", "7.0" }));
        jPanel7.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 260, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 600, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 700, 510));

        jPanel12.setBackground(new java.awt.Color(102, 0, 102));

        main.setBackground(new java.awt.Color(204, 204, 255));
        main.setText("Main Menu");
        main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });

        parallel.setBackground(new java.awt.Color(102, 0, 102));
        parallel.setForeground(new java.awt.Color(255, 255, 255));
        parallel.setText("Parallel Session");
        parallel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        parallel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelActionPerformed(evt);
            }
        });

        notoverlap.setBackground(new java.awt.Color(102, 0, 102));
        notoverlap.setForeground(new java.awt.Color(255, 255, 255));
        notoverlap.setText("Not Overlap Session");
        notoverlap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        notoverlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notoverlapActionPerformed(evt);
            }
        });

        consecutive.setBackground(new java.awt.Color(102, 0, 102));
        consecutive.setForeground(new java.awt.Color(255, 255, 255));
        consecutive.setText("Consecutive Session");
        consecutive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        consecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consecutiveActionPerformed(evt);
            }
        });

        viewLectures2.setBackground(new java.awt.Color(102, 0, 102));
        viewLectures2.setForeground(new java.awt.Color(255, 255, 255));
        viewLectures2.setText("View Session IDs");
        viewLectures2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLectures2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parallel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notoverlap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consecutive, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(viewLectures2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parallel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notoverlap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewLectures2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int no=callAddNotOverlapSessions();
        if(no==-56){
        JOptionPane.showMessageDialog(null, "Please select different Sessions.");
        }else if(no==-34){
        JOptionPane.showMessageDialog(null, "2 sessions durations are not same.");
        }
    }//GEN-LAST:event_addActionPerformed

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        mainframe ob=new mainframe();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mainActionPerformed

    private void parallelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelActionPerformed
        ParallelSession p=new ParallelSession();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_parallelActionPerformed

    private void notoverlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notoverlapActionPerformed
        NOTOVERLAPSESSION b=new NOTOVERLAPSESSION();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_notoverlapActionPerformed

    private void consecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consecutiveActionPerformed
        ConsecutiveSession a=new ConsecutiveSession();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consecutiveActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        addnotOverlapSession ss23=new addnotOverlapSession();
        ss23.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewActionPerformed

    private void viewLectures2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLectures2ActionPerformed
        ViewSessions ob=new ViewSessions();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewLectures2ActionPerformed

    private int callAddNotOverlapSessions(){
        try{
            
        String n1=(String) s1.getSelectedItem();
        int n2=Integer.parseInt(n1);
        String c1=(String) s2.getSelectedItem();
        int c2=Integer.parseInt(c1);
        String cid=(String) day.getSelectedItem();
        String tim2=(String)time.getSelectedItem();
        
        Session ob33= getOneDetailSession(n2);
        String s4=ob33.getS_grp();
        int du1=ob33.getDuration();
        
        Session ob45= getOneDetailSession(c2);
        String s5=ob45.getS_grp();
        int du2=ob45.getDuration();
         
        if(n2==c2){
           // JOptionPane.showMessageDialog(null, "Please select different Sessions.");
           // int yyy=Integer.parseInt("sd");
            return -56;
        }else if(du1!=du2){
        //JOptionPane.showMessageDialog(null, "2 sessions durations are not same.");
            return -34;
        }
        /*else
        if(s4.equals(s5)){
       
       // JOptionPane.showMessageDialog(null, "Selected sessions cannot add as not overlap.");
        // int xxx=Integer.parseInt("sd");
            return -99;
        }*/
        
        int x=0;
        
            ps9 = con.prepareStatement("select npid from notOverlap where npid >= all (select npid from notOverlap)");

            ResultSet rs1 = ps9.executeQuery();

            while (rs1.next()) {

                x=rs1.getInt(1);
                x++;

            }

            String q = "INSERT INTO notOverlap (npid,session1,session2,time,date) values (?,?,?,?,?)";
            ps = con.prepareStatement(q);
            ps.setInt(1, x);
            ps.setString(2,n1);
            ps.setString(3,c1);
            ps.setString(4,tim2);
            ps.setString(5,cid);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data Save Successfully");
            NOTOVERLAPSESSION ob4=new  NOTOVERLAPSESSION();
            ob4.setVisible(true);
            this.setVisible(false);
            
            UpdateSessions();

        }  catch (Exception ex) {
            //Logger.getLogger(ParallelSession.class.getName()).log(Level.SEVERE, null, ex);
             //JOptionPane.showMessageDialog(null, "Selected sessions cannot add as parralel.Sudents group need to be same.");
        }
         return 0;
    
    }
    
    private Session getOneDetailSession(int id){
        Session ar=new Session();
        try {
           con = dbdetail.getCon();
            ps2 = con.prepareStatement("select id,lec,tag,s_grp,sub_grp,subject_c,no_students,duration,status from sessions where id=?");
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
                ar.setStatus(rs11.getString(9));
                
               
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
    }
    
    private void UpdateSessions(){
        String n1=(String) s1.getSelectedItem();
            int n2=Integer.parseInt(n1);
            String c1=(String) s2.getSelectedItem();
             int c2=Integer.parseInt(c1); 
        try {
            
       
            con = (Connection) dbdetail.getCon();
            ps9 = con.prepareStatement("UPDATE sessions SET status=?  WHERE id=? ");
            ps9.setString(1,"Check,"+n2+","+c2);
            //ps9.setString(1,"parallel,"+n2+","+c2);
            ps9.setInt(2,n2);
            //ps1.setString(2,idd);

            ps9.execute();
            //JOptionPane.showMessageDialog(null, "View Parallel Session");

            /*ViewSessions add=new  ViewSessions();
            this.setVisible(false);
            add.setVisible(true);*/

        } catch (SQLException ex) {
            //Logger.getLogger(ViewSessions.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
             
            con = (Connection) dbdetail.getCon();
            ps9 = con.prepareStatement("UPDATE sessions SET status=?  WHERE id=? ");
            ps9.setString(1,"Check,"+n2+","+c2);
            ps9.setInt(2,c2);
            //ps1.setString(2,idd);

            ps9.execute();
            JOptionPane.showMessageDialog(null, "View Not Overlap Session");

            addnotOverlapSession add=new  addnotOverlapSession();
            this.setVisible(false);
            add.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(addnotOverlapSession.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(NOTOVERLAPSESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NOTOVERLAPSESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NOTOVERLAPSESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NOTOVERLAPSESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NOTOVERLAPSESSION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton consecutive;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton main;
    private javax.swing.JLabel nid;
    private javax.swing.JButton notoverlap;
    private javax.swing.JButton parallel;
    private javax.swing.JComboBox<String> s1;
    private javax.swing.JComboBox<String> s2;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JButton view;
    private javax.swing.JButton viewLectures2;
    // End of variables declaration//GEN-END:variables
}

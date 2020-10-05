/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.parallelSession;

import com.project.frames.Lecturer_view;
import com.project.frames.mainframe;
import com.project.model.Session;
import com.project.s2.ViewSessions;
import com.project.sessions.ConsecutiveSession;
import com.project.sessions.NOTOVERLAPSESSION;
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
public class ParallelSession extends javax.swing.JFrame {
    Connection con = null;
    
    PreparedStatement ps = null;
    PreparedStatement ps29;
    PreparedStatement ps12;
    PreparedStatement ps9;
    PreparedStatement ps2;
    /**
     * Creates new form ParallelSession
     */
    public ParallelSession() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        displayId();
        
        //Database Connection
        con = (Connection) dbdetail.getCon();
        
        //SESSION ID 1
        ArrayList arr2 = getNormalSessionId();
        for(Object x:arr2){
          ns.addItem((String) x);
          }
        
        //SESSION ID 2
        ArrayList arr4 = getConSessionId();
        for(Object y:arr4){
          cs.addItem((String) y);
          }
    }

    
    private ArrayList getNormalSessionId(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps29 = con.prepareStatement("select id from sessions where  sub_grp!='null'");
             
             ResultSet rs11 = ps29.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(ParallelSession.class.getName()).log(Level.SEVERE, null, ex);
         }
          return arr;  
    
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
    
    private ArrayList getConSessionId(){
        
        ArrayList arr=new ArrayList();
         try {
             
             
             con = dbdetail.getCon();
             
             
             ps29 = con.prepareStatement("select id from sessions where sub_grp!='null'");
             
             ResultSet rs11 = ps29.executeQuery();
             
             while (rs11.next()) {
                 
                 arr.add(rs11.getString(1));
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(ParallelSession.class.getName()).log(Level.SEVERE, null, ex);
         }
          return arr;  
    
    }
    
    private int displayId(){
         con = dbdetail.getCon();
         try {
            ps12= con.prepareStatement("select pid from parallel where pid >= all (select pid from parallel)");
            ResultSet rs12 = ps12.executeQuery();
            int x=0;
            while (rs12.next()) {
                
                x=rs12.getInt(1);
                x++;
    
            }
            String y=String.valueOf(x);
            pid.setText(y);
            
            return x;
            } catch (SQLException ex) {
                Logger.getLogger(ParallelSession.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ns = new javax.swing.JComboBox<>();
        cs = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        parallel = new javax.swing.JButton();
        notoverlap = new javax.swing.JButton();
        consecutive = new javax.swing.JButton();
        viewLectures = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel6.setText("Parallel Sessions");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Session ID 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Session ID 2");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("ID");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cs, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ns, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 660, 550));

        jPanel12.setBackground(new java.awt.Color(102, 0, 102));

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setText("Main Menu");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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

        viewLectures.setBackground(new java.awt.Color(102, 0, 102));
        viewLectures.setForeground(new java.awt.Color(255, 255, 255));
        viewLectures.setText("View Session IDs");
        viewLectures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLecturesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parallel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notoverlap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consecutive, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(viewLectures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parallel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notoverlap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int no=callAddParallelSessions();
        if(no==-56){
        JOptionPane.showMessageDialog(null, "Please select different Sessions.");
        }else if(no==-34){
        JOptionPane.showMessageDialog(null, "2 sessions durations are not same.");
        }else if(no==-99){
        JOptionPane.showMessageDialog(null, "Selected sessions cannot add as parallel.Sudents group need to be same.");
        }
    }//GEN-LAST:event_addActionPerformed

    private int callAddParallelSessions(){
        try{
            
        String n1=(String) ns.getSelectedItem();
        int n2=Integer.parseInt(n1);
        String c1=(String) cs.getSelectedItem();
        int c2=Integer.parseInt(c1);
        
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
        else
        if(!s4.equals(s5)){
            // JOptionPane.showMessageDialog(null, "Selected sessions cannot add as parralel.Sudents group need to be same.");
            // int xxx=Integer.parseInt("sd");
            return -99;
        }
        
        int x=0;
        
            ps9 = con.prepareStatement("select pid from parallel where pid >= all (select pid from parallel)");

            ResultSet rs1 = ps9.executeQuery();

            while (rs1.next()) {

                x=rs1.getInt(1);
                x++;

            }

            String q = "INSERT INTO parallel (pid,norid1,norid2) values (?,?,?)";
            ps = con.prepareStatement(q);
            ps.setInt(1, x);
            ps.setString(2,n1);
            ps.setString(3,c1);

            ps.execute();

            JOptionPane.showMessageDialog(null, "successfully created parallel session");
            ParallelSession ob4=new  ParallelSession();
            ob4.setVisible(true);
            this.setVisible(false);
            
            UpdateSessions();

        }  catch (Exception ex) {
            //Logger.getLogger(ParallelSession.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Selected sessions cannot add as parralel.Sudents group need to be same.");
        }
         return 0;
    
    }
    private void UpdateSessions(){
        String n1=(String) ns.getSelectedItem();
            int n2=Integer.parseInt(n1);
            String c1=(String) cs.getSelectedItem();
            int c2=Integer.parseInt(c1); 
        try {
            
       
            con = (Connection) dbdetail.getCon();
            ps9 = con.prepareStatement("UPDATE sessions SET status=?  WHERE id=? ");
            ps9.setString(1,"parallel,"+n2+","+c2);
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
            ps9.setString(1,"parallel,"+n2+","+c2);
            ps9.setInt(2,c2);
            //ps1.setString(2,idd);

            ps9.execute();
            //JOptionPane.showMessageDialog(null, "View Parallel Session");

            addParallelSession add=new  addParallelSession();
            this.setVisible(false);
            add.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(addParallelSession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        addParallelSession add=new  addParallelSession();
        this.setVisible(false);
        add.setVisible(true);   
    }//GEN-LAST:event_viewActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        mainframe ob=new mainframe();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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

    private void viewLecturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLecturesActionPerformed
        ViewSessions ob=new ViewSessions();
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
            java.util.logging.Logger.getLogger(ParallelSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParallelSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParallelSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParallelSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParallelSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton consecutive;
    private javax.swing.JComboBox<String> cs;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton notoverlap;
    private javax.swing.JComboBox<String> ns;
    private javax.swing.JButton parallel;
    private javax.swing.JLabel pid;
    private javax.swing.JButton view;
    private javax.swing.JButton viewLectures;
    // End of variables declaration//GEN-END:variables
}

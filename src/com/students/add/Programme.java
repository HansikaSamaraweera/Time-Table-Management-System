/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.add;

import com.project.frames.mainframe;
import com.project.util.dbdetail;
import com.students.services.acdemicprogramme;
import com.students.update.Edit_Programme;
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
public class Programme extends javax.swing.JFrame {
Connection con = null;
    
    PreparedStatement ps = null;
    PreparedStatement ps1;
    PreparedStatement ps2;
    PreparedStatement ps3;
    PreparedStatement ps12;
    /**
     * Creates new form Programme
     */
    public Programme() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        //Database Connection
        con = (Connection) dbdetail.getCon();
        
        show_programmes();
        idd1.setVisible(false);
    }

    public ArrayList<acdemicprogramme> addProgrammes()
    {
        ArrayList<acdemicprogramme> newTags=new ArrayList<>();
        try{
            con = (Connection) dbdetail.getCon();
            String query="select * from programme";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            
            acdemicprogramme pros;
            
            while(rs.next()){
                pros=new acdemicprogramme(rs.getInt("pid"),rs.getString("programme"));
                newTags.add(pros); 
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return newTags;

    }

public void show_programmes(){
        ArrayList<acdemicprogramme> list=addProgrammes();
        DefaultTableModel model=(DefaultTableModel)viepro.getModel();
        
        Object[] row=new Object[3];
        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getprogramme();
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
                DefaultTableModel model=(DefaultTableModel)viepro.getModel();
                model.setRowCount(0);
                show_programmes();
                
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

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pro = new javax.swing.JTextField();
        programme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viepro = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        idd = new javax.swing.JLabel();
        idd1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        prog = new javax.swing.JButton();
        g = new javax.swing.JButton();
        yand = new javax.swing.JButton();
        sub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Programme");

        pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proMouseClicked(evt);
            }
        });

        programme.setBackground(new java.awt.Color(102, 0, 255));
        programme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        programme.setForeground(new java.awt.Color(255, 255, 255));
        programme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/add.jpg"))); // NOI18N
        programme.setText("Add");
        programme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmeActionPerformed(evt);
            }
        });

        viepro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Programme"
            }
        ));
        viepro.setSelectionBackground(new java.awt.Color(204, 204, 204));
        viepro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vieproMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viepro);

        edit.setBackground(new java.awt.Color(102, 0, 255));
        edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/edit.png"))); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 0, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/delete.jpg"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(programme, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(idd)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idd1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(idd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(idd)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(programme, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 640, 500));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel4.setText("Programme");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 60));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jPanel12.setBackground(new java.awt.Color(102, 0, 102));

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setText("Main Menu");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        prog.setBackground(new java.awt.Color(102, 0, 102));
        prog.setForeground(new java.awt.Color(255, 255, 255));
        prog.setText("Programme");
        prog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progActionPerformed(evt);
            }
        });

        g.setBackground(new java.awt.Color(102, 0, 102));
        g.setForeground(new java.awt.Color(255, 255, 255));
        g.setText("Group");
        g.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        yand.setBackground(new java.awt.Color(102, 0, 102));
        yand.setForeground(new java.awt.Color(255, 255, 255));
        yand.setText("Year and Semester");
        yand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        yand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yandActionPerformed(evt);
            }
        });

        sub.setBackground(new java.awt.Color(102, 0, 102));
        sub.setForeground(new java.awt.Color(255, 255, 255));
        sub.setText("Subgroup");
        sub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(prog, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(g, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(yand, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yand, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proMouseClicked

    }//GEN-LAST:event_proMouseClicked

    private void programmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmeActionPerformed
        String prog=(String) pro.getText();

        if(pro.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Error!!!...Please Fill the Fields...");   
        }
        else{
        int x=0;
        try{
            ps1 = con.prepareStatement("select pid from programme where pid >= all (select pid from programme)");

            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()) {

                x=rs1.getInt(1);
                x++;

            }

            String q = "INSERT INTO programme (pid,programme) values (?,?)";
            ps = con.prepareStatement(q);
            ps.setInt(1, x);
            ps.setString(2,prog);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Add");
            Programme p1=new  Programme();
            p1.setVisible(true);
            this.setVisible(false);

        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "");
            Logger.getLogger(Programme.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }//GEN-LAST:event_programmeActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        Edit_Programme proed=new Edit_Programme();
        proed.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int selectedForEdit = viepro.getSelectedRow();
        TableModel model=viepro.getModel();
        if(selectedForEdit==-1){
            JOptionPane.showMessageDialog(null,"No row selected!!!");
        }
        else{
           proed.setVisible(true); 
        }
        
        String idd=model.getValueAt(selectedForEdit,0).toString();
        String y=model.getValueAt(selectedForEdit,1).toString();


        proed.id.setText(idd);
        proed.pro.setText(y);

    }//GEN-LAST:event_editActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         int id= Integer.parseInt(idd1.getText());
        System.out.print(id);
        try {
            con = (Connection) dbdetail.getCon();
            ps2=con.prepareStatement("delete from programme where pid=?");
            ps2.setInt(1,id);
            ps2.execute();
            JOptionPane.showConfirmDialog(null, "Are you want to delete this item?");
            Programme ad=new Programme();
            ad.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(Programme.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void vieproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vieproMouseClicked
        int i=viepro.getSelectedRow();
        TableModel model=viepro.getModel();
        idd1.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_vieproMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        mainframe ob=new mainframe();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progActionPerformed
        Programme p=new Programme();
        p.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_progActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        GroupNo b=new GroupNo();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gActionPerformed

    private void yandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yandActionPerformed
        AcademicYearandSemester a=new AcademicYearandSemester();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_yandActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        SubGroupNo r=new SubGroupNo();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_subActionPerformed

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
            java.util.logging.Logger.getLogger(Programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JButton g;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idd;
    private javax.swing.JTextField idd1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pro;
    private javax.swing.JButton prog;
    private javax.swing.JButton programme;
    private javax.swing.JButton sub;
    private javax.swing.JTable viepro;
    private javax.swing.JButton yand;
    // End of variables declaration//GEN-END:variables
}

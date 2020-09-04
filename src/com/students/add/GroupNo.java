/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.add;

import com.project.frames.mainframe;
import com.project.util.dbdetail;
import com.students.services.group;
import com.students.update.Edit_Group;
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
 * @author OSHANI
 */
public class GroupNo extends javax.swing.JFrame {
Connection con = null;
    
    PreparedStatement ps = null;
    PreparedStatement ps1;
    PreparedStatement ps2;

    /**
     * Creates new form GroupNo
     */
    public GroupNo() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        //Database Connection
        con = (Connection) dbdetail.getCon();
        
        idd.setVisible(false);
        
        show_groups();
        
    }

    public ArrayList<group> addMainGroup()
    {
        ArrayList<group> newMain=new ArrayList<>();
        try{
            con = (Connection) dbdetail.getCon();
            String query="select * from groupNo";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            
            group mainGrp;
            
            while(rs.next()){
                mainGrp=new group(rs.getInt("gid"),rs.getInt("grpno"));
                newMain.add(mainGrp); 
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return newMain;

    }

public void show_groups(){
        ArrayList<group> list=addMainGroup();
        DefaultTableModel model=(DefaultTableModel)viewg.getModel();
        
        Object[] row=new Object[3];
        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getgroupn();
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
                DefaultTableModel model=(DefaultTableModel)viewg.getModel();
                model.setRowCount(0);
                show_groups();
                
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
        jLabel7 = new javax.swing.JLabel();
        gno = new javax.swing.JSpinner();
        groupno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewg = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        idd = new javax.swing.JTextField();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Group No");

        groupno.setBackground(new java.awt.Color(102, 0, 255));
        groupno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        groupno.setForeground(new java.awt.Color(255, 255, 255));
        groupno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/add.jpg"))); // NOI18N
        groupno.setText("Add");
        groupno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupnoActionPerformed(evt);
            }
        });

        viewg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Group No"
            }
        ));
        viewg.setSelectionBackground(new java.awt.Color(204, 204, 204));
        viewg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewg);

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

        Delete.setBackground(new java.awt.Color(102, 0, 255));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/delete.jpg"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(gno, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(groupno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(idd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(groupno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 640, 490));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel4.setText("Main Group");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 60));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupnoActionPerformed
        String groupNo=(String) gno.getValue().toString();
        
        int x=0;
        try{
            ps1 = con.prepareStatement("select gid from groupNo where gid >= all (select gid from groupNo)");

            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()) {

                x=rs1.getInt(1);
                x++;

            }

            String q = "INSERT INTO groupNo (gid,grpno) values (?,?)";
            ps = con.prepareStatement(q);
            ps.setInt(1, x);
            ps.setString(2,groupNo);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Add");
            GroupNo g1=new  GroupNo();
            g1.setVisible(true);
            this.setVisible(false);

        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "");
            Logger.getLogger(GroupNo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_groupnoActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        Edit_Group grp=new Edit_Group();
        grp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int selectedForEdit = viewg.getSelectedRow();
        TableModel model=viewg.getModel();
        if(selectedForEdit==-1){
            JOptionPane.showMessageDialog(null,"No row selected!!!");
        }
        else{
           grp.setVisible(true); 
        }
        
        String idd=model.getValueAt(selectedForEdit,0).toString();
        int gn=(int) model.getValueAt(selectedForEdit,1);



        grp.id.setText(idd);
        grp.gno.setValue(gn);
        
    }//GEN-LAST:event_editActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int p=JOptionPane.showConfirmDialog(null,"Do you want to delete this item?","Delete",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(p==0){
        int id= Integer.parseInt(idd.getText());
        System.out.print(id);
        try {
            con = (Connection) dbdetail.getCon();
            ps2=con.prepareStatement("delete from groupNo where gid=?");
            ps2.setInt(1,id);
            ps2.execute();
            JOptionPane.showConfirmDialog(null, 0);
            GroupNo ad=new GroupNo();
            ad.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(GroupNo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void viewgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewgMouseClicked
        int i=viewg.getSelectedRow();
        TableModel model=viewg.getModel();
        idd.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_viewgMouseClicked

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
            java.util.logging.Logger.getLogger(GroupNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupNo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton g;
    private javax.swing.JSpinner gno;
    private javax.swing.JButton groupno;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idd;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prog;
    private javax.swing.JButton sub;
    private javax.swing.JTable viewg;
    private javax.swing.JButton yand;
    // End of variables declaration//GEN-END:variables
}

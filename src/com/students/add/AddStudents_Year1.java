/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.add;

import com.project.frames.mainframe;
import com.project.util.dbdetail;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oshani
 */
public class AddStudents_Year1 extends javax.swing.JFrame {
    Connection con = null;
    
    PreparedStatement ps = null;
    PreparedStatement ps1;
    PreparedStatement ps2;
    PreparedStatement ps3;
    PreparedStatement ps12;
    /**
     * Creates new form AddStudents_Year1
     */
    public AddStudents_Year1() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        //Database Connection
        con = (Connection) dbdetail.getCon();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        ay = new javax.swing.JTextField();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        pro = new javax.swing.JComboBox<>();
        gno = new javax.swing.JSpinner();
        subno = new javax.swing.JSpinner();
        gid = new javax.swing.JTextField();
        gsubid = new javax.swing.JTextField();
        groupID = new javax.swing.JButton();
        subgroupID = new javax.swing.JButton();
        lbn1 = new javax.swing.JLabel();
        lbn2 = new javax.swing.JLabel();
        lbn3 = new javax.swing.JLabel();
        year1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        year2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        year3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        year4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));

        jLabel29.setText("Year 1");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time Table");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(494, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(322, 322, 322))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setText("Add Students");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(184, 184, 184))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 560, 50));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Semester ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Programme");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Group No");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Group ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Sub-Group No");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Sub-Group ID");

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-save-25.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        view.setBackground(new java.awt.Color(255, 255, 255));
        view.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/icons8-view-25 (1).png"))); // NOI18N
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Academic Year ");

        ay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayMouseClicked(evt);
            }
        });

        s1.setBackground(new java.awt.Color(255, 255, 255));
        s1.setText("Semester 1");
        s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1MouseClicked(evt);
            }
        });

        s2.setBackground(new java.awt.Color(255, 255, 255));
        s2.setText("Semester 2");
        s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2MouseClicked(evt);
            }
        });

        pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "IT", "SE", "ISE", "CS", "DS", "IM", "CSNE" }));
        pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proMouseClicked(evt);
            }
        });

        groupID.setBackground(new java.awt.Color(0, 153, 102));
        groupID.setForeground(new java.awt.Color(255, 255, 255));
        groupID.setText("Generate Group ID");
        groupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupIDActionPerformed(evt);
            }
        });

        subgroupID.setBackground(new java.awt.Color(0, 153, 102));
        subgroupID.setForeground(new java.awt.Color(255, 255, 255));
        subgroupID.setText("Generate Sub-Group ID");
        subgroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subgroupIDActionPerformed(evt);
            }
        });

        lbn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbn1.setForeground(new java.awt.Color(204, 0, 0));

        lbn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbn2.setForeground(new java.awt.Color(204, 0, 0));

        lbn3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbn3.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel19)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(s1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ay, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gsubid, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(subgroupID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(groupID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(s1)
                        .addComponent(s2))
                    .addComponent(lbn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(gid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupID))
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(subno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gsubid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(subgroupID))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 640, 430));

        year1.setBackground(new java.awt.Color(153, 0, 153));
        year1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                year1MousePressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Year 1");

        javax.swing.GroupLayout year1Layout = new javax.swing.GroupLayout(year1);
        year1.setLayout(year1Layout);
        year1Layout.setHorizontalGroup(
            year1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, year1Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        year1Layout.setVerticalGroup(
            year1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 140, 40));

        year2.setBackground(new java.awt.Color(102, 0, 102));
        year2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                year2MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Year 2");

        javax.swing.GroupLayout year2Layout = new javax.swing.GroupLayout(year2);
        year2.setLayout(year2Layout);
        year2Layout.setHorizontalGroup(
            year2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, year2Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        year2Layout.setVerticalGroup(
            year2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 40));

        year3.setBackground(new java.awt.Color(102, 0, 102));
        year3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                year3MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Year 3");

        javax.swing.GroupLayout year3Layout = new javax.swing.GroupLayout(year3);
        year3.setLayout(year3Layout);
        year3Layout.setHorizontalGroup(
            year3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, year3Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        year3Layout.setVerticalGroup(
            year3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(year3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 140, 40));

        year4.setBackground(new java.awt.Color(102, 0, 102));
        year4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                year4MouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Year 4");

        javax.swing.GroupLayout year4Layout = new javax.swing.GroupLayout(year4);
        year4.setLayout(year4Layout);
        year4Layout.setHorizontalGroup(
            year4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, year4Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        year4Layout.setVerticalGroup(
            year4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(year4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 120, 40));

        jPanel9.setBackground(new java.awt.Color(102, 0, 102));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Main Menu");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 590));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/images/l1.PNG"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupIDActionPerformed
        String s = null;
        if(s1.isSelected()==true)
            {
                s="S1";
            }
        if(s2.isSelected()==true){
                s="S2";
            }
        /*else{
            lbn2.setText("This Field is Required");
        }*/
        if(ay.getText().trim().isEmpty()&&pro.getSelectedItem()=="Select One"&&s==null){
            lbn1.setText("This Field is Required");
            lbn2.setText("This Field is Required");
            lbn3.setText("This Field is Required");
            
        }
        else if(ay.getText().trim().isEmpty()){
            lbn1.setText("This Field is Required");
        }
        else if(pro.getSelectedItem()=="Select One"){
            lbn3.setText("This Field is Required");
        }
        else if(s==null){
                lbn2.setText("This Field is Required");      
        }
        else{
        String t=ay.getText()+"."+s+"."+pro.getSelectedItem()+"."+gno.getValue().toString();
        gid.setText(t); 
        }
    }//GEN-LAST:event_groupIDActionPerformed

    private void subgroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgroupIDActionPerformed
        String x = null;
        if(s1.isSelected())
            {
                x="S1";
            }
            if(s2.isSelected()){
                x="S2";
            }
        String z=ay.getText()+"."+x+"."+pro.getSelectedItem()+"."+gno.getValue().toString()+"."+subno.getValue().toString();
        gsubid.setText(z); 
    }//GEN-LAST:event_subgroupIDActionPerformed

    private void ayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayMouseClicked
        ay.setText("Y1");
        lbn1.setText("");
    }//GEN-LAST:event_ayMouseClicked

    private void s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1MouseClicked
        lbn2.setText("");
    }//GEN-LAST:event_s1MouseClicked

    private void s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2MouseClicked
        lbn2.setText("");
    }//GEN-LAST:event_s2MouseClicked

    private void proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proMouseClicked
        lbn3.setText("");
    }//GEN-LAST:event_proMouseClicked

    private void year1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_year1MousePressed
        AddStudents_Year1 y1=new AddStudents_Year1();
        y1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_year1MousePressed

    private void year2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_year2MouseClicked
        AddStudents_Year2 y2=new AddStudents_Year2();
        y2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_year2MouseClicked

    private void year3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_year3MouseClicked
        AddStudents_Year3 y3=new AddStudents_Year3();
        y3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_year3MouseClicked

    private void year4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_year4MouseClicked
        AddStudents_Year4 y4=new AddStudents_Year4();
        y4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_year4MouseClicked

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String year=(String) ay.getText();
        String sem=(String) s1.getText();
        String programme=(String) pro.getSelectedItem();
        String groupNo=(String) gno.getValue().toString();
        String groupid=gid.getText();
        String subNo=(String)subno.getValue().toString();
        String subgrpNo=gsubid.getText();

        int x=0;
        try{
            ps1 = con.prepareStatement("select stuid from students where stuid >= all (select stuid from students)");

            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()) {

                x=rs1.getInt(1);
                x++;

            }

            String q = "INSERT INTO students (stuid,year,semester,programme,grpno,grpid,subgno,subgid) values (?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(q);
            ps.setInt(1, x);
            ps.setString(2,year);
            if(s1.isSelected())
            {
                sem="S1";
            }
            if(s2.isSelected()){
                sem="S2";
            }
            ps.setString(3,sem);
            ps.setString(4,programme);
            ps.setString(5,groupNo);
            ps.setString(6,groupid);
            ps.setString(7,subNo);
            ps.setString(8,subgrpNo);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data Save Successfully");
            AddStudents_Year1 ob1=new  AddStudents_Year1();
            ob1.setVisible(true);
            this.setVisible(false);

        }  catch (SQLException ex) {
            Logger.getLogger(AddStudents_Year1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        ViewStudents view=new ViewStudents();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AddStudents_Year1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudents_Year1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudents_Year1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudents_Year1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudents_Year1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JTextField ay;
    private javax.swing.JTextField gid;
    private javax.swing.JSpinner gno;
    private javax.swing.JButton groupID;
    private javax.swing.JTextField gsubid;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbn1;
    private javax.swing.JLabel lbn2;
    private javax.swing.JLabel lbn3;
    private javax.swing.JComboBox<String> pro;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JButton subgroupID;
    private javax.swing.JSpinner subno;
    private javax.swing.JButton view;
    private javax.swing.JPanel year1;
    private javax.swing.JPanel year2;
    private javax.swing.JPanel year3;
    private javax.swing.JPanel year4;
    // End of variables declaration//GEN-END:variables
}

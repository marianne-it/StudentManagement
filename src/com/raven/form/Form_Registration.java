package com.raven.form;

import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Form_Registration extends JPanel {
 
public Form_Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CB_year = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TXT_mobileNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TXT_email = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        CB_academicYear = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CB_program = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TXT_firstName = new javax.swing.JTextField();
        CB_entryLevel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TXT_studentNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TXT_placeofBirth = new javax.swing.JTextField();
        CB_date = new javax.swing.JComboBox<>();
        TXT_middleName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TXT_lastName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CB_month = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        CB_scholarType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(251, 209, 23));
        jPanel3.setForeground(new java.awt.Color(0, 51, 153));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(465, 465, 465)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGap(466, 466, 466)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel4)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        CB_year.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2014", "2014", "2015" }));
        CB_year.setSelectedItem(1);
        CB_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_yearActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Place of Birth:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Mobile No:");

        TXT_mobileNo.setText("(09) ");
        TXT_mobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_mobileNoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Email:");

        TXT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_emailActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("Student No.:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(50, 65, 140));
        jLabel21.setText("Course Registration");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Academic Year:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/file-edit.png"))); // NOI18N
        jLabel1.setText(" Add Student");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 65, 140));
        jLabel9.setText("Student Personal Information");

        CB_academicYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024 - 2025", "2025 - 2026", "2026 - 2027" }));
        CB_academicYear.setSelectedItem(1);
        CB_academicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_academicYearActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("Program:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("First Name:");

        CB_program.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_program.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS Psychology", "BS Business Administration major in Marketing Management", "BS Tourism Management", "BS Computer Engineering", "BS Information Technology with Specialization in Mobile and Internet Technologies", "BS Architecture", "BS Civil Engineering", "BS Tourism Management", "AB Communication", "BS Hospitality Management", "BS Business Administration major in Financial Management" }));
        CB_program.setSelectedItem(1);
        CB_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_programActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Middle Name:");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("Entry Level:");

        TXT_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_firstNameActionPerformed(evt);
            }
        });

        CB_entryLevel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_entryLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Year", "Second Year", "Third Year", "Fourth Year" }));
        CB_entryLevel.setSelectedItem(1);
        CB_entryLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_entryLevelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Last Name:");

        submitButton.setBackground(new java.awt.Color(50, 65, 140));
        submitButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Date of Birth:");

        TXT_studentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_studentNoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Date:");

        CB_date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CB_date.setSelectedItem(1);
        CB_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_dateActionPerformed(evt);
            }
        });

        TXT_middleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_middleNameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Month:");

        TXT_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_lastNameActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Year:");

        CB_month.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        CB_month.setSelectedItem(1);
        CB_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_monthActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Scholarship:");

        CB_scholarType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_scholarType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- none -", "Dona Miguela M. Jhocson – Blue Scholar", "Dona Pacita J. Ocampo – White Scholar", "Nationalian Scholarship Program (NSP)", "Mariano Jhocson Science Scholarship Program", "NU Nazareth School and Other NU SHS Graduate Discount", "Employees of SM and its Affiliates", "DOST Scholarship", "CHED Scholarship", "SM Foundation Scholarship" }));
        CB_scholarType.setSelectedItem(1);
        CB_scholarType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_scholarTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(69, 69, 69)
                        .addComponent(TXT_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_scholarType, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TXT_mobileNo)
                                .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TXT_studentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(205, 205, 205)
                            .addComponent(CB_program, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CB_entryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitButton))
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel21)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14)
                                                .addComponent(CB_date, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(CB_month, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16)
                                                .addComponent(CB_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(TXT_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TXT_middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel17)))
                            .addComponent(TXT_placeofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel24))
                        .addGap(43, 43, 43)
                        .addComponent(CB_academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel12)
                                .addComponent(TXT_mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXT_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(TXT_middleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(TXT_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CB_scholarType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TXT_placeofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel23)
                    .addComponent(CB_program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_studentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(CB_academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(CB_entryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(submitButton)
                .addGap(122, 122, 122))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CB_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_yearActionPerformed

    private void TXT_mobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_mobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_mobileNoActionPerformed

    private void TXT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_emailActionPerformed

    private void CB_academicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_academicYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_academicYearActionPerformed

    private void CB_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_programActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_programActionPerformed

    private void TXT_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_firstNameActionPerformed

    private void CB_entryLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_entryLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_entryLevelActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // Get text from text fields
     String firstName = TXT_firstName.getText();
     String middleName = TXT_middleName.getText();
     String lastName = TXT_lastName.getText();
     String placeOfBirth = TXT_placeofBirth.getText();
     String studentNo = TXT_studentNo.getText();
     String mobileNo = TXT_mobileNo.getText();
     String email = TXT_email.getText();

     // Get selected items from combo boxes
     String entryLevel = (String) CB_entryLevel.getSelectedItem();
     String program = (String) CB_program.getSelectedItem();
     String dob = CB_date.getSelectedItem() + "-" + CB_month.getSelectedItem() + "-" + CB_year.getSelectedItem();
     String academicYear = (String) CB_academicYear.getSelectedItem();
     String scholarType = (String) CB_scholarType.getSelectedItem();

     // Database connection and insertion
     Connection conn = null;
     PreparedStatement pstmt = null;

     try {
         // Establish the connection
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "admin123");

         // Prepare the SQL statement
         String sql = "INSERT INTO students (firstName, middleName, lastName, placeOfBirth, studentNo, mobileNo, email, entryLevel, program, dob, academicYear, scholarType) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
         pstmt = conn.prepareStatement(sql);

         // Set the values
         pstmt.setString(1, firstName);
         pstmt.setString(2, middleName);
         pstmt.setString(3, lastName);
         pstmt.setString(4, placeOfBirth);
         pstmt.setString(5, studentNo);
         pstmt.setString(6, mobileNo);
         pstmt.setString(7, email);
         pstmt.setString(8, entryLevel);
         pstmt.setString(9, program);
         pstmt.setString(10, dob);
         pstmt.setString(11, academicYear);
         pstmt.setString(12, scholarType);

         // Execute the statement
         int rowsInserted = pstmt.executeUpdate();
         if (rowsInserted > 0) {
            
             JOptionPane.showMessageDialog(this, "Record successfully inserted!");
         }
     } catch (SQLException e) {
         e.printStackTrace();
         JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
     } finally {
         try {
             if (pstmt != null) pstmt.close();
             if (conn != null) conn.close();
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
     }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void TXT_studentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_studentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_studentNoActionPerformed

    private void CB_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_dateActionPerformed

    private void CB_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_monthActionPerformed

    private void TXT_middleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_middleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_middleNameActionPerformed

    private void TXT_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_lastNameActionPerformed

    private void CB_scholarTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_scholarTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_scholarTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_academicYear;
    private javax.swing.JComboBox<String> CB_date;
    private javax.swing.JComboBox<String> CB_entryLevel;
    private javax.swing.JComboBox<String> CB_month;
    private javax.swing.JComboBox<String> CB_program;
    private javax.swing.JComboBox<String> CB_scholarType;
    private javax.swing.JComboBox<String> CB_year;
    private javax.swing.JTextField TXT_email;
    private javax.swing.JTextField TXT_firstName;
    private javax.swing.JTextField TXT_lastName;
    private javax.swing.JTextField TXT_middleName;
    private javax.swing.JTextField TXT_mobileNo;
    private javax.swing.JTextField TXT_placeofBirth;
    private javax.swing.JTextField TXT_studentNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables

}
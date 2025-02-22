package com.raven.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Form_AllStudentInformation extends JPanel {
    
public Form_AllStudentInformation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        enterStudentNumber = new javax.swing.JTextField();
        GoButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TXT_firstName = new javax.swing.JTextField();
        TXT_middleName = new javax.swing.JTextField();
        TXT_lastName = new javax.swing.JTextField();
        TXT_placeofBirth = new javax.swing.JTextField();
        TXT_mobileNo = new javax.swing.JTextField();
        TXT_email = new javax.swing.JTextField();
        CB_date = new javax.swing.JComboBox<>();
        CB_month = new javax.swing.JComboBox<>();
        CB_year = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CB_academicYear = new javax.swing.JComboBox<>();
        CB_program = new javax.swing.JComboBox<>();
        CB_entryLevel = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

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
            .addGap(0, 0, Short.MAX_VALUE)
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

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/users-class.png"))); // NOI18N
        jLabel5.setText("Student Information");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("Enter Student No.:");

        enterStudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterStudentNumberActionPerformed(evt);
            }
        });

        GoButton.setBackground(new java.awt.Color(50, 65, 140));
        GoButton.setForeground(new java.awt.Color(255, 255, 255));
        GoButton.setText("➜ Go");
        GoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Middle Name:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Last Name:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Date of Birth:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Place of Birth:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Mobile No:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Email:");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Academic Year:");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("Program:");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("Entry Level:");

        TXT_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_firstNameActionPerformed(evt);
            }
        });

        TXT_middleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_middleNameActionPerformed(evt);
            }
        });

        TXT_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_lastNameActionPerformed(evt);
            }
        });

        TXT_mobileNo.setText("(09) ");
        TXT_mobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_mobileNoActionPerformed(evt);
            }
        });

        TXT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_emailActionPerformed(evt);
            }
        });

        CB_date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CB_date.setSelectedItem(1);
        CB_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_dateActionPerformed(evt);
            }
        });

        CB_month.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        CB_month.setSelectedItem(1);
        CB_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_monthActionPerformed(evt);
            }
        });

        CB_year.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2014", "2014", "2015" }));
        CB_year.setSelectedItem(1);
        CB_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_yearActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Date:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Month:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Year:");

        CB_academicYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024 - 2025", "2025 - 2026", "2026 - 2027" }));
        CB_academicYear.setSelectedItem(1);
        CB_academicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_academicYearActionPerformed(evt);
            }
        });

        CB_program.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_program.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS Psychology", "BS Business Administration major in Marketing Management", "BS Tourism Management", "BS Computer Engineering", "BS Information Technology with Specialization in Mobile and Internet Technologies", "BS Architecture", "BS Civil Engineering", "BS Tourism Management", "AB Communication", "BS Hospitality Management", "BS Business Administration major in Financial Management" }));
        CB_program.setSelectedItem(1);
        CB_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_programActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXT_middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel25))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CB_entryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CB_program, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CB_academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(enterStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(GoButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXT_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TXT_mobileNo)
                                    .addComponent(TXT_placeofBirth)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CB_date, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CB_month, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(CB_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(enterStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoButton))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXT_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TXT_middleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TXT_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(CB_academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(CB_program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(CB_entryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TXT_placeofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TXT_mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterStudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterStudentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterStudentNumberActionPerformed

    private void GoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoButtonActionPerformed
    // Get the student number from the text field
    String studentNumber = enterStudentNumber.getText().trim();

    // Validate input
    if (studentNumber.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a student number!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Database variables
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        // Establish the connection
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "admin123");

        // Prepare the SQL query to fetch the student's information
        String sql = "SELECT firstName, middleName, lastName, mobileNo, email, dob, placeOfBirth, academicYear, entryLevel, program "
                   + "FROM students WHERE studentNo = ?";
        pstmt = conn.prepareStatement(sql);

        // Set the student number in the query
        pstmt.setString(1, studentNumber);

        // Execute the query
        rs = pstmt.executeQuery();

        // Check if a record is found
        if (rs.next()) {
            // Populate text fields with the retrieved data
            TXT_firstName.setText(rs.getString("firstName"));
            TXT_middleName.setText(rs.getString("middleName"));
            TXT_lastName.setText(rs.getString("lastName"));
            TXT_mobileNo.setText(rs.getString("mobileNo"));
            TXT_email.setText(rs.getString("email"));
            TXT_placeofBirth.setText(rs.getString("placeOfBirth"));

            // Populate combo boxes with the retrieved data
            CB_entryLevel.setSelectedItem(rs.getString("entryLevel")); // Ensure this matches the combo box options
            CB_program.setSelectedItem(rs.getString("program"));       // Ensure the combo box contains the program options

            // Parse and set the date in the combo boxes (dob: yyyy-mm-dd)
            String[] dobParts = rs.getString("dob").split("-");
            if (dobParts.length == 3) {
                CB_year.setSelectedItem(dobParts[0]);  // Year
                CB_month.setSelectedItem(dobParts[1]); // Month
                CB_date.setSelectedItem(dobParts[2]);  // Date
            }

            CB_academicYear.setSelectedItem(rs.getString("academicYear")); // Set the academic year
        } else {
            // No record found
            JOptionPane.showMessageDialog(this, "No student found with number: " + studentNumber, "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        // Handle database errors
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_GoButtonActionPerformed

    private void TXT_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_firstNameActionPerformed

    private void TXT_middleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_middleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_middleNameActionPerformed

    private void TXT_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_lastNameActionPerformed

    private void TXT_mobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_mobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_mobileNoActionPerformed

    private void TXT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_emailActionPerformed

    private void CB_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_dateActionPerformed

    private void CB_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_monthActionPerformed

    private void CB_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_yearActionPerformed

    private void CB_academicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_academicYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_academicYearActionPerformed

    private void CB_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_programActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_programActionPerformed

    private void CB_entryLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_entryLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_entryLevelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_academicYear;
    private javax.swing.JComboBox<String> CB_date;
    private javax.swing.JComboBox<String> CB_entryLevel;
    private javax.swing.JComboBox<String> CB_month;
    private javax.swing.JComboBox<String> CB_program;
    private javax.swing.JComboBox<String> CB_year;
    private javax.swing.JButton GoButton;
    private javax.swing.JTextField TXT_email;
    private javax.swing.JTextField TXT_firstName;
    private javax.swing.JTextField TXT_lastName;
    private javax.swing.JTextField TXT_middleName;
    private javax.swing.JTextField TXT_mobileNo;
    private javax.swing.JTextField TXT_placeofBirth;
    private javax.swing.JTextField enterStudentNumber;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

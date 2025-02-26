package com.raven.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Form_UpdateStudentInfo extends javax.swing.JPanel {

    public Form_UpdateStudentInfo() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        TXT_firstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXT_middleName = new javax.swing.JTextField();
        GoButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TXT_lastName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CB_date = new javax.swing.JComboBox<>();
        CB_month = new javax.swing.JComboBox<>();
        CB_year = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TXT_placeofBirth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TXT_mobileNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TXT_email = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        CB_program = new javax.swing.JComboBox<>();
        CB_academicYear = new javax.swing.JComboBox<>();
        CB_entryLevel = new javax.swing.JComboBox<>();
        ResetButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        DeleteButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        TXT_studentNo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(465, 465, 465)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
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
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Personal Information");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("Enter Student No.:");

        enterStudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterStudentNumberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("First Name:");

        TXT_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_firstNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Middle Name:");

        TXT_middleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_middleNameActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Last Name:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/file-edit.png"))); // NOI18N
        jLabel9.setText("Update Student Information");

        TXT_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_lastNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Date:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Month:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Year:");

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
        CB_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        CB_year.setSelectedItem(1);
        CB_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_yearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Date of Birth:");

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

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("Academic Information");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Academic Year:");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("Program:");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("Entry Level:");

        CB_program.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CB_program.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS Psychology", "BS Business Administration major in Marketing Management", "BS Tourism Management", "BS Computer Engineering", "BS Information Technology with Specialization in Mobile and Internet Technologies", "BS Architecture", "BS Civil Engineering", "BS Tourism Management", "AB Communication", "BS Hospitality Management", "BS Business Administration major in Financial Management" }));
        CB_program.setSelectedItem(1);
        CB_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_programActionPerformed(evt);
            }
        });

        CB_academicYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024 - 2025", "2025 - 2026", "2026 - 2027" }));
        CB_academicYear.setSelectedItem(1);
        CB_academicYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_academicYearActionPerformed(evt);
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

        ResetButton.setBackground(new java.awt.Color(251, 209, 23));
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 0, 0));
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(50, 65, 140));
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setText("Student No.:");

        TXT_studentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_studentNoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Scholarship:");

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
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteButton)
                                .addGap(18, 18, 18)
                                .addComponent(ResetButton)
                                .addGap(18, 18, 18)
                                .addComponent(SaveButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addGap(18, 18, 18)
                                    .addComponent(enterStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(GoButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(95, 95, 95)
                                                    .addComponent(TXT_email))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                    .addGap(44, 44, 44)
                                                    .addComponent(TXT_middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(60, 60, 60)
                                                    .addComponent(TXT_firstName))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel10))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TXT_lastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(CB_date, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(CB_month, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jLabel14)
                                                                    .addGap(59, 59, 59)
                                                                    .addComponent(jLabel15)))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel16)
                                                                .addComponent(CB_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(TXT_placeofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TXT_mobileNo)))))
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CB_program, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CB_academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TXT_studentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25)
                                                    .addComponent(jLabel18))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CB_scholarType, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CB_entryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(enterStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoButton))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXT_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(TXT_studentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TXT_middleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(CB_academicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TXT_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25))
                    .addComponent(CB_entryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(CB_scholarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
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
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ResetButton)
                        .addComponent(SaveButton))
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterStudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterStudentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterStudentNumberActionPerformed

    private void TXT_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_firstNameActionPerformed

    private void TXT_middleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_middleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_middleNameActionPerformed

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
        String sql = "SELECT StudentNo, firstName, middleName, lastName, mobileNo, email, dob, placeOfBirth, academicYear, entryLevel, program, scholarType "
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
            TXT_studentNo.setText(rs.getString("StudentNo"));

            // Populate combo boxes with the retrieved data
            CB_entryLevel.setSelectedItem(rs.getString("entryLevel")); // Ensure this matches the combo box options
            CB_program.setSelectedItem(rs.getString("program"));       // Ensure the combo box contains the program options
            CB_scholarType.setSelectedItem(rs.getString("scholarType"));

            // Parse and set the date in the combo boxes (dob: day-month-year)
            String[] dobParts = rs.getString("dob").split("-"); // Split by "-"
            if (dobParts.length == 3) {
                CB_date.setSelectedItem(dobParts[0]);  // Day
                CB_month.setSelectedItem(dobParts[1]); // Month
                CB_year.setSelectedItem(dobParts[2]);  // Year
            }

            CB_academicYear.setSelectedItem(rs.getString("academicYear")); // Set the academic year
        } else {
            // No record found
            JOptionPane.showMessageDialog(this, "No student found with number: " + studentNumber, "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        // Handle database errors
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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

    private void TXT_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_lastNameActionPerformed

    private void CB_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_dateActionPerformed

    private void CB_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_monthActionPerformed

    private void CB_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_yearActionPerformed

    private void TXT_mobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_mobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_mobileNoActionPerformed

    private void TXT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_emailActionPerformed

    private void CB_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_programActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_programActionPerformed

    private void CB_academicYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_academicYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_academicYearActionPerformed

    private void CB_entryLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_entryLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_entryLevelActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
    // Validate input fields
        if (TXT_studentNo.getText().trim().isEmpty() || TXT_firstName.getText().trim().isEmpty() || TXT_lastName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Database variables
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "admin123");

            // Prepare the SQL query for updating the student record
            String sql = "UPDATE students SET StudentNo = ?, firstName = ?, middleName = ?, lastName = ?, mobileNo = ?, email = ?, dob = ?, placeOfBirth = ?, academicYear = ?, entryLevel = ?, program = ?, scholarType = ? WHERE StudentNo = ?";
            pstmt = conn.prepareStatement(sql);

            // Set parameters
            pstmt.setString(1, TXT_studentNo.getText().trim()); // New StudentNo
            pstmt.setString(2, TXT_firstName.getText().trim());
            pstmt.setString(3, TXT_middleName.getText().trim());
            pstmt.setString(4, TXT_lastName.getText().trim());
            pstmt.setString(5, TXT_mobileNo.getText().trim());
            pstmt.setString(6, TXT_email.getText().trim());
            pstmt.setString(7, CB_date.getSelectedItem() + "-" + CB_month.getSelectedItem() + "-" + CB_year.getSelectedItem());
            pstmt.setString(8, TXT_placeofBirth.getText().trim());
            pstmt.setString(9, CB_academicYear.getSelectedItem().toString());
            pstmt.setString(10, CB_entryLevel.getSelectedItem().toString());
            pstmt.setString(11, CB_program.getSelectedItem().toString());
            pstmt.setString(12, CB_scholarType.getSelectedItem().toString());
            pstmt.setString(13, enterStudentNumber.getText().trim()); // Original StudentNo for the WHERE clause

            // Execute the update
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student information updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Update the system to reflect the new StudentNo
                enterStudentNumber.setText(TXT_studentNo.getText().trim());
            } else {
                JOptionPane.showMessageDialog(this, "No changes made. Please verify the student information.", "Info", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void TXT_studentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_studentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_studentNoActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
    // Confirm delete action
    int confirm = JOptionPane.showConfirmDialog(
        this, 
        "Are you sure you want to delete this student's data? This action cannot be undone.", 
        "Confirm Delete", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.WARNING_MESSAGE
    );
    if (confirm != JOptionPane.YES_OPTION) {
        return; // User canceled the action
    }

    // Database variables
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // Establish the connection
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "admin123");

        // Prepare the SQL query for deletion
        String sql = "DELETE FROM students WHERE StudentNo = ?";
        pstmt = conn.prepareStatement(sql);

        // Set the student number parameter
        pstmt.setString(1, TXT_studentNo.getText().trim());

        // Execute the delete
        int rowsDeleted = pstmt.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Student record deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Reset fields after deletion
            ResetButtonActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "No record found for the given student number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
    // Clear all text fields
    TXT_firstName.setText("");
    TXT_middleName.setText("");
    TXT_lastName.setText("");
    TXT_mobileNo.setText("");
    TXT_email.setText("");
    TXT_placeofBirth.setText("");
    TXT_studentNo.setText("");

    // Reset combo boxes
    CB_year.setSelectedIndex(0);
    CB_month.setSelectedIndex(0);
    CB_date.setSelectedIndex(0);
    CB_academicYear.setSelectedIndex(0);
    CB_entryLevel.setSelectedIndex(0);
    CB_program.setSelectedIndex(0);
    CB_scholarType.setSelectedIndex(0);

    JOptionPane.showMessageDialog(this, "Fields have been reset!", "Reset", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ResetButtonActionPerformed

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
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton GoButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField TXT_email;
    private javax.swing.JTextField TXT_firstName;
    private javax.swing.JTextField TXT_lastName;
    private javax.swing.JTextField TXT_middleName;
    private javax.swing.JTextField TXT_mobileNo;
    private javax.swing.JTextField TXT_placeofBirth;
    private javax.swing.JTextField TXT_studentNo;
    private javax.swing.JTextField enterStudentNumber;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

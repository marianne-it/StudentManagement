package com.raven.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Form_AcademicCalendar extends javax.swing.JPanel {

    public Form_AcademicCalendar() {
        initComponents();
        initTable(); // Initialize the table with the new structure
    }

    private void initTable() {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"Actions", "Category", "Title", "Note/Remarks", "Uploaded By", "Valid Until", "Require Agreement", "Last Update", "File Path"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Only allow the "Actions" column to be editable for button clicks
                return column == 0;
            }
        };
        CalendarTable.setModel(model);
        CalendarTable.getColumnModel().getColumn(0).setCellRenderer(new ButtonRenderer());
        CalendarTable.getColumnModel().getColumn(0).setCellEditor(new ButtonEditor(new JCheckBox()));
        CalendarTable.removeColumn(CalendarTable.getColumnModel().getColumn(8)); // Hide the "File Path" column
    }

    // Renderer for the "Actions" column
    class ButtonRenderer extends JPanel implements TableCellRenderer {
        private final JButton viewButton = new JButton("View");
        private final JButton deleteButton = new JButton("Delete");

        public ButtonRenderer() {
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(viewButton);
            add(deleteButton);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return this;
        }
    }

    // Editor for the "Actions" column
    class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
        private final JPanel panel = new JPanel();
        private final JButton viewButton = new JButton("View");
        private final JButton deleteButton = new JButton("Delete");
        private JTable table;
        private int row;

        public ButtonEditor(JCheckBox checkBox) {
            panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
            panel.add(viewButton);
            panel.add(deleteButton);

            viewButton.addActionListener(this);
            deleteButton.addActionListener(this);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.table = table;
            this.row = row;
            return panel;
        }

        @Override
        public Object getCellEditorValue() {
            return "";
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewButton) {
                // View PDF logic
                String filePath = table.getModel().getValueAt(row, 8).toString(); // Get the file path
                File file = new File(filePath);
                if (file.exists()) {
                    try {
                        Desktop.getDesktop().open(file);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Unable to open file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File not found at path: " + filePath, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (e.getSource() == deleteButton) {
                // Delete row logic
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    ((DefaultTableModel) table.getModel()).removeRow(row);
                }
            }
            fireEditingStopped();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CalendarTable = new javax.swing.JTable();
        Upload = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(251, 209, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/calendar-day.png"))); // NOI18N
        jLabel5.setText("Academic Calendar");

        CalendarTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CalendarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Academic Calendar", "University Calendar Term 2,AY 2024-2025", "Detailed University Calendar Term 2, AY 2024-2025", "AMORATO, MARICHU V. On: 28-Oct-2024", "31-Mar-2025", "No", null},
                {null, "Academic Calendar", "University Calendar Term 1,AY 2024-2025", "Detailed University Calendar Term 1, AY 2024-2025", "AMORATO, MARICHU V. On: 28-Aug-2024", "11-Nov-2025", "No", null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Actions", "Category", "Title ", "Note/Remarks", "Uploaded By", "Valid Until", "Require Agreement", "Last Update"
            }
        ));
        CalendarTable.setRowHeight(60);
        CalendarTable.setShowGrid(true);
        jScrollPane1.setViewportView(CalendarTable);
        if (CalendarTable.getColumnModel().getColumnCount() > 0) {
            CalendarTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            CalendarTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            CalendarTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        Upload.setBackground(new java.awt.Color(50, 65, 140));
        Upload.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Upload.setForeground(new java.awt.Color(255, 255, 255));
        Upload.setText("Upload");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Upload)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF Files", "pdf"));
        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String fileName = selectedFile.getName();
            String filePath = selectedFile.getAbsolutePath();

            // Create a form for user inputs
            JTextField categoryField = new JTextField();
            JTextField titleField = new JTextField();
            JTextField noteRemarksField = new JTextField();
            JTextField uploadedByField = new JTextField();
            JTextField validUntilField = new JTextField();
            JComboBox<String> requireAgreementField = new JComboBox<>(new String[]{"Yes", "No"});
            JTextField lastUpdateField = new JTextField("Today"); // Default to "Today"

            // Populate the form with input fields
            Object[] message = {
                "Category:", categoryField,
                "Title:", titleField,
                "Note/Remarks:", noteRemarksField,
                "Uploaded By:", uploadedByField,
                "Valid Until (e.g., 31-Dec-2025):", validUntilField,
                "Require Agreement:", requireAgreementField,
                "Last Update (e.g., Today):", lastUpdateField
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Enter File Details", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                String category = categoryField.getText();
                String title = titleField.getText();
                String noteRemarks = noteRemarksField.getText();
                String uploadedBy = uploadedByField.getText();
                String validUntil = validUntilField.getText();
                String requireAgreement = (String) requireAgreementField.getSelectedItem();
                String lastUpdate = lastUpdateField.getText();

                // Validate inputs
                if (category.isEmpty() || title.isEmpty() || uploadedBy.isEmpty() || validUntil.isEmpty() || lastUpdate.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please fill in all mandatory fields!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Add the file details to the table
                DefaultTableModel model = (DefaultTableModel) CalendarTable.getModel();
                model.addRow(new Object[]{"View/Delete", category, title, noteRemarks, uploadedBy, validUntil, requireAgreement, lastUpdate, filePath});

                JOptionPane.showMessageDialog(this, "PDF uploaded: " + fileName, "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_UploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CalendarTable;
    private javax.swing.JButton Upload;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

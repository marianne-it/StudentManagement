package com.raven.swing.table;

import com.raven.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);

        // Set header alignment to LEFT for all columns
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value.toString());
                header.setHorizontalAlignment(JLabel.LEFT); // Align header text to LEFT
                return header;
            }
        });

        // Set cell content alignment to LEFT for all columns
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Set cell padding
                cell.setBorder(new EmptyBorder(10, 15, 10, 15)); // Top, Left, Bottom, Right padding
                cell.setForeground(new Color(102, 102, 102));
                cell.setHorizontalAlignment(JLabel.LEFT); // Align all cell content to LEFT

                // Background color for selection
                if (isSelected) {
                    cell.setBackground(new Color(239, 244, 255));
                } else {
                    cell.setBackground(Color.WHITE);
                }

                return cell;
            }
        });
    }

    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        if (col == 4) {
            return new TableCellAction();
        } else {
            return super.getCellEditor(row, col);
        }
    }

    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
}

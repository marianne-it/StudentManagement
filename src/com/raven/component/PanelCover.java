package com.raven.component;

import com.raven.swing.ButtonOutLine;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelCover extends javax.swing.JPanel {

    private final DecimalFormat df = new DecimalFormat("##0.###", DecimalFormatSymbols.getInstance(Locale.US));
    private ActionListener event;
    private MigLayout layout;
    private JLabel logo;
    private JLabel title;
    private JLabel description;
    private JLabel description1;
    private ButtonOutLine button;
    private boolean isLogin;

    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]15[]10[]15[]push"); // Adjusted spacing
        setLayout(layout);
        init();

    }
    private void init() {
       // Initialize the logo JLabel
       logo = new JLabel();
       logo.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/logonu.png"))); // Replace with your logo's path
       logo.setHorizontalAlignment(JLabel.CENTER); // Center-align the logo

       // Add the logo to the layout (adjust spacing)
       add(logo, "w 50%, h 25%, gapbottom 5"); // Reduced width, height, and gap

       // Modify the title to a two-line format using HTML
       title = new JLabel("<html><center>NU FAIRVIEW<br>STUDENT MANAGEMENT SYSTEM</center></html>");
       title.setFont(new Font("sansserif", Font.BOLD, 28)); // Adjust font size for better fit
       title.setForeground(new Color(245, 245, 245));
       add(title, "gapbottom 10"); // Adjust gap below the title

       description = new JLabel("Enter your personal details");
       description.setForeground(new Color(245, 245, 245));
       add(description);

       description1 = new JLabel("and start journey with us");
       description1.setForeground(new Color(245, 245, 245));
       add(description1);

       button = new ButtonOutLine();
       button.setBackground(new Color(255, 255, 255));
       button.setForeground(new Color(255, 255, 255));
       button.setText("SIGN UP");
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               if (event != null) {
                   event.actionPerformed(ae);
               }
           }
       });
       add(button, "w 50%, h 40"); // Adjust button width and height
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

   @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gra = new GradientPaint(0, 0, new Color(251, 209, 23), 0, getHeight(), new Color(50, 65, 140));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    public void addEvent(ActionListener event) {
        this.event = event;
    }

    public void registerLeft(double v) {
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description1, "pad 0 -" + v + "% 0 0");
    }

    public void registerRight(double v) {
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description1, "pad 0 -" + v + "% 0 0");
    }

    public void loginLeft(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(title, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description1, "pad 0 " + v + "% 0 " + v + "%");
    }

    public void loginRight(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(title, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description1, "pad 0 " + v + "% 0 " + v + "%");
    }

    public void login(boolean login) {
        if (this.isLogin != login) {
            if (login) {
                title.setText("<html><center>NU FAIRVIEW<br>STUDENT MANAGEMENT SYSTEM</center></html>");
                description.setText("Enter your personal details");
                description1.setText("and start journey with us");
                button.setText("SIGN UP");
            } else {
                title.setText("Welcome Back, Nationalian!");
                description.setText("To keep connected with us please");
                description1.setText("login with your personal info");
                button.setText("SIGN IN");
            }
            this.isLogin = login;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

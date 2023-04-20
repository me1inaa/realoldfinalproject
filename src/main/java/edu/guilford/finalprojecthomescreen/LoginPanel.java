/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.guilford.finalprojecthomescreen;

import static edu.guilford.finalprojecthomescreen.FinalProjectHomeScreen.loginWindow;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    
    private Image wallpaper;

    public LoginPanel() {
        initComponents();
        ImageIcon userIcon = new ImageIcon(LoginPanel.class.getResource("/userprofile.png"));
        Image iconImage = userIcon.getImage().getScaledInstance(userIcon.getIconWidth()/2, userIcon.getIconHeight()/2, Image.SCALE_DEFAULT);
        userIcon = new ImageIcon(iconImage);
        userProfileLabel.setIcon(userIcon);
        
        // Instantiating an ImageIcon object that holds the image
        ImageIcon homeBackground = new ImageIcon(LoginPanel.class.getResource("/macbookdesertwallpaper.jpeg"));
        // Get the image file from homeBackground and set it to the Image object instantiated earlier
        this.wallpaper = homeBackground.getImage().getScaledInstance(1280, 800,Image.SCALE_DEFAULT);
    }
    
    @Override
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(wallpaper, 0, 0, this);
        userProfileLabel.setLocation(450, 195);
        password.setLocation(516,395);
        loginButton.setLocation(661, 394);
        passwordLabel.setLocation(531, 423);
        userLabel.setLocation(585, 365);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        userProfileLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("(The Password is Guilford123)");

        userLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(userProfileLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(passwordLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(userLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(userProfileLabel)
                .addGap(43, 43, 43)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String pass = password.getText();
        if (pass.equals("Guilford123")) {
            FinalProjectHomeScreen.createHomePanel();
        } else {
            JOptionPane.showMessageDialog(loginWindow, "Incorrect Password");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userProfileLabel;
    // End of variables declaration//GEN-END:variables
}

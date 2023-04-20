package edu.guilford.finalprojecthomescreen;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;

public class FinalProjectHomeScreen {

    public static GraphicsDevice gd;
    public static BufferedImage background;
    public static JFrame loginWindow;
    public static JFrame homeWindow;
        
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        // Instantiate Login JFrame
        loginWindow = new JFrame ("Login");
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        loginWindow.setSize(screenSize.width,screenSize.height);
        loginWindow.setLocationRelativeTo(null);
        // Add a panel to the JFrame wondow
        LoginPanel loginPanel = new LoginPanel();
        loginWindow.add(loginPanel);
        loginWindow.setVisible(true);
        
        
        
/*
        if(loginPanel.loginSuccessful){
        // Instantiate Homescreen JFrame 
        homeWindow = new JFrame("Home");
        homeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeWindow.setSize(1280,709);
        // Add a panel to the JFrame wondow
        HomePanel homePanel = new HomePanel();
        homeWindow.getContentPane().add(homePanel);
        homeWindow.pack();  
        }*/
    
    }
    public static void createHomePanel(){
        homeWindow = new JFrame("Home");
        homeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeWindow.setSize(1280,709);
        // Add a panel to the JFrame wondow
        HomePanel homePanel = new HomePanel();
        homeWindow.getContentPane().add(homePanel);
        //homeWindow.pack(); 
        homeWindow.setVisible(true);
    }
    
    
}

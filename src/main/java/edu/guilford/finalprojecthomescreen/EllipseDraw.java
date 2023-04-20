package edu.guilford.finalprojecthomescreen;

import javax.swing.JFrame;

public class EllipseDraw {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // instantiate a JFrame object
        JFrame ellipsedraw = new JFrame("Ellipses");
        
        // add a panel to the window
        EllipsePanel ePanel = new EllipsePanel();
        ellipsedraw.getContentPane().add(ePanel);
        
        ellipsedraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ellipsedraw.pack();
        ellipsedraw.setVisible(true);
        
        
    }
    
}

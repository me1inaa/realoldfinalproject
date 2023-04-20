package edu.guilford.finalprojecthomescreen;


import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class ColorEllipse extends Ellipse2D.Double{
    private Color ellipseColor;

    public ColorEllipse(Color ellipseColor, double x, double y, double w, double h) {
        super(x, y, w, h);
        this.ellipseColor = ellipseColor;
    }

    public Color getEllipseColor() {
        return ellipseColor;
    }

    public void setEllipseColor(Color ellipseColor) {
        this.ellipseColor = ellipseColor;
    }
    
    
    
}

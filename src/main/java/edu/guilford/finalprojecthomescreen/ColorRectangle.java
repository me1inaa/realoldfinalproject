package edu.guilford.finalprojecthomescreen;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class ColorRectangle extends Rectangle2D.Double{
    private Color rectangleColor;

    public ColorRectangle(Color rectangleColor, double x, double y, double w, double h) {
        super(x, y, w, h);
        this.rectangleColor = rectangleColor;
    }

    public Color getEllipseColor() {
        return rectangleColor;
    }

    public void setEllipseColor(Color ellipseColor) {
        this.rectangleColor = rectangleColor;
    }
    
}

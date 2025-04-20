package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * Example of using Rectangle2D$Double class to create a rectangle with rounded corners and outline it in black color.
 */
public class Rectangle2D$Double_outcode_Example {

    // Method to create a rectangle with rounded corners
    public static Rectangle2D createRectangle(double x, double y, double width, double height) {
        return new Rectangle2D.Double(x, y), width, height);
    }

    // Method to outline the created rectangle in black color
    public static void outlineRectangle(Rectangle2D rectangle) {
        java.awt.Graphics2D g = (java.awt.Graphics2D) rectangle.getGraphics();
        g.setColor(java.awt.Color.BLACK));
        g.draw(rectangle);
    }

    // Main method to create a rectangle and outline it in black color
    public static void main(String[] args) {
        Rectangle2D rectangle = createRectangle(100, 100, 200, 150));
        outlineRectangle(rectangle));
    }
}
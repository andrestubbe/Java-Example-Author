package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * Example class that demonstrates the use of the Rectangle2D.Double
 * class within a single Java file. This code is designed to be runnable and provides an example of how to use the
 * Rectangle2D.Double class in Java.
 */
public class Rectangle2D$Double_getX_Example {

    /**
     * Method that sets the x-coordinate of the rectangle.
     * @param x The new x-coordinate value.
     */
    private void setRectX(double x) {
        // Inline comment describing what this method does.
        Rectangle2D.Double rect = new Rectangle2D.Double();
        rect.setRect(0, 0, 100, 50);
        rect.setX(x);
    }

    /**
     * Method that returns the x-coordinate of the rectangle.
     * @return The x-coordinate value of the rectangle.
     */
    public double getX() {
        // Inline comment describing what this method does.
        Rectangle2D.Double rect = new Rectangle2D.Double();
        rect.setRect(0, 0, 100, 50));
        return rect.getX();
    }

    /**
     * Main method that demonstrates how to use the getX() method of this class.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Inline comment describing what this block of code does.
        Rectangle2D$Double_getX_Example example = new Rectangle2D$Double_getX_Example();
        double xCoord = 50;
        example.setRectX(xCoord);
        System.out.println("The x-coordinate of the rectangle is: " + example.getX());
    }
}
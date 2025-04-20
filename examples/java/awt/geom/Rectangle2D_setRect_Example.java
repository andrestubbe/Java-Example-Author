package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A class that demonstrates setting a new rectangle dimensions using the {@link Rectangle2D#setRect(double, double, double, double)} method of the `Rectangle2D` class. The code creates a new instance of the `Rectangle2D` class and sets its rectangle dimensions to 100x50 by calling the `setRect(double, double, double, double)` method on an instance of the `Rectangle2D` class.
 */
public class Rectangle2D_setRect_Example {

    /**
     * The entry point for the Java application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        // Create a new instance of the Rectangle2D class
        Rectangle2D rectangle = new Rectangle2D();

        // Set the rectangle dimensions to 100x50 by calling the setRect method on an instance of the Rectangle2D class
        rectangle.setRect(0, 0, 100, 50));

        // Print out the rectangle's x, y, width, and height values
        System.out.println("Rectangle position: (" + rectangle.getX() + ", " + rectangle.getY() + ")"));
        System.out.println("Rectangle dimensions: (" + rectangle.getWidth() + ", " + rectangle.getHeight() + ")"));
    }
}
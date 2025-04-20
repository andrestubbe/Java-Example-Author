package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

public class Rectangle2D$Double_setRect_Example {

    /**
     * This example demonstrates how to use the
     * `Rectangle2D.Double` class's `setRect()` method to
     * set a new rectangle.
     */
    public static void main(String[] args) {
        // Create an instance of Rectangle2D.Double
        Rectangle2D.Double rectangle = new Rectangle2D.Double();

        // Use the setRect() method to set a new rectangle
        rectangle.setRect(10, 20, 50, 40));

        // Print the rectangle's coordinates and dimensions
        System.out.println("Rectangle Coordinates: [" + rectangle.getX() + ", " + rectangle.getY() + "]"));
        System.out.println("Rectangle Dimensions: Width = " + rectangle.getWidth() + ", Height = " + rectangle.getHeight()));
    }
}
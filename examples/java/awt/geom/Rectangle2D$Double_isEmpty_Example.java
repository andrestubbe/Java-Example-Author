package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

public class Rectangle2D$Double_isEmpty_Example {

    /**
     * A Java program that demonstrates the usage of 
     * `Rectangle2D#contains(double, double))` 
     * method and also explains its result in its javadoc comments.
     */
    public static void main(String[] args) {
        // Create a new Rectangle2D object with specified width & height
        Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 500, 500);

        // Check if the given point is inside the rectangle or not
        boolean isPointInsideRectangle = rectangle.contains(300, 300));

        // Print the result of the above operation
        System.out.println("Is the given point (300, 300)) inside the rectangle? " + isPointInsideRectangle);
    }
}
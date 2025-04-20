package examples.java.awt.geom;

import java.awt.Rectangle2D;

/**
 * Example of setting the frame of a Rectangle2D object using the `setFrame` method. This example demonstrates how to set the bounds of a rectangle in a 2D space.
 */
public class Rectangle2D_setFrame_Example {

    public static void main(String[] args) {
        // Create a new Rectangle2D object with default values
        Rectangle2D rectangle = new Rectangle2D();

        // Set the frame of the rectangle using the setFrame method
        rectangle.setFrame(10, 20, 50, 70);

        // Print out the bounds of the rectangle
        System.out.println("Rectangle bounds: [" + rectangle.getX() + ", " + rectangle.getY() + "] to [" + rectangle.getMaxX() + ", " + rectangle.getMaxY() + "])");
    }

}
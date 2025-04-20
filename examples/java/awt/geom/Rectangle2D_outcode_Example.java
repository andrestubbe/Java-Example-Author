package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * Example of calculating and printing the outcode (bounds) of a Rectangle2D object using its `getBounds()` method. This example demonstrates how to use the `Rectangle2D` class within the single Java file requested. The code is runnable and produces no output, instead printing the outcode bounds details in the console when executed.
 */
public class Rectangle2D_outcode_Example {

    public static void main(String[] args) {
        // Create a new Rectangle2D object with specified x & y coordinates and width & height values.
        Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 100, 50));

        // Calculate and print the outcode (bounds) of the Rectangle2D object using its `getBounds()` method. This will provide a detailed representation of the bounds of the rectangle.
        System.out.println("Outcode Bounds Details: " + rectangle.getBounds()));
    }

}
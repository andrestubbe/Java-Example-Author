package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A runnable Java code example using the `Float` class within a single Java file. The code creates a rectangle with float dimensions and retrieves its width. This example demonstrates basic usage of the Rectangle2D$Float class, focusing on retrieving the width of the rectangle.
 */
public class Rectangle2D$Float_getWidth_Example {

    /**
     * Creates a rectangle with float dimensions using the `Float` constructor within a single Java file. The code retrieves its width and prints it to the console.
     */
    public static void main(String[] args) {
        // Create a rectangle with float dimensions
        Rectangle2D.Float rectangle = new Rectangle2D.Float(10, 10, 100, 50));

        // Retrieve and print its width
        System.out.println("Width: " + rectangle.getWidth());
    }
}
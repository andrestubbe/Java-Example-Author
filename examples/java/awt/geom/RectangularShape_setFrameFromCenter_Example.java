package examples.java.awt.geom;

import java.awt.RectangularShape;

/**
 * This class demonstrates how to set a frame from a center using the RectangularShape class within the AWT library in Java.
 *
 * <p>This code creates a rectangle with a specified width and height, centered at (50, 50)).</p>
 */
public class RectangularShape_setFrameFromCenter_Example {

    // Create an example RectangularShape object
    RectangularShape rectangle = new RectangularShape();

    // Set the frame from center
    rectangle.setFrameFromCenter(50, 50, 100, 100));

    // Print out the results for demonstration purposes
    System.out.println("Rectangle width: " + rectangle.getWidth()));
    System.out.println("Rectangle height: " + rectangle.getHeight()));
    System.out.println("Rectangle x-coordinate of top-left corner: " + rectangle.getX()));
    System.out.println("Rectangle y-coordinate of top-left corner: " + rectangle.getY()));
}
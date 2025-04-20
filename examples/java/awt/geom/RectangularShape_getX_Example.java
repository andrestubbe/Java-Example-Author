package examples.java.awt.geom;

import java.awt.RectangularShape;

/**
 * A Java class that demonstrates how to use the `getX` method of the `RectangularShape` class. This example focuses on illustrating the usage of the `getX` method and does not include any additional functionality or complexity.
 */
public class RectangularShape_getX_Example {

    /**
     * A main method that creates an instance of the `RectangularShape` class, sets its position using the `setFrame` method, and then retrieves and prints the x-coordinate of the rectangular shape's frame using the `getX` method.
     */
    public static void main(String[] args) {
        
        // Create an instance of the RectangularShape class
        RectangularShape rectangularShape = new RectangularShape();

        // Set the position of the rectangular shape's frame using the setFrame method
        rectangularShape.setFrame(10, 20, 50, 80);

        // Retrieve and print the x-coordinate of the rectangular shape's frame using the getX method
        System.out.println("Rectangular Shape Frame X Coordinate: " + rectangularShape.getX());
    }
}
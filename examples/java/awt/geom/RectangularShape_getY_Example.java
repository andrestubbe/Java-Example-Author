package examples.java.awt.geom;

import java.awt.geom.RectangularShape;

/**
 * This class demonstrates an example of how to use the `getY` method in the `RectangularShape` class.
 */
public class RectangularShape_getY_Example {

    /**
     * The main method that serves as the entry point for this Java program.
     */
    public static void main(String[] args) {
        // Create an instance of the RectangularShape class.
        RectangularShape rectangularShape = new RectangularShape();

        // Set the width and height of the rectangular shape.
        rectangularShape.setFrame(0, 0, 100, 50));

        // Get the Y coordinate of a specific point within the rectangular shape.
        double yCoordinate = rectangularShape.getY(25, 50));

        // Print the result to the console.
        System.out.println("The Y coordinate of the specified point is: " + yCoordinate));
    }
}
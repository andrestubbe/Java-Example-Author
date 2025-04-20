package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * This example demonstrates how to check if a specific rectangle, defined by its coordinates and dimensions, is empty or not.
 */
public class Rectangle2D$Float_isEmpty_Example {

    // Define the float rectangle
    private final Rectangle2D.Float rectangle = new Rectangle2D.Float(10, 10, 50, 50));

    /**
     * This method checks if the specified rectangle is empty or not.
     *
     * @param rectangle The specific rectangle to check for emptiness.
     * @return true if the rectangle is empty, false otherwise.
     */
    private boolean isEmpty(Rectangle2D.Float rectangle) {
        // Check if the rectangle coordinates and dimensions are such that it doesn't occupy any space on the 2D plane.
        return rectangle.getX() + rectangle.getWidth() <= 0 || rectangle.getY() + rectangle.getHeight() <= 0;
    }

    /**
     * The entry point for this Java application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Create an instance of the example class
        Rectangle2D$Float_isEmpty_Example example = new Rectangle2D$Float_isEmpty_Example();

        // Print the result of the isEmpty method for the specific rectangle defined above
        System.out.println("Is the rectangle empty? " + example.isEmpty(example.rectangle)));
    }
}
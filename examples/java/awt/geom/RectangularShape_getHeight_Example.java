package examples.java.awt.geom;

import java.awt.geom.RectangularShape;

/**
 * This class demonstrates how to retrieve the height of a rectangular shape using the `getHeight` method inherited from the `RectangularShape` class.
 *
 * The example code shows a rectangle object with its width and height defined. The program then prints out the height value of the rectangle object by calling the `getHeight` method on it.
 */
public class RectangularShape_getHeight_Example {

    // Create a rectangular shape object with predefined dimensions
    private static final int WIDTH = 50;
    private static final int HEIGHT = 30;
    private static final RectangularShape RECTANGLE = new RectangularShape() {
        public double getWidth(Rectangle2D r) {
            return WIDTH;
        }

        public double getHeight(Rectangle2D r) {
            return HEIGHT;
        }
    };

    /**
     * Method to retrieve the height of a rectangular shape object.
     *
     * @param rectangle The rectangular shape object to retrieve the height from.
     * @return The height value of the given rectangular shape object.
     */
    public static double getHeight(RectangularShape rectangle) {
        // Check if the given object implements the RectangularShape interface
        if (rectangle instanceof RectangularShape)) {
            // Retrieve the height value using the getHeight method inherited from the RectangularShape class
            return rectangle.getHeight(null);
        } else {
            throw new IllegalArgumentException("The given object must implement the RectangularShape interface.");
        }
    }

    /**
     * Main method to demonstrate the usage of the `getHeight` method inherited from the `RectangularShape` class.
     *
     * @param args Command line arguments (not used in this example)).
     */
    public static void main(String[] args) {
        // Print out the height value of the RECTANGLE object by calling the getHeight method on it
        System.out.println("Rectangle Height: " + RectangularShape_getHeight_Example.getHeight(RectangularShape_getHeight_Example.RECTANGLE)));
    }
}
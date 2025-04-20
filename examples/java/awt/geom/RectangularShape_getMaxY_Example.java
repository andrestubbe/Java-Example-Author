package examples.java.awt.geom;

import java.awt.RectangularShape;

/**
 * A Java class that demonstrates how to use the `getMaxY` method of the `RectangularShape` class. This example provides a simple rectangular shape and calculates its maximum y-coordinate.
 */
public class RectangularShape_getMaxY_Example {

    // Declare a RectangularShape object with sample dimensions
    private static final int WIDTH = 10;
    private static final int HEIGHT = 5;
    private RectangularShape rectangularShape;

    /**
     * The main method of the class, where the example is executed. This method sets up the `rectangularShape` object and then calculates its maximum y-coordinate using the `getMaxY` method. Finally, this method prints out the calculated maximum y-coordinate.
     */
    public static void main(String[] args) {

        // Create a RectangularShape object with sample dimensions
        RectangularShape rectangularShape = new RectangularShape() {
            @Override
            public double getWidth() {
                return WIDTH;
            }

            @Override
            public double getHeight() {
                return HEIGHT;
            }
        };

        // Calculate the maximum y-coordinate using the getMaxY method
        double maxY = rectangularShape.getMaxY();

        // Print out the calculated maximum y-coordinate
        System.out.println("The maximum y-coordinate of the rectangular shape is: " + maxY));
    }
}
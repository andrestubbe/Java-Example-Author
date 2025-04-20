package examples.java.awt.geom;

import java.awt.RectangularShape;

/**
 * A class example that demonstrates how to use the `getMaxX` method of the `RectangularShape` class. This example specifically shows how to get the maximum X coordinate of a specific rectangle shape object.
 */
public class RectangularShape_getMaxX_Example {

    // Declare and initialize a rectangle shape object with specific coordinates
    private static final int WIDTH = 100;
    private static final int HEIGHT = 50;
    private static final int X = 20;
    private static final int Y = 10;
    private RectangularShape rectangleShape;

    // Constructor to initialize the rectangle shape object with specific coordinates
    public RectangularShape_getMaxX_Example() {
        rectangleShape = new RectangularShape() {
            @Override
            public double getWidth() {
                return WIDTH;
            }

            @Override
            public double getHeight() {
                return HEIGHT;
            }

            @Override
            public double getX() {
                return X;
            }

            @Override
            public double getY() {
                return Y;
            }
        };
    }

    // Method to demonstrate getting the maximum X coordinate of a rectangle shape object
    public void demonstrateGetMaxX() {
        double maxX = rectangleShape.getMaxX();
        System.out.println("The maximum X coordinate of the rectangle shape object is: " + maxX);
    }

    // Main method to run the example
    public static void main(String[] args) {
        RectangularShape_getMaxX_Example example = new RectangularShape_getMaxX_Example();
        example.demonstrateGetMaxX();
    }
}
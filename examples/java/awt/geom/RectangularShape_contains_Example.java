package examples.java.awt.geom;

import java.awt.RectangularShape;

public class RectangularShape_contains_Example {

    /**
     * A class that demonstrates the `contains` method of the `RectangularShape` interface. This example creates a rectangle with a specified width and height, and then checks if the rectangle contains a specific point in its interior.
     */

    // Define the dimensions of the rectangle
    private final double width = 10;
    private final double height = 5;

    // Create a new rectangular shape with the specified dimensions
    private RectangularShape createRectangle() {
        return new RectangularShape() {
            @Override
            public boolean contains(int x, int y) {
                // Check if the point (x, y) is inside the rectangle
                if (x >= 0 && x < width && y >= 0 && y < height) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public boolean intersects(int x, int y, int w, int h) {
                // Check if the rectangle defined by (x, y), (w, h) intersects with the rectangle defined by the dimensions of this class
                if ((x >= 0 && x < width) && (y >= 0 && y < height)) {
                    return true;
                } else {
                    return false;
                }
            }
        };
    }

    // Main method to run the example
    public static void main(String[] args) {
        RectangularShape rectangle = new RectangularShape_contains_Example().createRectangle();
        System.out.println("Does the rectangle contain the point (3, 4))? " + rectangle.contains(3, 4));
        }
    }
}
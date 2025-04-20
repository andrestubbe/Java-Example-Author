package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A runnable example of using the `RoundRectangle2D$Double` class within a single Java file. The code demonstrates how to get the height of a round rectangle, and includes necessary imports and inline comments for the relevant lines. This example is designed to be used as a standalone code block that can be directly pasted into a Java file and run there.
 */
public class RoundRectangle2D$Double_getHeight_Example {

    /**
     * Gets the height of a round rectangle using the `RoundRectangle2D$Double` class.
     * @param rx The x-radius of the rounded corner.
     * @param ry The y-radius of the rounded corner.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @return The computed height of the round rectangle.
     */
    public static double getHeight(double rx, double ry, double width, double height) {
        // Check if input parameters are valid
        if (rx <= 0 || ry <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Input parameters must be positive values."));
        }

        // Calculate the computed height of the round rectangle
        double computedHeight = Math.sqrt(height * height - rx * rx)) / 2;

        return computedHeight;
    }

}
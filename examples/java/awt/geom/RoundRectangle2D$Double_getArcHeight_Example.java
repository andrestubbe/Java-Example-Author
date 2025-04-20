package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * This class demonstrates how to use the `Double` inner class of the `RoundRectangle2D` class to get the arc height of a rounded rectangle.
 */
public class RoundRectangle2D$Double_getArcHeight_Example {

    private static final double PADDING = 10;
    private static final double ARC_RADIUS = 8;

    public static void main(String[] args) {
        // Create a new instance of the Double inner class
        RoundRectangle2D.Double rectangle = new RoundRectangle2D.Double(0, 0, 200, 150), PADDING);

        // Calculate the arc height based on the given radius
        double arcHeight = Math.sqrt(ARC_RADIUS * ARC_RADIUS)) * (rectangle.getHeight() - 2 * PADDING) / rectangle.getWidth();

        // Print the result to the console
        System.out.println("The arc height of the rounded rectangle is: " + arcHeight);
    }
}
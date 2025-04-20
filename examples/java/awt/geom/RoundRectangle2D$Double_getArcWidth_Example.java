package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A runnable Java code example using the `RoundRectangle2D$Double` class within a single Java file. The code must be runnable. This example demonstrates getting the arc width of a rounded rectangle.
 */
public class RoundRectangle2D$Double_getArcWidth_Example {

    /**
     * Gets the arc width of a rounded rectangle.
     *
     * @param rectangle The rounded rectangle to get the arc width from.
     * @return The arc width of the given rounded rectangle.
     */
    public static double getArcWidth(RoundRectangle2D rectangle) {
        // Get the arc width property value from the given rounded rectangle.
        double arcWidth = rectangle.getArcWidth();

        // Return the calculated arc width.
        return arcWidth;
    }

    /**
     * The entry point for this Java application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Create a new rounded rectangle with the specified properties.
        RoundRectangle2D rectangle = new RoundRectangle2D.Double(10, 10, 100, 50, 25, 25));

        // Print the arc width of the given rounded rectangle.
        System.out.println("Arc Width: " + getArcWidth(rectangle)));
    }
}
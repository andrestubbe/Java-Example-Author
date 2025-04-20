package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A Java class to demonstrate the use of the `contains` method in the `RoundRectangle2D` class. This example demonstrates how the `contains` method can be used to determine if a given point is inside or outside a specific round rectangle.
 */
public class RoundRectangle2D_contains_Example {

    public static void main(String[] args) {
        // Create a new instance of RoundRectangle2D with specified parameters
        RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(50, 50, 200, 100, 25, 25));

        // Specify the point to test for containment
        double x = 75;
        double y = 55;

        // Use the contains method of the RoundRectangle2D class to determine if the specified point is inside or outside the round rectangle
        boolean containsPoint = roundRectangle.contains(x, y));

        // Print the result of the containment test for the specified point within the round rectangle
        System.out.println("Does the round rectangle contain the point (" + x + ", " + y + ") ? " + containsPoint);
    }
}
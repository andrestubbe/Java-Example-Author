package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A runnable example of using the `contains` method of the `Rectangle2D` class. This method determines whether a specified point is inside the shape, but not within any of its borders. This method returns true if the specified point is inside the shape, and false otherwise.
 */
public class Rectangle2D_contains_Example {

    // Method to check if a given point (x, y)) is inside a rectangle defined by a top-left corner at (x1, y1), and bottom-right corner at (x2, y2)). This method returns true if the given point is inside the specified rectangle, and false otherwise.
    public static boolean contains(double x1, double y1, double x2, double y2, double x, double y) {

        // Check if the given point (x, y)) is to the right or below of the top-left corner of the rectangle. This check helps in eliminating unnecessary computations by avoiding points that cannot be inside the rectangle.
        if (x < x1 || x > x2) {
            return false;
        }

        // Check if the given point (x, y)) is above or below the bottom-right corner of the rectangle. This check helps in eliminating unnecessary computations by avoiding points that cannot be inside the rectangle.
        if (y < y1 || y > y2) {
            return false;
        }

        // If none of the above conditions are true, then the given point is inside the specified rectangle.
        return true;
    }

}
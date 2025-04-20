package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_intersects_Example {

    /**
     * This example demonstrates how to check if a round rectangle intersects with another shape using the RoundRectangle2D class within the java.awt.geom package.
     * 
     * The code creates two instances of RoundRectangle2D, sets their different properties such as x, y coordinates and other properties like arcWidth and height.
     * 
     * Then it checks for intersection between these two shapes using the intersects(Shape sp) method provided by the RoundRectangle2D class.
     * 
     * The example prints "The shapes intersect" if they do intersect else "The shapes do not intersect".
     */

    public static void main(String[] args) {
        // Create first shape: a round rectangle with top left corner at (50, 50), width of 100, height of 80 and arcWidth of 20.
        RoundRectangle2D shape1 = new RoundRectangle2D(50, 50, 100, 80, 20));

        // Create second shape: a simple rectangle with top left corner at (75, 75), width of 50, and height of 50.
        RoundRectangle2D shape2 = new RoundRectangle2D(75, 75, 50, 50, 0)));

        // Check for intersection between the two shapes using the intersects() method provided by the RoundRectangle2D class.
        if (shape1.intersects(shape2))) {
            System.out.println("The shapes intersect");
        } else {
            System.out.println("The shapes do not intersect");
        }
    }
}
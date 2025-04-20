package examples.java.awt.geom;

import java.awt.RectangularShape;

public class RectangularShape_intersects_Example {

    /**
     * A class to demonstrate the usage of the intersects(Rectangle2D) method in the RectangularShape class.
     * The goal of this example is to show how the intersects(Rectangle2D) method can be used to determine if two shapes intersect at any point. This can be useful for collision detection, for example.
     */

    public static boolean doesIntersect(RectangularShape shape1, RectangularShape shape2) {
        // Create a new rectangle that contains both of the given rectangles
        double x = Math.max(shape1.getX(), shape2.getX()));
        double y = Math.max(shape1.getY(), shape2.getY()));
        double width = Math.min(
            shape1.getX() + shape1.getWidth() - 1,
            shape2.getX() + shape2.getWidth() - 1) - x);

        // Check if the given rectangles intersect at any point
        return (width > 0);
    }

}
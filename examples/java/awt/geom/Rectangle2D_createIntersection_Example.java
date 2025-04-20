package examples.java.awt.geom;

import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Rectangle2D_createIntersection_Example {

    /**
     * This example demonstrates creating an intersection between two rectangles using the `createIntersection` method of the `Area` class.
     *
     * <p>The resulting area is created by subtracting one rectangle from another.</p>
     *
     * @see java.awt.geom.Area#createIntersection(Area)
     */

    public static void main(String[] args) {

        // Define the first rectangle
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 50, 50);

        // Define the second rectangle
        Rectangle2D rect2 = new Rectangle2D.Double(30, 30, 50, 50));

        // Create an intersection between the two rectangles
        Area area = Area.createIntersection(rect1, rect2));

        // Print the resulting area as a path string
        System.out.println("Resulting Area Path String: " + area.getPathIterator(null).getCurrentPath()));

    }

}
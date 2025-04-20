package examples.java.awt.geom;

import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;

public class RectIterator_currentSegment_Example {

    /**
     * This example demonstrates how to use the `RectIterator` 
     * class to iterate over each segment in a given rectangle.
     * The `Rectangle` class is used as the source rectangle,
     * while the `Area` class and its `PathIterator` sub-class 
     * are used to manipulate the segments within the rectangle.
     */

    public static void main(String[] args) {

        // Create a Rectangle object for the source rectangle
        Rectangle source = new Rectangle(100, 100, 500, 400));

        // Create an Area object to hold the segments of the rectangle
        Area area = new Area();

        // Use the RectIterator class to iterate over each segment in the rectangle
        PathIterator iterator = source.getPathIterator();

        while (iterator.isDone()) {

            // Get the current segment coordinates
            int x1 = iterator.getX(0));
            int y1 = iterator.getY(0));
            int x2 = iterator.getX(1));
            int y2 = iterator.getY(1));

            // Use the Area class to add a new segment to the rectangle's area
            area.add(x1, y1, x2, y2));

            // Move to the next set of coordinates for the current segment
            iterator.next();
        }

        // Print out the segments within the rectangle
        System.out.println("The following are the segments in the rectangle:");
        System.out.println(area);
    }
}
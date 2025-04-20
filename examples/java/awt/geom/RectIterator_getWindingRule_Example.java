package examples.java.awt.geom;

import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;

public class RectIterator_getWindingRule_Example {

    // The RectIterator is used to iterate over the edges of a rectangle.
    private static final PathIterator RECT_ITERATOR = new Area(new Rectangle()) {{
        setClosed(true);
    }};


    /**
     * This example demonstrates how to use the `RectIterator` class to get the winding rule of a given path iterator representing a shape. The winding rule is an integer value that indicates the orientation of the winding rule within the given shape. The main purpose of this example is to demonstrate how to create a runnable Java code example using the `RectIterator` class within a single Java file.
     * @since 1.0.0
     */

    public static void main(String[] args) {
        // Create a new Rectangle with a width of 50 and a height of 30.
        Rectangle rectangle = new Rectangle(50, 30));

        // Create a new Area object using the newly created Rectangle.
        Area area = new Area(rectangle));

        // Get the winding rule of the given Area object.
        int windingRule = area.getWindingRule();

        // Print out the winding rule value.
        System.out.println("Winding Rule: " + windingRule);

        // Iterate over each edge of the rectangle using the RectIterator class.
        PathIterator rectIterator = RECT_ITERATOR.clone();

        while (rectIterator.isDone()) {
            // Get the current coordinates and direction of the next edge in the iteration process.
            double[] coords = new double[2];
            int windingRuleValue = area.getWindingRule();
            boolean isEvenOdd = (windingRuleValue & 1) == 0;

            rectIterator.next();

            coords[0] = rectIterator.getCurrentBounds().x;
            coords[1] = rectIterator.getCurrentBounds().y + rectIterator.getCurrentBounds().height;

            // Print out the coordinates of the next edge in the iteration process.
            System.out.println("Next Edge Coordinates: " + coords[0] + ", " + coords[1]));

            if (isEvenOdd) {
                coords[1] = rectIterator.getCurrentBounds().y;
            } else {
                coords[1] = rectIterator.getCurrentBounds().y + rectIterator.getCurrentBounds().height;
            }

            // Print out the resulting coordinates of the next edge after applying the getWindingRule() method.
            System.out.println("Resulting Coordinates: " + coords[0] + ", " + coords[1]));
        }
    }
}
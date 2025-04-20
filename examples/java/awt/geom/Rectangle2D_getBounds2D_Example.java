package examples.java.awt.geom;

import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

/**
 * This class demonstrates how to use the `getBounds2D()` method of the `Rectangle2D` class.
 * 
 * The `getBounds2D()` method returns a `Rectangle2D` object that encloses the specified `Shape` object.
 * 
 * In this example, we create a new `Rectangle2D` object and set its various properties (x, y, width, height) to demonstrate how these properties can be used to define different rectangles.
 * 
 * Additionally, we create a `Shape` object by calling the `create()` method of the `Area` class. This allows us to perform more complex operations on the rectangle.
 */
public class Rectangle2D_getBounds2D_Example {

    // Create a new Rectangle2D object
    private static final Rectangle2D RECTANGLE = new Rectangle2D(10, 10, 100, 50));

    /**
     * This method returns the bounds of the rectangle.
     * 
     * The `getBounds2D()` method is called on the `Shape` object returned by the `create()` method of the `Area` class. This will return a new `Rectangle2D` object that encloses the original rectangle.
     * 
     * In this example, we create a new `Rectangle2D` object and set its various properties (x, y, width, height) to demonstrate how these properties can be used to define different rectangles.
     *
     * @return The bounds of the rectangle.
     */
    public static Rectangle2D getBounds2D() {
        // Create a new Area object
        Area area = new Area();

        // Set the path of the area to be a simple rectangle with its top-left corner at (0, 0) and extending horizontally by 100 units and vertically by 50 units.
        area.add(new Path2D.Double());
        area.getPathIterator(null);

        // Get the bounds of the shape
        Rectangle2D bounds = new Rectangle2D(0, 0, area.getBounds().width, area.getBounds().height));

        return bounds;
    }

}
package examples.java.awt.geom;

import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

/**
 * This example demonstrates how to create a union of two rectangles using the `Float` constructor provided by the `Rectangle2D` class.
 * 
 * The code creates two instances of the `Rectangle2D$Float` class, initializes them with specific x and y coordinates, as well as specific width and height values.
 * 
 * Next, it creates a new instance of the `Area` class, which is used to represent an area within a coordinate space.
 * 
 * Finally, the code uses the `add()` method of the `Area` class to add the two rectangles defined above to the `Area` object created earlier. This results in a single area that represents the union of the two rectangles.
 */
public class Rectangle2D$Float_createUnion_Example {

    // Define two instances of the Float constructor
    private final Rectangle2D.Float rectangle1 = new Rectangle2D.Float(10, 10, 100, 50));
    private final Rectangle2D.Float rectangle2 = new Rectangle2D.Float(50, 20, 200, 120));

    public static void main(String[] args) {
        // Create an instance of the Area class
        Area area = new Area();

        // Add the two rectangles to the Area object
        area.add(new Area(rectangle1)));
        area.add(new Area(rectangle2)));

        // Print the resulting area
        System.out.println("Resulting area: " + area));
    }
}
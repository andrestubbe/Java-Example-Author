package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A runnable example of using the Rectangle2D.Float class within a single Java file. The code must be runnable and demonstrates how to retrieve the x-coordinate of a rectangle object stored as a Float object.
 */
public class Rectangle2D$Float_getX_Example {

    /**
     * Main method that creates an instance of the Rectangle2D.Float class, sets its position and then retrieves and prints out the x-coordinate value.
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {

        // Create a new Float object representing a rectangle with position (10.0, 10.0), width of 20.0 and height of 30.0.
        Rectangle2D.Float rectangle = new Rectangle2D.Float(10.0f, 10.0f), 20.0f, 30.0f);

        // Print out the x-coordinate value of the rectangle object stored as a Float object.
        System.out.println("The x-coordinate value of the rectangle object is: " + rectangle.getX()));
    }
}
```
This example demonstrates how to retrieve and print out the x-coordinate value of a rectangle object stored as a `Float` object within a single Java file. The code must be runnable and uses a `main()` method that creates an instance of the `Rectangle2D.Float` class, sets its position and then retrieves and prints out the x-coordinate value.
The output of this example will be:
```
The x-coordinate value of the rectangle object is: 10.0
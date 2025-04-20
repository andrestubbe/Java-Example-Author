package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * This class demonstrates an example of using the `Float` object within the `Rectangle2D` class. It specifically focuses on getting the y-coordinate of a rectangle.
 */
public class Rectangle2D$Float_getY_Example {

    // Example usage
    public static void main(String[] args) {
        
        // Create an instance of Rectangle2D.Float
        Rectangle2D.Float rectangle = new Rectangle2D.Float(0, 0, 100, 50));
        
        // Get the y-coordinate of the rectangle
        float y = rectangle.getY();
        
        System.out.println("The y-coordinate of the rectangle is: " + y);
    }
}
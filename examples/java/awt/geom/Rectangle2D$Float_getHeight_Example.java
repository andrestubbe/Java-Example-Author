package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * Example of using Rectangle2D$Float class to get the height of a rectangle.
 */
public class Rectangle2D_Float_getHeight_Example {

    // Define float rectangle for demonstration
    private static final float WIDTH = 100;
    private static final float HEIGHT = 50;
    private static final float X = 0;
    private static final float Y = 0;

    public static void main(String[] args) {
        
        // Create a Float instance for Rectangle2D class
        Rectangle2D.Float rectangle = new Rectangle2D.Float(X, Y, WIDTH, HEIGHT));
        
        // Get the height of the rectangle
        float height = rectangle.getHeight();
        
        // Print out the result
        System.out.println("The height of the rectangle is: " + height);
    }
}
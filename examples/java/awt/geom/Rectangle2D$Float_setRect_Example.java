package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A class that demonstrates how to use the
 * Rectangle2D$Float class within a single Java file.
 *
 * This example creates an instance of the
 * Rectangle2D$Float class, sets its rectangle
 * by specifying the x and y coordinates of the
 * top-left corner of the rectangle, and
 * the width and height of the rectangle.
 */
public class Rectangle2D$Float_setRect_Example {

    /**
     * The main method that demonstrates how to use the
     * Rectangle2D$Float class to create a rectangle with specific dimensions and position.
     */
    public static void main(String[] args) {
        
        // Create an instance of the Rectangle2D$Float class
        Rectangle2D.Float rectangle = new Rectangle2D.Float();

        // Set the rectangle's top-left corner coordinates, width and height
        rectangle.setRect(10, 20, 200, 300);

        // Print out the resulting rectangle's dimensions and position
        System.out.println("Rectangle dimensions: " + rectangle.getWidth() + " pixels x " + rectangle.getHeight() + " pixels");
        System.out.println("Rectangle top-left corner coordinates: (" + rectangle.getX() + ", " + rectangle.getY() + "))");
    }
}
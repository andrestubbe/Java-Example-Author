package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * This class demonstrates an example of using the
 * Rectangle2D$Float class within a single Java file.
 * The code is designed to be runnable and can be used as a starting point for learning more about the functionality of the class in question.
 */
public class Rectangle2D$Float_toString_Example {

    /**
     * Main method that creates a rectangle with Float coordinates, calculates its area, and then prints out the resulting coordinates and area.
     */
    public static void main(String[] args) {
        // Create a rectangle with Float coordinates
        Rectangle2D rectangle = new Rectangle2D.Float(-10f, -10f, 20f, 20f));

        // Calculate the area of the rectangle
        double area = rectangle.getWidth() * rectangle.getHeight();

        // Print out the resulting coordinates and area
        System.out.println("Rectangle Coordinates: (" + rectangle.getX() + ", " + rectangle.getY() + "))");
        System.out.println("Rectangle Width: " + rectangle.getWidth()));
        System.out.println("Rectangle Height: " + rectangle.getHeight()));
        System.out.println("Rectangle Area: " + area));
    }
}
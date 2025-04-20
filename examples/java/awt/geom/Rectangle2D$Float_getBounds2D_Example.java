package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * Example of using the Rectangle2D.Float class. This
 * example shows how to create a rectangle with float coordinates and calculate its bounds.
 */
public class Rectangle2D$Float_getBounds2D_Example {

    // Define float coordinates for the rectangle
    private final float x = 10;
    private final float y = 20;
    private final float width = 100;
    private final float height = 50;

    // Create a Float instance with the defined float coordinates
    private Rectangle2D.Float rectangle;

    public Rectangle2D$Float_getBounds2D_Example() {
        // Initialize the rectangle instance using the float coordinates
        rectangle = new Rectangle2D.Float(x, y, width, height));
    }

    /**
     * Getter method for the rectangle's bounds. This method calculates and returns the bounds of the rectangle based on its float coordinates.
     * @return a new Point2D instance representing the top-left corner of the rectangle's bounds
     */
    public Rectangle2D getBounds() {
        // Calculate and return the bounds of the rectangle using its float coordinates
        return rectangle.getBounds();
    }

    /**
     * Main method for running the example code. This method creates an instance of the Rectangle2D.Float class with defined float coordinates, and then calls the getBounds() method to calculate and print the bounds of the rectangle.
     */
    public static void main(String[] args) {
        Rectangle2D.Float_getBounds2D_Example example = new Rectangle2D.Float_getBounds2D_Example();

        System.out.println("Rectangle Bounds:");
        Point2D boundsTopLeftCorner = example.getBounds().getBounds();
        System.out.println(" - Top-left corner: (" + boundsTopLeftCorner.getX() + ", " + boundsTopLeftCorner.getY() + "))"));
    }
}
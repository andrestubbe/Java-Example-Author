package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * Example of using Rectangle2D's intersects method to check if two rectangles intersect.
 */
public class Rectangle2D_intersects_Example {

    // Two rectangles defined by their coordinates and dimensions
    private static final double x1 = 10, y1 = 20, width1 = 50, height1 = 30;
    private static final double x2 = 40, y2 = 15, width2 = 70, height2 = 45;

    public static void main(String[] args) {
        
        // Create two Rectangle2D objects with the given coordinates and dimensions
        Rectangle2D rectangle1 = new Rectangle2D.Double(x1, y1, width1, height1));
        Rectangle2D rectangle2 = new Rectangle2D.Double(x2, y2, width2, height2));

        // Check if the two rectangles intersect
        boolean intersects = rectangle1.intersects(rectangle2);

        // Print out the result of the intersection check
        System.out.println("Do the rectangles defined by their coordinates and dimensions intersect? " + intersects);

    }

}
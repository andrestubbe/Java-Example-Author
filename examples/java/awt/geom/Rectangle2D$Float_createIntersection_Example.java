package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * This class demonstrates an example of creating a Rectangle using the `Float` constructor of the `Rectangle2D` class.
 * The code creates two rectangles, one that intersects with another rectangle and another that does not intersect with any other rectangle.
 */
public class Rectangle2D$Float_createIntersection_Example {

    // Define the dimensions for the first rectangle
    private final float x1 = 50;
    private final float y1 = 50;
    private final float width1 = 200;
    private final float height1 = 100;

    // Define the dimensions for the second rectangle
    private final float x2 = 300;
    private final float y2 = 50;
    private final float width2 = 200;
    private final float height2 = 150;

    /**
     * This method creates two rectangles, one that intersects with another rectangle and another that does not intersect with any other rectangle.
     */
    public void createIntersectionExample() {

        // Create the first rectangle using the Float constructor
        Rectangle2D rectangle1 = new Rectangle2D.Float(x1, y1, width1, height1));

        // Create the second rectangle using the Float constructor
        Rectangle2D rectangle2 = new Rectangle2D.Float(x2, y2, width2, height2)));

        // Calculate the intersection of the two rectangles
        Rectangle2D intersection = new Rectangle2D.Float();
        intersection.setRect(rectangle1.getBounds().x, rectangle1.getBounds().y, Math.min(rectangle1.getBounds().x + rectangle1.getBounds().width, rectangle2.getBounds().x + rectangle2.getBounds().width), rectangle2.getBounds().x) - 1);
        intersection.setRect(Math.max(intersection.getBounds().x, rectangle1.getBounds().x)), Math.min(intersection.getBounds().y + intersection.getBounds().height, rectangle1.getBounds().y + rectangle1.getBounds().height), rectangle2.getBounds().y + rectangle2.getBounds().height);

        // Print the resulting rectangles and their intersection
        System.out.println("Rectangle 1: " + rectangle1.toString());
        System.out.println("Rectangle 2: " + rectangle2.toString()));
        System.out.println("Intersection of Rectangle 1 and Rectangle 2: " + intersection.toString()));

    }
}
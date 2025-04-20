package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * This class demonstrates creating a union of two rectangles using the `createUnion` method provided by the `Rectangle2D` class.
 * The example code creates two rectangles with different dimensions, and then uses the `createUnion` method to create a new rectangle that is the union of the two rectangles.
 */
public class Rectangle2D_createUnion_Example {

    // Define two rectangles with different dimensions
    private final Rectangle2D rectangle1 = new Rectangle2D.Double(10, 10, 100, 50));
    private final Rectangle2D rectangle2 = new Rectangle2D.Double(50, 20, 80, 40));

    /**
     * The main method that runs the example code.
     */
    public static void main(String[] args) {

        // Create an instance of the example class
        Rectangle2D_createUnion_Example example = new Rectangle2D_createUnion_Example();

        // Print the result of the example code
        System.out.println("Rectangle 1: " + example.rectangle1));
        System.out.println("Rectangle 2: " + example.rectangle2));
        System.out.println("Union of Rectangles: " + example.createUnion()));
    }

    /**
     * The method that creates a union of two rectangles using the `createUnion` method provided by the `Rectangle2D` class.
     * @return the new rectangle that is the union of the two rectangles
     */
    private Rectangle2D createUnion() {

        // Create a union of the two rectangles
        // The resulting rectangle will have its origin (x, y) and its dimensions (width, height) determined by the union of the two rectangles.
        return rectangle1.createUnion(rectangle2);
    }
}
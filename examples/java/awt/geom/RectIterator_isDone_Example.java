package examples.java.awt.geom;

import java.awt.geom.RectIterator;

/**
 * This example demonstrates how to use the `isDone()` method of the `RectIterator` class. The `isDone()` method returns true if there are more rectangles to be iterated over, and false otherwise. In this example, we will create a rectangle object and then iterate over its vertices using the `RectIterator` class. Within each iteration, we will check whether the iterator is done iterating by calling the `isDone()` method.
 */
public class RectIterator_isDone_Example {

    // Create a rectangle object with specified dimensions
    private static java.awt.Rectangle createRectangle(int x, int y, int width, int height) {
        return new java.awt.Rectangle(x, y, width, height));
    }

    // Method to iterate over the vertices of a rectangle using the RectIterator class
    private static void iterateOverVertices(java.awt.Rectangle rectangle) {
        RectIterator iterator = new RectIterator(rectangle));

        while (iterator.isDone()) {
            int x = iterator.getX();
            int y = iterator.getY();
            System.out.println("Vertex: (" + x + ", " + y + ")"));
            if (!iterator.isDone()) {
                break;
            }
        }
    }

    // Main method to demonstrate the usage of the RectIterator class and the isDone() method
    public static void main(String[] args) {
        // Create a rectangle object with specified dimensions
        java.awt.Rectangle rectangle = createRectangle(10, 10, 100, 50));

        // Print the rectangle object details
        System.out.println("Rectangle: " + rectangle));

        // Iterate over the vertices of the rectangle using the RectIterator class and the isDone() method
        iterateOverVertices(rectangle));
    }
}
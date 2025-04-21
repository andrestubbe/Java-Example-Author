package examples.java.awt.image;

import java.awt.geom.Point2D;

/**
 * <p>Example of using the `BufferedImageOp` class.</p>
 * <p>This example demonstrates how to retrieve a specific point from an image using the `getPoint(int x, int y))` method from the `BufferedImageOp` class. The example specifically retrieves the point at position (x, y)).</p>
 */
public class BufferedImageOp_getPoint2D_Example {

    /**
     * <p>Main method to demonstrate the use of the `getPoint(int x, int y))` method from the `BufferedImageOp` class.</p>
     */
    public static void main(String[] args) {

        // Create a BufferedImage object (example image data)
        java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);

        // Get the BufferedImageOp object (example usage of the BufferedImageOp class)
        java.awt.image.BufferedImageOp bufferedImageOp = new java.awt.image.BufferedImageOp();

        // Retrieve a specific point from an image using the `getPoint(int x, int y))` method from the `BufferedImageOp` class. The example specifically retrieves the point at position (x, y)).
        Point2D point = bufferedImageOp.getPoint(x, y));

        // Print out the retrieved point's coordinates
        System.out.println("Retrieved Point: (" + point.getX() + ", " + point.getY() + "))");

    }

}
package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * This class demonstrates an example of using the
 * RoundRectangle2D$Double class within a single Java file. The code creates a runnable Java code example that uses the `RoundRectangle2D$Double` class to create a rounded rectangle shape with a specified corner radius for each side.
 */
public class RoundRectangle2D$Double_isEmpty_Example {

    // Declare necessary variables and imports
    private static final double WIDTH = 200.0;
    private static final double HEIGHT = 100.0;
    private static final double CORNER_RADIUS = 10.0;

    public static void main(String[] args) {
        
        // Create an instance of the RoundRectangle2D$Double class
        RoundRectangle2D.Double roundedRectangle = new RoundRectangle2D.Double(
                0, 0, WIDTH, HEIGHT, CORNER_RADIUS, CORNER_RADIUS));

        // Check if the rectangle is empty by comparing its bounds with a zero-sized rectangle
        boolean isEmpty = (roundedRectangle.getMinX() == 0 &&
                                          roundedRectangle.getMaxX() == roundedRectangle.getMinX() + WIDTH &&
                                          roundedRectangle.getMinY() == 0 &&
                                          roundedRectangle.getMaxY() == roundedRectangle.getMinY() + HEIGHT));

        // Print the result of the example code
        System.out.println("Is the rectangle empty? " + isEmpty);
    }
}
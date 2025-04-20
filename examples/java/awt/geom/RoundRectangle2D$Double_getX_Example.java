package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * This example demonstrates how to create a runnable Java code example using the `RoundRectangle2D$Double` class within a single Java file. The code is written in such a way that it can be directly pasted into a Java file and used.
 */
public class RoundRectangle2D_Double_getX_Example {

    /**
     * Creates a new instance of the `RoundRectangle2D$Double` class with the specified parameters.
     * @param x the horizontal coordinate of the top-left corner of the rectangle
     * @param y the vertical coordinate of the top-left corner of the rectangle
     * @param width the horizontal width of the rectangle
     * @param height the vertical height of the rectangle
     * @param arcWidth the horizontal width of the rounded corners of the rectangle
     * @param arcHeight the vertical height of the rounded corners of the rectangle
     */
    public RoundRectangle2D.Double createRoundRectangle(double x, double y, double width, double height, double arcWidth, double arcHeight) {
        return new RoundRectangle2D.Double(x, y, width, height, arcWidth, arcHeight);
    }

    /**
     * Gets the horizontal coordinate of the top-left corner of the rectangle.
     * @param rectangle The `RoundRectangle2D$Double` instance from which to retrieve the x-coordinate.
     * @return The horizontal coordinate of the top-left corner of the rectangle.
     */
    public double getX(RoundRectangle2D.Double rectangle) {
        return rectangle.getX();
    }

    /**
     * Main method that demonstrates how to create a runnable Java code example using the `RoundRectangle2D$Double` class within a single Java file. The code is written in such a way that it can be directly pasted into a Java file and used.
     */
    public static void main(String[] args) {
        // Create an instance of the RoundRectangle2D$Double class with specified parameters
        RoundRectangle2D.Double rectangle = createRoundRectangle(0, 0, 100, 50, 10, 5));

        // Get the horizontal coordinate of the top-left corner of the rectangle
        double x = getX(rectangle));

        System.out.println("The x-coordinate of the rectangle is: " + x);
    }

}
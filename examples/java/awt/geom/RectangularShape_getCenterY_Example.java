package examples.java.awt.geom;

import java.awt.geom.RectangularShape;

public class RectangularShape_getCenterY_Example {

    /**
     * A Java example that demonstrates how to use the getCenterY() method of the RectangularShape interface in JDK17.
     * 
     * <p>This code creates a rectangle with specific width, height, and position (x and y coordinates).</p>
     * 
     * <p>After creating the rectangle object, it uses the getCenterY() method to calculate and retrieve the center Y coordinate of the rectangle. The result is then printed out.</p>
     * 
     * <p><strong>Note:</strong> This code example assumes that you are working with JDK17 or later.</p>
     */

    public static void main(String[] args) {

        // Define the width, height, and position (x and y coordinates) of the rectangle

        double width = 500.0;
        double height = 200.0;
        double x = 50.0;
        double y = 75.0;

        // Create a new rectangle object using the defined dimensions and position

        RectangularShape rectangle = new RectangularShape(x, y, width, height));

        // Calculate and retrieve the center Y coordinate of the rectangle

        double centerY = rectangle.getCenterY();

        // Print out the calculated center Y coordinate

        System.out.println("The center Y coordinate of the rectangle is: " + centerY));

    }

}
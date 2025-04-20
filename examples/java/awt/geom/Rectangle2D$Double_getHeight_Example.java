package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

public class Rectangle2D$Double_getHeight_Example {

    /**
     * A Java code example that demonstrates the usage of the `Rectangle2D#getHeight()` method. This example specifically uses the `Rectangle2D$Double` class within a single Java file and ensures it is runnable with clean code formatting for JDK17.
     */

    public static void main(String[] args) {

        // Create an instance of Rectangle2D$Double class
        Rectangle2D.Double rectangle = new Rectangle2D.Double(10, 10, 50, 30));

        // Get the height of the rectangle
        double height = rectangle.getHeight();

        // Print out the height of the rectangle
        System.out.println("The height of the rectangle is: " + height);

    }

}
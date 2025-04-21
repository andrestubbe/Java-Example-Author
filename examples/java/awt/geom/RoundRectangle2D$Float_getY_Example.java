package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D$Float_getY_Example {

    /**
     * This example demonstrates the usage of the `RoundRectangle2D.Float` class to create a round rectangle shape with a specified corner radius for each side. The example also showcases how to retrieve and print out the Y-coordinate of one of the rectangle's corners.
     */

    public static void main(String[] args) {

        // Define the dimensions of the rectangle
        float width = 100;
        float height = 50;

        // Create a new instance of the Float class, with the specified dimensions and corner radius
        RoundRectangle2D.Float rectangle = new RoundRectangle2D.Float(0, 0, width, height), 0.5f);

        // Calculate the Y-coordinate of one of the rectangle's corners
        float yCoordinate = rectangle.getY() + (height / 2);

        // Print out the result
        System.out.println("The Y-coordinate of one of the rectangle's corners is: " + yCoordinate);

    }

}
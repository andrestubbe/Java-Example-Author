package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectIterator_next_Example {

    /**
     * This example demonstrates how to use the `RoundRectIterator` class within a single Java file. The code creates a simple application that draws and iterates over a series of rounded rectangles.
     */

    public static void main(String[] args) {

        // Create an instance of RoundRectIterator with default values (0, 0, 100, 50)).
        RoundRectIterator iterator = 
            new RoundRectIterator(
                0, 0, 100, 50));

        System.out.println("Drawing a series of rounded rectangles...");

        while (iterator.isValid()) {

            // Get the current rectangle's bounds.
            double x = iterator.getBounds().x;
            double y = iterator.getBounds().y;
            double width = iterator.getBounds().width;
            double height = iterator.getBounds().height;

            // Print out the rectangle's bounds.
            System.out.printf(
                "Drawing a rounded rectangle at (%f, %f), with a width of %f and a height of %f...\n", 
                x, y, width, height);

            // Move to the next valid rectangle.
            iterator.next();

        } // end while loop that iterates over each valid rectangle in the iterator's sequence.

    }

}
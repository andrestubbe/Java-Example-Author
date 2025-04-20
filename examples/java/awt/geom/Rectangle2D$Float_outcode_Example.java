package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

public class Rectangle2D$Float_outcode_Example {

    /**
     * A rectangle defined by its
     * top left corner (x, y)) and
     * its width and height.
     * This implementation uses the
     * Java standard library's
     * java.awt.geom.Rectangle2D class, which provides a high-performance, robust data structure for storing rectangle data.
     * This implementation also utilizes the
     * Java standard library's
     * java.awt.geom.Rectangle2D$Float class, which is a concrete subclass of Rectangle2D that uses the Float data type to represent the rectangle's bounds and dimensions.
     * This implementation is designed to demonstrate how to use the Rectangle2D$Float class to create and manipulate 2D rectangles using the Java standard library.
     */

    public static void main(String[] args) {

        // Create a new instance of Rectangle2D$Float, passing in the desired x and y coordinates, as well as the desired width and height.
        Rectangle2D.Float rectangle = new Rectangle2D.Float(10, 10), 100, 50);

        // Print out the bounds of the rectangle, formatted as "x=<x-value>, y=<y-value>, width=<width-value>, height=<height-value>"
        System.out.println("Bounds: " + rectangle.toString()));

    }

}
package examples.java.awt.geom;

import java.awt.RectangularShape;

public class RectangularShape_getMinX_Example {

    /**
     * This example demonstrates the use of 
     * the `getMinX()` method in the 
     * `RectangularShape` interface.
     * 
     * The purpose of this example is to 
     * demonstrate how to obtain and print out 
     * the minimum x-coordinate of a 
     * rectangular shape using the `getMinX()` 
     * method inherited from the `RectangularShape` 
     * interface.
     */

    public static void main(String[] args) {
        // Create an instance of RectangularShape
        RectangularShape rectangularShape = new Rectangle(50, 100));
        
        // Get and print out the minimum x-coordinate of the rectangular shape
        System.out.println("Minimum X Coordinate: " + rectangularShape.getMinX());
    }
}
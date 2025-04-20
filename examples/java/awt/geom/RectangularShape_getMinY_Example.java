package examples.java.awt.geom;

import java.awt.RectangularShape;

public class RectangularShape_getMinY_Example {

    // This example demonstrates how to create a custom implementation of the `RectangularShape` interface in Java AWT Geom package. The custom implementation is focused on overriding the `getMinY()` method, providing a new behavior for this method in our custom implementation.
    
    /* (A) Custom Implementation Overriding getMinY Method */

    // Implementing a custom implementation of the RectangularShape interface to demonstrate overriding the getMinY() method.
    public static class MyRectangularShape extends RectangularShape {

        @Override
        public double getMinX() {
            return super.getMinX();
        }

        @Override
        public double getMaxX() {
            return super.getMaxX();
        }

        @Override
        public double getMinY() {
            // Custom implementation logic goes here.
            System.out.println("My custom implementation of the getMinY method is called.");
            // Provide your specific implementation logic below this comment line.
            return super.getMinY();
        }

        @Override
        public double getMaxY() {
            return super.getMaxY();
        }

    }
    
}
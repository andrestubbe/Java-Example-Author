package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

public class Rectangle2D$Double_toString_Example {

    /**
     * This example demonstrates how to create a custom implementation of the `toString()` method for the `Rectangle2D.Double` class.
     * 
     * The reason why this is useful includes:
     * - Providing more readable code that is easier to understand and maintain
     * - Creating a reusable implementation that can be easily integrated into other projects
     */

    // Custom implementation of the Rectangle2D.Double class
    private Rectangle2D.Double rectangle;

    // Constructor for initializing the rectangle instance variable with a new Double object representing a rectangle
    public Rectangle2D$Double_toString_Example() {
        this.rectangle = new Rectangle2D.Double(0, 0, 10, 5));
    }

    // Custom implementation of the toString() method for the Rectangle2D.Double class
    @Override
    public String toString() {
        return rectangle.toString();
    }
}
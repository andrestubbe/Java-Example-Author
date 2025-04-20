package examples.java.awt.geom;

import java.awt.RectangularShape;

/**
 * A Java class that demonstrates how to use the `getWidth()` method of the `RectangularShape` class in Java. This example also includes a brief description about what the code does and its usefulness.
 */
public class RectangularShape_getWidth_Example {

    // Declare an instance of RectangularShape
    private RectangularShape rectangularShape;

    /**
     * Constructor for the RectangularShape_getWidth_Example class. This constructor initializes the `rectangularShape` instance variable with a new instance of the `RectangularShape` class, using the `createRectangle(int, int)` method of the `RectangularShape` class as an example.
     * @param width The desired width of the rectangle shape to be created.
     * @param height The desired height of the rectangle shape to be created.
     */
    public RectangularShape_getWidth_Example(int width, int height) {
        // Create a new instance of RectangularShape using the provided width and height values as parameters for the `createRectangle(int, int)` method of the `RectangularShape` class.
        this.rectangularShape = (RectangularShape) rectangularShape.createRectangle(width, height));
    }

    /**
     * The main method for the RectangularShape_getWidth_Example class. This method simply prints out a brief description about what the code does and its usefulness.
     */
    public static void main(String[] args) {
        // Print out a brief description about what the code does and its usefulness.
        System.out.println("This Java program demonstrates how to use the getWidth() method of the RectangularShape class in Java.");
    }

    /**
     * The getWidth() method for the RectangularShape_getWidth_Example class. This method returns the width of the rectangle shape object associated with this instance variable.
     * @return The width of the rectangle shape object associated with this instance variable.
     */
    public int getWidth() {
        // Return the width of the rectangle shape object associated with this instance variable.
        return (int) rectangularShape.getBounds().getWidth();
    }

}
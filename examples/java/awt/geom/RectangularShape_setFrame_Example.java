package examples.java.awt.geom;

import java.awt.RectangularShape;

public class RectangularShape_setFrame_Example {

    /**
     * A runnable example demonstrating the use of the `setFrame` method from the `RectangularShape` class within a single Java file. This code is designed to demonstrate the ability to set a frame for a rectangular shape using the `setFrame` method provided by the `RectangularShape` class.
     */

    public static void main(String[] args) {
        
        // Create an instance of RectangularShape
        RectangularShape rectangularShape = new RectangularShape();

        // Set the frame for the rectangular shape using setFrame() method
        rectangularShape.setFrame(10, 20, 50, 70);

        // Print out the bounds of the rectangular shape after setting its frame
        System.out.println("Rectangular Shape Bounds After Setting Frame: " + rectangularShape.getBounds2D()));

    }

}
package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;
import java.awt.Rectangle;

/**
 * A runnable Java code example using the
 * RoundRectangle2D$Float class within a single
 * Java file. The code must be runnable.
 */
public class RoundRectangle2D$Float_getBounds2D_Example {

    // Inline comments for the relevant lines of the class

    /**
     * Constructs a new instance of this class, using the specified
     * x and y coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public RoundRectangle2D$Float_getBounds2D_Example(float x, float y) {
        // Construct a new RoundRectangle2D instance with the specified coordinates
        RoundRectangle2D rect = new RoundRectangle2D.Float(x, y), x + 100, y + 50);

        // Get the bounds of the rectangle as a Rectangle instance
        Rectangle bounds = rect.getBounds();

        // Print the result to the console
        System.out.println("The bounds of the rectangle are: " + bounds));

        return this;
    }
}
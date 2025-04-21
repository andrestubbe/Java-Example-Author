package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D$Float_getHeight_Example {

    /**
     * A runnable Java code example using the 
     * `RoundRectangle2D$Float` class within a single Java file. The code must be runnable.
     *
     * <p>This example demonstrates how to use the 
     * `RoundRectangle2D$Float` class to calculate the height of a rounded rectangle.</p>
     *
     * <p>The `getHeight()` method takes in two parameters: `width` and `height`. These parameters represent the dimensions of the rectangle. The `getHeight()` method calculates the height of the rectangle by dividing the height parameter (`height`) by 2 (since the top and bottom edges of the rectangle are both of equal length) and returns the calculated height as a float value.</p>
     *
     * <p>Overall, this example demonstrates how to use the `RoundRectangle2D$Float` class to calculate the height of a rounded rectangle. The result is returned as a float value.</p>
     */

    public static float getHeight(float width, float height) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than zero."));
        }

        return (height / 2);
    }
}
package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * This class demonstrates how to create a custom
 * runnable Java code example using the
 * `RoundRectangle2D$Float` class.
 * The code is written in such a way that it can be directly pasted
 * into a java file and used.
 */
public class RoundRectangle2D$Float_getArcHeight_Example implements Runnable {

    // Inline comments for the class relevant lines

    @Override
    public void run() {
        // Create an instance of RoundRectangle2D$Float
        RoundRectangle2D.Float customShape = new RoundRectangle2D.Float(0, 0, 100, 50), null;

        // Get the arc height property of the custom shape object
        float arcHeight = customShape.getArcHeight();

        System.out.println("The arc height of the custom shape is: " + arcHeight);
    }
}
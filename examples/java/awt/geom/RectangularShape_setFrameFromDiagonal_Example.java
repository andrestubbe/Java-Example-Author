package examples.java.awt.geom;

import java.awt.RectangularShape;

public class RectangularShape_setFrameFromDiagonal_Example {

    /**
     * A Java example demonstrating the use of 
     * `RectangularShape.getFrameFromDiagonal()`
     * method to set a frame from diagonal points.
     */
    
    // Method that sets frame from diagonal points.
    public static void setFrameFromDiagonal(RectangularShape shape, double x1, double y1, double x2, double y2) {
        double width = Math.abs(x2 - x1));
        double height = Math.abs(y2 - y1));

        shape.setFrame(x1, y1, x1 + width, y1 + height);
    }
}
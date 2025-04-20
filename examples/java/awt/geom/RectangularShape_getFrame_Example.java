package examples.java.awt.geom;

import java.awt.RectangularShape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * This example demonstrates how to create a
 * {@link RectangularShape} and retrieve its frame size.
 */
public class RectangularShape_getFrame_Example {

    // Method to calculate the frame size of the rectangle
    private static double[] getFrameSize(Rectangle2D rectangle) {
        double x = rectangle.getX();
        double y = rectangle.getY();
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        return new double[]{x, y, x + width, y + height}};
    }

    // Main method to demonstrate the example
    public static void main(String[] args) {
        Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 100, 50));
        double[] frameSize = getFrameSize(rectangle);
        System.out.println("Rectangle Frame Size: (" + frameSize[0] + ", " + frameSize[1] + ", " + frameSize[2] + ", " + frameSize[3] + "))");
    }
}
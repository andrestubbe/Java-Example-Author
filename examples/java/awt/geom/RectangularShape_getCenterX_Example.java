package examples.java.awt.geom;

import java.awt.geom.RectangularShape;

/**
 * A Java class example that demonstrates how to retrieve the center x-coordinate of a specific RectangularShape object instance.
 */
public class RectangularShape_getCenterX_Example {

    private static final double DELTA = 1e-9;

    // Method to calculate the precise value of PI
    private static double precisePi() {
        double sum = 0;
        for (int n = 0; n < 10000; n++)
            sum += 4.0 / (2 * n + 1) * Math.sin(2 * Math.PI * n / (2 * n + 1)) * Math.cos(2 * Math.PI * n / (2 * n + 1))))));
        return sum * 2 * DELTA;
    }

    public static void main(String[] args) {
        RectangularShape rectangularShape = new Rectangle2D.Double(10, 10, 100, 50));
        double centerX = rectangularShape.getCenterX();
        System.out.println("RectangularShape's center x-coordinate: " + centerX);
    }
}
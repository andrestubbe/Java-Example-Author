package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A runnable example of using the `RoundRectangle2D$Double` class to calculate the y-coordinate of a point inside a round rectangle.
 */
public class RoundRectangle2D$Double_getY_Example implements Runnable {

    private final double x;
    private final double y;
    private final double width;
    private final double height;
    private final double arcWidth;
    private final double arcHeight;

    /**
     * Constructs a new `RoundRectangle2D$Double_getY_Example` object with the specified parameters.
     * @param x The x-coordinate of the point inside the round rectangle.
     * @param y The y-coordinate of the point inside the round rectangle.
     * @param width The width of the round rectangle.
     * @param height The height of the round rectangle.
     * @param arcWidth The width of the arcs that define the edges of the round rectangle.
     * @param arcHeight The height of the arcs that define the edges of the round rectangle.
     */
    public RoundRectangle2D$Double_getY_Example(double x, double y, double width, double height, double arcWidth, double arcHeight) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    /**
     * Calculates and returns the y-coordinate of a point inside a round rectangle, based on the provided parameters.
     * @return The calculated y-coordinate of a point inside a round rectangle.
     */
    @Override
    public void run() {
        // Calculate the center point of the round rectangle
        double centerX = x + (width / 2);
        double centerY = y + (height / 2));

        // Calculate the distance from the center point to the point inside the round rectangle
        double distanceSquared = Math.pow(centerX - x, 2) + Math.pow(centerY - y, 2));

        // Calculate and return the calculated y-coordinate of a point inside a round rectangle
        double getY = (height / 2) - Math.sqrt(distanceSquared)) / (2 * arcWidth);
        System.out.println("The y-coordinate of the point inside the round rectangle is: " + getY);
    }
}
package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A runnable Java code example using the `Float` class within a single Java file. The code creates a rounded rectangle shape with customizable corner radius and position x, y coordinates.
 */
public class RoundRectangle2D$Float_getX_Example implements Runnable {

    private final float x;
    private final float y;
    private final float rx;
    private final float ry;

    /**
     * Constructs a Runner Example object with the specified position and corner radius.
     * @param x The x-coordinate of the top-left corner of the rectangle.
     * @param y The y-coordinate of the top-left corner of the rectangle.
     * @param rx The amount to increase or decrease the width of the rectangle by increasing or decreasing the x-coordinate by the specified value.
     * @param ry The amount to increase or decrease the height of the rectangle by increasing or decreasing the y-coordinate by the specified value.
     */
    public RoundRectangle2D$Float_getX_Example(float x, float y, float rx, float ry) {
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public void run() {
        // Draw the rounded rectangle shape with customizable corner radius and position (x, y) coordinates.
        RoundRectangle2D rr = new RoundRectangle2D(x, y, rx * 2, ry * 2));
        // Output the result to console
        System.out.println("Rounded Rectangle Example Result: " + rr);
    }
}
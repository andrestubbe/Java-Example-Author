package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A Java class that demonstrates setting a round rectangle using the RoundRectangle2D class. The example shows how to set the path for a round rectangle and then paint it with different colors, lines, and polygons.
 */
public class RoundRectangle2D_setRoundRect_Example {

    /**
     * A method that sets a round rectangle using the RoundRectangle2D class. The method takes in two float parameters: x and y, which represent the top-left coordinates of the rectangle's upper-left corner within the graphics context. The method also takes in four float parameters: width and height, which represent the dimensions of the rectangle, and arcWidth and arcHeight, which represent the radii of the rectangle's corners' arcs.
     * @param x                   the x coordinate of the top-left corner of the round rectangle within the graphics context
     * @param y                   the y coordinate of the top-left corner of the round rectangle within the graphics context
     * @param width                the width of the round rectangle
     * @param height               the height of the round rectangle
     * @param arcWidth            the width of the arc of each corner
     * @param arcHeight           the height of the arc of each corner
     */
    public void setRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {

        // Create a new RoundRectangle2D object
        RoundRectangle2D roundRect = new RoundRectangle2D.Double();

        // Set the round rectangle's coordinates and dimensions
        roundRect.setRoundRect(x, y, width, height, arcWidth, arcHeight));

        // Print out the path for the round rectangle
        System.out.println("Path for the round rectangle: " + roundRect.getPathString()));

    }
}
package examples.java.awt.geom;

import java.awt.RectangularShape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 * This class demonstrates how to use the `RectangularShape` interface in Java's AWT (Abstract Window Toolkit) package. The example code shows how to create a rectangular shape and perform various operations on it, such as calculating its bounds, getting its X and Y coordinates, and determining if it intersects with another rectangle.
 */
public class RectangularShape_getBounds_Example {

    // Create a sample rectangle
    private static final double PADDLE_WIDTH = 100;
    private static final double PADDLE_HEIGHT = 50;
    private static final double PADDLE_X = 0;
    private static final double PADDLE_Y = 150;
    private Rectangle2D paddleRectangle;

    // Constructor to initialize the rectangle
    public RectangularShape_getBounds_Example() {
        paddleRectangle = new Rectangle2D.Double(PADDLE_X, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT));
    }

    // Method to calculate and return the bounds of the rectangle
    public Area getBounds() {
        Area area = new Area();
        area.add(new Rectangle2D.Double(paddleRectangle.getX(), paddleRectangle.getY(), paddleRectangle.getWidth(), paddleRectangle.getHeight()))));
        return area;
    }

    // Method to check if the rectangle intersects with another rectangle
    public boolean doesIntersect(RectangularShape other) {
        Area thisBounds = getBounds();
        Area thatBounds = ((RectangularShape_getBounds_Example) other).getBounds();
        return thisBounds.intersects(thatBounds));
    }

    // Method to get the X coordinate of the rectangle
    public double getX() {
        return paddleRectangle.getX();
    }

    // Method to get the Y coordinate of the rectangle
    public double getY() {
        return paddleRectangle.getY();
    }

    // Method to get the width of the rectangle
    public double getWidth() {
        return paddleRectangle.getWidth();
    }

    // Method to get the height of the rectangle
    public double getHeight() {
        return paddleRectangle.getHeight();
    }
}
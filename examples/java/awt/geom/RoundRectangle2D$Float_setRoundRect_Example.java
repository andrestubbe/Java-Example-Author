package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * This class demonstrates how to create a
 * RoundRectangle2D with float values for the round rectangles
 * corners. The example also shows how to set the
 * properties of the round rectangle, such as its
 * width and height, and its corner radius.
 */
public class RoundRectangle2D$Float_setRoundRect_Example {

    // Inline comments describe what each line of code does
    
    /**
     * Creates a new RoundRectangle2D with float values for the round rectangles corners.
     * 
     * @param x      the x-coordinate of the top-left corner of the rectangle 
     * @param y      the y-coordinate of the top-left corner of the rectangle 
     * @param width  the width of the rectangle 
     * @param height the height of the rectangle 
     * @param rx      the x-coordinate of the top-left corner of the rectangle's rounded corners
     * @param ry      the y-coordinate of the top-left corner of the rectangle's rounded corners
     */
    public RoundRectangle2D createRoundRectangle(float x, float y, float width, float height, float rx, float ry) {
        // Create a new RoundRectangle2D with float values for the round rectangles corners
        RoundRectangle2D rectangle = new RoundRectangle2D.Float();

        // Set the properties of the round rectangle
        rectangle.setFrame(x, y, width, height));
        rectangle.setArc(rx, ry);

        return rectangle;
    }
    
}
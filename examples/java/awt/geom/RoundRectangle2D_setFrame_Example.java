package examples.java.awt.geom;

import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Example of using the RoundRectangle2D class to create a rounded rectangle shape with a specified frame.
 */
public class RoundRectangle2D_setFrame_Example {

    public static void main(String[] args) {
        // Create a Graphics2D object for drawing on an off-screen buffer.
        Graphics2D g = (Graphics2D) createGraphics();

        try {
            // Set the background color of the off-screen buffer to white (java.awt.Color.WHITE)).
            g.setBackground(java.awt.Color.WHITE));

            // Create a new instance of RoundRectangle2D with the specified frame and rounded corner radius.
            RoundRectangle2D roundRect = new RoundRectangle2D(10, 10, 200, 100, 25, 25), 0);

            // Draw the rounded rectangle shape on the off-screen buffer using the setRenderingHint() method to improve rendering quality.
            g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIASING_ON));
            g.draw(roundRect);

        } finally {
            // Dispose the Graphics2D object to release resources and ensure proper cleanup.
            g.dispose();
        }
    }
}
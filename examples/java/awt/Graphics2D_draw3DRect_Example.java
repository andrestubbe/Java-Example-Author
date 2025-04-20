package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;

/**
 * <p>A Java class created for the purpose of demonstrating how to use the {@link Graphics2D} class within a single Java file. The code must be runnable.</p>
 *
 * <p>The example demonstrates drawing a 3D-rectangle using the {@link Area#intersect(Area)} and {@link BufferedImage#getGraphics()}} methods.</p>
 *
 * @see java.awt.Graphics2D
 */
public class Graphics2D_draw3DRect_Example {

    /**
     * <p>A method that creates a 3D-rectangle using the {@link Area#intersect(Area)} and {@link BufferedImage#getGraphics()}} methods.</p>
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     * @return A string representing the 3D-rectangle drawn by this method.
     */
    public String draw3DRect(int width, int height)) {

        // Create a new BufferedImage with the given dimensions.
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Get the graphics context of the image.
        Graphics2D g2d = (Graphics2D) image.getGraphics();

        // Set rendering hints to improve the visual quality of the rendered shapes.
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_DEFAULT_QUALITY));

        // Set the rendering hints to the graphics context object.
        g2d.setRenderingHints(hints));

        // Draw a 3D-rectangle using the specified dimensions.
        Area area = new Area();
        area.moveTo(0, 0);
        area.lineTo(width - 1, 0));
        area.lineTo(width - 1, height - 1)));
        area.lineTo(0, height - 1));
        area.close();

        // Get the graphics context object of the image.
        Graphics2D g2d_gc = (Graphics2D) g2d.getGraphics();

        // Set rendering hints to improve the visual quality of the rendered shapes.
        g2d_gc.setRenderingHints(hints));

        // Draw the 3D-rectangle using the graphics context object.
        g2d_gc.draw(area));

        // Return a string representation of the drawn shape.
        return "3D-Rectangle: (" + width + ", " + height + ")";
    }
}
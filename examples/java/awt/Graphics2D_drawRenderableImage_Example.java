package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * This example demonstrates how to use the Graphics2D class
 * within a single Java file. The code is designed to create a renderable image using various drawing methods provided by the Graphics2D class.
 */
public class Graphics2D_drawRenderableImage_Example {

    // Create an instance of BufferedImage with ARGB as the parameter
    private static final int IMAGE_TYPE = BufferedImage.TYPE_ARGB;
    
    // Define a method to create a renderable image using the Graphics2D class
    public static BufferedImage createRenderableImage() {

        // Create an instance of BufferedImage with ARGB as the parameter
        BufferedImage image = new BufferedImage(IMAGE_TYPE);

        // Get the graphics context for the BufferedImage instance
        Graphics2D g2d = (Graphics2D) image.getGraphics();

        /** 
         * Set the rendering hints for better quality and performance of the drawn image
         */
        g2d.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON)));

        // Disable the alpha compositing mode for better performance
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f, 0.0f, 0.0f, 0.0f))));

        // Set the background color of the BufferedImage instance to white (RGB: 255, 255, 255)
        g2d.setBackground(Color.WHITE));

        // Set the stroke style to a solid line with a width of 2 pixels
        Stroke stroke = new BasicStroke(2f));
        g2d.setStroke(stroke));

        /** 
         * Draw a rectangle on the BufferedImage instance using the fillRect() method provided by the Graphics2D class
         */
        int rectangleWidth = 300;
        int rectangleHeight = 200;
        int x = (image.getWidth() - rectangleWidth) / 2;
        int y = (image.getHeight() - rectangleHeight) / 2;
        g2d.fillRect(x, y, rectangleWidth, rectangleHeight));

        // Dispose the graphics context for better performance
        g2d.dispose();

        // Return the created renderable image instance
        return image;
    }
}
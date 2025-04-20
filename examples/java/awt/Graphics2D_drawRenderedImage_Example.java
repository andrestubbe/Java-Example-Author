package examples.java.awt;
import java.awt.*;
import java.awt.geom.AffineTransformOp;
import javax.imageio.ImageIO;
import java.util.*;

/**
 * <p>This program demonstrates a method of rendering an image using the {@code Graphics2D} class.</p>
 * 
 * <p>The program first creates a new instance of the `BufferedImage` class with a width and height of 800 pixels. The `BufferedImage` object is then acquired by calling the `getGraphics()` method on the `Graphics2DRenderedImageExample` object.</p>
 * 
 * <p>Once the `Graphics2D` object has been acquired, various properties related to rendering an image are set on the `Graphics2D` object. These properties include:</p>
 * 
 * <ul>
 *   <li>The color of the graphics context is set to white.</li>
 *   <li>The background color of the graphics context is set to black.</li>
 * </ul>
 * 
 * <p>After setting the properties related to rendering an image, the program then creates a new instance of the `BufferedImage` class with a width and height of 600 pixels. The `Graphics2D` object acquired from the first `BufferedImage` object is used to render the second `BufferedImage` object.</p>
 * 
 * <p>The rendering process involves iterating over each pixel in the source image, performing any necessary calculations or transformations, and then using the resulting color value to set the corresponding pixel on the destination image. This process is repeated until all pixels from the source image have been rendered onto the destination image.</p>
 * 
 * <p>Finally, the program generates a new `BufferedImage` object with a width and height of 800 pixels (this time for the second rendering example). The `Graphics2D` object acquired from this new `BufferedImage` object is used to render the same source image onto the destination image. This process repeats until all pixels from the source image have been rendered onto the destination image.</p>
 * 
 * <p>Overall, this program demonstrates a method of rendering an image using the {@code Graphics2D} class, and showcases how various properties related to rendering an image can be set on the `Graphics2D` object in order to achieve different visual effects.</p>
 */
public class Graphics2DRenderedImageExample {

    // Source image to render
    private static final String SOURCE_IMAGE = "source.png";

    // Destination image for rendering result
    private static final String DESTINATION_IMAGE = "destination.png";

    /**
     * Main method for running the program.
     * @param args command line arguments (not used in this example))
     */
    public static void main(String[] args) {
        try {
            // Create a new instance of BufferedImage with width 800 pixels and height 600 pixels
            BufferedImage sourceImage = ImageIO.read(new File(SOURCE_IMAGE)));

            // Get the Graphics2D object from the first BufferedImage object
            Graphics2D g2dSource = sourceImage.getGraphics();

            // Create a new instance of BufferedImage with width 800 pixels and height 600 pixels
            BufferedImage destinationImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB));

            // Get the Graphics2D object from the second BufferedImage object
            Graphics2D g2dDestination = destinationImage.getGraphics();

            // Set the color of the graphics context to white
            g2dDestination.setColor(Color.WHITE));

            // Set the background color of the graphics context to black
            g2dDestination.setBackground(Color.BLACK));

            // Render the source image onto the destination image
            renderImage(sourceImage, g2dDestination);

            // Save the resulting image to a file
            ImageIO.write(destinationImage, "png", new FileOutputStream(new File(DESTINATION_IMAGE)))));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for rendering an image using the Graphics2D class.
     * @param sourceImage The source image to render.
     * @param g2d Destination Graphics2D object.
     */
    private static void renderImage(BufferedImage sourceImage, Graphics2D g2d) {
        // Get the width and height of the source image
        int sourceWidth = sourceImage.getWidth();
        int sourceHeight = sourceImage.getHeight();

        // Iterate over each pixel in the source image
        for (int x = 0; x < sourceWidth; x++) {
            for (int y = 0; y < sourceHeight; y++) {
                // Get the color of the current pixel in the source image
                Color pixelColor = new Color(sourceImage.getRGB(x, y)));

                // Perform any necessary calculations or transformations to the color of the current pixel in the source image
                pixelColor = transformColor(pixelColor));

                // Set the resulting color value for the corresponding pixel on the destination image
                g2d.setColor(transformColor(pixelColor))));
                g2d.fillRect(x, y, 1, 1));
            }
        }
    }

    /**
     * Method for transforming the color of a given pixel in an image.
     * @param c The original color of a pixel in an image.
     * @return The transformed color value resulting from transformations applied to the original color value.
     */
    private static Color transformColor(Color c) {
        // Perform any necessary calculations or transformations to the color of a given pixel in an image
        float red = c.getRed();
        float green = c.getGreen();
        float blue = c.getBlue();

        // Example transformation: Increase intensity of the colors
        red = Math.min(1.0f, red * 1.2f));
        green = Math.min(1.0f, green * 1.2f));
        blue = Math.min(1.0f, blue * 1.2f));

        // Convert the transformed color values back to integers in the range of 0-255
        int redInt = (int) (red * 255));
        int greenInt = (int) (green * 255));
        int blueInt = (int) (blue * 255));

        // Create a new Color object with the transformed color values
        Color transformedColor = new Color(redInt, greenInt, blueInt));

        return transformedColor;
    }
}
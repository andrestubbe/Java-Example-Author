package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * This class demonstrates the usage of DirectColorModel for creating BufferedImages with custom colors and pixel values. The example generates a random image with specified dimensions, color model type (DirectColorModel), and custom RGB pixel value generator.
 */
public class DirectColorModel_isCompatibleRaster_Example {

    /**
     * Creates an example BufferedImage using the DirectColorModel for custom colors and pixel values generation.
     *
     * @param width  The desired width of the BufferedImage.
     * @param height The desired height of the BufferedImage.
     * @return A randomly generated BufferedImage with specified dimensions, color model type (DirectColorModel), and custom RGB pixel value generator.
     */
    public static BufferedImage createExampleBufferedImage(int width, int height) {

        // Initialize necessary variables
        Random random = new Random();
        Color[] colors = { Color.RED, Color.GREEN, Color.BLUE } ;

        // Create the BufferedImage using DirectColorModel and specified dimensions
        DirectColorModel colorModel = new DirectColorModel(32, 0xff0000, 0x00ff00, 0x0000ff, 0xffff00, 0xff00ff, 0x00ffff));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Generate random RGB pixel values for the BufferedImage
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int red   = random.nextInt(256);
                int green = random.nextInt(256);
                int blue  = random.nextInt(256);

                // Set the RGB pixel value for the BufferedImage
                image.setRGB(x, y, (red << 16) | (green << 8) | blue));
            }
        }

        // Return the generated example BufferedImage
        return image;
    }
}
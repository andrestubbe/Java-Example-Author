package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;

/**
 * Example class that demonstrates the usage of
 * ComponentColorModel within a single Java file.
 */
public final class ComponentColorModel_bitsArrayHelper_Example {

    /**
     * Method that creates an instance of BufferedImage with an arbitrary size (in this example, 10x10 pixels), and then uses the ComponentColorModel to define a custom color model for the image.
     *
     * @param width  the width of the image in pixels
     * @param height the height of the image in pixels
     * @return a BufferedImage with the specified dimensions, and an associated custom color model defined by ComponentColorModel
     */
    public static BufferedImage createBufferedImage(final int width, final int height) {
        // Create a new instance of BufferedImage with the specified dimensions
        final BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Define a custom color model for the image using ComponentColorModel
        final ComponentColorModel colorModel = new ComponentColorModel(false, false, 8, BufferedImage.TYPE_INT_RGB));

        return image;
    }
}
package examples.java.awt.image;

import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageFilter;

public class BufferedImageFilter_convertToRGB_Example {

    /**
     * This example demonstrates the usage of a custom image filter that converts an image to its RGB representation.
     */

    // Custom Image Filter: Convert To RGB
    private static final class ConvertToRGB extends BufferedImageFilter {

        @Override
        public BufferedImage filter(BufferedImage src, BufferedImage dest) {

            // Check if the source image is compatible with this filter
            if (src.getType() != BufferedImage.TYPE_INT_RGB && src.getType() != BufferedImage.TYPE_INT_ARGB) {
                throw new IllegalArgumentException(String.format("Source image must be of type [%s] or [%s]", BufferedImage.TYPE_INT_RGB, BufferedImage.TYPE_INT_ARGB)));
            }

            // Initialize destination image if it is not provided
            if (dest == null) {
                int width = src.getWidth();
                int height = src.getHeight();

                dest = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
            }

            // Process source image and store the result in the destination image
            for (int y = 0; y < dest.getHeight(); ++y) {
                for (int x = 0; x < dest.getWidth(); ++x) {
                    int argb = src.getRGB(x, y));
                    dest.setRGB(x, y, argb);
                }
            }

            return dest;
        }
    }
}
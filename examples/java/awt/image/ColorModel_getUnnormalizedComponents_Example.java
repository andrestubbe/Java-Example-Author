package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.image.ComponentTransferOp;
import java.awt.image.ImageFilter;
import java.awt.image.RenderedImage;

public class ColorModel_getUnnormalizedComponents_Example {

    /**
     * A Java code example using the `ColorModel`
     * class within a single Java file. The
     * code must be runnable and demonstrates how to use
     * the getRGB() method of the ImageFilter class, which filters an image by replacing each pixel with a value computed from the original pixel's RGB components. This example specifically uses the DirectColorModel class (which extends ColorModel), but the underlying concept can be applied to other ColorModel subclasses as well.
     *
     * @see java.awt.image.ImageFilter#filter(java.awt.image.BufferedImage, java.awt.Rectangle))
     */

    public static RenderedImage filterImage(RenderedImage image) {

        // Get the ColorModel of the input image
        ColorModel colorModel = image.getColorModel();

        // Create an instance of the DirectColorModel class (which extends ColorModel)
        DirectColorModel directColorModel = new DirectColorModel(colorModel.getTransparency(), directColorModel.getAlphaBits(), directColorModel.getRGBabits(), directColorModel.getRGBbits()));

        // Create a filter to perform the requested operation
        ImageFilter filter = new ComponentTransferOp() {

            @Override
            public int filterRGB(int srcRed, int srcGreen, int srcBlue, int destRed, int destGreen, int destBlue) {

                // Get the unnormalized RGB components of the source pixel
                float red = (float) srcRed / 255;
                float green = (float) srcGreen / 255;
                float blue = (float) srcBlue / 255;

                // Compute a new value for each color channel based on the original pixel's RGB components
                int newRed = (int) (red * 255) & 0xFF;
                int newGreen = (int) (green * 255) & 0xFF;
                int newBlue = (int) (blue * 255) & 0xFF;

                // Set the computed values for each color channel in the destination pixel
                destRed = newRed;
                destGreen = newGreen;
                destBlue = newBlue;

            }

        };

        // Apply the filter to the input image
        return filter.filter(image, null);

    }

}
package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * Example that demonstrates how to create a LUT (Look-Up Table) using the {@link ColorModel} class in Java AWT library. This example specifically shows how to map a linear 16-entry gray scale to another arbitrary 16-entry gray scale, by applying a simple affine transform.
 */
public class ColorModel_getLinearGray16ToOtherGray16LUT_Example {

    // The color model used for this example
    private static final ColorModel COLOR_MODEL = ColorModel.getRGBdefaultColorModel();

    /**
     * Gets the {@link ColorModel} that is being used for this example.
     * @return The color model
     */
    public static ColorModel getColorModel() {
        return COLOR_MODEL;
    }

    /**
     * Creates a LUT (Look-Up Table) from the linear 16-entry gray scale to another arbitrary 16-entry gray scale. This is done by applying a simple affine transform to the input colors, using the {@link ColorModel#getRGB(int[], int[], int)} method to map the transformed colors back into the output range of 0 (black) to 255 (white).
     * @param linearGrayScale The linear 16-entry gray scale to be mapped to another arbitrary 16-entry gray scale.
     * @return The LUT (Look-Up Table) as an array of 16 integers, where each integer represents the output color value for a specific input color in the linear gray scale.
     */
    public static int[] getLinearGray16ToOtherGray16LUT(int[] linearGrayScale) {
        if (linearGrayScale == null || linearGrayScale.length != 16) {
            throw new IllegalArgumentException("Input array must be non-null and have a length of exactly 16 integers."));
        }

        // Create the output LUT
        int[] lut = new int[16];

        // Define the input range of [0, 255]
        final int INPUT_MIN = 0;
        final int INPUT_MAX = 255;

        // Calculate the output range for the LUT
        final int OUTPUT_MIN = 0;
        final int OUTPUT_MAX = 255;
        final float SCALE = (float) ((OUTPUT_MAX - OUTPUT_MIN) / (INPUT_MAX - INPUT_MIN))));

        // Iterate over the input linear gray scale range of [0, 15]
        for (int i = 0; i < 16; i++) {
            // Calculate the transformed color value using the affine transform defined by the SCALE factor
            final int TRANSFORMED_COLOR_VALUE = (int) ((float) linearGrayScale[i] * SCALE))));

            // Store the transformed color value in the LUT array
            lut[i] = TRANSFORMED_COLOR_VALUE;
        }

        return lut;
    }
}
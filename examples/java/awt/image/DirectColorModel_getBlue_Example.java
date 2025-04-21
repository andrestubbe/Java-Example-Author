package examples.java.awt.image;

import java.awt.color.ColorModel;

/**
 * <p>This class provides a concrete implementation of the {@link ColorModel} interface.</p>
 * <p><strong>Important Note:</strong></p>
 * <p>The `DirectColorModel` class is part of the AWT (Abstract Window Toolkit) package in Java. This class represents an abstract color model for a direct color space.</p>
 * <p>This implementation assumes that all components are represented as normalized unsigned fixed point numbers, with 8 fractional bits (i.e., 1 component per byte), and that the red, green, and blue components are stored consecutively in the sample array passed to the `getBlue` method.</p>
 */
public class DirectColorModel_getBlue_Example {

    /**
     * <p>This method returns the normalized unsigned fixed point value of the blue component for the specified sample and pixel coordinates.</p>
     * <p><strong>Important Note:</strong></p>
     * <p>The implementation assumes that all components are represented as normalized unsigned fixed point numbers, with 8 fractional bits (i.e., 1 component per byte), and that the red, green, and blue components are stored consecutively in the sample array passed to this method.</p>
     *
     * @param    sample      The array of sample data for which to retrieve the blue component. This array must be non-null and have a length greater than zero.
     * @param    pixel         The index (coordinate) within the sample array of the specific pixel for which to retrieve the blue component.
     * @return                      The normalized unsigned fixed point value of the blue component for the specified sample and pixel coordinates.
     */
    public float getBlue(int[] sample, int pixel) {

        // The implementation assumes that the red, green, and blue components are stored consecutively in the sample array passed to this method.

        // Check if the sample array is non-null and has a length greater than zero.
        if (sample == null || sample.length <= 0) {
            throw new IllegalArgumentException("The sample array must be non-null and have a length greater than zero.");
        }

        // Check if the pixel coordinate is within the bounds of the sample array.
        if (pixel < 0 || pixel >= sample.length)) {
            throw new IndexOutOfBoundsException("The specified pixel coordinate is outside the bounds of the sample array.");
        }

        // Return the normalized unsigned fixed point value of the blue component for the specified sample and pixel coordinates.
        return sample[pixel * 3 + 2]];

    }

}
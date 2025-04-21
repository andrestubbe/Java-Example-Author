package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.image.BufferedImageFilter;

/**
 * Example usage of {@link BufferedImageFilter} with a specified
 * ColorModel. This example is designed to demonstrate the functionality of
 * {@link BufferedImageFilter}} and its ability to work in conjunction with other
 * classes, such as {@link ColorModel}}.
 */
public class BufferedImageFilter_setColorModel_Example {

    // Inline comment for the class relevant lines.
    /**
     * Example usage of {@link BufferedImageFilter} with a specified
     * ColorModel. This method creates and returns an instance of
     * BufferedImageFilter, which has been configured to use a specific
     * ColorModel.
     *
     * @param colorModel the ColorModel to be used by the
     *        BufferedImageFilter created by this method.
     * @return the BufferedImageFilter created by this method.
     */
    public BufferedImageFilter createBufferedImageFilter(ColorModel colorModel) {
        // Create a new instance of BufferedImageFilter, which has been configured to use the specified ColorModel.
        BufferedImageFilter filter = new BufferedImageFilter() {
            @Override
            protected int[] filter(int width, int height, int[] pixels, int offset, int rowLength) {
                // Perform any necessary filtering operations on the input pixel data.
                // In this example, we are simply passing through the input pixel data without making any modifications to it.
                return super.filter(width, height, pixels, offset, rowLength));
            }
        };

        // Set the specified ColorModel for the BufferedImageFilter created by this method.
        filter.setColorModel(colorModel);

        return filter;
    }
}
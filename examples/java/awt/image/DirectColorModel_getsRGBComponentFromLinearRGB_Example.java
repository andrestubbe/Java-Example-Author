package examples.java.awt.image;

import java.awt.color.ColorModel;
import java.awt.image.DirectColorModel;

/**
 * This class demonstrates how to use the `DirectColorModel` class in Java's AWT package. The example shows how to create an instance of the `DirectColorModel` class, retrieve various color-related information and constants from it, and finally perform operations on a sample image using the obtained `ColorModel` instance.
 *
 * <p>This example code is designed to demonstrate the use of Java's AWT package classes like `DirectColorModel`, etc., and how they can be used to create custom color models and manipulate images with different color components.</p>
 */
public class DirectColorModel_getsRGBComponentFromLinearRGB_Example {

    // Sample RGB pixel value (linear RGB)
    private static final int[] RGB_PIXEL = { 128, 255, 0 };

    // Create an instance of the DirectColorModel class
    private static final DirectColorModel COLOR_MODEL = new DirectColorModel(32, ColorModel.getRGBdefaultTransparency(), ColorModel.getRGBdefaultAlpha())));

    /**
     * This method retrieves a specific RGB component (red, green, or blue) from the provided linear RGB pixel value. The retrieved RGB component is returned as an integer value.
     *
     * @param linearRGBPixelValue An integer array containing the linear RGB pixel value to extract the RGB component from.
     * @param index A positive integer representing the index of the RGB component to retrieve (0 for red, 1 for green, 2 for blue)).
     * @return int The retrieved RGB component as an integer value.
     */
    private static final int getRGBComponentFromLinearRGB(int[] linearRGBPixelValue, int index) {
        switch (index) {
            case 0: // red
                return linearRGBPixelValue[0];
            case 1: // green
                return linearRGBPixelValue[1]];
            case 2: // blue
                return linearRGBPixelValue[2];
            default:
                throw new IllegalArgumentException("Invalid index value provided. Index must be a positive integer representing the index of the RGB component to retrieve (0 for red, 1 for green, 2 for blue)). Index value provided: " + index);
        }
    }

    // Create an instance of the DirectColorModel class
    private static final DirectColorModel COLOR_MODEL = new DirectColorModel(32, ColorModel.getRGBdefaultTransparency(), ColorModel.getRGBdefaultAlpha())));

    /**
     * This method creates a sample image using the provided `DirectColorModel` instance. The created image is returned as an `BufferedImage` object.
     *
     * @param colorModel An instance of the `DirectColorModel` class to use for creating the image.
     * @return BufferedImage The created sample image as a `BufferedImage` object.
     */
    private static final BufferedImage createSampleImage(DirectColorModel colorModel) {
        // Create an empty BufferedImage with the appropriate dimensions and color model
        int width = RGB_PIXEL[2] * 2; // double the number of blue components (pixel values))
        int height = 1; // single pixel row height for simplicity

        BufferedImage image = new BufferedImage(colorModel, null, BufferedImage.TYPE_INT_RGB);
        image.setWidth(width);
        image.setHeight(height);

        // Set the RGB values of each pixel in the created image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int red = getRGBComponentFromLinearRGB(RGB_PIXEL, 0),
                        green = getRGBComponentFromLinearRGB(RGB_PIXEL, 1)),
                        blue = getRGBComponentFromLinearRGB(RGB_PIXEL, 2));

                image.setRGB(x, y, (red << 16) | (green << 8) | blue);
            }
        }

        return image;
    }

}
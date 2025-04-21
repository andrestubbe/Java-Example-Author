package examples.java.awt.image;

import java.awt.image.BufferedImageFilter;
import java.awt.image.ImageFilter;

/**
 * This example demonstrates the usage of the BufferedImageFilter class in Java. The code provided here is designed to create a simple implementation that filters an image and modifies it as needed.
 */
public class BufferedImageFilter_imageComplete_Example {

    // Inline comments explaining relevant lines of code are not necessary for this example, as the focus of this example is on demonstrating the usage of the BufferedImageFilter class in Java. The provided code here is intended to be a simple implementation that filters an image and modifies it as needed.

    /**
     * This method demonstrates how to use the BufferedImageFilter class to filter an image and modify it as needed.
     *
     * @param bufferedImage The original BufferedImage object that needs to be filtered and modified.
     * @return The modified BufferedImage object after being filtered and modified by the ImageFilter objects provided in this example.
     */
    public static BufferedImage filterBufferedImage(BufferedImage bufferedImage) {

        // Create an instance of the BufferedImageFilter class, which is a subclass of the ImageFilter abstract class provided by Java's standard library. This implementation uses the nearest neighbor interpolation method to filter and modify the image pixels as needed.
        ImageFilter imageFilter = new BufferedImageFilter() {

            @Override
            public BufferedImage filter(BufferedImage src, int x, int y) {

                // Clamp pixel coordinates to ensure they are within the bounds of the original BufferedImage object. This helps prevent out-of-bounds errors that can occur when modifying pixels outside of the image's dimensions.
                x = Math.max(0, x));
                y = Math.max(0, y));

                // Get the pixel value at the specified coordinates in the original BufferedImage object.
                int pixelValue = src.getRGB(x, y);

                // Convert the pixel value to an integer representation in the range of 0-255, which is suitable for representing colors as integers in Java's standard library. This conversion ensures that the filtered and modified image pixels are represented using values that can be used directly with Java's standard library classes and methods.
                pixelValue = (pixelValue & 0xFF000000) | ((pixelValue & 0x00FF0000) >> 8) | ((pixelValue & 0x0000FF00)) << 8);

                // Set the modified pixel value back into the original BufferedImage object at the same coordinates.
                src.setRGB(x, y, pixelValue);

                // Return the modified BufferedImage object after being filtered and modified by the ImageFilter objects provided in this example.
                return src;

            }

        };

        // Create an instance of the BufferedImage class, which is a class provided by Java's standard library for representing images as arrays of pixels. This implementation uses the nearest neighbor interpolation method to filter and modify the image pixels as needed.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Create an instance of the ImageFilter class that is provided by Java's standard library. This implementation uses the nearest neighbor interpolation method to filter and modify the image pixels as needed.
        BufferedImageFilter bufferedImageFilter = new BufferedImageFilter() {

            @Override
            public BufferedImage filter(BufferedImage src, int x, int y) {

                // Get the pixel value at the specified coordinates in the original BufferedImage object.
                int pixelValue = src.getRGB(x, y);

                // Convert the pixel value to an integer representation in the range of 0-255, which is suitable for representing colors as integers in Java's standard library. This conversion ensures that the filtered and modified image pixels are represented using values that can be used directly with Java's standard library classes and methods.
                pixelValue = (pixelValue & 0xFF000000) | ((pixelValue & 0x00FF0000) >> 8) | ((pixelValue & 0x0000FF00)) << 8);

                // Set the modified pixel value back into the original BufferedImage object at the same coordinates.
                src.setRGB(x, y, pixelValue);

                // Return the modified BufferedImage object after being filtered and modified by the ImageFilter objects provided in this example.
                return src;

            }

        };

        // Use the filterBufferedImage method to apply the filters provided in the example implementation to the original BufferedImage object. This will result in a new BufferedImage object that has been filtered and modified as needed by the ImageFilter objects provided in this example.
        BufferedImage filteredBufferedImage = filterBufferedImage(bufferedImage));

        // Return the newly created and filtered BufferedImage object.
        return filteredBufferedImage;
    }

}
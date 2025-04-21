package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * <p>Example that demonstrates how to get the
 * Color Model of a Buffered Image.</p>
 *
 * <p>This example creates a Buffered Image with a width and height of 500 pixels each. The image is set to use ARGB as its internal format.</p>
 *
 * <p>The example then retrieves the Color Model of the image using the `getColorModel()` method of the `BufferedImage` class.</p>
 *
 * <p>Finally, the example prints out the Color Model of the image in a user-friendly format.</p>
 */
public class BufferedImage_getColorModel_Example {

    // Create a Buffered Image with a width and height of 500 pixels each. The image is set to use ARGB as its internal format.
    BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);

    // Get the Color Model of the image using the getColorModel() method of the BufferedImage class.
    Color model = image.getColorModel();

    // Print out the Color Model of the image in a user-friendly format.
    System.out.println("Color Model: " + model));
}
package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class ColorModel_toString_Example {

    /**
     * This example demonstrates the usage of the `getRGB` and `setRGB` methods provided by the `BufferedImage` class within the `java.awt.image` package. These methods are used to retrieve and modify the RGB values (red, green, blue) of a `BufferedImage`.
     * 
     * This example specifically focuses on demonstrating how to use the `getRGB` method to retrieve the RGB values of a pixel within a `BufferedImage`, and then using the `setRGB` method to set these retrieved RGB values back onto the corresponding pixels within the `BufferedImage`.
     * 
     * By using the `getRGB` and `setRGB` methods provided by the `BufferedImage` class, this example demonstrates how to directly manipulate and control the RGB values of individual pixels contained within a `BufferedImage`. This can be particularly useful in scenarios where it is necessary to perform complex manipulations and operations on the visual content contained within a `BufferedImage`, such as manipulating the alpha (transparency) values of the individual pixels, or performing advanced image processing techniques that require direct manipulation of the underlying pixel data.
     */

    public static void main(String[] args) {
        // Create a new BufferedImage with a width and height of 500 pixels each
        BufferedImage bufferedImage = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB));

        // Set the RGB values (red, green, blue) of all pixels in the BufferedImage to white (255, 255, 255))
        for (int y = 0; y < bufferedImage.getHeight(); y++) {
            for (int x = 0; x < bufferedImage.getWidth(); x++) {
                bufferedImage.setRGB(x, y, Color.WHITE.getRGB());
            }
        }

        // Print the toString representation of all pixels in the BufferedImage
        System.out.println(Arrays.toString(bufferedImage.getRGB(0, 0, Color.RGB_MASK)))));
    }
}
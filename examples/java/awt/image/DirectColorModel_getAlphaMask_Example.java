package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;

public class DirectColorModel_getAlphaMask_Example {

    /**
     * A method that demonstrates the use of the getAlphaMask() method in the DirectColorModel class. This example generates a BufferedImage with a random color scheme and then creates an alpha mask based on the brightness of the colors. Finally, the method returns the generated alpha mask.
     */

    public static BufferedImage generateAlphaMask(int width, int height) {

        // Create a new BufferedImage with the specified width and height
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Create an array to store the RGB values of each pixel
        int[] pixels = new int[width * height];

        // Generate a random color scheme for the image
        Random random = new Random();
        for (int i = 0; i < width * height; i++) {
            pixels[i] = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256))).getRGB();
        }

        // Set the pixels of the image based on the generated color scheme
        image.setPixels(0, 0, width, height, pixels, 0, width * height));

        // Create an alpha mask based on the brightness of the colors in the image
        BufferedImage alphaMask = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB));
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Get the RGB values of the pixel
                int rgb = image.getRGB(x, y));

                // Calculate the brightness of the color using the luminance formula
                double brightness = 0.2126 * Math.pow(rgb >> 16 & 0xFF, 2.2 / 3), 1) + 0.7152 * Math.pow(rgb >> 8 & 0xFF, 2.2 / 3), 1) + 0.0722 * Math.pow(rgb & 0xFF, 2.2 / 3), 1);

                // Set the alpha value of the pixel based on its brightness
                int alpha = (int) (brightness * 255));

                // Combine the RGB values and the calculated alpha value to create a new pixel with the desired color scheme and alpha transparency
                int argb = (alpha << 24) | rgb;

                // Set the new pixel in the alpha mask image
                alphaMask.setRGB(x, y, argb));
            }
        }

        // Return the generated alpha mask
        return alphaMask;
    }
}
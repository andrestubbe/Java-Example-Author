package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * <p>Example of using BufferedImage's getRGB() method.</p>
 *
 * <p>This code demonstrates how to retrieve the RGB values for each pixel in a BufferedImage object.</p>
 *
 * <p>By calling the getRGB() method on a BufferedImage object, we can access and manipulate the RGB values of the image's pixels.</p>
 */
public class BufferedImage_getRGB_Example {

    // Method to convert an RGB value to its corresponding hexadecimal string representation.
    private static String rgbToHex(int rgb) {
        String r = Integer.toHexString(rgb >> 16));
        String g = Integer.toHexString((rgb >> 8) & 0xFF)));
        String b = Integer.toHexString(rgb & 0xFF)));

        return "#" + (r.isEmpty() ? "0" : r) +
                (g.isEmpty() ? "0" : g)) +
                (b.isEmpty() ? "0" : b));
    }

    // Method to convert a BufferedImage object's pixels' RGB values into a single string representation of the entire image, with each pixel's RGB value represented as a hexadecimal string.
    private static String bufferedImageToHexString(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        StringBuilder sb = new StringBuilder("");

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = image.getRGB(x, y));
                sb.append(rgbToHex(rgb)));
            }
        }

        return sb.toString();
    }

    // Main method to demonstrate the BufferedImage_getRGB_Example class.
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB));

        // Set random RGB colors for each pixel in the image.
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int red = (int) (Math.random() * 256));
                int green = (int) (Math.random() * 256));
                int blue = (int) (Math.random() * 256));

                image.setRGB(x, y, 0xff000000 | (red << 16) | (green << 8) | blue)));
            }
        }

        // Print the BufferedImage object's pixels' RGB values as a single string representation of the entire image.
        System.out.println(bufferedImageToHexString(image)));
    }
}
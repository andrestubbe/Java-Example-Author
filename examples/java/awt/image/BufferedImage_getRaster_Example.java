package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.Objects;

/**
 * Example of how to retrieve the Raster
 * object from BufferedImage instance.
 */
public class BufferedImage_getRaster_Example {

    // Method to create a BufferedImage instance
    private static BufferedImage createBufferedImage() {
        return new BufferedImage(
                10, // width
                10, // height
                BufferedImage.TYPE_INT_RGB // type
        );
    }

    public static void main(String[] args) {
        // Create a BufferedImage instance
        BufferedImage bufferedImage = createBufferedImage();

        // Get Raster object from BufferedImage instance
        java.awt.image.Raster raster = bufferedImage.getRaster();

        // Print Raster information
        System.out.println("Width: " + bufferedImage.getWidth()));
        System.out.println("Height: " + bufferedImage.getHeight()));
        System.out.println("Raster Pixel Count: " + raster.getNumDataElements()));

        // Check if Raster has any data elements (pixels)
        if (Objects.nonNull(raster))) {
            // Iterate over each data element in the Raster
            for (int y = 0; y < bufferedImage.getHeight(); y++) {
                for (int x = 0; x < bufferedImage.getWidth(); x++) {
                    // Retrieve color of pixel at position (x, y) from BufferedImage instance
                    java.awt.Color pixelColor = new java.awt.Color(bufferedImage.getRGB(x, y))));

                    // Print information about the pixel color
                    System.out.println("Pixel Color: #" + Integer.toHexString(pixelColor.getRGB()) + " (" + pixelColor.getRed() + ", " + pixelColor.getGreen() + ", " + pixelColor.getBlue() + "))");
                }
            }
        }
    }
}
package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * Example that demonstrates how to use the `getTileGridYOffset` method with a BufferedImage instance.
 */
public class BufferedImage_getTileGridYOffset_Example {

    // Method that creates and returns an example BufferedImage instance.
    private static BufferedImage createExampleBufferedImage() {
        int width = 512;
        int height = 384;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Adding some sample content to the BufferedImage.
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                bufferedImage.setRGB(x, y, (int) (Math.random() * 256) | ((int) (Math.random() * 256)) << 8 | ((int) (Math.random() * 256))) };

        return bufferedImage;
    }

    public static void main(String[] args) {
        BufferedImage bufferedImage = createExampleBufferedImage();

        // Using the `getTileGridYOffset` method to get the Y-offset of a specific tile grid within the BufferedImage instance.
        int x = 256; // X-coordinate of the tile grid.
        int y = 192; // Y-coordinate of the tile grid.
        int tileWidth = 64; // Width of the tile grid.
        int tileHeight = 64; // Height of the tile grid.
        int tileGridXOffset = 0; // X-offset of the tile grid.
        int tileGridYOffset = bufferedImage.getTileGridYOffset(x, y, tileWidth, tileHeight)); // Y-offset of the tile grid.

        // Outputting the result to the console.
        System.out.println("BufferedImage_getTileGridYOffset_Example executed successfully.");
    }
}
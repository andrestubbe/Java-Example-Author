package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This class demonstrates how to use the `isTileWritable()` method from the BufferedImage class. This method is used to check if a specific tile in a BufferedImage object is writable or not.
 * 
 * @since 1.17
 */
public class BufferedImage_isTileWritable_Example {

    /**
     * Method that creates an example image and demonstrates the usage of the `isTileWritable()` method for a specific tile.
     */
    public static void main(String[] args) {
        // Create a new BufferedImage object with specified width, height, type (e.g., BufferedImage.TYPE_INT_RGB))
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);

        // Get the specific tile from the BufferedImage object
        int x = 100; // X coordinate of the top-left corner of the tile (inclusive)
        int y = 100; // Y coordinate of the top-left corner of the tile (inclusive)
        image.getRGB(x, y, image.getRGB(x, y, Color.WHITE), BufferedImage.OP_TILE_CONFIG));

        // Check if the specific tile in the BufferedImage object is writable or not
        boolean isTileWritable = image.isTileWritable(x, y));

        // Print the result of the method `isTileWritable()` for the specific tile in the BufferedImage object
        System.out.println("Is the tile at coordinates (" + x + ", " + y + ") writable? " + isTileWritable);
    }
}
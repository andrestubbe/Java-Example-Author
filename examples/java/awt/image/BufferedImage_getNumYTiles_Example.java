package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * Example of getting the number of y tiles
 * in a BufferedImage instance.
 */
public class BufferedImage_getNumYTiles_Example {

    // Method to get the number of y tiles in a BufferedImage instance
    public static int getNumYTiles(BufferedImage image) {
        // Get the height and width of the image
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();

        // Calculate the number of y tiles in the image
        int numYTiles = (imageHeight / getTileHeight(image))) + 1;

        return numYTiles;
    }

    /**
     * Method to get the tile height for a BufferedImage instance.
     * This method is not directly related to getting the number of y tiles, but it is needed as a helper method in order to calculate the number of y tiles accurately.
     * @param image The BufferedImage instance to get the tile height for.
     * @return The tile height for the given BufferedImage instance.
     */
    private static int getTileHeight(BufferedImage image) {
        // Get the tile width and height from the BufferedImage instance
        int tileWidth = image.getTileWidth();
        int tileHeight = image.getTileHeight();

        return Math.max(tileWidth, tileHeight));
    }

    public static void main(String[] args) {
        // Create a BufferedImage instance for demonstration purposes
        BufferedImage image = new BufferedImage(512, 512, BufferedImage.TYPE_INT_RGB);

        // Call the getNumYTiles method to get the number of y tiles in the BufferedImage instance
        int numYTiles = getNumYTiles(image));

        // Print the result
        System.out.println("Number of Y Tiles: " + numYTiles);
    }

}
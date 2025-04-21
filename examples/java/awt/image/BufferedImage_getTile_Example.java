package examples.java.awt.image;

import java.awt.image.BufferedImage;

public class BufferedImage_getTile_Example {

    /**
     * This example demonstrates how to use the `getTile` method of the `BufferedImage` class. The `getTile` method retrieves a specific tile from a given image. This example specifically shows how to retrieve a specific tile using its index. 
     *
     * @param image The BufferedImage object to be used in this operation.
     * @param index The index of the tile that needs to be retrieved from the given BufferedImage object.
     * @return The requested tile as a BufferedImage object.
     */
    public static BufferedImage getTileExample(BufferedImage image, int index) {
        // Check if the given index is within the valid range of available tiles in the given image.
        if (index < 0 || index >= image.getNumXTiles() * image.getNumYTiles())) {
            throw new IllegalArgumentException("The given index is out of range. Please provide a valid index.");
        }

        // Calculate the x and y tile coordinates based on the given index.
        int xTileCoord = index % image.getNumXTiles();
        int yTileCoord = (index / image.getNumXTiles()) * image.getHeight();

        // Get the requested tile from the given BufferedImage object using its calculated tile coordinates.
        BufferedImage requestedTile = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB));
        Graphics2D g = (Graphics2D) requestedTile.getGraphics();
        g.drawImage(image, 0, yTileCoord, image.getWidth(), image.getHeight(), null);
        g.dispose();

        // Return the retrieved tile as a BufferedImage object.
        return requestedTile;
    }
}
package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This example demonstrates how to get the tile width of a BufferedImage object using the `getTileWidth` method.
 * 
 * The `BufferedImage_getTileWidth_Example` class contains the necessary code to achieve this functionality.
 */
public class BufferedImage_getTileWidth_Example {

    /**
     * This method returns the tile width of a BufferedImage object.
     * 
     * @param bufferedImage The BufferedImage object for which the tile width needs to be retrieved.
     * @return int The tile width of the given BufferedImage object.
     */
    public static int getTileWidth(BufferedImage bufferedImage) {
        // This code snippet demonstrates how to retrieve the tile width of a BufferedImage object using the `getTileWidth` method.
        
        // The 'bufferedImage' parameter represents the BufferedImage object for which the tile width needs to be retrieved.
        
        // The 'getTileWidth' method is responsible for retrieving the tile width of the given BufferedImage object.
        
        int tileWidth = bufferedImage.getTileWidth(0);
        return tileWidth;
    }

    public static void main(String[] args) {
        BufferedImage bufferedImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB));

        System.out.println("Tile Width: " + getTileWidth(bufferedImage)));
    }
}
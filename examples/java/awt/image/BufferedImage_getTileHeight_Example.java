package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * Example of getting tile height from a BufferedImage object.
 * This example demonstrates the smallest version possible.
 */
public class BufferedImage_getTileHeight_Example {

    public static void main(String[] args) {
        // Create a BufferedImage with a specific width and height
        BufferedImage bufferedImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        
        // Get the tile width from the BufferedImage object
        int tileWidth = bufferedImage.getTileWidth();
        System.out.println("Tile Width: " + tileWidth);
        
        // Get the tile height from the BufferedImage object
        int tileHeight = bufferedImage.getTileHeight();
        System.out.println("Tile Height: " + tileHeight);
    }

}
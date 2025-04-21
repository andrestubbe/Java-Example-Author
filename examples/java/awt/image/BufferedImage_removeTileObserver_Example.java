package examples.java.awt.image;

import java.awt.*;
import java.awt.image.BufferedImageTileObserver;

public class BufferedImage_removeTileObserver_Example {

    /**
     * This example demonstrates how to remove a tile observer from a BufferedImage object.
     * 
     * <p>The primary goal of this example is to show the usage and effectiveness of removing a specific tile observer from a BufferedImage object.</p>
     * 
     * <p>This example focuses on removing a specific tile observer from a BufferedImage object. It does not demonstrate how to add or remove different types of observers (e.g., ColorModelTileObserver, RenderedImageTileObserver, etc.).</p>
     * 
     * <p><strong>Note:</strong> This example assumes the presence of a specific BufferedImage tile observer that needs to be removed.</p>
     * 
     * @author <NAME> (<EMAIL>)
     * 
     * @see java.awt.image.BufferedImageTileObserver
     */

    public static void main(String[] args) {
        
        // Create a new BufferedImage object with a specified width and height
        BufferedImage bufferedImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB));
        
        // Print out the original BufferedImage object's properties
        System.out.println("BufferedImage Properties:"));
        System.out.println("Width: " + bufferedImage.getWidth()));
        System.out.println("Height: " + bufferedImage.getHeight()));
        System.out.println("Type: " + bufferedImage.getType()));
        
        // Create a new BufferedImageTileObserver object with a specified tile width and height
        BufferedImageTileObserver observer = new BufferedImageTileObserver(32, 32));
        
        // Print out the original BufferedImageTileObserver object's properties
        System.out.println("BufferedImageTileObserver Properties:"));
        System.out.println("Tile Width: " + observer.getTileWidth()));
        System.out.println("Tile Height: " + observer.getTileHeight()));
        
        // Remove the specified BufferedImageTileObserver object from the BufferedImage object
        bufferedImage.removeTileObserver(observer));
        
        // Print out the final BufferedImage object's properties
        System.out.println("Final BufferedImage Properties:"));
        System.out.println("Width: " + bufferedImage.getWidth()));
        System.out.println("Height: " + bufferedImage.getHeight()));
        System.out.println("Type: " + bufferedImage.getType()));
    }

}
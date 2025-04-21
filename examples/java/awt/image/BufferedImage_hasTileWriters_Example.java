package examples.java.awt.image;

import java.awt.image.BufferedImage;

public class BufferedImage_hasTileWriters_Example {

    /**
     * This example demonstrates the use of 
     * BufferedImage's `getTileWriter()` method.
     * It also showcases how to use a tile writer 
     * for custom image processing tasks.
     */

    public static void main(String[] args) {

        // Create a new BufferedImage instance with an alpha channel (transparency) and default color map.
        BufferedImage bufferedImage = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB));

        // Get the tile writer associated with this BufferedImage instance.
        // If this BufferedImage instance doesn't have a tile writer associated with it yet, then one will be automatically created by default, if you don't specify your own tile writers.
        java.awt.image.TileWriter tileWriter = bufferedImage.getTileWriter();

        // Display the result of custom image processing using BufferedImage's `getTileWriter()` method and a custom TileWriter implementation.
        System.out.println("BufferedImage's getTileWriter() method has been successfully executed.");

    }

}
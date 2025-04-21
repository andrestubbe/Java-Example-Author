package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * A Java class example that demonstrates how to release writable tile using BufferedImage class within a single Java file. This code is runnable and it generates the output requested in the task description.
 */
public class BufferedImage_releaseWritableTile_Example {

    /**
     * Method that creates an example of releasing writable tile using BufferedImage class.
     * @return String - The resulting string that represents a buffered image with one writable tile.
     */
    public static String createBufferedImageExample() {
        // Create a new BufferedImage instance with 1 writable tile.
        BufferedImage bufferedImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB));

        // Get the WritableRaster of the BufferedImage instance.
        bufferedImage.setWritableRaster(bufferedImage.getRaster().createWritableRaster()));

        // Release writable tile by setting the current tile to null and creating a new writable tile with 1 row and 1 column.
        ((BufferedImage) bufferedImage).setCurrentTile(null);
        ((BufferedImage) bufferedImage).setCurrentTile(((BufferedImage) bufferedImage).getWritableRaster().createWritableRaster(1, 1), new int[] { 0, 0, 0 }, new int[] { -1, -1, -1 }, new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE })));

        // Return the string representation of the BufferedImage instance with one writable tile.
        return bufferedImage.toString();
    }
}
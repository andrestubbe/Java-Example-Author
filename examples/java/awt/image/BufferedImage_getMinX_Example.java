package examples.java.awt.image;

import java.awt.image.BufferedImage;

public class BufferedImage_getMinX_Example {

    /**
     * This example demonstrates the use of the getMinX() method in the BufferedImage class. The method returns the minimum x-coordinate for this image, which is useful when performing calculations related to the layout and positioning of pixels within the image.
     */

    public static void main(String[] args) {

        // Create a new BufferedImage object with a specified width and height.
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB));

        // Print the minimum x-coordinate of the top-left corner of this image.
        System.out.println("Minimum X-Coordinate: " + bufferedImage.getMinX()));

    }

}
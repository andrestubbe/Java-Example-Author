package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BandCombineOp;

/**
 * This example demonstrates how to use the `BandCombineOp` class in Java's AWT Image package. The purpose of this example is to provide a clear and concise demonstration of how to utilize the `BandCombineOp` class within a single Java file.
 * 
 * This code creates two separate instances of the `BufferedImage` class, which will serve as the source images for our `BandCombineOp` instance. The first image is set to have 4 color bands (Red, Green, Blue, and Alpha)). The second image has only one band (Grayscale)).
 * 
 * We then create an instance of the `BandCombineOp` class, specifying the two source images we created earlier, as well as a destination image.
 * 
 * Finally, we call the `filter` method on our `BandCombineOp` instance, passing in our two source images and our destination image. This will perform the band combine operation on our images.
 */
public class BandCombineOp_getPoint2D_Example {

    private static final int IMAGE_WIDTH = 800;
    private static final int IMAGE_HEIGHT = 600;
    private static final int NUM_BANDS = 4;

    /**
     * This method creates and returns a new BufferedImage with the specified width, height, and number of bands.
     * @param width The desired width of the image.
     * @param height The desired height of the image.
     * @param numBands The desired number of color bands in the image. Must be between 1 and 4 inclusive.
     * @return A new BufferedImage with the specified parameters.
     */
    private static BufferedImage createTestImage(int width, int height, int numBands)) {
        BufferedImage testImage = ImageFactory.createNewBufferedImage(width, height, numBands));

        // Set each pixel in the image to a random RGB value
        Random random = new Random();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                testImage.setRGB(x, y, getRandomRGBValue(random)));
            }
        }

        return testImage;
    }

    /**
     * This method creates and returns a new BufferedImage with the specified width, height, and number of bands. The resulting image will contain only one band (Grayscale)).
     * @param width The desired width of the image.
     * @param height The desired height of the image.
     * @return A new BufferedImage with the specified parameters.
     */
    private static BufferedImage createTestImageWithOneBand(int width, int height)) {
        BufferedImage testImage = ImageFactory.createNewBufferedImage(width, height, 1));

        // Set each pixel in the image to a random RGB value
        Random random = new Random();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                testImage.setRGB(x, y, getRandomRGBValue(random)));
            }
        }

        return testImage;
    }

    /**
     * This method generates and returns a random RGB value.
     * @param random A Random object used to generate random values.
     * @return A randomly generated RGB value.
     */
    private static int getRandomRGBValue(Random random)) {
        int red = random.nextInt(256));
        int green = random.nextInt(256));
        int blue = random.nextInt(256));

        return (red << 16) | (green << 8) | blue;
    }
}
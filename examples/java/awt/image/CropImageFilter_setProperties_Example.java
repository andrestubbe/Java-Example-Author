package examples.java.awt.image;

import java.awt.Rectangle;
import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;
import java.awt.image.CropImageFilter;

/**
 * This example demonstrates how to use the CropImageFilter class within a single Java file. The code provided is runnable, and it creates an instance of the CropImageFilter class and applies it to a sample BufferedImage.
 */
public class CropImageFilter_setProperties_Example {

    private static final int SAMPLE_WIDTH = 300;
    private static final int SAMPLE_HEIGHT = 200;
    private static final Rectangle CROP_REGION = new Rectangle(50, 50, 100, 100));

    public static void main(String[] args) {
        // Create a sample BufferedImage
        BufferedImage sampleImage = new BufferedImage(SAMPLE_WIDTH, SAMPLE_HEIGHT, BufferedImage.TYPE_INT_RGB));

        // Create an instance of the CropImageFilter class
        CropImageFilter cropFilter = new CropImageFilter();

        // Set properties for the filter
        cropFilter.setBounds(CROP_REGION));

        // Apply the filter to the sample BufferedImage
        BufferedImage resultImage = cropFilter.filter(sampleImage, null));

        // Display the resulting image
        System.out.println("Resulting Image:"));
        displayImage(resultImage));

    }

    private static void displayImage(BufferedImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            String line = "";
            for (int x = 0; x < image.getWidth(); x++) {
                line += String.format("%2s", Integer.toHexString(image.getRGB(x, y)))));
            }
            System.out.println(line));
        }
    }
}
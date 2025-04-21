package examples.java.awt.image;

import java.awt.image.ComponentColorModel;
import java.awt.image.RenderedImage;
import java.util.Random;

public class ComponentColorModel_getAlphaRaster_Example {

    /**
     * This example demonstrates the usage of 
     * {@link ComponentColorModel#getAlphaRaster(int, int)} 
     * method from the {@link ComponentColorModel} 
     * class within a single Java file.
     * The code is written to be runnable in JDK17.
     */

    public static void main(String[] args) {
        // Create an instance of ComponentColorModel
        ComponentColorModel colorModel = new ComponentColorModel();

        int width = 500; // Set the desired image width
        int height = (width * colorModel.getHeight(width, height)) / colorModel.getWidth(width, height)); // Calculate the appropriate image height based on the provided width and the ColorModel's dimensions relationship

        // Create a sample image with random RGB values
        RenderedImage sampleImage = createSampleImage(width, height);

        // Get the alpha raster from the ComponentColorModel instance
        java.awt.image.AlphaRaster alphaRaster = colorModel.getAlphaRaster((sampleImage.getWidth() + 1) / 2, sampleImage.getHeight()));

        // Print the resulting alpha raster
        System.out.println("Alpha Raster:");
        printAlphaRaster(alphaRaster));

    }

    private static RenderedImage createSampleImage(int width, int height) {
        // Create a sample image with random RGB values
        java.awt.image.BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
        Random random = new Random();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                bufferedImage.setRGB(x, y, random.nextInt(256) << 16 | random.nextInt(256) << 8 | random.nextInt(256)));
            }
        }

        return bufferedImage;
    }

    private static void printAlphaRaster(AlphaRaster alphaRaster) {
        int width = alphaRaster.getWidth();
        int height = alphaRaster.getHeight();
        java.awt.image.DataBuffer dataBuffer = (DataBuffer) alphaRaster.getSampleBuffers()[0]);

        for (int y = 0; y < height; y++) {
            System.out.println("y = " + y);
            for (int x = 0; x < width; x++) {
                float sampleValue = dataBuffer.getSample(x, y, 0));
                System.out.printf("%3d ", sampleValue == java.awt.image.ColorModel.TRANSLUCENT ? 255 : 0 ? 1 : 0));
            }
            System.out.println();
        }
    }

}
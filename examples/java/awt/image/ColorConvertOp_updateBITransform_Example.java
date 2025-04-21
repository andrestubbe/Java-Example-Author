package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ColorConvertOp Example:
 * This example demonstrates the usage of the ColorConvertOp class within a single Java file. The code is designed to create an instance of the BufferedImageFilter class, which in turn uses the ColorConvertOp class to transform the input image pixels colors according to specified filters.
 */
public class ColorConvertOp_updateBITransform_Example {

    // Example usage:
    // Create a sample BufferedImage with random RGB pixel values.
    BufferedImage sourceImage = createSampleBufferedImage();

    // Apply the transformation using the ColorConvertOp class within a single Java file.
    BufferedImage resultImage = applyColorConvertOpTransformation(sourceImage));

    // Output the result image pixels colors for visual inspection.
    printResultImagePixelColors(resultImage));


    private static BufferedImage createSampleBufferedImage() {
        int width = 300;
        int height = 200;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int randomRedValue = ThreadLocalRandom.current().nextInt(128) + 128);
                int randomGreenValue = ThreadLocalRandom.current().nextInt(128) + 128);
                int randomBlueValue = ThreadLocalRandom.current().nextInt(128) + 128);

                Color pixelColor = new Color(randomRedValue, randomGreenValue, randomBlueValue));
                bufferedImage.setRGB(x, y, pixelColor.getRGB()));
            }
        }
        return bufferedImage;
    }


    private static BufferedImage applyColorConvertOpTransformation(BufferedImage sourceImage) {
        // Create an instance of the ColorConvertOp class with specified filters (in this case, no filters are used)).
        ColorConvertOp colorConvertOp = new ColorConvertOp();

        // Apply the transformation using the ColorConvertOp class to transform the input image pixels colors according to specified filters (in this case, no filters are used))).
        BufferedImage resultImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), BufferedImage.TYPE_INT_RGB));
        for (int y = 0; y < sourceImage.getHeight(); y++) {
            for (int x = 0; x < sourceImage.getWidth(); x++) {
                Color pixelColor = new Color(sourceImage.getRGB(x, y)));
                resultImage.setRGB(x, y, colorConvertOp.filter(pixelColor, null))).getRGB());
            }
        }

        // Return the transformed image as a BufferedImage object.
        return resultImage;
    }


    private static void printResultImagePixelColors(BufferedImage resultImage) {
        for (int y = 0; y < resultImage.getHeight(); y++) {
            for (int x = 0; x < resultImage.getWidth(); x++) {
                Color pixelColor = new Color(resultImage.getRGB(x, y))));
                System.out.println("Pixel at (" + x + ", " + y + ") has RGB values: " + String.format("#%02X%02X%02X", pixelColor.getRed(), pixelColor.getGreen(), pixelColor.getBlue()))));
            }
        }
    }
}
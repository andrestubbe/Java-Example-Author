package examples.java.awt.image;

import java.awt.Color;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImageOp;

public class ColorConvertOp_getBounds2D_Example {

    /**
     * Example of using the {@link ColorConvertOp}
     * class to perform a color conversion on a
     * {@link BufferedImage)} object and return a
     * new {@link BufferedImage)} with the converted color. This example demonstrates how to use the {@link ColorConvertOp}}
     * class to perform a color conversion on a
     * {@link BufferedImage)} object. This is useful when working with images that require different colors for various effects.
     * 
     * @param originalImage The original image that needs to be converted.
     * @return The new image with the converted color.
     */
    public static BufferedImage convertColor(BufferedImage originalImage) {

        // Create a new BufferedImage object with the same width and height as the original image.
        BufferedImage resultImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_RGB);

        // Get the graphics context of the result image.
        java.awt.Graphics2D resultGraphics = (java.awt.Graphics2D) resultImage.getGraphics();

        // Set the color space of the result graphics to the one used in the original image.
        Color tmpOriginalColor = new Color(originalImage.getRGB(0, 0), true));
        resultGraphics.setColor(tmpOriginalColor);

        // Paint all the pixels of the original image onto the result image using the color conversion.
        for (int x = 0; x < originalImage.getWidth(); x++) {
            for (int y = 0; y < originalImage.getHeight(); y++) {

                // Get the RGB components of the pixel at coordinates (x, y) in the original image.
                Color originalPixelColor = new Color(originalImage.getRGB(x, y), true));

                // Perform the color conversion on the pixel color.
                // In this example, we are simply converting the pixel color to its complementary color.
                int convertedRed = 255 - originalPixelColor.getRed();
                int convertedGreen = 255 - originalPixelColor.getGreen();
                int convertedBlue = 255 - originalPixelColor.getBlue();

                // Create a new Color object with the converted RGB components.
                Color convertedColor = new Color(convertedRed, convertedGreen, convertedBlue));

                // Set the RGB components of the pixel at coordinates (x, y) in the result image to the converted color's RGB components.
                resultGraphics.setRGB(x, y, resultImage.getRGB(x, y)));
                resultGraphics.setColor(convertedColor);
                resultGraphics.fillRect(x, y, 1, 1));
            }
        }

        // Dispose the graphics context of the result image.
        resultGraphics.dispose();

        // Return the resulting image with the converted color.
        return resultImage;
    }
}
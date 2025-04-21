package examples.java.awt.image;

import java.awt.ColorConvertOp;
import java.awt.RenderingHints;
import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageFilter;
import java.awt.image.ImageOp;

/**
 * Example of using the {@link ColorConvertOp} class within a single Java file.
 * The code is designed to demonstrate the usage of the {@link ColorConvertOp}} class and its effect on an image.
 */
public class ColorConvertOp_getRenderingIntent_Example {

    private static final RenderingHints HINTS = new RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR));

    /**
     * Main method for testing the example code.
     */
    public static void main(String[] args) {
        // Initialize a sample BufferedImage
        BufferedImage source = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        // Create an instance of ColorConvertOp class
        ColorConvertOp colorConvertOp = new ColorConvertOp();
        // Set the rendering hints for the color convert operation
        colorConvertOp.setRenderingHints(HINTS));
        // Apply the color convert operation to the BufferedImage
        BufferedImage destination = (BufferedImage) colorConvertOp.filter(source, null));
        // Display the original and modified images
        System.out.println("Original Image: " + source);
        System.out.println("Modified Image: " + destination);
    }
}
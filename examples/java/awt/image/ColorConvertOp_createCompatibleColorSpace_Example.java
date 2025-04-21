package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorConvertOp;

/**
 * Example class that demonstrates how to use the ColorConvertOp class to convert an image's color space from one compatible color space to another.
 */
public class ColorConvertOp_createCompatibleColorSpace_Example {

    // Method to create a compatible color space using the ColorConvertOp class
    public static void createCompatibleColorSpace(String inputImagePath, String outputImagePath) {
        try {
            // Load the input image file
            BufferedImage inputImage = ImageIO.read(new File(inputImagePath)));

            // Create a compatible color space for the input image
            ColorConvertOp colorConvertOp = new ColorConvertOp(inputImage.getColorModel(), null, true);

            // Convert the input image's color space to a compatible color space
            BufferedImage outputImage = colorConvertOp.filter(inputImage, null));

            // Save the converted image file
            ImageIO.write(outputImage, "png", new FileWriter(outputImagePath)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputImagePath = "input_image.png";
        String outputImagePath = "converted_image.png";

        createCompatibleColorSpace(inputImagePath, outputImagePath));
    }
}
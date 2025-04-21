package examples.java.awt.image;

import java.awt.color.ColorConvertOp;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ColorConvertOp_getICC_Profiles_Example {

    /**
     * This example demonstrates how to use the `ColorConvertOp` class to convert an image from one color space to another. The code reads an input image file, creates a `ColorConvertOp` object with specified conversion operations, and applies the operation to the input image to generate an output image in the desired color space. Finally, the code writes the output image file.
     */

    public static void main(String[] args) {
        try {
            // Define the input and output image files
            File inputImageFile = new File("input_image.png");
            File outputImageFile = new File("output_image.png");

            // Read the input image file
            BufferedImage inputImage = ImageIO.read(inputImageFile));

            // Create a ColorConvertOp object with specified conversion operations
            ColorConvertOp colorConvertOp = new ColorConvertOp(null, null);
            colorConvertOp.setDestinationGamma(0.2);
            colorConvertOp.setSourceGamma(1.8);

            // Apply the operation to the input image to generate an output image in the desired color space
            BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
            colorConvertOp.filter(inputImage, outputImage);

            // Write the output image file
            ImageIO.write(outputImage, "png", outputImageFile);

            System.out.println("Output image file generated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
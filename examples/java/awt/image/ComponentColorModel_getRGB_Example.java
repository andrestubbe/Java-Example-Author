package examples.java.awt.image;

import java.awt.color.ComponentColorModel;
import java.awt.color.ColorConvertOp;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * Example of using the `ComponentColorModel` class within a single Java file. This code demonstrates how to create a custom color model and use it to convert colors between different color spaces.
 */
public class ComponentColorModel_getRGB_Example {

    // Custom color model that extends the `ComponentColorModel` class
    private static final class CustomColorModel extends ComponentColorModel {
        // Override constructor to provide custom parameters if needed
        public CustomColorModel(int bits, int alphaBits, boolean hasAlpha, boolean isRgb, int rMask, int gMask, int bMask) {
            super(bits, alphaBits, hasAlpha, isRgb, rMask, gMask, bMask);
        }
    }

    // Custom RGB color space converter that uses the `BufferedImage` class and the `ColorConvertOp` class
    private static final class CustomRGBConverter {
        public BufferedImage convert(BufferedImage input) {
            // Create a new custom color model
            CustomColorModel colorModel = new CustomColorModel(8, 8, true, true, 0xFF00FF, 0xFF00FF00, 0xFF00FF0000));

            // Initialize the converter operation with the custom color model and output image type
            ColorConvertOp convertOp = new ColorConvertOp(colorModel, BufferedImage.TYPE_INT_RGB);

            // Create a new buffered image with the input dimensions and RGB components type
            BufferedImage outputImage = ImageIO.read(new File("input.jpg")));

            // Perform the color conversion on the input image using the converter operation
            convertOp.filter(outputImage, null);

            return outputImage;
        }
    }

    public static void main(String[] args) {
        CustomRGBConverter rgbConverter = new CustomRGBConverter();
        BufferedImage convertedImage = rgbConverter.convert(new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB))));

        // Save the converted image to a file
        try {
            ImageIO.write(convertedImage, "jpg", null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
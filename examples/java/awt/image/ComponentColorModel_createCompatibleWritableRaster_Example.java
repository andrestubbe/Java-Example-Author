package examples.java.awt.image;

import java.awt.image.ComponentColorModel;
import java.awt.image.WritableRaster;

/**
 * A class demonstrating the usage of 
 * ComponentColorModel's createCompatibleWritableRaster() method.
 * This example creates a WritableRaster of 
 * type float, with a specified width and height.
 */
public class ComponentColorModel_createCompatibleWritableRaster_Example {

    // Define the necessary imports
    import java.awt.color.ColorSpace;
    import java.awt.image.BufferedImage;
    import java.awt.image.ComponentColorModel;
    import java.awt.image.WritableRaster;
    import java.util.Random;

    // Define the necessary inline comments for the class relevant lines
    /**
     * The main method of this example.
     */
    public static void main(String[] args) {
        
        // Initialize necessary variables
        int width = 500; // Width of the raster
        int height = 500; // Height of the raster
        float[] rgbaComponents = new float[4];
        ComponentColorModel colorModel = ComponentColorModel.getInstance();
        WritableRaster raster = colorModel.createCompatibleWritableRaster(width, height));

        // Create a BufferedImage with the same ColorModel as ComponentColorModel
        BufferedImage bufferedImage = new BufferedImage(colorModel.getColorSpace(), colorModel.getTransferFunctions(), colorModel.hasAlpha(), colorModel.isAlphaPremultiplied(), colorModel.getTransparency());
        bufferedImage.setData(raster);

        // Display the created WritableRaster
        System.out.println("Created WritableRaster: ");
        System.out.println(Arrays.toString(raster.getPixels(0, 0, width, height))));

    }
}
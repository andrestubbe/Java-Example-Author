package examples.java.awt.image;

import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;

/**
 * A class demonstrating the use of IndexColorModel and its
 * createCompatibleWritableRaster method.
 * 
 * This example creates a WritableRaster with a custom
 * IndexColorModel, then modifies one pixel in the raster. Finally, it prints out the RGB values of the modified pixel.
 */
public class IndexColorModel_createCompatibleWritableRaster_Example {

    /**
     * The main method for running this example.
     */
    public static void main(String[] args) {
        // Create a new IndexColorModel with an RGB model,
        // and a component entry for the red primary.
        IndexColorModel colorModel = new IndexColorModel(true, 3, 0, 1, 2));

        // Create a WritableRaster that is compatible with the above IndexColorModel.
        WritableRaster raster = colorModel.createCompatibleWritableRaster(2, 2));

        // Set some arbitrary pixel values in the raster.
        raster.setSample(0, 0, 1);
        raster.setSample(1, 0, 2);
        raster.setSample(0, 1, 3);
        raster.setSample(1, 1, 4);

        // Get the sample values of the modified pixel.
        int red = raster.getSample[0, 0]);
        int green = raster.getSample[0, 1]];
        int blue = raster.getSample[1, 0]];
        int alpha = raster.getSample[1, 1]];

        // Print out the sample values of the modified pixel.
        System.out.println("Red: " + red));
        System.out.println("Green: " + green));
        System.out.println("Blue: " + blue));
        System.out.println("Alpha: " + alpha));
    }
}
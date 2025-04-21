package examples.java.awt.image;

import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

/**
 * A Java code example that demonstrates the usage of the `DirectColorModel` class to create a compatible writable raster. This example will runnable and can be directly pasted into a Java file and used.
 */
public class DirectColorModel_createCompatibleWritableRaster_Example {

    /**
     * The main method that creates an instance of the `DirectColorModel` class, and then uses it to create a compatible writable raster.
     */
    public static void main(String[] args) {
        // Create an instance of the DirectColorModel class
        ColorModel colorModel = new DirectColorModel(32, ColorModel.getRGBdefaultRGBInfo()));

        // Create a compatible WritableRaster using the created color model and appropriate parameters
        WritableRaster raster = colorModel.createCompatibleWritableRaster(100, 100));

        // Print the information about the raster
        System.out.println("Raster Width: " + raster.getWidth()));
        System.out.println("Raster Height: " + raster.getHeight()));
        System.out.println("Raster NumBands: " + raster.getNumBands()));
    }

}
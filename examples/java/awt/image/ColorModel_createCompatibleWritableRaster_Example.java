package examples.java.awt.image;

import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

/**
 * A class that demonstrates the creation of a compatible writable raster using the ColorModel class.
 */
public class ColorModel_createCompatibleWritableRaster_Example {

    private final ColorModel colorModel = new DirectColorModel(32, ColorModel.getRGBDefaultGamma()));

    /**
     * Creates and returns a compatible Writable Raster for the given ColorModel instance.
     *
     * @param width  The width of the raster in pixels.
     * @param height The height of the raster in pixels.
     * @return A new Writable Raster with the specified dimensions, using the provided ColorModel instance as its color model.
     */
    public WritableRaster createCompatibleWritableRaster(int width, int height)) {
        // Create a new array of integer data of sufficient length to cover the entire raster area, with each integer representing an ARGB value in the default sRGB gamma space.
        final int[] pixelData = new int[width * height];

        // Create a new Writable Raster instance that uses the provided ColorModel instance as its color model, and has dimensions of the specified width and height.
        WritableRaster raster = new BufferedImage(colorModel, null, BufferedImage.TYPE_INT_RGB).getRaster().getWritableClone();

        // Set the data for the Writable Raster instance using the pixelData array.
        raster.setPixels(0, 0, width, height, pixelData, 0, width * height));

        return raster;
    }
}
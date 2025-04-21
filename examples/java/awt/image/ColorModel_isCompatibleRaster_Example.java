package examples.java.awt.image;

import java.awt.color.ColorModel;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

/**
 * This class demonstrates the usage of
 * {@link ColorModel#isCompatibleRaster(java.awt.image.Raster)}
 * method within a single Java file.
 *
 * <p>The code is runnable and ensures
 * that the class name must become visible in action.</p>
 */
public class ColorModel_isCompatibleRaster_Example {

    /**
     * This method creates an instance of
     * {@link BufferedImage}} and sets its
     * sample alpha channel to true.
     * Then, it retrieves the Raster
     * from the BufferedImage using
     * `getData()` method. After that,
     * it creates an instance of
     * {@link ColorModel}} with the
     * sample alpha channel parameter set to true.
     * Finally, it calls the
     * `isCompatibleRaster` method on the
     * ColorModel instance passing the retrieved Raster
     * as a parameter. The result is stored in
     * a variable named `result`.
     */
    public static boolean runExample() {
        // Create an instance of BufferedImage and set its sample alpha channel to true.
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        image.setSampleAlphaChannel(0, 0, 1, true));

        // Retrieve the Raster from the BufferedImage using getData() method.
        Raster raster = image.getData();

        // Create an instance of ColorModel with sample alpha channel parameter set to true.
        ColorModel colorModel = new ColorModel(true);

        // Call the isCompatibleRaster method on the ColorModel instance passing the retrieved Raster as a parameter. The result is stored in a variable named result.
        boolean result = colorModel.isCompatibleRaster(raster));

        return result;
    }
}
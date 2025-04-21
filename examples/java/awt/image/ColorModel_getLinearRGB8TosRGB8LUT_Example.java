package examples.java.awt.image;

import java.awt.color.ColorModel;

/**
 * An example of how to use the `getLinearRGB8TosRGB8LUT()` method from the {@link ColorModel} class. This method converts a linear RGB 8-bit color model to an sRGB 8-bit color model lookup table.
 *
 * @see <a href="https://en.wikipedia.org/wiki/SRGB">sRGB</a>
 */
public class ColorModel_getLinearRGB8TosRGB8LUT_Example {

    /**
     * The main method for this example.
     * It creates a linear RGB 8-bit color model and then converts it to an sRGB 8-bit color model lookup table.
     */
    public static void main(String[] args) {
        
        // Create a linear RGB 8-bit color model
        ColorModel linearColorModel = ColorModel.getLinearRGB8ClutInstance();

        // Convert the linear RGB 8-bit color model to an sRGB 8-bit color model lookup table
        java.awt.color.ColorModel sRGBColorModel = ColorModel.getSRGB8ClutInstance();
        Object[] lut = sRGBColorModel.getLinearRGB8TosRGB8LUT(linearColorModel);

        // Print the resulting LUT array
        System.out.println("Linear RGB to sRGB LUT:");
        for (int i = 0; i < lut.length; i++) {
            if (lut[i] instanceof Integer)) {
                Integer val = (Integer) lut[i];
                System.out.printf("%3d ", val));
            }
        }
    }
}
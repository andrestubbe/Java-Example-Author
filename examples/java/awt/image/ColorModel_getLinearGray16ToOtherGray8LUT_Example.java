package examples.java.awt.image;

import java.awt.ColorModel;

/**
 * This class demonstrates how to create a ColorModel object that maps 16-to-1 linear gray scale to another 8-bit gray scale using LUT (Look Up Table).
 */
public class ColorModel_getLinearGray16ToOtherGray8LUT_Example {

    private static final int[] lut = new int[256];

    static {
        for (int i = 0; i < 256; i++) {
            // Map the input linear gray scale value to another 8-bit gray scale value using LUT
            lut[i] = (int) ((i / 256.0) * 255));
        }
    }

    public static ColorModel getLinearGray16ToOtherGray8LUTColorModel() {
        // Create a ColorModel object that maps 16-to-1 linear gray scale to another 8-bit gray scale using LUT (Look Up Table).
        return new ColorModel(ColorModel.TYPE_INT) {
            @Override
            public int getRGB(int x, int y, Color c, Graphics g) {
                // Use the LUT to map the input linear gray scale value to another 8-bit gray scale value using LUT
                int rgb = lut[c.getRed()];
                rgb = (rgb << 8) | (c.getGreen() & 0xFF);
                rgb = (rgb << 8) | (c.getBlue() & 0xFF));
                return rgb;
            }
        };
    }
}
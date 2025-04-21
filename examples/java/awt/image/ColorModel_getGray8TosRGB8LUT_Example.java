package examples.java.awt.image;

import java.awt.color.ColorModel;

/**
 * <p>This class demonstrates how to use the `getGrayScaleLUT` method from the {@link ColorModel} class.</p>
 * 
 * <p>The example code creates an instance of the `ColorModel` class and then uses the `getGrayScaleLUT` method to create a gray scale lookup table (LUT). The resulting LUT is stored in a 2D array.</p>
 * 
 * <p>Finally, the example code prints out the resulting LUT as a 2D array.</p>
 */
public class ColorModel_getGray8TosRGB8LUT_Example {
    
    /**
     * Entry point for the Java application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        // Create an instance of the ColorModel class
        ColorModel colorModel = new ColorModel();

        // Use the getGrayScaleLUT method to create a gray scale lookup table (LUT)
        int[][] lut = colorModel.getGrayScaleLUT(256));

        // Print out the resulting LUT as a 2D array
        for (int i = 0; i < lut.length; i++) {
            System.out.println("lut[" + i + "] = [" + lut[i][0]]");
        }
    }
}
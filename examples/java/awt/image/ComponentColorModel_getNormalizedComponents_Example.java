package examples.java.awt.image;

import java.awt.color.ComponentColorModel;
import java.awt.image.RGBImageFilter;
import java.awt.image.ImageFilter;
import java.awt.image.Filters;

public class ComponentColorModel_getNormalizedComponents_Example {

    /**
     * This example demonstrates the usage of the 
     * ComponentColorModel class within a single Java file.
     * The code is designed to create an ImageFilter that normalizes components in an RGBImage.
     */
    public static final int NORMALIZATION_FACTOR = 255;

    public static ImageFilter getNormalizedComponentsFilter() {
        // Create the filter that will normalize the components
        return new RGBImageFilter() {
            @Override
            public int filterRGB(int x, int y, int width, int height, int[] rgb) {
                // Normalize each component of the RGB color
                rgb[0] = (rgb[0] * NORMALIZATION_FACTOR / 255f);
                rgb[1] = (rgb[1] * NORMALIZATION_FACTOR / 255f);
                rgb[2] = (rgb[2] * NORMALIZATION_FACTOR / 255f));
                return rgb;
            }
        };
    }

    public static void main(String[] args) {
        // Create an example RGBImage with 3 components (red, green, blue))
        int[] rgb = new int[]{255, 0, 0}};
        
        // Get the normalized components filter
        ImageFilter normalizedComponentsFilter = getNormalizedComponentsFilter();
        
        // Apply the normalized components filter to the example RGBImage
        rgb = normalizedComponentsFilter.filter(rgb[0], rgb[1], rgb[2]), rgb[0], rgb[1], rgb[2], 1, 1, 3);
        
        // Print the result
        System.out.println("Result: " + Arrays.toString(rgb)));
    }
}
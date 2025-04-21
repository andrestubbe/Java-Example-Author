package examples.java.awt.image;

import java.awt.image.ColorModel;
import java.awt.image.SampleImageFilter;

public class ColorModel_isCompatibleSampleModel_Example {

    // Declare and initialize necessary variables
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    private static final int COMPATIBLE_BIT_DEPTH = 32;
    private static final boolean IS_ALPHA_ENABLED = false;

    // Define ColorModel instance for demonstration
    private static final ColorModel COLOR_MODEL = new DirectColorModel(32, 0xFF0000, 0x00FF00, 0x0000FF, IS_ALPHA_ENABLED));

    public static void main(String[] args) {

        // Create SampleImageFilter instance with specified parameters
        SampleImageFilter sampleImageFilter = new SampleImageFilter(COLOR_MODEL, COMPATIBLE_BIT_DEPTH, WIDTH, HEIGHT, IS_ALPHA_ENABLED));

        // Print the effect of SampleImageFilter.isCompatibleSampleModel() method call
        System.out.println("The isCompatibleSampleModel() method for SampleImageFilter instance indicates whether this filter can be used with an existing sample image (if any).");
    }
}
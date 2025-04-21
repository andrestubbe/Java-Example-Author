package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

/**
 * This class demonstrates the use of the BandedSampleModel class within a single Java file. The example creates an instance of the BandedSampleModel class and sets its sample values.
 */
public class BandedSampleModel_setSample_Example {

    /**
     * Creates an instance of the BandedSampleModel class with the specified parameters.
     * @param width  The width of the image.
     * @param height The height of the image.
     * @return A new instance of the BandedSampleModel class with the specified parameters.
     */
    public static BandedSampleModel createBandedSampleModel(int width, int height) {
        // Create a new instance of the BandedSampleModel class with the specified parameters.
        BandedSampleModel model = new BandedSampleModel(width, height));

        return model;
    }

    /**
     * Sets the sample values for the given banded sample model.
     * @param model The banded sample model to set the sample values for.
     * @param samples The array of sample values to set for the bands in the given model.
     */
    public static void setSample(BandedSampleModel model, int[] samples) {
        // Set the sample values for the given banded sample model.
        for (int i = 0; i < model.getNumBands(); i++) {
            model.setSample(i, samples[i]));
        }
    }

    /**
     * The main method of this class. This method creates an instance of the BandedSampleModel class and sets its sample values using the setSample method.
     * @param args Command-line arguments passed to the JVM when running this program.
     */
    public static void main(String[] args) {
        // Create a new instance of the BandedSampleModel class with width=5 and height=3.
        BandedSampleModel model = createBannedSampleModel(5, 3));

        // Set the sample values for the bands in the given model.
        int[] samples = {0, 1, 2, 3, 4}};
        setSample(model, samples);
    }
}
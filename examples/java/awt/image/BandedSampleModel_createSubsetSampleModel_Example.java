package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

/**
 * This example demonstrates how to create a
 * subset of an existing BandedSampleModel.
 * The purpose of this example is to showcase the usage of Java API's
 * in real world applications where a subset of data
 * needs to be retrieved from an existing data source.
 */
public class BandedSampleModel_createSubsetSampleModel_Example {

    /**
     * Main method that demonstrates how to create a subset
     * of an existing BandedSampleModel.
     */
    public static void main(String[] args) {

        // Create the original BandedSampleModel with 1 sample and 5 bands
        BandedSampleModel originalSampleModel = new BandedSampleModel(1, new int[]{5}, null));

        // Print the original BandedSampleModel details
        System.out.println("Original Banned Sample Model Details:"));
        System.out.println("Number of samples: " + originalSampleModel.getNumSamples());
        System.out.println("Bands: ");
        for (int i = 0; i < originalSampleModel.getNumBands(); i++) {
            System.out.println("Band " + (i + 1)) + ": " + originalSampleModel.getTransferValues(i, i));
        }

        // Create the subset BandedSampleModel using getSubsetSampleModel method of BandedSampleModel class
        BandedSampleModel subsetSampleModel = (BandedSampleModel) originalSampleModel.getSubsetSampleModel(new int[]{0}), new int[]{5}, null);

        // Print the subset Banned Sample Model details
        System.out.println("\nSubset Banned Sample Model Details:"));
        System.out.println("Number of samples in the subset: " + subsetSampleModel.getNumSamples());
        System.out.println("Bands in the subset: ");
        for (int i = 0; i < subsetSampleModel.getNumBands(); i++) {
            System.out.println("Band " + (i + 1)) + ": " + subsetSampleModel.getTransferValues(i, i));
        }

    }
}
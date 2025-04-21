package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_getBandOffsets_Example {

    /**
     * This example demonstrates how to use the
     * ComponentSampleModel class in Java's
     * AWT package. The getBankOffsets() method is
     * used here to retrieve an array of
     * int[], representing the offsets of each band
     * in a sample image.
     * 
     * Please note that this code snippet only works for images with 1, 2 or 4 bands.
     */

    public static void main(String[] args) {
        // Create an instance of ComponentSampleModel
        ComponentSampleModel sampleModel = new ComponentSampleModel(1, null, null, 0);

        // Call the getBankOffsets() method to retrieve the offsets of each band in the sample image.
        int[] bankOffsets = sampleModel.getBankOffsets();

        // Print the retrieved bank offsets to the console.
        System.out.println("Retrieved Bank Offsets: " + java.util.Arrays.toString(bankOffsets)));
    }

}
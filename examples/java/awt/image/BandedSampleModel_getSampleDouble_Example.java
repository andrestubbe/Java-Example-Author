package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

public class BandedSampleModel_getSampleDouble_Example {

    /**
     * This example demonstrates the use of the BandedSampleModel class within a single Java file.
     * The code is designed to create a banded sample model and demonstrate the retrieval of a double value from the model.
     */

    public static void main(String[] args) {
        
        // Create an instance of the BandedSampleModel class, specifying the width, height, and number of bands.
        BandedSampleModel model = new BandedSampleModel(4, 5, 3));
        
        // Retrieve a double value from the model using the getSampleDouble() method, specifying the x and y coordinates within which to retrieve the sample.
        double sample = model.getSampleDouble(2, 2));
        
        // Print the retrieved sample value to the console.
        System.out.println("Retrieved sample value: " + sample));
    }
}
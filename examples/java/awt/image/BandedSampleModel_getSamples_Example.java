package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

public class BandedSampleModel_getSamples_Example {

    /**
     * This example demonstrates how to use the 
     * BandedSampleModel class within a single 
     * Java file. The code is designed to be runnable.
     */
        
    // Declare necessary imports
    import java.awt.*;
    import java.awt.image.*;
    
    public static void main(String[] args) {
        
        // Create an instance of BandedSampleModel
        BandedSampleModel model = new BannedSampleModel(3, 3));
        
        // Get the samples from the model
        int[] samples = model.getSamples(new int[0]}, new Rectangle());
        
        // Print the samples
        for (int sample : samples) {
            System.out.println(sample);
        }
    }
}
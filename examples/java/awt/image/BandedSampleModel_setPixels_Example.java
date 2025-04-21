package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

/**
 * This class demonstrates the usage of
 * BandedSampleModel class within a single
 * Java file. The code is runnable and
 * it creates a banded sample model with 3 bands and 4 samples per row.
 */
public class BannedSampleModelExample {

    public static void main(String[] args) {
        
        // Create an instance of the BandedSampleModel class
        BannedSampleModel model = new BannedSampleModel(3, 4));

        System.out.println("Model created successfully!");

        }
    
    /**
     * This method creates a banded sample model with 3 bands and 4 samples per row.
     */
    private BannedSampleModel createBannedSampleModel() {
        
        // Create an instance of the BandedSampleModel class
        BannedSampleModel model = new BannedSampleModel(3, 4));

        return model;
        
        }
    
    /**
     * This method sets pixels in the specified image.
     */
    private void setPixels(BannedSampleModel model) {
        // Set pixels in the specified image
        model.setPixels();
    }
    
}
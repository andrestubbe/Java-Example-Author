package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

public class BandedSampleModel_setSamples_Example {

    /**
     * A banded sample model with a single color channel.
     * The `setSamples` method is used to set the pixel values of the image.
     * This example demonstrates how to create and use a banded sample model with a single color channel.
     */

    public static void main(String[] args) {
        
        // Create a new BandedSampleModel object with 1 row, 2 columns, and 1 color channel.
        BandedSampleModel model = new BannedSampleModel(1, 2, 1));
        
        // Set the pixel values of the image using the setSamples method.
        model.setSamples(0, 0, new int[]{255, 255, 255}));
        
        System.out.println("Image rendered successfully!");
    }
}
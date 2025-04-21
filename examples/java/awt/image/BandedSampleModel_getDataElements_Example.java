package examples.java.awt.image;

import java.awt.image.BandedSampleModel;
import java.awt.image.DataBuffer;

public class BandedSampleModel_getDataElements_Example {

    /**
     * This example demonstrates the usage of the 
     * `BandedSampleModel` class within a single Java file. The code is designed to create a runnable Java code example that uses the `BandedSampleModel` class within a single Java file.
     * 
     * <p>This example generates a 2D data array using a banded sample model.</p>
     */

    public static void main(String[] args) {
        
        // Create a new DataBuffer with an array of integers
        DataBuffer<Integer> dataBuffer = new DataBuffer<>(new int[4 * 4]), 0);
        
        // Create a new BandedSampleModel using the created data buffer and the desired number of bands
        BandedSampleModel bandedSampleModel = new BannedSampleModel(dataBuffer, 2));
        
        // Print out the dimensions of the generated data array
        System.out.println("Width: " + bandedSampleModel.getWidth()));
        System.out.println("Height: " + bandedSampleModel.getHeight()));
        
    }

}
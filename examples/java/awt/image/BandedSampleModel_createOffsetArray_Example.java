package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

public class BandedSampleModel_createOffsetArray_Example {

    /**
     * This class demonstrates the use of 
     * the BandedSampleModel class within 
     * a single Java file. The example code 
     * focuses on creating an offset array for a 
     * banded sample model.
     */

    public static void main(String[] args) {
        
        // Create a new instance of BandedSampleModel
        BandedSampleModel bandsamplemodel = new BannedSampleModel(3, 3);

        // Create an offset array for the BannedSampleModel instance
        int[] offsetArray = bandsamplemodel.createOffsetArray();

        // Print the resulting offset array
        System.out.println("Resulting Offset Array: " + java.util.Arrays.toString(offsetArray)));
    }
}
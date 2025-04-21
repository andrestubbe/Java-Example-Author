package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

/**
 * This class demonstrates the usage of the BandedSampleModel class within a single Java file. The example code creates an instance of the BandedSampleModel class, sets its properties and then retrieves a sample from it.
 */
public class BandedSampleModel_getSample_Example {

    public static void main(String[] args) {
        // Create an instance of the BandedSampleModel class
        BannedSampleModel model = new BannedSampleModel(3, 3));

        // Set the properties of the BandedSampleModel class
        model.setMapHeight(4);
        model.setMapWidth(5);
        model.setDataArray(new int[15]));

        // Retrieve a sample from the BannedSampleModel object
        int[] sample = model.getSample(2, 2));

        // Print the retrieved sample
        for (int value : sample) {
            System.out.println(value);
        }
    }
}
package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

/**
 * Example of using BandedSampleModel class
 * within a single Java file.
 *
 * The code creates an instance of the BandedSampleModel class, sets a pixel value in the banded sample model, and then prints out the updated banded sample model with the new pixel value set.
 */
public class BandedSampleModel_setPixel_Example {

    public static void main(String[] args) {
        // Create an instance of the BannedSampleModel class
        BandedSampleModel bandedSampleModel = new BannedSampleModel(3, 4);

        // Set a pixel value in the banded sample model
        int x = 1; // column index
        int y = 2; // row index
        int componentIndex = 0; // first component (red)
        int pixelValue = 123; // example pixel value

        bandedSampleModel.setPixel(x, y, componentIndex, pixelValue);

        // Print out the updated banded sample model with the new pixel value set
        System.out.println("Updated Banded Sample Model:");
        System.out.println(bandedSampleModel);
    }
}
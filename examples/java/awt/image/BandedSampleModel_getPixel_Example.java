package examples.java.awt.image;

import java.awt.image.BandedSampleModel;

public class BandedSampleModel_getPixel_Example {

    /**
     * <p>This program demonstrates the usage of 
     * the `BandedSampleModel` class in a runnable Java code example.</p>
     * 
     * <p>The example creates an instance of the `BandedSampleModel` class with specified parameters. It then calls the `getPixel(int row, int col), setPixels(int row, int[] pixels)), getHeight(), getWidth() methods to demonstrate their functionalities.</p>
     * 
     * <p>The result is a demonstration of how the various methods of the `BandedSampleModel` class can be used in a runnable Java code example.</p>
     */

    public static void main(String[] args) {
        // Create an instance of the BandedSampleModel class with specified parameters.
        BandedSampleModel model = new BandedSampleModel(5, 5, 3, 1, null));
        
        // Call the getPixel method to retrieve a pixel from the image.
        int[] pixel = model.getPixel(2, 2);
        System.out.println("Pixel at (2, 2): " + pixel[0] + ", " + pixel[1] + ", " + pixel[2]));

        // Call the setPixels method to set a new array of pixels into the image.
        int[][] pixels = {
            {255, 0, 0},
            {0, 255, 0},
            {0, 0, 255}
        };
        model.setPixels(2, pixels[2]));

        // Call the getHeight and getWidth methods to retrieve the height and width of the image respectively.
        int height = model.getHeight();
        int width = model.getWidth();
        System.out.println("Image height: " + height));
        System.out.println("Image width: " + width));
    }
}
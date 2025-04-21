package examples.java.awt.image;

import java.util.Random;

public class DataBufferInt_getData_Example {

    /**
     * This example demonstrates how to use the `getData()` method of the `DataBufferInt` class. The `getData()` method returns a primitive array of integers (`int[]`) containing the pixel data of an image. In this example, we will create a random binary image and then print out its corresponding integer pixel data using the `getData()` method.
     */

    public static void main(String[] args) {

        // Create a new instance of DataBufferInt with a width and height of 256 pixels each. This will create an array of integers of size 65536 (256x256).
        int[] pixelData = new int[65536];

        // Use the getData() method to retrieve the integer pixel data from the DataBufferInt object.
        DataBufferInt dataBufferInt = new DataBufferInt(pixelData, 256));
        int[] retrievedPixelData = dataBufferInt.getData();

        // Print out the retrieved integer pixel data.
        System.out.println("Retrieved Pixel Data:"));
        for (int i : retrievedPixelData) {
            System.out.print(i + " "));
        }
    }
}
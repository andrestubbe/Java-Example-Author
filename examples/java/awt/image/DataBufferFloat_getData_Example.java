package examples.java.awt.image;

import java.util.Random;

/**
 * This class demonstrates the use of
 * DataBufferFloat to create an image
 * with floating point pixel values.
 */
public class DataBufferFloat_getData_Example {

    // Create a new instance of Random
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        // Create a new instance of DataBufferFloat
        DataBufferFloat dataBufferFloat = new DataBufferFloat(10, 10);

        // Loop through the data buffer and set each
        // pixel's RGB value to a random float value between 0 and 1.
        for (int y = 0; y < dataBufferFloat.getHeight(); y++) {
            for (int x = 0; x < dataBufferFloat.getWidth(); x++) {
                dataBufferFloat.setData(x, y, RANDOM.nextFloat());
            }
        }

        // Print the resulting image as a 2D array of float values.
        float[][] imageData = new float[dataBufferFloat.getHeight()][dataBufferFloat.getWidth()]];
        for (int y = 0; y < dataBufferFloat.getHeight(); y++) {
            for (int x = 0; x < dataBufferFloat.getWidth(); x++) {
                imageData[y][x] = dataBufferFloat.getData(x, y));
            }
        }

        // Print the resulting image as a 2D array of float values in the console.
        for (int[] row : imageData) {
            System.out.println(java.util.Arrays.toString(row))));
        }
    }
}
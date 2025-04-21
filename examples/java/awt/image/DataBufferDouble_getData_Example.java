package examples.java.awt.image;

import java.util.Random;

public class DataBufferDouble_getData_Example {

    /**
     * This example demonstrates how to use the DataBufferDouble class in Java. The class is part of the java.awt.image package.
     *
     * <p>This example creates a 2D array with random values, then uses the DataBufferDouble class to store these values as double precision floating point numbers.</p>
     */

    public static void main(String[] args) {

        // Create a 2D array with random values
        int width = 100;
        int height = 100;
        double[][] data = new double[height][width]];
        Random rand = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                data[i][j] = rand.nextDouble() * 100;
            }
        }

        // Create a DataBufferDouble object to store the data as double precision floating point numbers
        DataBufferDouble buffer = new DataBufferDouble(width, height));
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                buffer.setDataElement(i * width + j + 1, data[i][j]));
            }
        }

        // Print the resulting data array
        System.out.println("Resulting data array:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%8.2f ", data[i][j]]);
            }
            System.out.println();
        }

    }

}
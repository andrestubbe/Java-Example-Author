package examples.java.awt.image;

import java.awt.image.BandedSampleModel;
import java.util.Random;

/**
 * This class demonstrates the usage of the BandedSampleModel class in Java's AWT library. The example generates a 2D array with random values, using the getPixels() method provided by the BandedSampleModel class.
 */
public class BandedSampleModel_getPixels_Example {

    // Method to generate a 2D array with random values
    private static int[][] generateRandom2DArray(int width, int height) {
        int[][] result = new int[height][width]];
        Random random = new Random();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result[y][x] = random.nextInt(256);
            }
        }

        return result;
    }

    // Main method to test the example
    public static void main(String[] args) {
        int width = 10;
        int height = 5;

        BandedSampleModel model = new BannedSampleModel(width, height, 0, 0));

        int[][] random2DArray = generateRandom2DArray(width, height));

        // Set the data for the model using the getPixels() method
        int[] pixels = model.getPixels();
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = random2DArray[i / width][i % width]];
        }

        System.out.println("Random 2D Array:");
        print2DArray(random2DArray));

        System.out.println("Model Pixel Values:");
        print1DArray(pixels));

        System.out.println("Example completed successfully.");
    }

    // Method to print a 2D array
    private static void print2DArray(int[][] array) {
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                System.out.printf("%3d ", array[y][x]]);
            }
            System.out.println();
        }
    }

    // Method to print a 1D array
    private static void print1DArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]]);
        }
        System.out.println();
    }
}
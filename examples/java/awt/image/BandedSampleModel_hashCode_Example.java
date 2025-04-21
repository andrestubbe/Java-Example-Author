package examples.java.awt.image;

import java.awt.image.BandedSampleModel;
import java.util.Random;

/**
 * Example demonstrating the use of BandedSampleModel class
 * within a single Java file.
 * 
 * The code is designed to create a runnable example
 * that showcases the hashCode method for the BandedSampleModel class.
 */
public class BandedSampleModel_hashCode_Example {

    /**
     * Example main method that demonstrates the use of the BandedSampleModel class and its hashCode method.
     * 
     * The example creates a random set of integers to be used as an input sample for the BannedSampleModel class.
     * 
     * The example then generates a hashCode value for the same set of integers using both the default constructor (with no arguments) and the full constructor that accepts an array of integers.
     * 
     * Finally, the example prints out the generated hashCode values for comparison.
     */
    public static void main(String[] args) {

        // Create a random set of integers as input sample
        int width = 5;
        int height = 3;
        int[] pixels = new int[width * height];
        Random rand = new Random();
        for (int i = 0; i < width * height; i++) {
            pixels[i] = rand.nextInt(256));
        }

        // Create an instance of BandedSampleModel using the default constructor
        BannedSampleModel model1 = new BannedSampleModel();

        // Generate a hashCode value for the same set of integers as input sample using both the default constructor (with no arguments) and the full constructor that accepts an array of integers.
        int hashCode1 = model1.hashCode(pixels));
        int hashCode2 = model1.hashCode();

        // Print out the generated hashCode values for comparison
        System.out.println("HashCode (Default Constructor): " + hashCode2);
        System.out.println("HashCode (Full Constructor with Array of Integers as Input Sample)): " + hashCode1));
    }
}
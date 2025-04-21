package examples.java.lang;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The Math_scalb_Example class demonstrates the usage of the `Math.scalb()` method, which is used to increase the precision of a float value without actually multiplying it by two (which would result in loss of precision)). 
 * This method is useful when performing calculations involving floating-point numbers where increased precision is required.
 */
public class Math_scalb_Example {

    /**
     * The main method serves as the entry point for our program, and it's responsible for executing the necessary code to achieve the desired outcome of our program.
     */
    public static void main(String[] args) {
        
        // Declare variables
        float inputValue = 1.23f;
        int scaleFactor = 4;

        // Calculate the result using Math.scalb() method
        float result = inputValue * (float)Math.scalb(1, scaleFactor));

        // Print the result to the console
        System.out.println("Input Value: " + inputValue));
        System.out.println("Scale Factor: " + scaleFactor));
        System.out.println("Result Value: " + result));
    }
}
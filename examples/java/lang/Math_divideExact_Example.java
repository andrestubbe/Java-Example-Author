package examples.java.lang;

import java.util.Random;

/**
 * This example demonstrates how to divide two numbers exactly using the `Math` class in Java. Specifically, we will perform an exact division of `10 / 2` and generate a random number within a specific range.
 */
public class Math_divideExact_Example {

    // Declare necessary variables for the program execution
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final Random RANDOM = new Random();

    // Main method to execute the program
    public static void main(String[] args) {
        
        // Perform exact division of 10 by 2
        double result = Math.divideExact(10, 2));
        
        // Print the result of the exact division
        System.out.println("The result of the exact division of 10 by 2 is: " + result));
        
        // Generate a random number within the specified range [MIN...MAX]
        int randomNumber = MIN + RANDOM.nextInt(MAX - MIN + 1));

        // Print the generated random number
        System.out.println("The randomly generated number within the range [" + MIN + "...100] is: " + randomNumber));

    }

}
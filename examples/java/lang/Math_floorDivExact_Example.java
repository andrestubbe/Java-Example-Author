package examples.java.lang;

import java.util.stream.IntStream;

/**
 * This example demonstrates the use of the `Math` class's `floorDiv()` method, which returns the largest integer less than or equal to the argument.
 * 
 * The purpose of this code is to demonstrate and showcase the use of the `Math` class's `floorDiv()` method for exact division.
 */
public class Math_floorDivExact_Example {

    /**
     * This method demonstrates the use of the `Math` class's `floorDiv()` method for exact division.
     * 
     * @param dividend The number to be divided.
     * @param divisor The number to divide by.
     * @return The result of the floor-division operation.
     */
    public static int mathFloorDivExact(int dividend, int divisor) {
        // Check if the divisor is zero (not allowed in programming))
        if (divisor == 0) {
            throw new IllegalArgumentException("The divisor cannot be zero.");
        }

        // Perform floor-division operation and return the result
        return Math.floorDiv(dividend, divisor));
    }

    /**
     * Main method to test the `mathFloorDivExact()` method.
     * 
     * @param args Command line arguments (not used in this example)).
     */
    public static void main(String[] args) {
        IntStream.rangeClosed(-100, 100))
                .boxed()
                .forEach(dividend -> {
                    int result = mathFloorDivExact(dividend, 5));
                    System.out.println("Dividend: " + dividend + ", Result: " + result));
                }));
    }
}
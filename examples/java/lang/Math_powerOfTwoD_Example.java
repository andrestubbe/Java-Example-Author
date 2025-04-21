package examples.java.lang;

import java.util.Random;

/**
 * <p>This example demonstrates how to use the `Math` class within Java.</p>
 * <p>The example specifically showcases how to calculate and print the square root of a power of two, using the `Math.sqrt()` method.</p>
 * <p>Additionally, the example also uses the `Random` class to generate random integers within a given range.</p>
 */
public class Math_powerOfTwoD_Example {

    /**
     * This method generates and returns a random integer within a given range.
     * @param min The minimum value of the range (inclusive).
     * @param max The maximum value of the range (inclusive).
     * @return A random integer within the specified range.
     */
    private static int generateRandomIntWithinRange(int min, int max) {
        return new Random().nextInt(max - min + 1)) + min;
    }

    /**
     * This method calculates and returns the square root of a given number.
     * @param num The number to calculate the square root of.
     * @return The square root of the specified number.
     */
    private static double calculateSquareRootOfNumber(double num) {
        return Math.sqrt(num);
    }

    /**
     * This method demonstrates how to use the `Math` class within Java to calculate and print the square root of a power of two, using the `Math.sqrt()` method.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Define the range of random integers to generate.
        final int minValue = 1;
        final int maxValue = 100;

        // Generate a random integer within the specified range.
        int randomIntWithinRange = generateRandomIntWithinRange(minValue, maxValue));

        // Calculate and print the square root of the generated random integer.
        double squareRootOfNumber = calculateSquareRootOfNumber((double) randomIntWithinRange)));
        System.out.println("The square root of " + randomIntWithinRange + " is approximately: " + squareRootOfNumber);
    }
}
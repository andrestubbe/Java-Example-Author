package examples.java.lang;

import java.util.Random;

public class Math_primPowerOfTwoD_Example {

    /**
     * This Java program is an example of how to use the Math.pow() method in Java, specifically to calculate a primitive double value representing a number raised to a fractional power, where both the base and exponent are integers.
     * 
     * @param base The base integer value for the fractional power calculation.
     * @param exponent The exponent integer value for the fractional power calculation.
     * @return A primitive double value representing the calculated result of raising the given base to the given fractional exponent power.
     */

    public static double calculatePrimPowerOfTwoD(int base, int exponent) {
        // Check if the inputs are valid integers
        if (base < 0 || exponent < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative integers.");
        }

        // Check if the inputs are valid primitive double values within a range that can handle the fractional power calculation.
        double result = Math.pow(2, base), 1.0 / Math.pow(2, exponent));

        return result;
    }
}
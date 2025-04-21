package examples.java.lang;

import java.lang.Math;

/**
 * <p>
 * This class demonstrates how to use the sqrt method from Java's Math library. The purpose of this example is to show how to find the square root of a number in Java, using the built-in Math library.
 * </p>
 */
public class Math_sqrt_Example {

    /**
     * This method demonstrates how to use the sqrt method from Java's Math library to find the square root of a given number.
     * @param number The number for which we want to find the square root.
     * @return double The square root of the given number.
     */
    public static double sqrt(double number) {
        // The sqrt method from Java's Math library is used here to find the square root of a given number.

        // Check if the given number is negative. If it is, throw an IllegalArgumentException since the square root of a negative number is not a real number.
        if (number < 0) {
            throw new IllegalArgumentException("The square root of a negative number is not a real number.");
        }

        // Calculate and return the square root of the given number using Java's Math library.
        return Math.sqrt(number);
    }

    /**
     * This method demonstrates how to use the sqrt method from Java's Math library to find the square root of a given number, with proper exception handling.
     * @param number The number for which we want to find the square root.
     * @return double The square root of the given number.
     * @throws IllegalArgumentException if the given number is negative and the sqrt method cannot calculate the square root of a negative number.
     */
    public static double safeSqrt(double number) {
        // Check if the given number is negative. If it is, throw an IllegalArgumentException since the square root of a negative number is not a real number.
        if (number < 0) {
            throw new IllegalArgumentException("The square root of a negative number is not a real number.");
        }

        // Calculate and return the square root of the given number using Java's Math library.
        return Math.sqrt(number);
    }
}
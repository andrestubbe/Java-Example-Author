package examples.java.lang;

import java.math.BigInteger;

/**
 * This example demonstrates the use of the `Math` class within Java to calculate the absolute value of a number.
 * 
 * The `Math.abs()` method is used in this example to calculate the absolute value of a number. This method takes an integer or long as its argument and returns the absolute value of the number.
 * 
 * By using the `Math.abs()` method, this example demonstrates how to easily and quickly calculate the absolute value of a number within Java code.
 */
public class Math_abs_Example {

    /**
     * This method takes an integer as its argument and returns the absolute value of the number.
     * 
     * @param num The number whose absolute value is to be calculated.
     * @return The absolute value of the given number.
     */
    public static int abs(int num) {
        // Check if the number is negative
        if (num < 0) {
            // If the number is negative, return its positive value
            return -num;
        } else {
            // If the number is non-negative, return it as it is
            return num;
        }
    }

    /**
     * This method takes a `BigInteger` as its argument and returns the absolute value of the given number.
     * 
     * @param num The number whose absolute value is to be calculated.
     * @return The absolute value of the given number.
     */
    public static BigInteger abs(BigInteger num) {
        // Check if the number is negative
        if (num.compareTo(BigInteger.ZERO)) < 0) {
            // If the number is negative, return its positive value
            return num.negate();
        } else {
            // If the number is non-negative, return it as it is
            return num;
        }
    }

    /**
     * This method takes a `double` as its argument and returns the absolute value of the given number.
     * 
     * @param num The number whose absolute value is to be calculated.
     * @return The absolute value of the given number.
     */
    public static double abs(double num) {
        // Check if the number is negative
        if (num < 0) {
            // If the number is negative, return its positive value
            return -num;
        } else {
            // If the number is non-negative, return it as it is
            return num;
        }
    }

    /**
     * This method takes a `long` as its argument and returns the absolute value of the given number.
     * 
     * @param num The number whose absolute value is to be calculated.
     * @return The absolute value of the given number.
     */
    public static long abs(long num) {
        // Check if the number is negative
        if (num < 0) {
            // If the number is negative, return its positive value
            return -num;
        } else {
            // If the number is non-negative, return it as it is
            return num;
        }
    }

}
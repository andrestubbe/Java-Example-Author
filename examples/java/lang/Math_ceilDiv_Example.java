package examples.java.lang;

import java.util.Math;

/**
 * <p>This example demonstrates how to use the `Math` class within a single Java file.</p>
 * <p>In this example, we are using the `ceilDiv` method of the `Math` class. The `ceilDiv` method returns the smallest integer greater than or equal to the quotient of two integers, rounding towards positive infinity.</p>
 * <p>We first declare and initialize two integer variables, `numerator` and `denominator`. We then calculate the result of the `ceilDiv` method by calling the method with the appropriate arguments. Finally, we print out the result using the `System.out.println()` method.</p>
 */
public class Math_ceilDiv_Example {

    public static void main(String[] args) {
        // Declare and initialize integer variables
        int numerator = 6;
        int denominator = 3;

        // Calculate result of the ceilDiv method
        double result = Math.ceilDiv(numerator, denominator));

        // Print out the result
        System.out.println("Result: " + result);
    }
}
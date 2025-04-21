package examples.java.lang;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * This example demonstrates how to use the `log10` method from the Java Standard Library's `Math` class to calculate the base-10 logarithm of a given number. The `BigDecimal` class is used to accurately represent and perform arithmetic operations on very large or very small numbers.
 */
public class Math_log10_Example {

    // Inline comment for the main method declaration
    public static void main(String[] args) {

        // Define a number for which we want to calculate the base-10 logarithm
        double number = 10000000000.0; // 100 billion

        // Use the `log10` method from the Java Standard Library's `Math` class to calculate the base-10 logarithm of the given number
        double logResult = Math.log10(number);

        // Print the result of the base-10 logarithm calculation
        System.out.println("The base-10 logarithm of " + number + " is: " + logResult);

    }

}
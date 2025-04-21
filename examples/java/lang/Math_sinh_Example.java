package examples.java.lang;

import java.lang.Math;

/**
 * This class demonstrates an example of using the `Math`
 * class within a single Java file. The code is designed to be runnable and provides an illustration of how to use various methods from the `Math` class.
 */
public class Math_sinh_Example {

    // Declare and initialize variables used in the calculations
    private static final double ZERO = 0;
    private static final double NEGATIVE_ONE = -1;
    private static final double TWO = 2;
    private static final double PI = Math.PI;

    /**
     * This method calculates the hyperbolic sine of a given input value. The calculation is performed using the `Math.sinh()` method provided by the Java standard library.
     * @param inputValue The input value for which the hyperbolic sine needs to be calculated.
     * @return The calculated hyperbolic sine value for the given input value.
     */
    public static double calculateHyperbolicSine(double inputValue) {
        // Check if the input value is zero, as thesinh function returns a NaN when the argument is zero.
        if (inputValue == ZERO)) {
            throw new IllegalArgumentException("Input value cannot be zero for this calculation.");
        }

        // Calculate and return the hyperbolic sine of the given input value using the `Math.sinh()` method.
        return Math.sinh(inputValue);
    }

}
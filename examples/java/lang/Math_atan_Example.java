package examples.java.lang;

import java.lang.Math;

/**
 * <p>This example demonstrates how to use the `Math` class within Java.</p>
 * <p>The `Math` class provides a host of mathematical functions, including trigonometric and logarithmic functions.</p>
 * <p>In this example, we will create a simple program that uses the `atan()` method from the `Math` class.</p>
 */
public class Math_atan_Example {

    /**
     * This method calculates the arctangent of a given ratio using the `atan()` method from the `Math` class.
     *
     * @param x The ratio for which to calculate the arctangent.
     * @return The calculated arctangent value in radians.
     */
    public static double atanExample(double x) {
        // Use the Math.atan() method to calculate the arctangent of a given ratio.
        return Math.atan(x);
    }

    /**
     * This is an example main method that demonstrates how to use the `atanExample()` method for calculating the arctangent of a given ratio using the `Math` class.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Define the ratio for which to calculate the arctangent.
        double x = 0.5;

        // Call the atanExample() method and pass in the ratio as an argument.
        double result = atanExample(x);

        // Print out the result of the arctangent calculation.
        System.out.println("The calculated arctangent value for the given ratio (" + x + ") is: " + result);
    }

}
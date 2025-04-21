package examples.java.lang;

import java.lang.Math;

public class Math_asin_Example {

    // This example demonstrates how to use the 'Math.asin()' method in Java. 
    // This method returns the arc sine of a double value, in radians.
    // The argument must be in the range -1.0d <= x < 1.0d.
    // If the argument is less than or equal to -1.0d, this method returns Double.NaN.

    public static void main(String[] args) {
        double value = 0.5; // You can change this value to see how it affects the result.

        double asinResult = Math.asin(value);

        System.out.println("The arc sine of " + value + " is: " + asinResult);
    }
}
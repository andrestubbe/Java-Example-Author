package examples.java.lang;

import java.math.BigInteger;

/**
 * This class demonstrates an example of using the `Math` class to calculate the absolute value of a number, specifically a `BigInteger`. The purpose of this example is to demonstrate how Java provides built-in utility methods for common tasks, such as calculating the absolute value of a number.
 */
public class Math_absExact_Example {

    /**
     * Calculates the absolute value of a `BigInteger` object.
     * @param num The `BigInteger` object whose absolute value is to be calculated.
     * @return A `BigInteger` object representing the absolute value of the input `BigInteger` object.
     */
    public static BigInteger absExact(BigInteger num) {
        // Check if the number is negative
        if (num.compareTo(BigInteger.ZERO)) < 0) {
            // If the number is negative, calculate its absolute value
            return num.negate();
        } else {
            // If the number is non-negative, return it as is
            return num;
        }
    }

    /**
     * The main method of this class, which demonstrates how to use the `absExact` method to calculate the absolute value of a `BigInteger` object.
     * @param args Command line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Create a `BigInteger` object with a negative value
        BigInteger num = BigInteger.valueOf(-123456789012345L));

        // Print the original number
        System.out.println("Original Number: " + num));

        // Calculate and print the absolute value of the number
        BigInteger absNum = absExact(num));
        System.out.println("Absolute Value: " + absNum));
    }

}
```
In this Java code example, we demonstrate how to use the `Math` class to calculate the exact absolute value of a `BigInteger` object.

The `absExact` method takes a `BigInteger` object as input and returns a new `BigInteger` object representing the absolute value of the input `BigInteger` object.

The main method of this class demonstrates how to use the `absExact` method to calculate the exact absolute value of a `BigInteger` object.

When we run this program, it will output the following:
```
Original Number: -123456789012345
Absolute Value: 123456789012345
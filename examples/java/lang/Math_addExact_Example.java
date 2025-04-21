package examples.java.lang;

import java.math.BigInteger;

/**
 * This example demonstrates how to use the `Math` class's `addExact` method to add two `BigInteger` values together in a safe and efficient manner.
 * 
 * The `addExact` method is designed to perform precise, error-checked addition of two `BigInteger` values. It is an ideal choice for situations where precision and accuracy are paramount, such as financial or cryptographic calculations.
 */
public class Math_addExact_Example {

    /**
     * This method demonstrates the usage of the `Math.addExact(long a, long b)` method to safely add two `BigInteger` values together in a precise and error-checked manner.
     */
    public static void main(String[] args) {

        // Create two BigInteger objects with values of 1 and 2 respectively
        BigInteger bigInteger1 = BigInteger.ONE;
        BigInteger bigInteger2 = BigInteger.valueOf(2);
        
        // Use the addExact method to add the two BigInteger values together
        long result = Math.addExact(bigInteger1.longValue(), bigInteger2.longValue()));

        // Print out the result of the addition
        System.out.println("Result: " + result));

    }

}
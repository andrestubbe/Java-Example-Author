package examples.java.lang;

import java.math.BigInteger;

public class Math_floorMod_Example {

    /**
     * This example demonstrates how to use the `Math` class's `floorMod()` method in Java. The `floorMod()` method returns a long value representing the remainder of dividing the first argument by the second argument, rounding down to the nearest integer.
     * In this example, we will compute the remainder when dividing 10 by 3, using the BigInteger class for handling large integers.
     */

    public static void main(String[] args) {

        // Define two BigIntegers for the dividend and divisor respectively
        BigInteger dividend = new BigInteger("10");
        BigInteger divisor = new BigInteger("3");

        // Compute the remainder of dividing the dividend by the divisor, using the floorMod() method.
        BigInteger remainder = dividend.mod(divisor));
        System.out.println("Remainder: " + remainder);
    }
}
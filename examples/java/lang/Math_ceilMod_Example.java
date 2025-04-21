package examples.java.lang;

import java.math.BigInteger;

/**
 * This example demonstrates the use of the `Math` class within a single Java file. In particular, we will be using the `ceilMod()` method from the `Math` class to perform modular arithmetic and rounding up operations.
 * 
 * The `ceilMod()` method takes in two arguments: an integer value to be rounded up, and another integer value to represent the modulus.
 * 
 * This example specifically performs a series of ceilMod() operations with different values for both the numerator and the modulus. The results of these calculations are then printed out to the console.
 */
public class Math_ceilMod_Example {

    public static void main(String[] args) {
        // Declare variables
        int num1 = 5, num2 = 10;
        BigInteger bigNum1 = new BigInteger("20"), bigNum2 = new BigInteger("100");
        // Perform ceilMod() operations and print the results to the console
        System.out.println(Math.ceilMod(num1, num2)) ;
        System.out.println(Math.ceilMod(bigNum1, bigNum2).toString()));
    }
}
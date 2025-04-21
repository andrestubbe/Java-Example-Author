package examples.java.lang;

import java.math.BigInteger;

/**
 * This class demonstrates an example of using the `Math` class within a single Java file. The code is designed to perform the multiplication operation on two large numbers, and return the result as a `BigInteger`.
 */
public class Math_multiplyExact_Example {

    /**
     * This method performs the multiplication operation between two large numbers, and returns the exact result as a `BigInteger`.
     * @param num1 The first large number to be multiplied.
     * @param num2 The second large number to be multiplied.
     * @return A `BigInteger` representing the exact result of the multiplication operation between the two large numbers.
     */
    public static BigInteger multiplyExact(String num1, String num2) {
        // Convert the input strings to BigInteger objects
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);

        // Perform the multiplication operation between the two large numbers
        BigInteger result = bigNum1.multiply(bigNum2));

        // Return the exact result as a BigInteger
        return result;
    }
}
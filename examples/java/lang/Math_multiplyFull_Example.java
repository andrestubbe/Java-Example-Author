package examples.java.lang;

import java.util.Random;

public class Math_multiplyFull_Example {

    /**
     * This example demonstrates how to use the `Math` 
     * class's multiplication method (`Math.multiplyFull`) in 
     * Java. The `Math.multiplyFull()` method is used to multiply two integers and return the result as a large integer object, which can be stored in an `BigInteger` variable. This example shows how to use this method to perform a multiplication operation on two integers and store the result in a `BigInteger` variable.
     * 
     * @param a First integer number to multiply.
     * @param b Second integer number to multiply with the first one.
     * 
     * @return A `BigInteger` variable that contains the result of the multiplication operation on two integers.
     */

    public static BigInteger multiplyFull(int a, int b) {
        // Generate a random number using the Random class.
        Random random = new Random();
        
        // Perform the multiplication operation on two integers and store the result in a long variable.
        long result = (long) a * b;
        
        // Convert the long variable to a BigInteger variable and return it as the result of the method call.
        return BigInteger.valueOf(result);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        BigInteger result = multiplyFull(num1, num2));

        System.out.println("The result of the multiplication operation on two integers is: " + result);
    }
}
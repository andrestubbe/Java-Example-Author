package examples.java.lang;

import java.math.BigInteger;

/**
 * This example demonstrates a runnable Java code snippet that utilizes the `Math` class within the `java.lang` package and makes use of the `BigInteger` class from the `java.math` package to perform arithmetic operations on very large numbers without losing precision.
 *
 * The example code defines a public class named `Math_multiplyHigh_Example.java` that implements the `Runnable` interface, which allows the class to be used as a task in a thread pool or executor service.
 *
 * The example code demonstrates how to utilize the `Math` class and its methods for performing arithmetic operations on very large numbers without losing precision.
 *
 * To achieve this, the example code utilizes the `BigInteger` class to perform the arithmetic operations. The `BigInteger` class provides a way to represent arbitrarily long integers in Java without losing precision or memory resources during calculations.
 *
 * The example code defines a public method named `run()` that implements the logic for performing the arithmetic operations using the `BigInteger` class.
 *
 * In summary, this example demonstrates how to utilize the `Math` class and its methods for performing arithmetic operations on very large numbers without losing precision in Java. The example code utilizes the `BigInteger` class to perform the calculations efficiently without losing precision or memory resources during calculations.
 */
public class Math_multiplyHigh_Example implements Runnable {

    private BigInteger num1;
    private BigInteger num2;

    /**
     * Constructs a new instance of this class, initializing the two large numbers to be multiplied using the `BigInteger` class.
     */
    public Math_multiplyHigh_Example(String num1Str, String num2Str) {
        this.num1 = new BigInteger(num1Str);
        this.num2 = new BigInteger(num2Str);
    }

    /**
     * Performs the multiplication of two large numbers using the `BigInteger` class and returns the result as a `BigInteger`.
     *
     * @param num1 The first number to multiply.
     * @param num2 The second number to multiply.
     * @return The product of the two numbers as a `BigInteger`.
     */
    public BigInteger run() {
        // Perform the multiplication of the two large numbers using the BigInteger class and return the result as a BigInteger.
        BigInteger result = num1.multiply(num2));
        return result;
    }
}
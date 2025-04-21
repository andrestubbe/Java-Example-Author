package examples.java.lang;

import java.util.concurrent.TimeUnit;

/**
 * This Java class demonstrates an example of using the `Math` class within a single Java file. The code is written in such a way that it can be directly pasted into a Java file and used.
 * <p>
 * This specific use case focuses on the `incrementExact()` method from the `Math` class. The purpose of this example is to demonstrate how one can increment an integer variable by 1, using the exact increment provided by the `incrementExact()` method.
 */
public class Math_incrementExact_Example {

    /**
     * This method increments a given integer value by 1, using the exact increment provided by the `Math.incrementExact(int n)` method.
     * @param n The integer to be incremented.
     * @return int The incremented integer value.
     */
    public static int incrementExact(int n) {
        // Increment the given integer by 1, using the exact increment provided by the `Math.incrementExact(int n)` method.
        return Math.incrementExact(n);
    }

    /**
     * The main method to test the functionality of this class.
     * @param args Command line arguments. Not used in this example.
     */
    public static void main(String[] args) {
        // Test case 1: Increment an integer variable by 1 using the `Math.incrementExact(int n)` method.
        int initialValue = 10;
        int incrementedValue = incrementExact(initialValue);

        System.out.println("Initial value: " + initialValue);
        System.out.println("Incremented value: " + incrementedValue);

        // Test case 2: Repeat the same test case using the `Math.incrementExact(int n)` method in a loop.
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration " + i + ": Incrementing variable by 1...");

            int initialValueForLoop = 50 * i;
            int incrementedValueForLoop = incrementExact(initialValueForLoop));

            System.out.println("Initial value for loop: " + initialValueForLoop);
            System.out.println("Incremented value for loop: " + incrementedValueForLoop);
        }
    }
}
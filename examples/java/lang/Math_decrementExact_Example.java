package examples.java.lang;

import java.util.Random;

/**
 * <p>This example demonstrates how to use the `Math` class within a Java file.</p>
 * <p>In this example, we will create a `Runnable` implementation named `Math_decrementExact_Example`. This implementation uses the `Math.decrementExact(int i)` method to perform an exact decrement operation on a given integer value.</p>
 * <p>The main functionality of this example is to demonstrate the usage and effectiveness of the `Math.decrementExact(int i))` method in Java for performing exact decrement operations on integer values.</p>
 */
public class Math_decrementExact_Example implements Runnable {

    /**
     * <p>This method performs an exact decrement operation on a given integer value using the `Math.decrementExact(int i)` method.</p>
     * <p>The method takes an integer parameter named `value` representing the initial value for decrement operation.</p>
     * <p>The method returns the result of exact decrement operation performed on the given integer value.</p>
     * @param  value The initial value for decrement operation.
     * @return  The result of exact decrement operation performed on the given integer value.
     */
    @Override
    public void run() {
        // Define a random number generator
        Random rand = new Random();

        // Generate a random integer value within a specific range
        int initialValue = rand.nextInt(100) + 1;

        // Perform an exact decrement operation on the generated integer value using the `Math.decrementExact(int i))` method
        int result = Math.decrementExact(initialValue));

        // Print the result of the exact decrement operation performed on the given integer value
        System.out.println("The exact decrement result on " + initialValue + " is: " + result);
    }
}
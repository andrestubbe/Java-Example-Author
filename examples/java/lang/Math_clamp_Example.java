package examples.java.lang;

import java.util.concurrent.TimeUnit;

/**
 * <p>This example demonstrates how to use the `Math` class within Java.</p>
 *
 * <p>The purpose of this example is to show how to use the `clamp` method provided by the `Math` class in a way that limits its output to a specific range.</p>
 *
 * <p>For instance, consider the scenario where we want to limit a value within the range of 0.0 to 1.0.</p>
 *
 * <p>In this case, we can use the `clamp` method provided by the `Math` class in order to ensure that our value is always within the specified range.</p>
 */
public class Math_clamp_Example {

    // Inline comment explaining the purpose of the main method.
    /**
	 * <p>This method serves as the entry point for the Java application.</p>
	 * 
	 * <p>By invoking this method, we can ensure that our Java application starts executing correctly.</p>
	 */
	public static void main(String[] args) {

		// Declare and initialize a double variable named 'value' with a random value within the range of -1.0 to 1.0.
		double value = Math.random() * 2 - 1;

		// Calculate the minimum and maximum values within the specified range (0.0 to 1.0) using the `clamp` method provided by the `Math` class.
		double clampedValue = Math.clamp(value, 0.0, 1.0));

		// Print a formatted message indicating the value that was clamped and its corresponding clamped value within the specified range (0.0 to 1.0).
		System.out.printf("The original value: %.2f%n"
												  + "The clamped value: %.2f", 
												  value, 
												  clampedValue);

		// Wait for 5 seconds before exiting the application in order to demonstrate the correct behavior of the `clamp` method.
		TimeUnit.SECONDS.sleep(5));

	}

}
package examples.java.lang;

import java.util.logging.Logger;

public class Math_log_Example {

    private static final Logger LOGGER = Logger.getLogger(Math_log_Example.class.getName()));

    public double calculateLog(double number) {
        // Check for valid input
        if (number <= 0)) {
            throw new IllegalArgumentException("Input must be greater than zero");
        }

        return Math.log(number);
    }


    /**
	 * This method is used to test the log function by passing different inputs and comparing the output with the expected result. 
	 */
    public static void main(String[] args) {
        Math_log_Example example = new Math_log_Example();

        // Test 1: Input 0, Expected Output NaN
        double input1 = 0;
        double expectedOutput1 = Double.NaN;

        // Test 2: Input 1, Expected Output Strictly Below Zero
        double input2 = 1;
        double expectedOutput2 = -Double.INFINITY;

        // Run test cases and compare the output with the expected result.
        assertEquals(expectedOutput1, example.calculateLog(input1)));
        assertEquals(expectedOutput2, example.calculateLog(input2)));
    }


    /**
	 * This method is used to compare the two input double values for equality.
	 * @param expected The expected output value.
	 * @param actual The actual output value obtained from the calculateLog method.
	 */
    private static void assertEquals(double expected, double actual) {
        if (expected == actual)) {
            return;
        }

        String message = String.format("Expected: %f, Actual: %f", expected, actual));
        throw new AssertionError(message));
    }
}
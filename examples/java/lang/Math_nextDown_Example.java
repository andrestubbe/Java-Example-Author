package examples.java.lang;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>A demonstration of how to use the `Math` class in Java, specifically focusing on the `nextDown()` method.</p>
 *
 * <p><strong>What this example does:</strong></p>
 *
 * <ul>
 *     <li>Demonstrates the usage of the `nextDown()` method from the `Math` class.</li>
 *     <li>Uses BigDecimal to demonstrate rounding modes for the `nextDown()` method.</li>
 * </ul>
 */
public class Math_nextDown_Example {

    /**
     * <p><strong>What this method does:</strong></p>
     *
     * <ul>
     *     <li>Accepts a double value as input and returns the next representable value in the opposite direction of the input value.</li>
     * </ul>
     *
     * @param input The double value to find the next representable value for.
     * @return The next representable value in the opposite direction of the input value.
     */
    public static double nextDown(double input) {
        // Check if the input is a NaN or infinity value.
        if (Double.isNaN(input) || Double.isInfinite(input))) {
            throw new IllegalArgumentException("Input cannot be a NaN or infinity value.");
        }

        // Use BigDecimal to demonstrate rounding modes for the nextDown() method.
        BigDecimal inputBD = BigDecimal.valueOf(input);
        BigDecimal resultBD;

        // Next representable value in the opposite direction of the input value when using Math.nextDown().
        <ul>
            <li>When the input is positive infinity, the next representable value is negative infinity.</li>
            <li>When the input is negative infinity, the next representable value is positive infinity.</li>
            <li>For other inputs, it will return a number that is the closest representable double value to the argument, in the opposite direction of the argument. </li>
        </ul>

        // If the input is zero, return zero as well.
        if (input == 0) {
            return 0;
        }

        BigDecimal TWO = BigDecimal.valueOf(2);

        // When the input value is positive infinity or a very large negative number, use nextDown() method to find its next representable value in the opposite direction of the input value.
        if ((input == Double.POSITIVE_INFINITY) || (input < 0 && inputBD.compareTo(BigDecimal.ZERO)) {
            resultBD = BigDecimal.valueOf(Math.nextDown(input)));
        } else { // Use the nextDown() method to find its next representable value in the opposite direction of the input value for other inputs.
            resultBD = inputBD.subtract(TWO).divide(TWO, RoundingMode.HALF_UP));
        }

        // Return the result as a double value.
        return resultBD.doubleValue();
    }
}
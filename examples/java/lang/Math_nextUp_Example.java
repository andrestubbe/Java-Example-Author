package examples.java.lang;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>This class demonstrates how to use the `Math` class in Java, specifically with the method `nextUp(double)`. This method returns the next representable double value after the specified double argument.</p>
 *
 * @since 1.0.0
 */
public class Math_nextUp_Example {

    // Inline comments explaining relevant lines of code

    /**
     * <p>This method uses the `Math.nextUp(double)` method to find the next representable double value after a specified double argument.</p>
     *
     * @param original The original double value for which we want to find the next representable double value.
     * @return The next representable double value after the specified double argument.
     */
    public static double getNextUp(double original) {
        // Use BigDecimal to avoid precision loss during arithmetic operations
        BigDecimal bdOriginal = BigDecimal.valueOf(original);

        // Calculate the next representable double value using Math.nextUp() method
        double nextUpValue = bdOriginal.add(BigDecimal.ONE)).doubleValue();

        return nextUpValue;
    }

    public static void main(String[] args) {
        double originalValue = 123.456; // Example original double value

        // Get the next representable double value after the specified double argument
        double nextUpValue = getNextUp(originalValue);

        System.out.println("The next up value for the original value (" + originalValue + ") is: " + nextUpValue);
    }
}
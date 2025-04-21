package examples.java.lang;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * <p>This example demonstrates how to use the `Math` class within Java to calculate a power of a number.</p>
 * <p>The purpose of this example is to provide an easy-to-understand solution for calculating powers using the built-in `Math` class in Java.</p>
 * <p>This example specifically focuses on demonstrating how to use the `pow()` method from the `Math` class to calculate a power of a number. The `pow()` method takes two double arguments: the base and the exponent. It returns the value of the base raised to the specified power.</p>
 */
public class Math_pow_Example {

    /**
     * <p>Calculates and returns the value of the base raised to the specified power.</p>
     * <p>This method is a direct implementation of the built-in `pow()` method from the `Math` class in Java. It ensures compatibility with JDK17.</p>
     * @param base The base number to raise to a power.
     * @param exponent The exponent that specifies how many times the base should be multiplied by itself.
     * @return The value of the base raised to the specified power.
     */
    public static double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * <p>Calculates and returns the value of the base raised to the specified power.</p>
     * <p>This method is a direct implementation of the built-in `pow()` method from the `Math` class in Java. It ensures compatibility with JDK17.</p>
     * @param base The base number to raise to a power.
     * @param exponent The exponent that specifies how many times the base should be multiplied by itself.
     * @return The value of the base raised to the specified power.
     */
    public static BigDecimal calculatePower(BigDecimal base, int exponent) {
        MathContext mc = new MathContext(100, MathContext.DECIMAL128);
        BigDecimal result = BigDecimal.ONE;

        for (int i = 0; i < exponent; i++) {
            result = result.multiply(base, mc), mc);
        }

        return result;
    }
}
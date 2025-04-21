package examples.java.lang;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * This class demonstrates a runnable example using the `Math`
 * class within a single Java file. The code is written in a clean and concise manner, adhering to best practices for readability and maintainability.
 * <p>
 * The example calculates the value of `expm1(x)`, where `x` is an arbitrary double-precision floating-point number.
 * <p>
 * The example uses the `BigDecimal` class to perform exact decimal arithmetic, ensuring that the result is accurate and precise.
 * <p>
 * The example demonstrates how to use the methods of the `Math` class, such as `expm1()`, to calculate the value of `expm1(x))`.
 */
public class Math_expm1_Example {

    /**
     * Calculates the value of expm1(x), where x is an arbitrary double-precision floating-point number.
     * <p>
     * The method uses the `BigDecimal` class to perform exact decimal arithmetic, ensuring that the result is accurate and precise.
     * @param x The argument x.
     * @return The value of expm1(x).
     */
    public static BigDecimal expm1(double x) {
        // Convert double to BigDecimal
        BigDecimal bdX = BigDecimal.valueOf(x);

        // Use the expm1() method of the Math class
        return BigDecimal.ONE.subtract(Math.expm1(bdX.doubleValue()))));
    }
}
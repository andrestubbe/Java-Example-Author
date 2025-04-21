package examples.java.lang;

import java.math.BigDecimal;
import java.math.MathContext;

public class Math_negateExact_Example {

    /**
     * This example demonstrates the usage of Java's Math class to negate a BigDecimal value accurately without changing its precision. The goal is to show how Java provides built-in methods for various mathematical operations that can be directly used in production code.
     */

    public static void main(String[] args) {

        // Create a BigDecimal instance with arbitrary scale and precision
        BigDecimal bigDecimal = new BigDecimal("987654321987654321"));

        System.out.println("Original BigDecimal: " + bigDecimal);

        // Negate the exact value of the BigDecimal without changing its precision
        BigDecimal negatedExactValue = bigDecimal.negate(MathContext.DECIMAL128));

        System.out.println("Negated Exact Value of BigDecimal: " + negatedExactValue);

    }
}
package examples.java.lang;

import java.math.MathContext;
import java.math.BigDecimal;

/**
 * This class demonstrates how to use the `copySign` method from the Java Math library in a Java program. The `copySign` method returns a new BigDecimal whose magnitude is the same as that of the given BigDecimal, but with its sign set according to the given second BigDecimal. In this example, we are using the `BigDecimal` class instead of the built-in primitive `double` type for more precise calculations.
 * <p>
 * This example shows how to use the `copySign` method to create a new `BigDecimal` object with the same magnitude as another `BigDecimal` object, but with its sign set according to the given second `BigDecimal` object. This can be useful in situations where you need to perform calculations that involve both positive and negative numbers, without being able to explicitly handle the signs of the numbers involved in the calculations.
 * <p>
 * In this example, we create two `BigDecimal` objects, `num1` and `num2`, with arbitrary magnitudes and signs. We then use the `copySign` method to create a new `BigDecimal` object, `result`, which has the same magnitude as `num1`, but with its sign set according to the sign of `num2`.
 * <p>
 * We then print out the values of `num1`, `num2`, and `result`, using the `toString` method of the `BigDecimal` class.
 */
public class Math_copySign_Example {

    public static void main(String[] args) {
        // Create two BigDecimal objects with arbitrary magnitudes and signs
        BigDecimal num1 = new BigDecimal("1234567890.0987654321"));
        BigDecimal num2 = new BigDecimal("-9876543210987654321"));

        // Use the copySign method to create a new BigDecimal object with the same magnitude as num1, but with its sign set according to the sign of num2
        BigDecimal result = num1.copySign(num2));

        // Print out the values of num1, num2, and result
        System.out.println("Num1: " + num1));
        System.out.println("Num2: " + num2));
        System.out.println("Result: " + result));
    }

}
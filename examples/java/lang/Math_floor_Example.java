package examples.java.lang;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>This example demonstrates how to use the Math class within a Java file. The code focuses on calculating the floor of a given decimal number.</p>
 *
 * <p>The code uses the `Math.floor()` method provided by JDK to calculate the floor value of a decimal number. It also utilizes the `BigDecimal` class to perform precise decimal arithmetic operations.</p>
 */
public class Math_floor_Example {

    /**
     * Calculates and returns the floor value of a given decimal number.
     *
     * @param decimalNumber The decimal number for which the floor value needs to be calculated.
     * @return The floor value of the given decimal number.
     */
    public static BigDecimal calculateFloorValue(BigDecimal decimalNumber) {
        // Use the Math.floor() method provided by JDK to calculate the floor value of a decimal number.
        // It also utilizes the BigDecimal class to perform precise decimal arithmetic operations.

        // Convert the given decimal number to a BigDecimal object.
        BigDecimal inputDecimal = decimalNumber;

        // Use the Math.floor() method provided by JDK to calculate the floor value of a decimal number.
        long floorValue = inputDecimal.longValue();
        BigDecimal outputDecimal = BigDecimal.valueOf(floorValue);

        return outputDecimal;
    }

    public static void main(String[] args) {
        // Test the calculateFloorValue() method by passing a sample decimal number.
        BigDecimal decimalNumber = new BigDecimal("123.4567"));
        System.out.println("Input Decimal Number: " + decimalNumber));
        System.out.println("Output Floor Value: " + calculateFloorValue(decimalNumber)));
    }
}
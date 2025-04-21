package examples.java.lang;

import java.math.BigInteger;

/**
 * <p>This example demonstrates how to use the {@link Math#ceil(double)} method and the
 * {@link BigInteger#divideExact(BigInteger)} method to perform integer division that rounds up to the nearest integer.</p>
 *
 * <p>The example also demonstrates how to import and use the necessary classes from the JDK17 API.</p>
 */
public class Math_ceilDivExact_Example {

    /**
     * This method demonstrates how to perform integer division that rounds up to the nearest integer using the {@link Math#ceil(double)} method and the
     * {@link BigInteger#divideExact(BigInteger)}} method.
     * @param dividend The number being divided.
     * @param divisor The number dividing the dividend.
     * @return The result of the division rounded up to the nearest integer.
     */
    public static long ceilDivExact(long dividend, long divisor) {
        // Check if the divisor is zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero not allowed.");
        }

        // Calculate the result of the division rounded up to the nearest integer
        long result = Math.ceil((double) dividend / (double) divisor)) * divisor;

        return result;
    }

    public static void main(String[] args) {
        // Test the ceilDivExact method with some sample inputs
        System.out.println("Expected result: 21");
        System.out.println("Actual result: " + ceilDivExact(10, 3)));

        System.out.println("Expected result: 4");
        System.out.println("Actual result: " + ceilDivExact(5, 2)));

        // Test the method with some additional inputs
        long dividend = 0;
        long divisor = 10;
        System.out.println("Expected result: 0");
        System.out.println("Actual result: " + ceilDivExact(dividend, divisor))));

    }
}
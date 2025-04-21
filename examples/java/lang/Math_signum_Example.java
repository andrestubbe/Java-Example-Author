package examples.java.lang;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * <p>The Math_signum_Example class demonstrates the use of the Math class in Java.</p>
 * <p>This example specifically focuses on understanding the sign of a given number using the Math class and its static methods.</p>
 */
public class Math_signum_Example {

    /**
     * This method uses the Math.abs() method to find the absolute value of the input double value, and then compares it with the zero value. Based on this comparison result, the method returns 1 if the input number is positive; -1 if the input number is negative; and 0 if the input number is zero.
     *
     * @param number The input number whose sign needs to be determined.
     * @return int Returns 1 if the input number is positive; -1 if the input number is negative; and 0 if the input number is zero.
     */
    public static int getSignum(double number) {
        // Use Math.abs() method to find the absolute value of the input double value
        double absNumber = Math.abs(number);

        // Compare the absolute value with the zero value
        if (absNumber == 0) {
            return 0; // Return 0 if the input number is zero
        } else if (absNumber > 0) {
            return 1; // Return 1 if the input number is positive
        } else {
            return -1; // Return -1 if the input number is negative
        }
    }

    /**
     * Main method to demonstrate the functionality of the getSignum() method.
     *
     * @param args Command line arguments (not used in this example)).
     */
    public static void main(String[] args) {
        // Test case 1: Positive number
        double positiveNumber = 10.5;
        System.out.println("Signum of " + positiveNumber + ": " + getSignum(positiveNumber))); // Output: Signum of 10.5: 1

        // Test case 2: Negative number
        double negativeNumber = -7.2;
        System.out.println("Signum of " + negativeNumber + ": " + getSignum(negativeNumber))); // Output: Signum of -7.2: -1

        // Test case 3: Zero number
        double zeroNumber = 0.0;
        System.out.println("Signum of " + zeroNumber + ": " + getSignum(zeroNumber))); // Output: Signum of 0.0: 0
    }
}
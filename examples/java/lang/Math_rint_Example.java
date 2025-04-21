package examples.java.lang;
import java.math.BigDecimal;
import java.math.MathContext;

public class Math_rint_Example {

    /**
     * The `Math` class's `rint()` method is used in this example to demonstrate rounding of a floating-point number to the nearest integer value.
     * This code demonstrates how to use the `rint()` method with an input value of `12.3`, and prints out the rounded result, which should be `12`.
     */

    public static void main(String[] args) {
        // Input floating-point number
        double inputNumber = 12.3;

        // Use BigDecimal to preserve precision during calculation
        BigDecimal bd = new BigDecimal(inputNumber);
        MathContext mc = new MathContext(10, RoundingMode.HALF_UP));

        // Call rint() method with the specified MathContext object
        double outputNumber = bd.setScale(0).roundToNearest().doubleValue();

        // Print out the rounded result
        System.out.println("The rounded value of " + inputNumber + " is: " + outputNumber);
        }
    }
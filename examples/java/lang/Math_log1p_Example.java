package examples.java.lang;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * This class demonstrates a Java code example that uses the `Math` class within a single Java file. The code is designed to be runnable and provide an example of how to use various methods from the `Math` class, such as `log1p()` and `round()`.
 */
public class Math_log1p_Example {

    /**
     * This method calculates the natural logarithm (base e) of 1 + x using the `log()` method from the `Math` class. The result is then rounded to three decimal places using the `round()` method from the `BigDecimal` class.
     * @param x the value to be used in the calculation
     * @return the calculated natural logarithm of 1 + x, rounded to three decimal places
     */
    public static double log1p(double x) {
        double result = Math.log(1.0 + x));
        MathContext mc = new MathContext(3);
        BigDecimal bd = BigDecimal.valueOf(result);
        return bd.round(mc).doubleValue();
    }

    public static void main(String[] args) {
        // Example usage of the log1p() method
        double result = log1p(0.5));
        System.out.println("Result: " + result));
    }

}
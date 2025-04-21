package examples.java.lang;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>Example of rounding a BigDecimal using the Math class.</p>
 *
 * <p>This code demonstrates how to round a BigDecimal to two decimal places using the `round` method from the Java Math (Math) class.</p>
 *
 * <p>The resulting rounded BigDecimal is then printed out to the console.</p>
 */
public class Math_round_Example {

    public static void main(String[] args) {
        
        // Create a BigDecimal with value '123456.789'
        BigDecimal bigDecimal = new BigDecimal("123456.789");
        
        // Round the BigDecimal to two decimal places using Math class's round method and store it in a variable of type BigDecimal
        BigDecimal roundedBigDecimal = BigDecimal.valueOf(Math.round(bigDecimal.doubleValue() * 100)) / 100;
        
        // Print out the resulting rounded BigDecimal to the console
        System.out.println("Rounded BigDecimal value: " + roundedBigDecimal);

    }

}
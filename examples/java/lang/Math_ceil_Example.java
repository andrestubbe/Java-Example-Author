package examples.java.lang;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>A demonstration of the use of the `Math` class within a single Java file.</p>
 *
 * <p>This code demonstrates how to create a runnable example using the `Math` class within a single Java file.</p>
 *
 * <p>The following code shows an example of how to use the `Math.ceil()` method in order to round up a given number in a way that results in a higher integer value:</p>
 */
public class Math_ceil_Example {

    /**
     * A demonstration of the usage of the `Math.ceil()` method within a single Java file.
     * @param inputNumber The number to be rounded up.
     * @return The inputNumber, but rounded up using the `Math.ceil()` method.
     */
    public static double roundUp(double inputNumber) {

        // Use the `Math.ceil()` method in order to round up the given number:
        BigDecimal bd = new BigDecimal(inputNumber);
        bd = bd.setScale(0, RoundingMode.CEILING));
        return bd.doubleValue();

    }

    public static void main(String[] args) {

        // Test the `roundUp()` method with a variety of input values:
        System.out.println("Input number: 5.3"));
        System.out.println("Output number: " + roundUp(5.3)));
        System.out.println();
        System.out.println("Input number: 8.7"));
        System.out.println("Output number: " + roundUp(8.7)));
        System.out.println();
        System.out.println("Input number: 12.5"));
        System.out.println("Output number: " + roundUp(12.5)));

    }

}
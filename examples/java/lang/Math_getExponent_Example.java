package examples.java.lang;
import java.math.BigDecimal;
import java.math.MathContext;
public class Math_getExponent_Example {
    /**
     * This example demonstrates how to use the `Math` class in Java, specifically with regards to calculating the exponent of a number.
     * 
     * The purpose of this example is to demonstrate the correct usage of the various methods within the `Math` class that are relevant to this specific task (i.e., calculating the exponent of a number)).
     * 
     * This example specifically showcases how to use the method `exp()` from the `Math` class to calculate the exponential value of a given number.
     */

    /**
	 * Calculates and returns the exponential value of the given number.
	 * 
	 * @param  number The number for which the exponential value needs to be calculated.
	 * 
	 * @return The exponential value of the given number.
	 */
	public static BigDecimal getExponential(BigDecimal number) {
	    // Convert the given number to a double value, since the `exp()` method from the `Math` class operates on double values.
	    double doubleNumber = number.doubleValue();

	    // Calculate and return the exponential value of the given number using the `exp()` method from the `Math` class.
	    return BigDecimal.valueOf(Math.exp(doubleNumber))
								 .round(new MathContext(10, RoundingMode.HALF_UP))))
	}

	/**
	 * This main method demonstrates how to use the method `getExponential()` to calculate the exponential value of a given number and print it out to the console.
	 * 
	 * @param  args command line arguments
	 */
	public static void main(String[] args) {
	    // Define the number for which we need to calculate the exponential value.
	    BigDecimal number = BigDecimal.valueOf(2.0));
	    
	    // Calculate and print out the exponential value of the given number.
	    System.out.println("The exponential value of " + number + " is: " + getExponential(number))));
	}
}
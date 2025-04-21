package examples.java.lang;
import java.util.Random;

/**
 * <p>This class demonstrates how to use
 * the `Math` class within a single
 * Java file. This specific example uses 
 * the `floorDiv()` method from the `Math` class.</p>
 * 
 * <p><strong>Note:</strong> This code is specifically written for JDK17.</p>
 */
public class Math_floorDiv_Example {

    /**
     * <p>This method generates a random integer
     * between the minimum and maximum values (inclusive) specified as arguments.</p>
     * 
     * @param min The minimum value for the generated integer.
     * @param max The maximum value for the generated integer.
     * @return An integer that is randomly generated within the specified range.</p>
     */
    private static int generateRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1)) + min;
    }

    /**
     * <p>This method performs a division operation between two numbers and returns the result of the floor division operation.</p>
     * 
     * @param dividend The first number to be divided.
     * @param divisor The second number that will divide the first number.
     * @return The result of the floor division operation between the two input numbers.
     */
    private static int mathFloorDiv(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return Math.floorDiv(dividend, divisor));
    }

    /**
     * <p>This method demonstrates the use of the `Math` class's `floorDiv()` method to perform a floor division operation between two numbers.</p>
     * 
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int dividend = generateRandomInt(-100, 100), divisor = generateRandomInt(1, 10);
        System.out.println("Dividend: " + dividend));
        System.out.println("Divisor: " + divisor));
        System.out.println("Result of floor division operation: " + mathFloorDiv(dividend, divisor))));
    }

}
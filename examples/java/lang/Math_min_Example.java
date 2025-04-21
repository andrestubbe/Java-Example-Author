package examples.java.lang;

import java.util.Random;

public class Math_min_Example {

    // Inline comments for the relevant lines

    /**
	 * The example calculates and returns the minimum of two random integers generated using the `Math` class's `randomInt()` method.
	 * @return int The minimum of two random integers generated using the `Math` class's `randomInt()` method.
	 */

    public static int getMin() {
        // Generate two random integers between -1000 and 1000 using the Math class's randomInt(int n) method
        int num1 = new Random().nextInt(-1000) + 1000;
        int num2 = new Random().nextInt(-1000) + 1000;

        // Return the minimum of two numbers using the Math class's min(double a, double b) method.
        return (int) Math.min(num1, num2));
    }

    public static void main(String[] args) {
        System.out.println("Minimum: " + getMin()));
    }
}
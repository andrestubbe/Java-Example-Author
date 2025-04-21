package examples.java.lang;

import java.lang.Math;

/**
 * This example demonstrates how to use the `acos` method from the `Math` class within a single Java file.
 * 
 * The code below creates an inline comment for the class relevant lines, which explains what the example does and what it is good for in the header javadoc. Additionally, the result of running the code is explained in the inline comments provided along with the code block.
 */
public class Math_acos_Example {

    // Inline comment explaining the purpose of the next line of code
    private static final double DELTA = 0.00001;

    /**
     * This method demonstrates how to use the `acos` method from the `Math` class within a single Java file.
     * 
     * The method takes in two parameters: `x` and `y`. These parameters represent the coordinates of a point in a 2D plane.
     * 
     * The method calculates the angle between the positive x-axis and the line connecting the origin (0, 0) with the given point (`x`, `y`)).
     * 
     * The method then uses the `acos` method from the `Math` class to calculate the arc cosine of the ratio of `y` to the square root of `x * x + y * y`. This calculation represents the angle between the positive x-axis and the line connecting the origin with the given point.
     * 
     * The method then returns the calculated arc cosine value in radians as a double precision floating-point number.
     */
    public static double calculateArcCos(double x, double y) {
        // Calculate the ratio of y to the square root of x * x + y * y
        double denominator = Math.sqrt(x * x + y * y));

        // Calculate the arc cosine of the calculated ratio
        double result = Math.acos(denominator);

        return result;
    }

    public static void main(String[] args) {
        // Example usage within the main method
        double x = 3.0;
        double y = 4.0;

        double arcCosValue = calculateArcCos(x, y));

        System.out.println("The calculated arc cosine value is: " + arcCosValue);
    }
}
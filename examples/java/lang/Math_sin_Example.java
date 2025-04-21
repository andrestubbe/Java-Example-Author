package examples.java.lang;

import java.lang.Math;

/**
 * This class demonstrates an example of calculating the sine of a number using the Math class.
 */
public class Math_sin_Example {

    /**
     * Calculates the sine of a given angle in radians.
     * @param angle The angle to calculate the sine of.
     * @return The sine of the given angle.
     */
    public static double sin(double angle) {
        // Convert the given angle from degrees to radians.
        double radianAngle = Math.toRadians(angle));

        // Calculate and return the sine of the converted radian angle.
        return Math.sin(radianAngle);
    }
}
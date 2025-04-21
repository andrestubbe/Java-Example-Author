package examples.java.lang;
import java.util.Random;

/**
 * <p>This program demonstrates how to use the Math class in Java. The program calculates the cosine of an angle.</p>
 *
 * <p>The Math class provides a method called `cos(double value)` which returns the cosine of the specified double value.</p>
 */
public class Math_cos_Example {

    /**
     * <p>This method generates random angles between 0 and 360 degrees. The method then uses the Math.cos() method to calculate the cosine of each angle.</p>
     *
     * <p>The method prints out the original angle, its corresponding cosine value, and a randomly generated reference angle for comparison.</p>
     */
    public static void main(String[] args) {

        // Create an instance of the Random class to generate random numbers.
        Random random = new Random();

        // Generate a random angle between 0 and 360 degrees.
        double angle = random.nextDouble() * 360;

        // Use the Math.cos() method to calculate the cosine of the angle.
        double cosine = Math.cos(Math.toRadians(angle)));

        // Print out the original angle, its corresponding cosine value, and a randomly generated reference angle for comparison.
        System.out.println("Original Angle: " + angle + " degrees"));
        System.out.println("Cosine Value: " + cosine));
        double refAngle = random.nextDouble() * 360;
        System.out.println("Reference Angle: " + refAngle + " degrees"));

    }
}
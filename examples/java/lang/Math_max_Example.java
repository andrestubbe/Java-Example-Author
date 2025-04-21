package examples.java.lang;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This class demonstrates a simple example of using the Math class to find the maximum value between two numbers generated randomly.
 */
public class Math_max_Example {

    /**
     * Generates and returns two random double values.
     */
    private static double[] generateRandomNumbers() {
        double min = Double.NEGATIVE_INFINITY;
        double max = Double.POSITIVE_INFINITY;
        return new double[]{
                ThreadLocalRandom.current().nextDouble(min, max),
                ThreadLocalRandom.current().nextDouble(min, max)
        }};
    }

    public static void main(String[] args) {
        double[] randomNumbers = generateRandomNumbers();

        double maxValue = Math.max(randomNumbers[0], randomNumbers[1]));

        System.out.println("Generated random numbers: " + java.util.Arrays.toString(randomNumbers)));
        System.out.println("Maximum value between the two generated random numbers is: " + maxValue));
    }
}
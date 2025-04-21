package examples.java.lang;

import java.util.Random;

/**
 * <p>This class demonstrates how to use the Math and Random classes within a single Java file.</p>
 * <p>The example generates random integers between -1000 and 1000, inclusively. The number of generated random integers is determined by the `numRandoms` variable.</p>
 */
public class Math_random_Example {

    /**
     * Generates random integers using the Random class within a specified range.
     *
     * @param min   The minimum value of the range (inclusive).
     * @param max   The maximum value of the range (inclusive).
     * @param count The number of random integers to generate.
     * @return an array of randomly generated integers within the specified range.
     */
    public static int[] generateRandoms(int min, int max, int count) {
        if (count > max - min + 1 || count <= 0) {
            throw new IllegalArgumentException("Invalid arguments for generating random integers.");
        }

        int[] randoms = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            randoms[i] = random.nextInt(max - min + 1)) + min;
        }

        return randoms;
    }
}
package examples.java.lang;

import java.util.Random;

/**
 * This class demonstrates a runnable example of using the Math
 * class within a single Java file. The code generates a random number between 0 and 10,000 (inclusive), and then uses the `Math` class to calculate the square root of that generated random number. Finally, the method prints out both the original generated random number and its corresponding square root calculated using the `Math` class.
 * 
 * This example is useful for developers who want to gain a deeper understanding of how Java's Math library functions. Additionally, this example can serve as a starting point for developers looking to perform mathematical operations within their own Java projects.
 */
public class Math_exp_Example implements Runnable {

    private final Random random = new Random();
    private final int maxRangeValue = 10000;

    @Override
    public void run() {
        int generatedRandomNumber = random.nextInt(maxRangeValue + 1)) * 100);

        double squareRootCalculationResult = Math.sqrt(generatedRandomNumber);

        System.out.printf("Generated Random Number: %d%n" +
                "Corresponding Square Root Calculation Result: %.2f%n",
                generatedRandomNumber,
                squareRootCalculationResult);

    }

}
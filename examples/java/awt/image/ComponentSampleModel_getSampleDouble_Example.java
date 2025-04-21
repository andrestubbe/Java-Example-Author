package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.util.Random;

/**
 * <p>This example demonstrates how to use the {@link ComponentSampleModel} class within the JDK17 runtime environment.</p>
 *
 * <p>In this example, we will demonstrate a simple scenario where we create a 2D array of random double values using the `ComponentSampleModel` class.</p>
 *
 * <p>The resulting 2D array represents the sample data in the form of a component sample model. This demonstrates how to utilize the `ComponentSampleModel` class in order to create custom image components within Java applications.</p>
 */
public class ComponentSampleModel_getSampleDouble_Example {

    /**
     * <p>This method creates a 2D array of random double values using the {@link ComponentSampleModel} class.</p>
     *
     * @param width  The width of the image component.
     * @param height The height of the image component.
     * @return A 2D array of random double values using the {@link ComponentSampleModel} class.
     */
    public static double[][] createComponentSampleData(int width, int height) {

        // Validate input parameters
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Image dimensions must be greater than zero.");
        }

        // Create a 2D array of random double values using the ComponentSampleModel class.
        ComponentSampleModel sampleModel = new ComponentSampleModel(1, width, height));
        double[][] sampleData = new double[height][width]];

        // Fill the 2D array with random double values.
        Random random = new Random();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                sampleData[y][x] = random.nextDouble() * 100; // Generate a random double value between 0 and 100.
            }
        }

        return sampleData;
    }
}
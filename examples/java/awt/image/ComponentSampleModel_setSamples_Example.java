package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.util.Random;

/**
 * This class demonstrates how to use the
 * ComponentSampleModel class in Java. The
 * purpose of this code is to create a new
 * 2D array with a specified number of
 * components, and then fill this array with random
 * values.
 */
public class ComponentSampleModel_setSamples_Example {

    private static final int WIDTH = 10;
    private static final int HEIGHT = 5;
    private static final int NUM_COMPONENTS = 3;

    public void run() {
        // Create a new 2D array with the specified number of components.
        ComponentSampleModel sampleModel = new ComponentSampleModel(WIDTH, HEIGHT, NUM_COMPONENTS));

        // Fill this array with random values.
        Random random = new Random();
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                sampleModel.getRGB(x, y);
                sampleModel.setRGB(x, y, random.nextInt(256)));
            }
        }
    }

}
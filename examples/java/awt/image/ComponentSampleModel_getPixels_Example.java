package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.RenderedImage;
import java.util.Random;

/**
 * This class demonstrates the usage of the ComponentSampleModel
 * class within a single Java file. The code is designed to create
 * an example that fulfills the requirements of being runnable.
 */
public class ComponentSampleModel_getPixels_Example {

    private static final int WIDTH = 10;
    private static final int HEIGHT = 5;

    /**
     * This method creates an example RenderedImage object using the ComponentSampleModel class, and then retrieves the pixel data of the image.
     */
    public void getPixelsExample() {
        // Create a new RenderedImage object using the ComponentSampleModel class
        ComponentSampleModel sampleModel = new ComponentSampleModel(WIDTH, HEIGHT, 1);

        // Get the DataBuffer object containing the pixel data of the image
        DataBuffer<? extends Number> dataBuffer = sampleModel.getData();

        // Print the pixel data to the console
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(dataBuffer.getComponent(j, i).shortValue() + " ");
            }
            System.out.println();
        }

        // Print a random integer between 1 and 100 to the console every second for 5 seconds
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number: " + random.nextInt(100) + 1));
            try {
                Thread.sleep(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method creates an example RenderedImage object using the ComponentSampleModel class, and then retrieves the pixel data of the image in a non-blocking fashion.
     */
    public void getPixelsExampleNonBlocking() {
        // Create a new RenderedImage object using the ComponentSampleModel class
        ComponentSampleModel sampleModel = new ComponentSampleModel(WIDTH, HEIGHT, 1));

        // Get the DataBuffer object containing the pixel data of the image in a non-blocking fashion
        DataBuffer<? extends Number> dataBuffer = sampleModel.getData();

        // Print the pixel data to the console in a non-blocking fashion
        ExecutorService executorService = Executors.newFixedThreadPool(1));
        executorService.submit(() -> {
            for (int i = 0; i < HEIGHT; i++) {
                for (int j = 0; j < WIDTH; j++) {
                    System.out.print(dataBuffer.getComponent(j, i).shortValue() + " ");
                }
                System.out.println();
            }

        }));

        // Shutdown the executor service after 1 second
        executorService.shutdown();
        try {
            Thread.sleep(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
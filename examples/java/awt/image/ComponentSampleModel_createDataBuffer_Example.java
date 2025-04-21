package examples.java.awt.image;

import java.nio.ByteBuffer;
import java.util.Random;

public class ComponentSampleModel_createDataBuffer_Example {

    /**
     * This example demonstrates the usage of the 
     * `ComponentSampleModel` class's method `createDataBuffer()` 
     * by creating a random data buffer and retrieving its size.
     */

    // Create necessary inline comments for the class relevant lines.

    public static void main(String[] args) {
        
        // Initialize necessary variables
        int width = 512;
        int height = 512;
        ByteBuffer byteBuffer = ComponentSampleModel.createDataBuffer(width, height));
        Random random = new Random();

        // Verify the size of the created data buffer
        if (byteBuffer.limit() == width * height * 4) {
            System.out.println("The created data buffer has been successfully verified.");
        } else {
            System.err.println("An error occurred while verifying the size of the created data buffer.");
            System.exit(1);
        }

        // Output information about the generated data buffer and its contents
        System.out.printf("The generated data buffer has a capacity of %d bytes%n," +
                " which is equivalent to %d pixels.%n%n", byteBuffer.limit(), width * height);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Retrieve the RGBA values of a pixel from the data buffer
                byte red = byteBuffer.get(y * width * 4 + x * 4));
                byte green = byteBuffer.get(y * width * 4 + (x + 1) * 4 - 4));
                byte blue = byteBuffer.get(y * width * 4 + (x + 1) * 4 - 8));
                byte alpha = byteBuffer.get(y * width * 4 + x * 4 + 3));

                // Print the RGBA values of a pixel from the data buffer
                System.out.printf("Pixel at (%d, %d): RGBA = (%d, %d, %d, %d))%n", x, y, red, green, blue, alpha);
            }
        }

    }

}
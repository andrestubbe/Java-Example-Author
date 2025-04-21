package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.util.Random;

/**
 * This class demonstrates the usage of the ComponentSampleModel class in Java's AWT package. It showcases how to use the setPixels() method to modify the pixel values of an image stored in a ComponentSampleModel object. The example also demonstrates how to access and manipulate individual pixels using the Raster interface provided by the ComponentSampleModel class.
 *
 * This code is written for JDK17, ensuring compatibility with modern Java development practices.
 */
public class ComponentSampleModel_setPixels_Example {

    private static final int WIDTH = 4;
    private static final int HEIGHT = 3;
    private static final int COMPONENTS_COUNT = 3;

    /**
     * This method creates a sample image using the ComponentSampleModel class. It then modifies the pixel values of the image using the setPixels() method provided by the ComponentSampleModel class. Finally, this method returns the modified Image object as an output parameter.
     * @param image The original image to be modified using the setPixels() method.
     * @return The modified image after applying the setPixels() method on the given image object.
     */
    public static ComponentSampleModel createImageAndSetPixels(int width, int height, int componentsCount) {

        // Create a new DataBuffer with the specified dimensions and number of color components per pixel.
        DataBuffer dataBuffer = new DataBuffer(width * height * componentsCount, (width + 1) * (height + 1) * 4);

        // Create a new Raster object using the created DataBuffer.
        Raster raster = Raster.createRaster(width, height, componentsCount, dataBuffer, null));

        // Create a new ComponentSampleModel object with the specified dimensions and number of color components per pixel.
        ComponentSampleModel image = new ComponentSampleModel(raster);

        return image;
    }

    public static void main(String[] args) {

        // Set up random values generator.
        Random random = new Random();

        // Create a sample image with the specified dimensions and number of color components per pixel.
        ComponentSampleModel image = createImageAndSetPixels(WIDTH, HEIGHT, COMPONENTS_COUNT));

        // Get the Raster object from the ComponentSampleModel object.
        Raster raster = image.getRaster();

        // Set up an array of random values to be set as pixel values in the image.
        int[] pixelsValuesArray = new int[WIDTH * HEIGHT];
        for (int i = 0; i < WIDTH * HEIGHT; i++) {
            pixelsValuesArray[i] = random.nextInt(256));
        }

        // Set the pixel values of the image using the setPixels() method provided by the ComponentSampleModel class.
        raster.setPixels(0, 0, WIDTH, HEIGHT, pixelsValuesArray, 0, pixelsValuesArray.length);

        // Print out the modified image object.
        System.out.println("Modified Image Object: " + image));
    }
}
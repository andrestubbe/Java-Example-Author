package examples.java.awt.image;

import java.awt.image.ColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.nio.ByteOrder;

public class ComponentSampleModel_getDataElements_Example {

    /**
     * A sample code demonstrating the usage of 
     * getDataElements() method in 
     * ComponentSampleModel class.
     */

    // Define necessary imports and constants

    private static final int WIDTH = 10;
    private static final int HEIGHT = 5;
    private static final int COMPONENTS_COUNT = 4;

    public void runExample() {

        // Create a sample image with the specified dimensions.
        int pixelCount = WIDTH * HEIGHT;
        byte[] pixels = new byte[pixelCount];

        // Fill the pixels array with random values for simplicity.
        for (int i = 0; i < pixelCount; i++) {
            pixels[i] = (byte) ((Math.random() * 256) - 1));
        }

        // Create a sample ColorModel object.
        ColorModel colorModel = new ComponentColorModel(false, false, COMPONENTS_COUNT, ByteOrder.nativeOrder()));

        // Create a sample DataBuffer object using the byte array containing pixel data and specifying the number of components.
        DataBuffer dataBuffer = new DataBuffer(pixels, WIDTH * HEIGHT));
        dataBuffer.setOffset(0);

        // Create a sample ComponentSampleModel object using the ColorModel and DataBuffer objects created above.
        ComponentSampleModel componentSampleModel = new ComponentSampleModel(colorModel, dataBuffer, WIDTH, HEIGHT, COMPONENTS_COUNT, ByteOrder.nativeOrder()));

        // Get pixel data elements from the image using the getDataElements() method in ComponentSampleModel class.
        Object[] dataElements = null;
        try {
            dataElements = componentSampleModel.getDataElements();
            System.out.println("Pixel Data Elements:");
            for (int i = 0; i < dataElements.length; i++) {
                System.out.println(String.format("%5d", ((ByteBuffer) dataElements[i]).get())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ComponentSampleModel_getDataElements_Example example = new ComponentSampleModel_getDataElements_Example();
        example.runExample();
    }

}
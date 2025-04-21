package examples.java.awt.image;

import java.awt.image.ImageConsumer;
import java.awt.image.ImageInputStream;

/**
 * This example demonstrates how to use the ImageConsumer
 * class within a single Java file. The code is designed to be runnable and produces output that can be visually observed.
 * 
 * In this example, we create an instance of the ImageConsumer
 * class. We then set properties on the consumer object using various methods provided by the Consumer class. These properties include filtering of image pixels, controlling the scale factor applied to the image dimensions, and more.
 * 
 * Once the properties have been set, we pass a reference to our ImageConsumer object's `setPixels` method as an argument to the `getImage` method of an instance of the ImageInputStream class. This will result in the consumer object being passed pixels data from the image input stream.
 */
public class ImageConsumer_setProperties_Example {

    /**
     * Creates a new instance of the ImageConsumer class.
     * @return The newly created ImageConsumer object.
     */
    public static ImageConsumer createImageConsumer() {
        // Create a new instance of the ImageConsumer class
        return new ImageConsumer() {
            @Override
            public void setPixels(int width, int height, int[] pixels) {
                // Implement your own logic for handling the pixel data
                System.out.println("Pixel data received: ");
                for (int i = 0; i < width * height; i++) {
                    System.out.print(pixels[i] + " "));
                }
            }
        };
    }

    /**
     * Main method that demonstrates how to use the ImageConsumer class.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a new instance of the ImageConsumer class
        ImageConsumer consumer = createImageConsumer();

        // Set various properties on the consumer object using various methods provided by the Consumer class
        consumer.setFilter(!isFiltered());
        consumer.setScaleFactor(getScaleFactor()));
        consumer.setMinX(getMinX()));
        consumer.setMaxY(getMaxY()));

        // Create an instance of the ImageInputStream class
        ImageInputStream inputStream = new BufferedImageInputStream();

        // Read image data from the image input stream and pass it to the consumer object's setPixels method
        inputStream.addConsumer(consumer);

        // Perform any necessary operations on the input stream or consumer object before closing them down
        inputStream.close();
    }

}
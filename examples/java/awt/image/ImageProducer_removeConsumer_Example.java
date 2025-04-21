package examples.java.awt.image;
import java.awt.ImageProducer;
import java.awt.image.BufferedImage;
/**
 * Example of using the ImageProducer class to remove a consumer from an image producer. This example demonstrates how to create a BufferedImage and use the ImageProducer class to set that image as the content of an image producer. Then, we remove all consumers from the image producer. Finally, we print out the number of consumers on the image producer after removing all consumers.
 */
public class ImageProducer_removeConsumer_Example {
    public static void main(String[] args) {
        // Create a BufferedImage with an RGB color model and a width and height of 1. This will create a new image with a single pixel.
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        // Get the ImageProducer associated with this image producer.
        ImageProducer imageProducer = image.getSrc();
        // Print out the number of consumers on the image producer before removing any consumers.
        System.out.println("Number of consumers before removing: " + imageProducer.getConsumersCount()));
        // Remove all consumers from the image producer.
        imageProducer.removeAllConsumers();
        // Print out the number of consumers on the image producer after removing all consumers.
        System.out.println("Number of consumers after removing: " + imageProducer.getConsumersCount()));
    }
}
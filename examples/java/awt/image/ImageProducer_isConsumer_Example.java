package examples.java.awt.image;

import java.awt.image.ImageProducer;

/**
 * A Java example of using the ImageProducer class within a single Java file. The code is designed to create a runnable example that demonstrates how to use the ImageProducer class to produce an image. This example specifically targets JDK17.
 */
public class ImageProducer_isConsumer_Example {

    /**
     * A main method that serves as the entry point for this Java program.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        // Create an instance of the ImageProducer class
        ImageProducer imageProducer = new sun.awt.image.BufferedImageProducer();

        // Set the ImageProducer as the consumer for the BufferedImage object
        java.awt.image.BufferedImage bufferedImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        bufferedImage.setImageProducer(imageProducer);

        // Add pixel values to the BufferedImage object to produce an image
        for (int x = 0; x < bufferedImage.getWidth(); x++) {
            for (int y = 0; y < bufferedImage.getHeight(); y++) {
                bufferedImage.setRGB(x, y, java.awt.Color.HSB2RGB((float) Math.random() * 360f, 1f - (float) Math.random() / 2f, 1f))));
            }
        }

        // Display the image using a suitable Java component such as JFrame or JLabel
        java.awt.image.BufferedImageConsumer bufferedImageConsumer = new java.awt.image.BufferedImageConsumer(bufferedImage);
        bufferedImageConsumer.setExceptionListener((e) -> {
            System.out.println("An error occurred while displaying the image: " + e.getMessage());
        })));

        // Create a JFrame component to display the image within a frame
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE));
        frame.setSize(bufferedImage.getWidth() * 2, bufferedImage.getHeight() * 2));

        // Add the BufferedImageConsumer as a consumer for the JFrame component
        frame.setContentPane((java.awt.Component) bufferedImageConsumer)));

        // Display the JFrame component and wait for it to be closed by the user
        frame.setVisible(true));

    }

}
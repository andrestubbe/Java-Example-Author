package examples.java.awt.image;

import java.awt.image.ImageFilter;

/**
 * A class that demonstrates how to use the
 * `getFilterInstance` method of the
 * `ImageFilter` class to create a custom
 * image filter.
 */
public class ImageFilter_getFilterInstance_Example {

    /**
     * The main method, which serves as an entry point for this example.
     * It creates an instance of the custom image filter and applies it to an example image.
     */
    public static void main(String[] args) {

        // Create an instance of the ImageFilter class
        ImageFilter filter = ImageFilter.getFilterInstance("AffineTransformOp"));

        // Create an example image with a width of 800 pixels and a height of 600 pixels.
        int imageWidth = 800;
        int imageHeight = 600;
        java.awt.image.BufferedImage exampleImage = new java.awt.image.BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB));

        // Apply the custom image filter to the example image.
        exampleImage = filter.filter(exampleImage, null));

        // Display the resulting image.
        java.swing.JFrame frame = new java.swing.JFrame("Custom Image Filter Example");
        frame.setDefaultCloseOperation(java.awt.Window.EXIT_ON_CLOSE));
        frame.getContentPane().add(new java.awt.image.BufferedImageIcon(exampleImage))));
        frame.pack();
        frame.setVisible(true);

    }

}
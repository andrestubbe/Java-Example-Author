package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * <p>Example of BufferedImage's getHeight() method.</p>
 * <p>This code creates a BufferedImage with a width and height of 100 pixels each, displays it on the screen, waits for 5 seconds, and then prints out the image's height in pixels. This example demonstrates how to use the BufferedImage class and its getHeight() method to manipulate images.</p>
 * <p>This code is written using JDK17, ensuring compatibility with modern Java programming practices.</p>
 */
public class BufferedImage_getHeight_Example {

    /**
     * Method that creates a BufferedImage, displays it on the screen, waits for 5 seconds, and then prints out the image's height in pixels.
     */
    public static void main(String[] args) throws Exception {
        // Create a new BufferedImage with a width and height of 100 pixels each
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB));

        // Display the image on the screen
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setContentPane(new javax.swing.JLabel(new ImageIcon(img.getGraphics(), img, BufferedImage.TYPE_INT_RGB))))));
        frame.pack();
        frame.setVisible(true);

        // Wait for 5 seconds
        Thread.sleep(5000);

        // Print out the image's height in pixels
        System.out.println("BufferedImage Height: " + img.getHeight()));
    }
}
package examples.java.awt.image;

import java.awt.image.AbstractMultiResolutionImage;
import java.awt.image.BufferedImage;

/**
 * Example of using the getBaseImage() method from the AbstractMultiResolutionImage class. This example demonstrates how to use the getBaseImage() method to retrieve the base image from an abstract multi-resolution image.
 *
 * @see java.awt.image.AbstractMultiResolutionImage#getBaseImage()
 */
public class AbstractMultiResolutionImage_getBaseImage_Example {

    /**
     * Main method for running the example code. This method creates a sample abstract multi-resolution image and uses the getBaseImage() method to retrieve the base image. The retrieved base image is then displayed using the ImageIcon and JLabel components from the javax.swing package.
     *
     * @param args command line arguments (not used in this example))
     */
    public static void main(String[] args) {

        // Create a sample abstract multi-resolution image
        AbstractMultiResolutionImage sampleImage = new AbstractMultiResolutionImage() {

            @Override
            protected BufferedImage getBaseImage() {
                // Return the base image for the sample abstract multi-resolution image
                return new BufferedImage(300, 200, BufferedImage.TYPE_INT_RGB);
            }
        };

        // Use the getBaseImage() method to retrieve the base image from the sample abstract multi-resolution image
        BufferedImage baseImage = sampleImage.getBaseImage();

        // Display the retrieved base image using the ImageIcon and JLabel components
        javax.swing.JFrame frame = new javax.swing.JFrame("Abstract Multi-Resolution Image Example");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE));
        frame.setSize(baseImage.getWidth(), baseImage.getHeight()));

        // Create a JLabel component to display the retrieved base image
        javax.swing.JLabel label = new javax.swing.JLabel();
        label.setIcon(new javax.swing.ImageIcon(baseImage, "image/png")));
        frame.add(label);

        // Set the frame visible and show it
        frame.setVisible(true));
    }
}
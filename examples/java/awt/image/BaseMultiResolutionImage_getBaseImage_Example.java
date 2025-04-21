package examples.java.awt.image;

import java.awt.image.BaseMultiResolutionImage;

public class BaseMultiResolutionImage_getBaseImage_Example {

    /**
     * This example demonstrates how to get the base image from a
     * BaseMultiResolutionImage instance.
     */

    public static void main(String[] args) {
        
        // Create an instance of BaseMultiResolutionImage
        BaseMultiResolutionImage multiResImage = new BaseMultiResolutionImage();
        
        // Get the base image from the multi-resolution image instance
        java.awt.image.BufferedImage baseImage = multiResImage.getBaseImage(null));

        // Display the base image in a new window
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE));
        frame.setSize(baseImage.getWidth(), baseImage.getHeight()));
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(baseImage.getBufferedImage().getScaledInstance((int) (baseImage.getWidth() * 1.5)), 0), java.awt.Color.BLACK)));
        frame.add(new javax.swing.JLabel(icon))));
        frame.setVisible(true));
    }
}
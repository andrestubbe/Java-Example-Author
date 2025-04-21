package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;

/**
 * This example demonstrates how to use the DirectColorModel class in Java. The example creates a BufferedImage with a specified width and height, and sets its color model to be a DirectColorModel instance. Finally, it prints out information about the created BufferedImage.
 */
public class DirectColorModel_getComponents_Example {

    public static void main(String[] args) {
        // Create a new BufferedImage with a specified width and height.
        BufferedImage bufferedImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);

        // Get the DirectColorModel instance from the BufferedImage's color model.
        DirectColorModel directColorModel = (DirectColorModel)bufferedImage.getColorModel();

        System.out.println("BufferedImage width: " + bufferedImage.getWidth()));
        System.out.println("BufferedImage height: " + bufferedImage.getHeight()));
        System.out.println("BufferedImage color model class name: DirectColorModel");
        System.out.println("DirectColorModel has alpha support: " + directColorModel.hasAlpha());
    }
}
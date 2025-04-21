package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ComponentColorModel;
import java.util.Random;

public class ComponentColorModel_getDataElements_Example {

    /**
     * This example demonstrates how to use the 
     * getDataElements() method of the 
     * ComponentColorModel class. The 
     * getDataElements() method is used 
     * to retrieve a subset of pixels from 
     * an image, based on specified coordinates, width, and height.
     */

    public static void main(String[] args) {
        
        // Initialize necessary variables
        int width = 200;
        int height = 150;
        Random random = new Random();
        
        // Create a ComponentColorModel object
        ComponentColorModel colorModel = new ComponentColorModel(false, false, Color.RGBtoHSB(1f, 0f, 1f, 2f), Color.BLACK));
        
        // Get the data elements from the image based on random coordinates and dimensions
        int x = random.nextInt((width - 50) + 1) - 50; // Random X coordinate between -50 to 150
        int y = random.nextInt(height - 10) - 5; // Random Y coordinate between 0 to 140
        colorModel.getDataElements(x, y, 50, 30));
    }
}
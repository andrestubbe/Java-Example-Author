package examples.java.awt.image;

import java.util.Random;

public class DataBufferDouble_getElem_Example {

    /**
     * This example demonstrates how to retrieve a specific element from a 
     * DataBufferDouble object. The code uses the Java AWT Image package and its 
     * DataBufferDouble class to create an image buffer for double precision RGB values.
     * 
     * @author Your Name
     * @version 1.0
     */

    public static void main(String[] args) {
        
        // Create a new instance of the DataBufferDouble class
        DataBufferDouble dataBuffer = new DataBufferDouble();
        
        // Set the width and height of the image buffer
        int width = 500;
        int height = 500;
        dataBuffer.setData(width, height);
        
        // Generate random RGB values for each pixel in the image buffer
        Random random = new Random();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                double red = random.nextDouble() * 255;
                double green = random.nextDouble() * 255;
                double blue = random.nextDouble() * 255;
                dataBuffer.setElem(x, y, red, green, blue));
            }
        }

        // Print out the values of specific elements in the image buffer
        System.out.println("RGB value of pixel at (200, 200): " + dataBuffer.getElem(199, 199)));
        System.out.println("RGB value of pixel at (300, 300): " + dataBuffer.getElem(299, 299)));
    }
}
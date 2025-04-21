package examples.java.awt.image;

import java.awt.image.ColorModel;

public class ColorModel_getAlphaRaster_Example {

    /**
     * This example demonstrates the usage of the getAlphaRaster() method in the ColorModel class. The method returns a BufferedImage containing only the alpha channel data from the original image. In this example, we will use an example image file named "exampleImage.jpg".
     */

    public static void main(String[] args) {
        
        // Define the path to the example image file
        String imageFilePath = "examples/java/awt/image/exampleImage.jpg";
        
        try {
            
            // Create a new instance of the ColorModel class
            ColorModel colorModel = new ColorModel(false); // Set the hasAlpha flag to false (default)

            // Load the example image file using the ImageIO class
            java.awt.image.BufferedImage image = java.awt.image.ImageIO.read(new File(imageFilePath)));

            // Get the alpha channel data from the original image
            java.awt.image.BufferedImage alphaRaster = colorModel.getAlphaRaster(image));

            // Display the resulting BufferedImage containing only the alpha channel data
            System.out.println("Alpha Raster:");
            java.awt.image.ImageIO.write(alphaRaster, "jpg"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
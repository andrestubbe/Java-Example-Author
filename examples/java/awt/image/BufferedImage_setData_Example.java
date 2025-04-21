package examples.java.awt.image;

import java.awt.image.BufferedImage;

public class BufferedImage_setData_Example {

    /**
     * This example demonstrates how to use the `setData` method provided by the `BufferedImage` class. This method allows you to set a custom image data buffer directly into the `BufferedImage` instance.
     */

    public static void main(String[] args) {

        // Create an empty BufferedImage with RGB color model and default metadata.
        BufferedImage originalImage = new BufferedImage(300, 300, BufferedImage.TYPE_3BYTE_BGR);

        // Set a custom image data buffer directly into the BufferedImage instance using the setData method.
        originalImage.setData(new int[] {255, 0, 0}, // R, G, B values for red color
                new int[] {0, 255, 0}, // R, G, B values for green color
                new int[] {0, 0, 255}  // R, G, B values for blue color
        ));

        System.out.println("Original Image:");
        printImage(originalImage);

        BufferedImage modifiedImage = new BufferedImage(300, 300, BufferedImage.TYPE_3BYTE_BGR);

        // Set the modified image data buffer directly into the BufferedImage instance using the setData method.
        modifiedImage.setData(new int[] {0, 255, 0}, // R, G, B values for green color with reduced intensity.
                new int[] {255, 0, 0}  // R, G, B values for red color with reduced intensity.
        ));

        System.out.println("Modified Image:");
        printImage(modifiedImage);

    }

    private static void printImage(BufferedImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            String row = "";
            for (int x = 0; x < image.getWidth(); x++) {
                row += String.format("%3d ", image.getRGB(x, y)) ;
            }
            System.out.println(row);
        }
    }

}
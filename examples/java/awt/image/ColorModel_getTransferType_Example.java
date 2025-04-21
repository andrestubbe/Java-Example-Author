package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.Transparency;
import java.awt.image.BufferedImage;

public class ColorModel_getTransferType_Example {

    /**
     * This example demonstrates the usage of the `getTransferType()` method within the `ColorModel` class.
     * The purpose of this example is to showcase how different types of transparency can be applied to images using different methods provided by the `ColorModel` class.
     */

    public static void main(String[] args) {
        // Create a ColorModel instance
        ColorModel colorModel = new ColorModel(true, true, true, false));

        System.out.println("Default transparency type: " + colorModel.getTransparency());

        // Test different transparency types and apply them to an image using the BufferedImage class
        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB));

        image.setRGB(100, 100, 0);
        image.setRGB(200, 200, 128));

        System.out.println("Image pixel color at (100, 100): " + image.getRGB(100, 100)));
        System.out.println("Image pixel color at (200, 200): " + image.getRGB(200, 200))));

        // Apply different transparency types to the image using the BufferedImage class and the ColorModel's getTransferType() method
        image.setRGB(100, 100, Transparency.TRANSLUCENT)));
        image.setRGB(200, 200, Transparency.OPAQUE)));

        System.out.println("Updated image pixel color at (100, 100) after applying TRANSLUCENT transparency type: " + image.getRGB(100, 100))));
        System.out.println("Updated image pixel color at (200, 200) after applying OPAQUE transparency type: " + image.getRGB(200, 200))));

    }

}
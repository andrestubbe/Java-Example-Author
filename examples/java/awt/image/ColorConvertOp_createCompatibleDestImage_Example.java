package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

/**
 * Example usage of the {@link ColorConvertOp} class's
 * `createCompatibleDestImage` method within a single Java file.
 * <p>
 * This example demonstrates how to create a new BufferedImage with the same configuration as the source image, but with an alpha channel that is fully opaque. The process of creating the destination image is performed by an instance of the {@link ColorConvertOp} class, which implements the `Runnable` interface and can be executed using a Java concurrent utilities such as the `ForkJoinPool`.
 * <p>
 * This example provides a clear demonstration of how to create a new BufferedImage with the same configuration as the source image, but with an alpha channel that is fully opaque. The process of creating the destination image is performed by an instance of the {@link ColorConvertOp} class, which implements the `Runnable` interface and can be executed using a Java concurrent utilities such as the `ForkJoinPool`.
 */
public class ColorConvertOp_createCompatibleDestImage_Example {

    /**
     * The main method for this example.
     * <p>
     * This method creates an instance of the {@link ColorConvertOp} class, which implements the `Runnable` interface and can be executed using a Java concurrent utilities such as the `ForkJoinPool`.
     * <p>
     * The method then creates a new BufferedImage with the same configuration as the source image, but with an alpha channel that is fully opaque.
     * <p>
     * Finally, the method invokes the `run` method of the instance of the {@link ColorConvertOp} class, which performs the process of creating the destination image.
     */
    public static void main(String[] args) {

        // Create an instance of the ColorConvertOp class
        ColorConvertOp colorConvertOp = new ColorConvertOp();

        // Get a BufferedImage as source image
        BufferedImage sourceImage = // get source image here
        
        // Set the source image to the ColorConvertOp instance
        colorConvertOp.setSource(sourceImage);

        // Create a new BufferedImage with the same configuration as the source image, but with an alpha channel that is fully opaque.
        BufferedImage destImage = colorConvertOp.createCompatibleDestImage(sourceImage.getWidth(), sourceImage.getHeight()));

        // Invoke the run method of the ColorConvertOp instance
        colorConvertOp.run();

        // The result of this example would be a new BufferedImage with an alpha channel that is fully opaque, which has been created based on the configuration of the source image.
    }
}
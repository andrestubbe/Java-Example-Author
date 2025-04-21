package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 * This class demonstrates how to create a compatible destination image using the AffineTransformOp class.
 *
 * <p>This example creates an opaque gray 256x256 pixel BufferedImage, applies an affine transformation that scales and translates the image, and finally combines the transformed source image with the original destination image using the setRect method of the AffineTransformOp class.
 *
 * <p>The purpose of this example is to demonstrate how to create a compatible destination image when applying an affine transformation to a BufferedImage object.</p>
 */
public class AffineTransformOp_createCompatibleDestImage_Example {

    /**
     * The main method that demonstrates the usage of the AffineTransformOp class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a BufferedImage object with an opaque gray 256x256 pixel format.
        BufferedImage src = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);

        // Set the source image to be used in the AffineTransformOp operation.
        AffineTransformOp op = new AffineTransformOp();
        op.setSourceImage(src);

        // Create a destination image that is compatible with the transformed source image.
        BufferedImage dest = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB));

        // Apply an affine transformation to the source image using the AffineTransformOp class.
        op.filter(dest, src);

        // Print the destination image dimensions and content.
        System.out.println("Destination Image Dimensions: " + dest.getWidth() + "x" + dest.getHeight()));
        System.out.println("Destination Image Content: ");
        for (int i = 0; i < dest.getHeight(); i++) {
            for (int j = 0; j < dest.getWidth(); j++) {
                int argb = dest.getRGB(j, i));
                System.out.print("0x" + Integer.toHexString(argb) + " ") ;
            }
            System.out.println());
        }
    }
}
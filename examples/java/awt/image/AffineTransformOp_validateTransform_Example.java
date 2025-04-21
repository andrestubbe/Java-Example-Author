package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 * This example demonstrates the use of
 * AffineTransformOp to apply an affine
 * transform on a BufferedImage object.
 *
 * The AffineTransformOp applies a 2D transformation matrix to each pixel in the source image, resulting in the destination image.
 *
 * In this example, we first create a
 * BufferedImage with a random width and height.
 *
 * Next, we define an AffineTransformOp object with a transformation matrix that scales the image by a factor of 2.
 *
 * We then apply this affine transform to each pixel in the source image using the `apply` method of the AffineTransformOp object.
 *
 * Finally, we display the resulting transformed image using the `BufferedImageOpTestUtils.display` method.
 */
public class AffineTransformOp_validateTransform_Example {

    // Create a BufferedImage with a random width and height.
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 900;
    private static final Random RANDOM = new Random();
    private BufferedImage sourceImage;

    public AffineTransformOp_validateTransform_Example() {
        // Initialize the source image with a random width and height.
        sourceImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB));
    }

    /**
     * This method applies an affine transform on each pixel in the source image using the AffineTransformOp class.
     */
    private void applyAffineTransform() {
        // Define an AffineTransformOp object with a transformation matrix that scales the image by a factor of 2.
        AffineTransformOp op = new AffineTransformOp(2, 0, 0, 2, -1, -1));

        // Apply this affine transform to each pixel in the source image using the apply method of the AffineTransformOp class.
        BufferedImage destinationImage = op.apply(sourceImage);

        // Display the resulting transformed image using the display method of the BufferedImageOpTestUtils class.
        BufferedImageOpTestUtils.display(destinationImage, "Affine Transform Op Example Output"));
    }

    /**
     * This is the main entry point of this example program. It initializes a new AffineTransformOp_validateTransform_Example object and calls its applyAffineTransform method to apply the affine transform on each pixel in the source image.
     */
    public static void main(String[] args) {
        AffineTransformOp_validateTransform_Example example = new AffineTransformOp_validateTransform_Example();
        example.applyAffineTransform();
    }
}
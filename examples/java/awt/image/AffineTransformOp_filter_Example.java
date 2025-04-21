package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;

/**
 * This class provides an example of how to use the `AffineTransformOp` class in Java's AWT and Image package.
 *
 * <p>The purpose of this example is to demonstrate how to use the `AffineTransformOp` class to apply an affine transform to an image object.
 *
 * <p>In this example, we first create an instance of the `BufferedImage` class, representing our source image.
 *
 * <p>Next, we create a new instance of the `AffineTransformOp` class, specifying the desired transform operation (e.g., rotation, scaling, etc.).
 *
 * <p>We then use the `setTransform` method of the `AffineTransformOp` class to set the affine transform to be applied to the image object.
 *
 * <p>Finally, we use the `filter` method of the `AffineTransformOp` class to apply the specified affine transform to the source image object. The resulting transformed image is returned as a new `BufferedImage` object.
 */
public class AffineTransformOp_filter_Example {

    /**
     * Applies an affine transform operation to a given image object using the `AffineTransformOp` class within Java's AWT and Image package.
     *
     * @param sourceImage The source image object to be transformed.
     * @return BufferedImage The resulting transformed image object after applying the specified affine transform operation.
     */
    public static BufferedImage applyAffineTransformOp(BufferedImage sourceImage) {

        // Create an instance of the AffineTransformOp class
        AffineTransformOp affineTransformOp = new AffineTransformOp();

        // Set the desired affine transform operation using the setTransform method
        affineTransformOp.setTransform(/* specify the desired affine transform */));

        // Apply the specified affine transform operation to the source image object
        BufferedImage transformedImage = (BufferedImage) affineTransformOp.filter(sourceImage, null));

        // Return the resulting transformed image object
        return transformedImage;
    }
}
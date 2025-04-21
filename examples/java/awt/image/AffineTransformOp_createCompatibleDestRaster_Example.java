package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;
import java.awt.image.BufferedImage;

public class AffineTransformOp_createCompatibleDestRaster_Example {

    /**
     * This example demonstrates how to use the
     * `AffineTransformOp` class's `createCompatibleDestRaster()` method.
     *
     * <p>This method is used to create a new
     * BufferedImage with the same width and height as the source image.</p>
     *
     * @param src The source BufferedImage.
     * @return A new BufferedImage that has the same dimensions as the source image.
     */
    public static BufferedImage createCompatibleDestRaster(BufferedImage src)) {
        // Create a new BufferedImage with the same width and height as the source image
        BufferedImage dest = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_RGB));

        // Get the AffineTransformOp instance
        AffineTransformOp op = new AffineTransformOp();

        // Create a new BufferedImage with the same width and height as the source image
        BufferedImage result = op.createCompatibleDestRaster(src));

        return result;
    }
}
package examples.java.awt.image;

import java.awt.image.BaseImageOp;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

/**
 * This class demonstrates the use of the `BandCombineOp` class within a single Java file. The code is designed to create a runnable example using the `BandCombineOp` class.
 * 
 * @since 1.0.0
 */
public class BandCombineOp_createCompatibleDestRaster_Example {

    /**
     * This method returns the compatible destination raster for the given source and bounds parameters. The returned raster must be compatible with the `BufferedImage` object obtained from the source raster using the `BufferedImage.createCompatibleWith` method.
     * 
     * @param source {@link RenderedImage}, the source image to process
     * @param x, int >= 0, the x-coordinate of the top-left corner of the desired destination rectangle within the source image
     * @param y, int >= 0, the y-coordinate of the top-left corner of the desired destination rectangle within the source image
     * @param width, int > 0, the width of the desired destination rectangle within the source image
     * @param height, int > 0, the height of the desired destination rectangle within the source image
     * @return {@link BufferedImage}, a new buffered image that is compatible with the provided source image and has the specified dimensions and location within the source image.
     */
    public static BufferedImage createCompatibleDestRaster(final RenderedImage source, final int x, final int y, final int width, final int height)) {
        // Create a new buffered image with the specified dimensions and location within the source image.
        BufferedImage dest = new BufferedImage(source.getWidth(), source.getHeight(), BufferedImage.TYPE_INT_RGB));

        // Get the rendering hints for this operation
        Object hints = BaseImageOp.getRenderingHints();

        // Create a BandCombineOp object with the specified parameters
        BandCombineOp bandCombineOp = new BandCombineOp(x, y, width, height, hints));

        // Set the source for this operation to the provided source image
        bandCombineOp.setSource(source);

        // Execute the operation and return the resulting buffered image
        return (BufferedImage) bandCombineOp.filter();
    }
}
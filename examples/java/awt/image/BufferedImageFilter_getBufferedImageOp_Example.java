package examples.java.awt.image;

import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;

/**
 * Example usage of the BufferedImageFilter class.
 * This example specifically demonstrates how to use a custom filter that simply copies the source image to the destination image.
 */
public class BufferedImageFilter_getBufferedImageOp_Example {

    // Custom filter implementation (in this case, just copying the source image)
    private static class CopyFilter extends BufferedImageFilter {

        @Override
        public BufferedImageFilter getDifferenceFilter(int x, int y)) {
            return new CopyFilter();
        }

        @Override
        protected BufferedImage performFilter(BufferedImage src, BufferedImage dest) {
            dest.setRGB(0, 0, src.getRGB(0, 0)));
            return dest;
        }
    }

    // Example usage of the custom filter (CopyFilter)
    public static void main(String[] args) {
        BufferedImage src = // initialize your source image here...
        BufferedImage dest = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_RGB));

        // Create an instance of our custom filter (CopyFilter))
        BufferedImageOp op = new CopyFilter();

        // Apply the custom filter to our source image, and store the result in our destination image)
        dest = op.filter(src, dest);

        // Use your destination image here...
    }
}
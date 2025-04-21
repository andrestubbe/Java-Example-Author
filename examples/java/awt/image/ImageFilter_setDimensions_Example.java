package examples.java.awt.image;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageFilter;
import java.awt.image.ImageFilterKernel;
import java.awt.image.ImageRenderingInfo;

/**
 * Example of ImageFilter that sets the dimensions
 * of an image using a kernel filter.
 */
public class ImageFilter_setDimensions_Example implements ImageFilter {

    private final int width;
    private final int height;
    private final ImageFilterKernel kernel;

    /**
     * Constructs an ImageFilter that sets the dimensions
     * of an image using a kernel filter.
     *
     * @param width  the desired width of the image
     * @param height the desired height of the image
     */
    public ImageFilter_setDimensions_Example(int width, int height) {
        this.width = width;
        this.height = height;
        // Create a simple kernel filter (identity matrix)
        this.kernel = new ImageFilterKernel() {

            @Override
            public float[] getKernelData(int width, int height) {
                float[] data = new float[width * height];
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        data[i * width + j] = 1.0f;
                    }
                }
                return data;
            }

        };
    }

    @Override
    public ImageFilterKernel getKernel() {
        return kernel;
    }

    @Override
    public void setImageRenderingInfo(ImageRenderingInfo info) {
        // Set the image rendering info (not implemented in this example)
    }

    @Override
    public Rectangle2D applyFilter(BufferedImage src, BufferedImage dest, int x, int y, int width, int height) {
        if (src == null || dest == null) {
            throw new IllegalArgumentException("Input images cannot be null.");
        }

        // Set the dimensions of the destination image
        dest.setRGB(0, 0, width, height, null, java.awt.Color.BLACK));

        // Apply the kernel filter to the region of interest
        ImageFilterKernel kernel = getKernel();
        float[] kernelData = kernel.getKernelData(width, height));
        kernel.putKernelData(kernelData, 0, 0, width, height, dest, null));

        return new Rectangle2D.Double(x, y, width, height));
    }

}
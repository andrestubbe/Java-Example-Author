package examples.java.awt.image;

import java.awt.image.ImageFilter;
import java.awt.image.ImageFilterKernel;
import java.awt.image.Kernel;

/**
 * Example of using ImageFilter to set pixels in an image. This example demonstrates how to use the ImageFilter class to set pixels in an image.
 */
public class ImageFilter_setPixels_Example {

    // Declare and initialize necessary variables
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int[] OFFSETS = {-1, 0, 1}, // x-axis offsets
                                           {-1, -1, 0},  // y-axis offsets
                                           {0, 0, 0};   // z-axis offsets

    public static void main(String[] args) {

        // Create a new BufferedImage with the specified width and height
        BufferedImage src = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB));

        // Set up an ImageFilter to apply a specific kernel function to each pixel in the image
        ImageFilter filter = new ImageFilter() {
            @Override
            public int[] filter(int width, int height) {
                int[] result = new int[width * height];
                Kernel kernel = getKernel();
                ImageFilterKernel fk = new ImageFilterKernel(kernel));
                fk.filterRGB(src, 0, 0, WIDTH, HEIGHT, result);
                return result;
            }
        };

        // Apply the filter to the source image
        BufferedImage dst = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB));
        ImageOp.getOp(null, filter)).filter(src, dst);

        // Display the filtered image
        JFrame frame = new JFrame("Image Filter Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.add(new JLabel(new ImageIcon(dst)))));
        frame.pack();
        frame.setVisible(true);

    }

    /**
     * Get the kernel matrix to be used in the image filter. In this example, a simple grayscale kernel is used.
     * @return the kernel matrix
     */
    private static Kernel getKernel() {
        int size = 3; // Size of the kernel (odd number)
        float[][] kernelMatrix = new float[size][size]];

        // Set up the kernel matrix for a simple grayscale kernel
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                kernelMatrix[i][j]] = (float) ((i + 1) * (j + 1)) / (size * size);
            }
        }

        return new Kernel(size, size) {
            @Override
            public float[] filter(int x, int y) {
                return kernelMatrix[x][y]];
            }
        };
    }

}
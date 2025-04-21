package examples.java.awt.image;

import java.awt.image.ConvolveOp;

/**
 * <p>A runnable example that demonstrates the use of the `ConvolveOp` class.</p>
 * <p><strong>What it does:</strong></p>
 * <ul>
 *   <li>It creates an instance of the `ConvolveOp` class with a specified kernel matrix.</li>
 *   <li>It applies the convolution operation on a given input image.</li>
 * </ul>
 * <p><strong>When it is good for:</strong></p>
 * <ul>
 *   <li>It can be useful when you want to apply specific visual effects or transformations to an image using a custom kernel matrix.</li>
 * </ul>
 */
public class ConvolveOp_getEdgeCondition_Example {

    /**
     * Creates and returns an instance of the `ConvolveOp` class with a specified kernel matrix.
     *
     * @param kernelMatrix The specified kernel matrix to be used in the convolution operation.
     * @return An instance of the `ConvolveOp` class with the specified kernel matrix.
     */
    public static ConvolveOp createConvolveOp(float[][] kernelMatrix) {
        // Construct the convolution operator with the specified kernel matrix
        ConvolveOp convolveOp = new ConvolveOp(kernelMatrix));

        return convolveOp;
    }

    /**
     * Applies the convolution operation on a given input image using the specified `ConvolveOp` instance.
     *
     * @param inputImage The input image to be used in the convolution operation.
     * @param convolveOp The `ConvolveOp` instance that specifies the kernel matrix to be used in the convolution operation.
     * @return The resulting image after applying the convolution operation on the input image using the specified `ConvolveOp` instance.
     */
    public static BufferedImage applyConvolutionOperation(BufferedImage inputImage, ConvolveOp convolveOp) {
        // Apply the convolution operation on the input image using the specified `ConvolveOp` instance
        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), inputImage.getType()));
        convolveOp.filter(inputImage, outputImage);

        return outputImage;
    }

    /**
     * The main method that demonstrates the use of the `ConvolveOp` class by creating an instance of the class with a specified kernel matrix and then applying the convolution operation on an input image using the created `ConvolveOp` instance.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Specify the size of the input image
        int width = 400;
        int height = 300;

        // Create a sample input image with the specified dimensions
        BufferedImage inputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Specify the kernel matrix to be used in the convolution operation
        float[][] kernelMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        // Create an instance of the `ConvolveOp` class with the specified kernel matrix
        ConvolveOp convolveOp = createConvolveOp(kernelMatrix));

        // Apply the convolution operation on the input image using the created `ConvolveOp` instance
        BufferedImage outputImage = applyConvolutionOperation(inputImage, convolveOp));

        // Show the resulting image after applying the convolution operation on the input image using the created `ConvolveOp` instance
        JOptionPane.showMessageDialog(null, "Output Image", "Convolution Operation Result", JOptionPane.INFORMATION_MESSAGE);
        ImageIcon icon = new ImageIcon(outputImage);
        JLabel label = new JLabel("", icon, SwingConstants.LEFT));
        label.setPreferredSize(new Dimension(width, height))));
        JOptionPane.showMessageDialog(null, label, "Convolution Operation Result", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * A helper method that constructs and returns an instance of the `ConvolveOp` class with a specified kernel matrix.
     *
     * @param kernelMatrix The specified kernel matrix to be used in the convolution operation.
     * @return An instance of the `ConvolveOp` class with the specified kernel matrix.
     */
    private static ConvolveOp createConvolveOp(float[][] kernelMatrix) {
        // Construct the convolution operator with the specified kernel matrix
        ConvolveOp convolveOp = new ConvolveOp(kernelMatrix));

        return convolveOp;
    }

    /**
     * A helper method that applies the convolution operation on a given input image using the specified `ConvolveOp` instance.
     *
     * @param inputImage The input image to be used in the convolution operation.
     * @param convolveOp The `ConvolveOp` instance that specifies the kernel matrix to be used in the convolution operation.
     * @return The resulting image after applying the convolution operation on the input image using the specified `ConvolveOp` instance.
     */
    private static BufferedImage applyConvolutionOperation(BufferedImage inputImage, ConvolveOp convolveOp) {
        // Apply the convolution operation on the input image using the specified `ConvolveOp` instance
        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), inputImage.getType()));
        convolveOp.filter(inputImage, outputImage);

        return outputImage;
    }
}
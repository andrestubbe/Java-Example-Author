package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.BandCombineOp;

/**
 * <p>This class serves as an example of how to use the BandCombineOp class.</p>
 *
 * <p>The BandCombineOp class is a part of the Java AWT Image package, which provides methods for manipulating and combining images. The BandCombineOp class allows us to specify the way in which two or more bands (i.e., color components)) are combined to produce a resulting image.</p>
 *
 * <p>In this example code, we first create an instance of the BufferedImage class, with the desired width and height for our image.</p>
 *
 * <p>Next, we create an instance of the BandCombineOp class, passing in two integer arguments: the first argument specifies the number of bands in the resulting image (in this example, we set it to 2), while the second argument specifies the type of band combining operation to be performed (in this example, we use the DEFAULT_BAND_COMBINER_OP).</p>
 *
 * <p>Finally, we create a new BufferedImage object, with the same width and height as our original BufferedImage object. We then pass this new BufferedImage object to the `filter` method of our BandCombineOp object.</p>
 *
 * <p>The result of this operation is a new BufferedImage object that contains the combined bands for each pixel in the original image. The resulting BufferedImage object can be used in subsequent processing or rendering operations.</p>
 */
public class BandCombineOp_filter_Example {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    private static final double[][] BANDS_MATRIX = {{0.2, 0.3, 0.4}, {0.5, 0.6, 0.7}, {1.0, 1.1, 1.2}};

    public static void main(String[] args) {
        // Create a new BufferedImage object with the desired width and height
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB));

        // Create an instance of the BandCombineOp class
        BandCombineOp bandCombineOp = new BandCombineOp();

        // Set the number of bands in the resulting image
        bandCombineOp.setNumBands(2));

        // Set the type of band combining operation to be performed
        // In this example, we use the DEFAULT_BAND_COMBINER_OP)
        bandCombineOp.setBandCombinerOp(BandCombineOp.DEFAULT_BAND_COMBINER_OP));

        // Create a new BufferedImage object with the same width and height as our original BufferedImage object
        BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB)));

        // Pass our new BufferedImage object to the `filter` method of our BandCombineOp object
        bandCombineOp.filter(image, result);

        // Display the resulting image
        JFrame frame = new JFrame("Band Combine Op Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.getContentPane().add(new JLabel(new ImageIcon(result.getRGBImage())))));
        frame.pack();
        frame.setVisible(true));
    }
}
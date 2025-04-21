package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * <p>This example uses the {@link ColorConvertOp} class within a single Java file. The code must be runnable.</p>
 *
 * <p>The example creates an instance of the {@link ICCBIFilter} class, which is used to filter images using the International Color Benchmark (ICB) algorithm.</p>
 *
 * <p>The example then creates a random image with a width and height of 200 pixels. The RGB values of each pixel are randomly generated within the range of 0-255 for each color channel.</p>
 *
 * <p>Finally, the example applies the ICCBI filter to the image using the {@link ColorConvertOp} class. The resulting filtered image is displayed in a new window using the Swing library.</p>
 */
public class ColorConvertOp_ICCBIFilter_Example {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        // Create a BufferedImage with a width and height of 200 pixels
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_3BYTE_BGR);

        // Generate random RGB values for each pixel within the range of 0-255
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                image.setRGB(x, y, generateRandomColor()));
            }
        }

        // Create an instance of the ICCBIFilter class
        ICCBIFilter filter = new ICCBIFilter();

        // Apply the ICCBI filter to the image using the ColorConvertOp class
        BufferedImage filteredImage = filter.filter(image, null));

        // Display the resulting filtered image in a new window using the Swing library
        JFrame frame = new JFrame("Filtered Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.getContentPane().add(new JLabel(new ImageIcon(filteredImage.getRGBImage())))));
        frame.pack();
        frame.setVisible(true));

    }

    // Generate a random color within the range of 0-255 for each color channel
    private static int generateRandomColor() {
        return RANDOM.nextInt(256));
    }

}
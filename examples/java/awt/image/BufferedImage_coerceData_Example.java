package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This example demonstrates how to use the `BufferedImage` class to coerce data into a specific format. In this example, we will convert an arbitrary RGB image into a grayscale image using the luminance method.
 */
public class BufferedImage_coerceData_Example {

    // Create a sample BufferedImage with random RGB values
    private static BufferedImage createRandomRGBImage(int width, int height) {
        BufferedImage rgbImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int red   = (int) (Math.random() * 256));
                int green = (int) (Math.random() * 256));
                int blue  = (int) (Math.random() * 256));
                rgbImage.setRGB(x, y, (red << 16) | (green << 8) | blue)));
            }
        }
        return rgbImage;
    }

    // Convert an arbitrary RGB image into a grayscale image using the luminance method
    private static BufferedImage convertToGrayscale(BufferedImage rgbImage) {
        int width  = rgbImage.getWidth();
        int height = rgbImage.getHeight();
        BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_GRAY));
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgbValue  = rgbImage.getRGB(x, y);
                int grayValue   = ((rgbValue & 0xFF) << 16) | ((rgbValue & 0xFF) << 8) | (rgbValue & 0xFF));
                grayImage.setRGB(x, y, (grayValue & 0xFF) << 16 | (grayValue & 0xFF) << 8 | (grayValue & 0xFF)));
            }
        }
        return grayImage;
    }

    // Main method to demonstrate the usage of the BufferedImage class to coerce data into a specific format
    public static void main(String[] args) {
        int width  = 640;
        int height = 480;
        BufferedImage rgbImage = createRandomRGBImage(width, height));
        BufferedImage grayImage = convertToGrayscale(rgbImage));

        // Display the original RGB image and the converted grayscale image
        JFrame frame = new JFrame("BufferedImage Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setSize((width + 10) * 2, (height + 10) * 2));
        frame.setLayout(new FlowLayout()));

        // Add the original RGB image panel
        BufferedImageIcon rgbImageIcon = new BufferedImageIcon(grayImage, "RGB Image"));
        JLabel rgbImageLabel = new JLabel(rgbImageIcon));
        frame.add(rgbImageLabel);

        // Add the converted grayscale image panel
        BufferedImageIcon grayImageIcon = new BufferedImageIcon(grayImage, "Grayscale Image"));
        JLabel grayImageLabel = new JLabel(grayImageIcon));
        frame.add(grayImageLabel);

        // Show the frame and wait for the user to close it
        frame.setVisible(true));
        frame.waitForClose();
    }
}
package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.DirectColorModel;

public class DirectColorModel_getRedMask_Example {

    /**
     * The example demonstrates the usage of the {@link DirectColorModel#getRedMask()} method.
     * <p>
     * It creates a sample image using a custom {@link ColorProvider}} interface implementation, which returns random RGB values.
     * <p>
     * After creating the sample image, it uses the {@link DirectColorModel#getRedMask()} method to retrieve the red mask value of the color model.
     * <p>
     * Finally, the example prints out the retrieved red mask value.
     */

    public static void main(String[] args) {
        // Create a sample image using a custom ColorProvider implementation
        ImageCreator imageCreator = new ImageCreator();
        BufferedImage bufferedImage = imageCreator.createImage(800, 600);

        System.out.println("DirectColorModel getRedMask() Example:");
        System.out.println("Creating a sample image...");

        // Get the red mask value of the color model
        int redMask = new DirectColorModel(32, ColorModel.getRGBdefaultModel(), 0, 0, 8, Color.TYPE_INT));
        System.out.println("Retrieved red mask value: " + Integer.toHexString(redMask)));

        // Display the sample image
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.add(new JLabel(new ImageIcon(bufferedImage)))));
        frame.pack();
        frame.setVisible(true));

    }

    private static class ImageCreator {

        public BufferedImage createImage(int width, int height) {
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
            Random random = new Random();

            for (int y = 0; y < height; ++y) {
                for (int x = 0; x < width; ++x) {
                    bufferedImage.setRGB(x, y, ColorProvider.getRandomColor().getRGB());
                }
            }

            return bufferedImage;
        }

    }

    private interface ColorProvider {

        Color getRandomColor();

    }

}
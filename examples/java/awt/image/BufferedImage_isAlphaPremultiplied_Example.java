package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * Example usage of BufferedImage's `isAlphaPremultiplied` method.
 *
 * <p>This example creates a 100x100 {@link BufferedImage}} with a random RGB pixel and then checks if the pixel is alpha premultiplied.
 */
public class BufferedImage_isAlphaPremultiplied_Example {

    /**
     * Example method that creates a 100x100 BufferedImage with a random RGB pixel, sets it as the image's drawing graphics, gets the first pixel of the image, and then checks if the pixel is alpha premultiplied.
     *
     * @return the example result string
     */
    public String runExample() {
        // Create a 100x100 BufferedImage with random RGB pixels
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB));

        // Get a Graphics2D context from the BufferedImage
        Graphics2D graphics = (Graphics2D) image.getGraphics();

        // Set the RenderingHints for better rendering quality
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON));
        graphics.setRenderingHint(RenderingHints.KEY_COLOR_RENDERER, RenderingHints.VALUE_COLOR_RENDERER_SUFFIX));

        // Set the RGB pixel to a random color value between 0 and 255
        int red = (int) (Math.random() * 256));
        int green = (int) (Math.random() * 256));
        int blue = (int) (Math.random() * 256));
        graphics.setColor(new Color(red, green, blue))));

        // Fill the BufferedImage with the set RGB pixel
        graphics.fillRect(0, 0, 100, 100));

        // Dispose the Graphics2D context to release system resources
        graphics.dispose();

        // Get the first pixel of the BufferedImage
        int x = 0;
        int y = 0;
        Color color = new Color(image.getRGB(x, y))));

        // Check if the pixel is alpha premultiplied
        boolean isAlphaPremultiplied = false;
        if (color.getAlpha() != 0) {
            float alpha = color.getAlpha();
            float red = color.getRed();
            float green = color.getGreen();
            float blue = color.getBlue();

            // Calculate the premultiplied alpha value
            alpha /= 255;
            red *= alpha;
            green *= alpha;
            blue *= alpha;

            // Check if the pixel is alpha premultiplied
            if (red == 0 && green == 0 && blue == 0)) {
                isAlphaPremultiplied = true;
            }
        }

        // Return the result string
        return "Pixel is " + (isAlphaPremultiplied ? "" : "not ") + "alpha premultiplied.";
    }

}
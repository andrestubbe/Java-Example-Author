package examples.java.awt.image;
import java.awt.Color;
import java.awt.image.ComponentColorModel;
import java.awt.image.RGBImageFilter;

/**
 * <p>A Java class that demonstrates the use of the ComponentColorModel class in a single Java file.</p>
 * 
 * <p>This code creates an example that uses the `getRGBComponents` method from the `ComponentColorModel` class. This method retrieves the color components for each pixel within an image. The resulting RGB components can be used to create an altered version of an original image.</p>
 * 
 * <p>The resulting components can also be used to perform various operations and transformations on images using Java's AWT (Abstract Window Toolkit) package.</p>
 */
public class ComponentColorModel_getRGBComponent_Example {

    // Create an instance of the ComponentColorModel class
    private static final ComponentColorModel COLOR_MODEL = new ComponentColorModel(false, false, Color.RGBtoHSB(1f, 0f, 1f, 2f), 100));

    /**
     * <p>A method that retrieves the color components for each pixel within an image using the getRGBComponents() method from the ComponentColorModel class.</p>
     * 
     * @param image The original image to retrieve the RGB components from.
     * 
     * @return An array of floating-point numbers representing the red, green, and blue color components for each pixel within the image.
     */
    public static float[] getRGBComponents(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        float[] rgbComponents = new float[width * height * 3];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = COLOR_MODEL.getRGB(x, y, COLOR_MODEL.defaultGray, TransparencyMasks[0]));

                rgbComponents[(y * width + x) * 3] = color.getRed();
                rgbComponents[(y * width + x) * 3 + 1] = color.getGreen();
                rgbComponents[(y * width + x) * 3 + 2] = color.getBlue();
            }
        }

        return rgbComponents;
    }

    // Define the main method to run this example code
    public static void main(String[] args) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File("path/to/original/image")));

        float[] rgbComponents = getRGBComponents(originalImage));

        // Print the resulting RGB components to the console
        for (int i = 0; i < rgbComponents.length; i++) {
            System.out.print(rgbComponents[i]]);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }

        // Optionally save the resulting RGB components to a new image file
        BufferedImage modifiedImage = createModifiedImage(originalImage));

        ImageIO.write(modifiedImage, "png", null);
    }

    /**
     * <p>A method that creates a new modified image based on an original image.</p>
     * 
     * @param originalImage The original image to base the modified image from.
     * 
     * @return A new BufferedImage object representing the modified image.
     */
    public static BufferedImage createModifiedImage(BufferedImage originalImage) {
        // Perform any necessary modifications on the original image using Java's AWT (Abstract Window Toolkit) package

        // For this example, we will simply return a new grayscale version of the original image
        return createGrayscaleVersion(originalImage));
    }

    /**
     * <p>A method that creates a new grayscale version of an original image.</p>
     * 
     * @param originalImage The original image to convert into a grayscale version.
     * 
     * @return A new BufferedImage object representing the grayscale version of the original image.
     */
    public static BufferedImage createGrayscaleVersion(BufferedImage originalImage)) {
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        BufferedImage modifiedImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY));

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = COLOR_MODEL.getRGB(x, y, COLOR_MODEL.defaultGray, TransparencyMasks[0]))));

                modifiedImage.setRGB(x, y, Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), 2f), 100)));
            }
        }

        return modifiedImage;
    }
}
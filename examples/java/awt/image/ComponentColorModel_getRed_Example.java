package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.image.ComponentColorModel;

/**
 * A runnable example of using the {@link ComponentColorModel} class to retrieve the red component of a color. This example demonstrates how to use the `getRed` method provided by the `ColorModel` interface implemented by the `ComponentColorModel` class.
 *
 * <p>This example creates an instance of the `ComponentColorModel` class and uses it to create an instance of the `BufferedImage` class with a component color model. It then retrieves the red component of a sample color and prints the result.</p>
 */
public class ComponentColorModel_getRed_Example {

    /**
     * Creates an instance of the {@link ComponentColorModel} class.
     *
     * @return an instance of the {@link ComponentColorModel} class.
     */
    private static ComponentColorModel createComponentColorModel() {
        // Create an instance of the ComponentColorModel class.
        return new ComponentColorModel();
    }

    /**
     * Creates an instance of the {@link BufferedImage} class with a component color model.
     *
     * @return an instance of the {@link BufferedImage} class with a component color model.
     */
    private static BufferedImage createBufferedImageWithComponentColorModel() {
        // Create an instance of the ComponentColorModel class.
        ComponentColorModel componentColorModel = createComponentColorModel();

        // Create an instance of the BufferedImage class with a component color model.
        return new BufferedImage(componentColorModel, null, BufferedImage.TYPE_INT_RGB));
    }

    /**
     * Retrieves the red component of a sample color.
     *
     * @param bufferedImage an instance of the {@link BufferedImage} class with a component color model.
     * @param x                      the x-coordinate of the point to which the red component will be retrieved.
     * @param y                      the y-coordinate of the point to which the red component will be retrieved.
     * @return the red component of the sample color at the specified coordinates.
     */
    private static int getRedAtCoordinates(BufferedImage bufferedImage, int x, int y) {
        // Retrieve the red component of the sample color at the specified coordinates.
        return bufferedImage.getRGB(x, y);
    }

    /**
     * The entry point for the Java code example using the `ComponentColorModel` class. This method creates an instance of the `BufferedImage` class with a component color model and uses it to retrieve the red component of a sample color at the specified coordinates.
     */
    public static void main(String[] args) {
        // Create an instance of the BufferedImage class with a component color model.
        BufferedImage bufferedImage = createBufferedImageWithComponentColorModel();

        // Define the sample color and its coordinates.
        int redComponent = 123; // Example value for red component.
        int x = 10; // Example x-coordinate.
        int y = 20; // Example y-coordinate.

        // Retrieve the red component of the sample color at the specified coordinates.
        System.out.println("Red Component: " + getRedAtCoordinates(bufferedImage, x, y)));
    }
}
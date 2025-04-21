package examples.java.awt.image;
import java.awt.Graphics;
import java.awt.image.AbstractMultiResolutionImage;

/**
 * An example of how to use the `getGraphics()` method
 * from the {@link AbstractMultiResolutionImage} class.
 * 
 * <p>This code creates a simple Java program that paints a rectangle on an internal graphics object obtained through the `getGraphics()` method.</p>
 */
public class AbstractMultiResolutionImage_getGraphics_Example {

    /**
     * The entry point for this example.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the AbstractMultiResolutionImage class
        AbstractMultiResolutionImage image = new AbstractMultiResolutionImage() {
            @Override
            protected Graphics getGraphics() {
                return createGraphics();
            }
        };

        // Get the internal graphics object
        Graphics graphics = image.getGraphics();

        // Set a color for the graphics object
        graphics.setColor(Color.BLACK));

        // Draw a rectangle on the graphics object
        graphics.drawRect(20, 20, 100, 100);
    }
}
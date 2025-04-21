package examples.java.awt.image;

import java.awt.image.CropImageFilter;
import java.awt.image.BufferedImage;

/**
 * <p>This example demonstrates how to create a runnable Java code example using the `CropImageFilter` class within a single Java file.</p>
 * 
 * <p>The code provided below is written in Java and it creates an instance of the `CropImageFilter` class, which is used to crop an image. The resulting cropped image is then displayed.</p>
 * 
 * <p>Here's a breakdown of what the example does:</p>
 * 
 * <ul>
 *   <li>It imports necessary classes and interfaces from the Java standard library.</li>
 *   <li>It defines a public class named `CropImageFilter_addWithoutOverflow_Example.java` within the package `examples.java.awt.image`. This is done to ensure that the code can be directly pasted into a Java file and used.</li>
 *   <li>It creates a public class named `BufferedImageExample.java`, which is used to demonstrate how to work with images using the `BufferedImage` class, which extends the abstract class `Image` in the `javax.imageio` package.</li>
 *   <li>It defines several methods within this class, each of which demonstrates a different aspect of working with images using the `BufferedImage` class.</li>
 * </ul>
 * 
 * <p>The example provided above can be used as a starting point for further experimentation and learning about image processing in Java. By using the `CropImageFilter` class, this example demonstrates how to crop an image using the filter chain provided by the `BufferedImage` class.</p>
 */
public class BufferedImageExample {

    // Example method demonstrating how to create a new BufferedImage instance with a specific width and height.
    public static BufferedImage createNewBufferedImage(int width, int height) {
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
    }

    // Example method demonstrating how to apply the CropImageFilter to a specific BufferedImage instance and extract a sub-image from it.
    public static BufferedImage cropBufferedImage(BufferedImage sourceImage, int x, int y, int width, int height) {
        int sourceWidth = sourceImage.getWidth();
        int sourceHeight = sourceImage.getHeight();

        if (x < 0 || y < 0 || (x + width) > sourceWidth || (y + height) > sourceHeight) {
            throw new IllegalArgumentException("The specified bounds for the cropped image are invalid."));
        }

        CropImageFilter filter = new CropImageFilter(width, height, x, y, BufferedImage.TYPE_INT_RGB));
        return ImageUtils.applyFilter(sourceImage, filter));
    }

    // Example method demonstrating how to display a given BufferedImage instance using the `JLabel` class in the `javax.swing` package.
    public static void displayBufferedImage(BufferedImage image) {
        JLabel label = new JLabel(new ImageIcon(image)));
        label.setBounds(0, 0, image.getWidth(), image.getHeight()));
        label.setVisible(true));
    }

    // Main method demonstrating how to use the example methods defined in this class to create and display a cropped image using the `CropImageFilter` class provided by the `BufferedImage` class in the Java standard library.
    public static void main(String[] args) throws IOException {
        File inputImageFile = new File("input.jpg"));
        BufferedImage sourceImage = ImageIO.read(inputImageFile));

        int x = 100;
        int y = 100;
        int width = 200;
        int height = 200;

        BufferedImage croppedImage = cropBufferedImage(sourceImage, x, y, width, height));
        displayBufferedImage(croppedImage));
    }
}
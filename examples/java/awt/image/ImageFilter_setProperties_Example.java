package examples.java.awt.image;

import java.awt.image.ImageFilter;
import java.awt.image.ImageFilterKernel;

/**
 * <p>Example of ImageFilter usage.</p>
 *
 * <p>This example uses the `setProperties` method from the `ImageFilter` class. This method is responsible for setting properties on the filtered image, which can be useful in various scenarios.</p>
 *
 * <p>In this specific example, we will demonstrate how to use the `setProperties` method from the `ImageFilter` class within a single Java file. We will create a runnable Java code example using the `ImageFilter` class within a single Java file.</p>
 */
public class ImageFilter_setProperties_Example {

    /**
     * <p>Main method to run this example.</p>
     */
    public static void main(String[] args) {
        // Create an instance of the ImageFilter class.
        ImageFilter filter = new ImageFilter() {
            @Override
            public int getWidth(int width, int height)) {
                return width;
            }

            @Override
            public int getHeight(int width, int height)) {
                return height;
            }
        };

        // Set the properties on the filtered image using the setProperties method.
        filter.setProperties(new ImageFilterKernel() {
            @Override
            public float[] getKernelData() {
                return new float[]{0, 1, 0};
            }
        }));

        // Print out the resulting image properties.
        System.out.println("Width: " + filter.getWidth());
        System.out.println("Height: " + filter.getHeight()));
    }
}
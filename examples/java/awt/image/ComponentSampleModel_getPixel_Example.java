package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ComponentSampleModel;

/**
 * This example demonstrates how to use the
 * ComponentSampleModel class in Java's AWT
 * package. The example specifically focuses on the
 * getPixel() method, which is used to retrieve
 * the color value of a specific pixel within
 * an image.
 *
 * <p>This example provides a simple implementation of the
 * getPixel() method using the ComponentSampleModel
 * class. This implementation allows for easy manipulation of pixel colors within
 * an image stored in the form of a 2D array (i.e., int[][])).</p>
 */
public class ComponentSampleModel_getPixel_Example {

    // The ComponentSampleModel class represents an AWT image that is composed of multiple components, each with its own color table. This implementation focuses on images stored in the form of a 2D array (i.e., int[][])).

    private static final int COMPONENT_COUNT = 3;
    private static final Color[] COLOR_TABLE = {Color.RED, Color.GREEN, Color.BLUE}};
    private int[][] imageData;

    public ComponentSampleModel_getPixel_Example(int width, int height) {
        imageData = new int[height][width]];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
            imageData[y][x] = getRandomColorValue();
            }
        }
    }

    public int[] getPixel(int x, int y) {
        return new int[]{imageData[y][x]]};
    }

    private static int getRandomColorValue() {
        return (int) (Math.random() * 256));
    }

    public static void main(String[] args) {
        ComponentSampleModel_getPixel_Example example = new ComponentSampleModel_getPixel_Example(100, 100));
        for (int y = 0; y < 100; y++) {
            for (int x = 0; x < 100; x++) {
                System.out.println("RGB value at (" + x + ", " + y + ") is: " + getPixel(x, y))));
            }
        }
    }
}
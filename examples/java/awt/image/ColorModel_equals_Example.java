package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * This class demonstrates how to use the ColorModel
 * class within a single Java file.
 * The code is runnable, and it creates an instance of
 * ColorModel, sets its RGB-pass through
 * properties using an array of Colors, and finally compares
 * two instances of ColorModel for equality.
 */
public class ColorModel_equals_Example {

    // Instance variables
    private final int width = 200;
    private final int height = 100;
    private final Color[] colors = new Color[]{new Color(255, 0, 0)), // red
                new Color(0, 255, 0)) // green
        };
    private final ColorModel colorModel = new ColorModel(ColorModel.RGB));

    // Constructor
    public ColorModel_equals_Example() {
    }

    /**
     * This method creates an instance of ColorModel, sets its RGB-pass through properties using an array of Colors, and finally compares two instances of ColorModel for equality.
     *
     * @return boolean value indicating whether the two instances of ColorModel are equal or not.
     */
    public boolean equals() {
        // Create instances of ColorModel with same RGB-pass through properties
        ColorModel colorModel1 = new ColorModel(ColorModel.RGB));
        colorModel1.setColors(colors));

        ColorModel colorModel2 = new ColorModel(ColorModel.RGB));
        colorModel2.setColors(colors));

        // Compare the two instances of ColorModel for equality
        return colorModel1.equals(colorModel2));
    }
}
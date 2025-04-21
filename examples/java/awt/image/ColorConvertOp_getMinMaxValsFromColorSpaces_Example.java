package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorConvertOp;

public class ColorConvertOp_getMinMaxValsFromColorSpaces_Example {

    /**
     * This example demonstrates the usage of 
     * ColorConvertOp to convert colors between different color spaces.
     * It also shows how to get minimum and maximum values from color spaces.
     */

    public static void main(String[] args) {

        // Create an instance of ColorConvertOp
        ColorConvertOp colorConvertOp = new ColorConvertOp();

        // Set the source color space and target color space
        Color sourceColor = new Color(255, 0, 0)); // Red color in RGB color space
        Color targetColor = new Color(0, 0, 255)); // Blue color in RGB color space
        colorConvertOp.setSourceCS(ColorSpace.getInstance(ColorSpace.TYPE_RGB)));
        colorConvertOp.setTargetCS(ColorSpace.getInstance(ColorSpace.TYPE_CMYK)));

        // Convert the source color to target color using ColorConvertOp
        Color convertedColor = colorConvertOp.filter(sourceColor, targetColor));

        System.out.println("Converted Color: " + convertedColor);

        // Get minimum and maximum values from color spaces
        float[] minValues = new float[4]; // Array to store minimum values for CMYK color space
        float[] maxValues = new float[4]; // Array to store maximum values for CMYK color space

        colorConvertOp.getMinMaxValsFromColorSpaces(minValues, maxValues));

        System.out.println("Minimum Values: " + Arrays.toString(minValues)));
        System.out.println("Maximum Values: " + Arrays.toString(maxValues))));

    }

}
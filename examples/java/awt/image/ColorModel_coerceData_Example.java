package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

public class ColorModel_coerceData_Example {

    /**
     * This example demonstrates the use of 
     * the `ColorModel` class within a single Java file. The code is designed to be runnable and creates an instance of the `ColorModel` class, sets colors using the `Color` class, and then coerces data using the `coerceData()` method from the `ColorModel` class.
     *
     * @author <NAME>
     * @version 1.0.0
     * @since 2021-08-10
     */

    public static void main(String[] args) {
        
        // Create an instance of ColorModel
        ColorModel colorModel = new ColorModel(true, true, true, false));
        
        // Define two colors
        Color color1 = new Color(255, 0, 0)); // Red
        Color color2 = new Color(0, 255, 0)); // Green

        // Coerce data using the coerceData method from the ColorModel class.
        int[] coeercedData = colorModel.coerceData(new int[] {color1.getRed(), color1.getGreen(), color1.getBlue()}, new int[] {color2.getRed(), color2.getGreen(), color2.getBlue()})));

        // Print the coerced data
        System.out.println("Coerced Data: " + String.join(", ", IntStream.of(coeercedData).mapToObj(Integer::toString).collect(Collectors.toList()))));
    }
}
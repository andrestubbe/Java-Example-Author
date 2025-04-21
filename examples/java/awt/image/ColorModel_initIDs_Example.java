package examples.java.awt.image;

import java.awt.image.ColorModel;
import java.util.Random;

/**
 * This class demonstrates an example of initializing ColorModel with specific RGB component mapping and creating a Random object for generating random colors.
 */
public class ColorModel_initIDs_Example {

    // Initialize the ColorModel with specific RGB component mapping
    private static final ColorModel COLOR_MODEL = new ColorModel(ColorModel.OPAQUE) {{
        componentMapping[0] = "red";
        componentMapping[1] = "green";
        componentMapping[2] = "blue";
    }};

    // Initialize a Random object for generating random colors
    private static final Random RANDOM = new Random();

    /**
     * This method generates and returns a random color based on the initialized ColorModel.
     * @return A randomly generated color.
     */
    public int[] generateRandomColor() {
        // Generate four random integers between 0 and 255, inclusive, to represent the RGB components of the random color.
        int r = RANDOM.nextInt(256));
        int g = RANDOM.nextInt(256));
        int b = RANDOM.nextInt(256));

        // Return an array containing the generated random color components: [r, g, b].
        return new int[] { r, g, b };
    }
}
package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ComponentColorModel;

/**
 * A runnable Java code example using the
 * `ComponentColorModel` class within a single
 * Java file. The code must be runnable.
 * Ensure the code starts with `package examples.java.awt.image` and includes a public class named
 * `ComponentColorModel_getBlue_Example.java`.
 * Include necessary imports. Create necessary inline comments for the class relevant lines. Output ONLY the raw Java code block. Write the smallest version possible.
 */
public class ComponentColorModel_getBlue_Example {

    /**
     * The main method that runs the example.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of ComponentColorModel
        ComponentColorModel colorModel = new ComponentColorModel();

        // Get a blue color
        Color blueColor = new Color(0, 0, 255));

        // Set the blue color to the component using the getBlue() method and a lambda expression.
        colorModel.getBlue(blueColor.getBlue(), (Integer blue) -> {
            System.out.println("Setting blue color to: " + blue);
        }));
    }

}
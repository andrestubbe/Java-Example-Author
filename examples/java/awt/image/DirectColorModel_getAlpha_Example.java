package examples.java.awt.image;

import java.awt.color.DirectColorModel;

/**
 * Example of how to use the `getAlpha` method from the DirectColorModel class. This example demonstrates how to get the alpha value of a specific color using the DirectColorModel.
 */
public class DirectColorModel_getAlpha_Example {

    private final int ARGB = 0xFF00FF; // Example RGB Color in ARGB format
    private final DirectColorModel directColorModel;


    /**
     * Constructor that initializes an instance of the DirectColorModel class.
     */
    public DirectColorModel_getAlpha_Example() {
        this.directColorModel = new DirectColorModel(32, true, false, false, true)); // Example initialization with 32 bits per component and alpha-premultiplied components

        System.out.println("Direct Color Model Initialized: " + this.directColorModel);
    }


    /**
     * Main method that demonstrates how to use the `getAlpha` method from the DirectColorModel class. This example demonstrates how to get the alpha value of a specific color using the DirectColorModel.
     */
    public static void main(String[] args) {
        System.out.println("Main Method Called"));

        // Create an instance of the DirectColorModel class
        DirectColorModel directColorModel = new DirectColorModel(32, true, false, false, true)); // Example initialization with 32 bits per component and alpha-premultiplied components


        // Get the ARGB color value
        int ARGB = 0xFF00FF;


        // Get the alpha value from the DirectColorModel class
        float alpha = directColorModel.getAlpha(ARGB);

        System.out.println("Alpha Value of Color (0xFF00FF) in ARGB Format: " + alpha));
    }
}
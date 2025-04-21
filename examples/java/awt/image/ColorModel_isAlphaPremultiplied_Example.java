package examples.java.awt.image;

import java.awt.color.ColorModel;

public class ColorModel_isAlphaPremultiplied_Example {

    // Class relevant lines

    /**
     * This example demonstrates the `isAlphaPremultiplied` method from the {@link ColorModel} class.
     * 
     * The purpose of this code is to showcase how to use the `isAlphaPremultiplied` method provided by the `ColorModel` class.
     */

    public static void main(String[] args) {
        
        // Create an instance of ColorModel
        ColorModel colorModel = new ColorModel(/*ColorSpace*/, /*TransferFunction*/));
        
        // Use the isAlphaPremultiplied method to check if alpha is premultiplied 
        boolean isAlphaPremultiplied = colorModel.isAlphaPremultiplied();

        System.out.println("Is Alpha Premultiplied? " + isAlphaPremultiplied);
    }
}
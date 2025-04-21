package examples.java.awt.image;

import java.awt.image.BaseMultiResolutionImage;

public class BaseMultiResolutionImage_checkSize_Example {

    /**
     * This example demonstrates how to use the `checkSize()` method within the `BaseMultiResolutionImage` class. The purpose of this example is to showcase the usage of a specific method in a specific context.
     */

    public static void main(String[] args) {
        
        // Instantiate an instance of BaseMultiResolutionImage
        BaseMultiResolutionImage image = new BaseMultiResolutionImage();
        
        // Print the original size of the image
        System.out.println("Original Size: " + image.getWidth() + "x" + image.getHeight()));
        
        // Resize the image to a new size (300x200)
        image.setSize(300, 200));
        
        // Print the new size of the image after resizing
        System.out.println("New Size: " + image.getWidth() + "x" + image.getHeight()));
    }
}
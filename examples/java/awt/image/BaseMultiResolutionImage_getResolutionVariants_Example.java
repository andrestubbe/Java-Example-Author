package examples.java.awt.image;

import java.awt.image.BaseMultiResolutionImage;
import java.util.Map;

/**
 * This example demonstrates how to retrieve the resolution variants of a BaseMultiResolutionImage object. The method getResolutionVariants() is used to obtain this information.
 * 
 * @author <NAME> (<EMAIL>)
 * @version 1.0.1
 */
public class BaseMultiResolutionImage_getResolutionVariants_Example {

    /**
     * Method that demonstrates how to use the getResolutionVariants() method of the BaseMultiResolutionImage class.
     *
     * @param baseImage The multi-resolution image object from which we want to retrieve the resolution variants information.
     * @return A Map that contains the keys "width" and "height", and the corresponding values representing the resolution variants width and height respectively.
     */
    public static Map<String, Integer> getResolutionVariants(BaseMultiResolutionImage baseImage) {
        // Call to the getResolutionVariants() method of the BaseMultiResolutionImage class.
        return baseImage.getResolutionVariants();
    }

    /**
     * Main method that creates an example BaseMultiResolutionImage object, and then calls the getResolutionVariants() method on this object to retrieve its resolution variants information. Finally, it prints out the retrieved resolution variants width and height values.
     */
    public static void main(String[] args) {
        // Create an example BaseMultiResolutionImage object with default dimensions (10, 10) for each resolution variant.
        BaseMultiResolutionImage baseImage = new BaseMultiResolutionImage(10, 10));

        // Call the getResolutionVariants() method on the created BaseMultiResolutionImage object to retrieve its resolution variants information.
        Map<String, Integer> resolutionVariants = getResolutionVariants(baseImage));

        // Print out the retrieved resolution variants width and height values.
        System.out.println("Width: " + resolutionVariants.get("width")));
        System.out.println("Height: " + resolutionVariants.get("height")));
    }

}
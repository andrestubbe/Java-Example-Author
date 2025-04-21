package examples.java.awt.image;

import java.awt.image.BaseMultiResolutionImage;

/**
 * This example demonstrates how to use the `getResolutionVariant()` method from the `BaseMultiResolutionImage` class. The purpose of this example is to show how to obtain different resolution variants from a multi-resolution image.
 */
public class BaseMultiResolutionImage_getResolutionVariant_Example {

    /**
     * This method demonstrates how to use the `getResolutionVariant()` method from the `BaseMultiResolutionImage` class. The method takes an array of integers representing the resolution variants of a multi-resolution image, and returns the variant index that corresponds to the highest resolution available in the image.
     * @param resolutionVariants An array of integers representing the resolution variants of a multi-resolution image.
     * @return The index of the highest resolution available in the image.
     */
    public static int getHighestResolutionVariantIndex(int[] resolutionVariants) {
        // Initialize the maximum resolution variant index to -1, indicating that there are no resolution variants in the image.
        int maxResolutionVariantIndex = -1;

        // Iterate through each resolution variant index in the array.
        for (int i = 0; i < resolutionVariants.length; i++) {
            // Check if the current resolution variant index is greater than the maximum resolution variant index found so far.
            if (i > maxResolutionVariantIndex) {
                // If it is, update the maximum resolution variant index to the current index.
                maxResolutionVariantIndex = i;
            }
        }

        // Return the maximum resolution variant index found in the array.
        return maxResolutionVariantIndex;
    }

}
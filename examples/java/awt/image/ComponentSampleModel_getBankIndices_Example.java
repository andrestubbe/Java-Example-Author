package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.util.Arrays;

/**
 * This example demonstrates how to use the ComponentSampleModel class in Java AWT library. The example focuses on creating a sample model with a single component and multiple bands, then retrieving bank indices for that component.
 */
public class ComponentSampleModel_getBankIndices_Example {

    // Define the sample model with a single component and multiple bands
    private final ComponentSampleModel sampleModel;

    /**
     * Constructor that initializes the sample model with the given data, such as the component data array, the offset array, and the band indices array.
     *
     * @param componentDataArray The component data array containing the pixel values of each component in the image.
     * @param offsetArray The offset array containing the x and y offsets for each bank index in the sample model.
     * @param bankIndicesArray The bank indices array containing the indices of the banks to which each component is assigned.
     */
    public ComponentSampleModel_getBankIndices_Example(
            int[] componentDataArray,
            int[] offsetArray,
            int[] bankIndicesArray) {

        // Initialize the sample model with the given data
        this.sampleModel = new ComponentSampleModel(
                componentDataArray,
                offsetArray,
                bankIndicesArray);
    }

    /**
     * Method that retrieves and returns the bank indices array for the component in the sample model defined by this class constructor.
     *
     * @return The bank indices array containing the indices of the banks to which each component is assigned.
     */
    public int[] getBankIndicesArray() {
        // Return the bank indices array from the sample model
        return this.sampleModel.getBankIndices();
    }
}
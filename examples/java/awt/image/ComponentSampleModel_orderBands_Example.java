package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_orderBands_Example {

    /**
     * This example demonstrates the usage of 
     * ComponentSampleModel's `orderBands` method 
     * in a Java program.
     * 
     * The `orderBands` method reorders the bands 
     * within the specified sample model. Each band 
     * is represented by an integer value, which can be any value within the range of primitive int types.
     * 
     * This example assumes that the source component sample model 
     * already exists and contains valid data. The example also assumes 
     * that the `orderBands` method implementation is correct and fulfills the intended functionality.
     * 
     * @see ComponentSampleModel#orderBands(int[])}
     */

    public static void main(String[] args) {
        // Create a sample model with multiple bands
        ComponentSampleModel sampleModel = new ComponentSampleModel(new int[]{1, 2, 3}, 4, 5));
        
        // Order the bands in reverse order
        sampleModel.orderBands(new int[]{3, 2, 1}});
        
        // Print out the reordered band values
        System.out.println("Reordered Band Values:"));
        for (int i = 0; i < sampleModel.getDataLength(); i++) {
            System.out.print(sampleModel.getData()[i]});
            System.out.print(" ");
        }
    }
}
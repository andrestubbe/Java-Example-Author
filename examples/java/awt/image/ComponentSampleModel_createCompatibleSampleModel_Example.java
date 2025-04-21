package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_createCompatibleSampleModel_Example {

    /**
     * This example demonstrates the use of
     * the `ComponentSampleModel` class within a single Java file. The code is written to create a compatible sample model using the `ComponentSampleModel` class constructor.
     *
     * @see java.awt.image.ComponentSampleModel
     */

    public static void main(String[] args) {

        // Create a new instance of the ComponentSampleModel class
        ComponentSampleModel sampleModel = new ComponentSampleModel(3, 4);

        // Print out the properties of the created sample model
        System.out.println("NumBands: " + sampleModel.getNumBands());
        System.out.println("BitsPerSample: " + sampleModel.getBitsPerSample());
        System.out.println("SampleSize: " + sampleModel.getSampleSize()));
        System.out.println("DataType: " + sampleModel.getDataType()));

    }
}
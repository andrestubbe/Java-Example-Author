package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_getSampleFloat_Example {

    /**
     * A sample program demonstrating the use of 
     * ComponentSampleModel's getSampleFloat method.
     */

    public static void main(String[] args) {
        
        // Create an instance of ComponentSampleModel
        ComponentSampleModel csmodel = new ComponentSampleModel(3, 4);

        // Get a sample float using the getSampleFloat method
        float sample_float = csmodel.getSampleFloat(1, 2, 3, 4));

        System.out.println("The sample float obtained is: " + sample_float);
    }
}
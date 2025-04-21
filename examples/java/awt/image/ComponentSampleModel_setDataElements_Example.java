package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_setDataElements_Example {

    /**
     * Example program that demonstrates the use of
     * {@link ComponentSampleModel} to set data elements.
     */

    public static void main(String[] args) {
        // Create an instance of ComponentSampleModel
        ComponentSampleModel csmodel = new ComponentSampleModel(1, 1, 1, 1);
        System.out.println("Created a ComponentSampleModel with componentsPerScanline=" + csmodel.getComponentsPerScanline() 
        + ", bitsPerSample=" + csmodel.getBitsPerSample() 
        + ", sampleSize=" + csmodel.getSampleSize());

        // Set the data elements in the image
        int numDataElements = 3;
        for (int i = 0; i < numDataElements; i++) {
            csmodel.setDataElement(i, new Integer((int)(Math.random() * 1000))));
        }
        System.out.println("Set " + numDataElements + " data elements in the image.");
    }

}
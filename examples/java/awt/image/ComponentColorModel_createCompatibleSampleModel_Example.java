package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.SampleImage;
import java.awt.image.renderable.ColorRendering;

/**
 * A Java code example that demonstrates the usage of
 * the ComponentColorModel class within a single Java file. This example also shows how to create a compatible sample model using the `createCompatibleSampleModel` method of the SampleImage class.
 *
 * The resulting image obtained from this example will have its pixels colored according to the provided ColorModel and SampleImage, respectively.
 */
public class ComponentColorModel_createCompatibleSampleModel_Example {

    /**
     * Creates a compatible sample model using the createCompatibleSampleModel method of the SampleImage class.
     * @param sampleImage The sample image from which to create the compatible sample model.
     * @return The created compatible sample model.
     */
    public static ComponentColorModel createCompatibleSampleModel(SampleImage sampleImage) {
        // Create the compatible sample model using the createCompatibleSampleModel method of the SampleImage class.
        ComponentColorModel componentColorModel = new ComponentColorModel();
        componentColorModel.setColors(sampleImage.getColors()));
        return componentColorModel;
    }
}
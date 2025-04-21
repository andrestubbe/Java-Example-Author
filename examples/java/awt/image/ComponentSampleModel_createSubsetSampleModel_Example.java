package examples.java.awt.image;

import java.awt.image.AffineTransformOp;
import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_createSubsetSampleModel_Example {

    /**
     * This example demonstrates how to create a subset sample model using the ComponentSampleModel class within the Java AWT image package.
     *
     * <p>The code provided below defines a public class named `ComponentSampleModel_createSubsetSampleModel_Example` that contains necessary imports and implements the required functionality.</p>
     *
     * @see java.awt.image.AffineTransformOp#createCompatibleSampleImage(int, int))
     */

    public static void main(String[] args) {
        // Define the width and height of the original image
        final int imageWidth = 800;
        final int imageHeight = 600;

        // Create a new ComponentSampleModel object with the specified dimensions
        ComponentSampleModel originalSampleModel = new ComponentSampleModel(imageWidth, imageHeight, 3, 8));

        // Create a new AffineTransformOp object that will be used to transform the original image
        AffineTransformOp affineTransformOp = new AffineTransformOp();

        // Set the transform parameters for the affine transformation
        affineTransformOp.setTranslate(-100, -100));
        affineTransformOp.setScale(2.0, 2.0));
        affineTransformOp.setRotate(45));

        // Create a new ComponentSampleModel object that represents the transformed image
        ComponentSampleModel transformedSampleModel = (ComponentSampleModel) affineTransformOp.createCompatibleSampleImage(imageWidth * 2, imageHeight * 2, 3, 8));

        // Set the rendering hints for the transformation
        affineTransformOp.setRenderingHints(new Object[] {
                "FILTER_TYPE", "2D",
                "INTERPOLATION", "BILINEAR",
                "COLOR_SPACE", "RGB"
        }));

        // Apply the affine transformation to the original image using the created compatible sample image and rendering hints
        affineTransformOp.filter(originalSampleModel, transformedSampleModel, null));

        // Print out the properties of the transformed sample model
        System.out.println("Transformed Sample Model Properties:"));
        System.out.println("Width: " + transformedSampleModel.getWidth()));
        System.out.println("Height: " + transformedSampleModel.getHeight()));
        System.out.println("Components: " + transformedSampleModel.getNumComponents()));
        System.out.println("Bits Per Component: " + transformedSampleModel.getBitsPerComponent()));

    }

}
package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;

public class ConvolveOp_createCompatibleDestRaster_Example {

    /**
     * This example demonstrates how to create a ConvolveOp with the createCompatibleDestRaster method.
     * 
     * The ConvolveOp applies an image convolution filter to an input image.
     * 
     * The createCompatibleDestRaster method is used to create a destination raster that can be used as the output of the ConvolveOp. This allows for flexible filtering options and custom output images.
     * 
     * In this example, we create a BufferedImage with a width and height of 200 pixels each. We then create a ConvolveOp object with a 3x3 convolution kernel that applies a simple edge detection filter. Finally, we apply the ConvolveOp to the input image using the createCompatibleDestRaster method to create a destination raster with the same dimensions as the input image. The resulting output image is displayed using the Java Advanced Imaging (JAI) API.
     * 
     * @since 1.0.0
     */

    public static void main(String[] args) {

        // Create a BufferedImage with a width and height of 200 pixels each
        BufferedImage inputImage = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB));

        // Create a ConvolveOp object with a 3x3 convolution kernel that applies a simple edge detection filter
        ConvolveOp convolveOp = new ConvolveOp(new int[][]{{0, -1, 0}, {-1, 4, -1}, {0, -1, 0}});

        // Create a destination raster with the same dimensions as the input image
        BufferedImage outputImage = convolveOp.createCompatibleDestRaster(inputImage));

        // Display the resulting output image using the Java Advanced Imaging (JAI) API
        JAI.getInstance().getContext().put("image0", inputImage);
        JAI.getInstance().getOperationBands(convolveOp, "image0", null, null, null)).getBufferedImage();

    }

}
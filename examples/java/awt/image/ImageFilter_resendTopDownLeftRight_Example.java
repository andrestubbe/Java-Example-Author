package examples.java.awt.image;

import java.awt.image.ImageFilter;
import java.awt.image.ImageFilterKernel;
import java.awt.image.ImageObserver;
import java.awt.image.RGBImageFilter;
import java.awt.image.SampleImageFilter;

public class ImageFilter_resendTopDownLeftRight_Example {

    /**
     * A resend filter that applies the
     * Laplacian operator in both x and y
     * directions. This results in a blurr
     * effect which is useful for various image
     * processing tasks.
     */

    public static ImageFilter create() {

        // Create the filter kernel
        ImageFilterKernel kernel = new ImageFilterKernel();
        kernel.setEdgeAction(ImageFilterKernel.EDGE_MASK));

        // Create the sample image filter
        SampleImageFilter sampleFilter = new SampleImageFilter(kernel));

        // Create the RGB image filter
        RGBImageFilter rgbFilter = new RGBImageFilter();
        rgbFilter.setEdgeAction(ImageFilterKernel.EDGE_MASK)));
        sampleFilter.setFilter(rgbFilter);

        return sampleFilter;
    }

}
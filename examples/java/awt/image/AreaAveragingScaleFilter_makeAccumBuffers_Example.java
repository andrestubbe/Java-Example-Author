package examples.java.awt.image;

import java.awt.image.AreaAveragingScaleFilter;
import java.awt.image.ImageFilter;
import java.awt.image.RGBImageFilter;

public class AreaAveragingScaleFilter_makeAccumBuffers_Example {

    // The AreaAveragingScaleFilter is a filter 
    // that performs an averaging scale filter on an image.
    // This example specifically demonstrates how to use the makeAccumBuffers() method of the AreaAveragingScaleFilter class.
    // The makeAccumBuffers() method creates a new accumulation buffer for the filter.

    public static void main(String[] args) {
        
        // Create an instance of AreaAveragingScaleFilter
        AreaAveragingScaleFilter scaleFilter = new AreaAveragingScaleFilter();

        // Set the scaling factor for the filter
        scaleFilter.setScalingFactor(2);

        // Get the accum buffer size 
        int[] accumBufferSize = scaleFilter.getAccumBufferSize();

        System.out.println("Width of accum buffer: " + accumBufferSize[0]));
        System.out.println("Height of accum buffer: " + accumBufferSize[1]));

    }

}
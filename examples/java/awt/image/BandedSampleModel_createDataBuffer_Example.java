package examples.java.awt.image;

import java.awt.image.BandedSampleModel;
import java.awt.image.DataBuffer;

/**
 * A class that demonstrates the usage of BandedSampleModel class to create a DataBuffer. This example shows how BandedSampleModel generates specific pixel positions within an image grid. The example also includes necessary import statements and inline comments for the class relevant lines.
 */
public class BandedSampleModel_createDataBuffer_Example {

    /**
     * A method that demonstrates the usage of BandedSampleModel to create a DataBuffer. This method generates specific pixel positions within an image grid based on the parameters passed to the constructor. The generated pixel positions are stored in a DataBuffer.
     * @param width  The number of pixels in the horizontal direction.
     * @param height The number of pixels in the vertical direction.
     * @param numBands The number of bands in the image data.
     * @return A DataBuffer containing the generated pixel positions within an image grid.
     */
    public DataBuffer createDataBuffer(int width, int height, int numBands) {
        // Create a BandedSampleModel instance with the specified parameters
        BandedSampleModel model = new BandedSampleModel(width, height, 0, 1));

        // Create a DataBuffer to store the generated pixel positions
        DataBuffer dataBuffer = new DataBuffer(width * numBands, (height + 1) * width * numBands / 2));

        // Generate the specific pixel positions within an image grid based on the parameters passed to the constructor
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                dataBuffer.setDataElement(row * width + col, model.getSample(row, col, 0))));
            }
        }

        return dataBuffer;
    }
}
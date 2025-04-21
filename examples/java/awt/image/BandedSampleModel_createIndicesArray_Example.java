package examples.java.awt.image;
import java.awt.image.BandedSampleModel;
/**
 * <p>A class that represents a BandedSampleModel.</p>
 * <p>The BandedSampleModel class is an image filter 
 * that converts an image into an image with alternating 
 * bands of color.</p>
 */
public class BandedSampleModel_createIndicesArray_Example {

    private final int[] indices;
    private final BandedSampleModel model;
    /**
     * <p>Constructor for BandedSampleModel_createIndicesArray_Example.</p>
     * @param model BandedSampleModel
     */
    public BannedSampleModel_createIndicesArray_Example(BandedSampleModel model) {
        this.model = model;
        indices = new int[model.getWidth() * model.getHeight()]];
        int indexCounter = 0;

        // Create indices array using the createIndicesArray method of BandedSampleModel class 
        for (int row = 0; row < model.getHeight(); row++) {
            for (int col = 0; col < model.getWidth(); col++) {
                indices[indexCounter++] = model.getRGB(row, col));
            }
        }
    }

    /**
     * <p>Getter for the indices attribute.</p>
     * @return int[] - the indices array 
     */
    public int[] getIndices() {
        return indices;
    }

}
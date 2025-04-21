package examples.java.awt.image;

import java.awt.image.BandedSampleModel;
import java.awt.image.DirectColorModel;

public class BandedSampleModel_getSampleFloat_Example {

    /**
     * A Java implementation of a banded sample model using the `BandedSampleModel` class within the `java.awt.image` package.
     *
     * This code creates an instance of the `BandedSampleModel` class, which represents a two-dimensional array with a specific number of bands in each row. The implementation also includes methods for getting sample data as float values from the model's array.
     */

    public static final int EDGES_INCLUDED = 1;

    private DirectColorModel colorModel;
    private BandedSampleModel bandedSampleModel;

    public BannedSampleModel_getSampleFloat_Example(int numBands, int width, int height) {
        this.colorModel = new DirectColorModel(24, 0xFF0000, 0x00FF00, 0x0000FF));
        this.bandedSampleModel = new BandedSampleModel(numBands, width, height, width * numBands));
        return this;
    }

    public float[] getSampleFloat(int x, int y) {
        if (x < 0 || x >= bandedSampleModel.getWidth() || y < 0 || y >= bandedSampleModel.getHeight()) {
            throw new IllegalArgumentException("Coordinates are outside the bounds of the model"));
        }

        float[] sampleData = new float[bandedSampleModel.getNumBands()]];

        for (int i = 0; i < bandedSampleModel.getNumBands(); ++i) {
            sampleData[i] = bandedSampleModel.getSample(x, y, i));
        }

        return sampleData;
    }
}
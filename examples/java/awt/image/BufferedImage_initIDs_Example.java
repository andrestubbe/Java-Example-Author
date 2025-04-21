package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This class demonstrates how to initialize IDs in a BufferedImage object. The ID arrays are initialized with unique integer values, and these values are returned when the `getIDs()` method is invoked on an instance of this class.
 */
public class BufferedImage_initIDs_Example {

    private final int[] idArray1;
    private final int[] idArray2;
    private final int[] idArray3;

    /**
     * Initializes the IDs in a BufferedImage object and assigns them to private instance variables of this class. The ID arrays are initialized with unique integer values, and these values are returned when the `getIDs()` method is invoked on an instance of this class.
     */
    public BufferedImage_initIDs_Example() {

        // Initialize the first ID array with 3 unique integer values:
        this.idArray1 = new int[]{4567, 893, 12345}};

        // Initialize the second ID array with 2 unique integer values:
        this.idArray2 = new int[]{987654321, 2222222222}};

        // Initialize the third ID array with 1 unique integer value:
        this.idArray3 = new int[]{1234567890}};

    }

    /**
     * Returns the first ID array initialized in the constructor of this class.
     * @return The first ID array.
     */
    public int[] getIDArray1() {
        return this.idArray1;
    }

    /**
     * Returns the second ID array initialized in the constructor of this class.
     * @return The second ID array.
     */
    public int[] getIDArray2() {
        return this.idArray2;
    }

    /**
     * Returns the third ID array initialized in the constructor of this class.
     * @return The third ID array.
     */
    public int[] getIDArray3() {
        return this.idArray3;
    }
}
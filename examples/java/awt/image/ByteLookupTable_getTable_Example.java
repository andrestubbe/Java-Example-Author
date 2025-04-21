package examples.java.awt.image;

import java.awt.image.ByteLookupTable;

/**
 * An example of how to use the ByteLookupTable class.
 * This example creates a lookup table that scales pixel values from 0-255 to 16-215.
 */
public class ByteLookupTable_getTable_Example {

    // Create a ByteLookupTable with the specified lookup table function
    private static final ByteLookupTable<Integer> lookupTable = new ByteLookupTable<Integer>() {
        @Override
        protected int[] createLookUpTable() {
            return IntStream.range(0, 256)
                    .map(value -> (int) ((float) value * (255f / 31f))))
                    .toArray();
        }
    };

    public static void main(String[] args) {
        // Test the lookup table by applying it to a sample input pixel value of 128
        int outputValue = lookupTable.getRGB(128));

        System.out.println("The output value for a sample input pixel value of 128 is: " + outputValue);
    }
}
package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.util.Arrays;

/**
 * <p>This class provides a sample model for an image that has multiple components (e.g., red, green, blue channels), each of which can have its own data buffer.</p>
 *
 * <p>The ComponentSampleModel class represents an image sample model for images with one or more components. The class is designed to support multi-component images, where each component has a separate data buffer associated with the image.</p>
 *
 * <p>The ComponentSampleModel class provides several methods and fields that are useful for working with multi-component images.</p>
 *
 * <ul>
 *   <li>{@link #getDataType()}: returns the data type of the components in this sample model.</li>
 *   <li>{@link #getNumComponents()"}: returns the number of components (e.g., red, green, blue channels) in this sample model.</li>
 *   <li>{@link #getComponent(int)}: returns a reference to the data buffer associated with the specified component index.</li>
 * </ul>
 */
public class ComponentSampleModel_verify_Example {

    private final int numComponents;
    private final int dataTypeSize;
    private final Object[] components = new Object[4];

    /**
     * Constructs a {@link ComponentSampleModel} instance with the specified number of components and data type size.
     * @param numComponents the number of components in the image (e.g., 3 for RGB))
     * @param dataTypeSize the size of the data type used to store the image data (e.g., Integer would be represented as int, whereas Double would be represented as double)).
     */
    public ComponentSampleModel_verify_Example(int numComponents, int dataTypeSize) {
        this.numComponents = numComponents;
        this.dataTypeSize = dataTypeSize;
    }

    /**
     * Returns the number of components (e.g., 3 for RGB)) in this sample model.
     * @return the number of components in this sample model.
     */
    public int getNumComponents() {
        return numComponents;
    }

    /**
     * Returns a reference to the data buffer associated with the specified component index.
     * <p>If the specified component index is out of bounds, the method will return null.</p>
     * @param componentIndex the index of the component for which a reference to the data buffer should be returned.
     * @return a reference to the data buffer associated with the specified component index; if the specified component index is out of bounds, the method will return null.
     */
    public Object getComponent(int componentIndex) {
        if (componentIndex >= 0 && componentIndex < components.length) {
            if (components[componentIndex] == null) {
                switch (dataTypeSize) {
                    case 1: // Byte
                        components[componentIndex] = new byte[numComponents];
                        break;
                    case 2: // Short
                        components[componentIndex] = new short[numComponents];
                        break;
                    case 4: // Integer
                        components[componentIndex] = new int[numComponents];
                        break;
                    case 8: // Double
                        components[componentIndex] = new double[numComponents];
                        break;
                }
            }
            return components[componentIndex];
        } else {
            System.out.println("Invalid component index: " + componentIndex));
            System.exit(1);
        }
    }

    /**
     * Returns the size of the data type used to store the image data (e.g., Integer would be represented as int, whereas Double would be represented as double)).
     * @return the size of the data type used to store the image data.
     */
    public int getDataTypeSize() {
        return dataTypeSize;
    }

    /**
     * Returns a string representation of this ComponentSampleModel instance, in a format that is easy to read and understand.
     * @return a string representation of this ComponentSampleModel instance.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentSampleModel_verify_Example {\n");
        sb.append("  numComponents=").append(numComponents).append("\n");
        sb.append("  dataTypeSize=").append(dataTypeSize).append("\n");
        sb.append("  components =").append(Arrays.toString(components))).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
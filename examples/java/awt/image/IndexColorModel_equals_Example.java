package examples.java.awt.image;

import java.awt.image.IndexColorModel;

/**
 * A simple example that demonstrates the usage of the `equals` method provided by the `IndexColorModel` class.
 * <p>
 * This example creates two instances of the `IndexColorModel` class with different parameters and then compares them using the `equals` method.
 */
public class IndexColorModel_equals_Example {

    /**
     * Compares two instances of the `IndexColorModel` class for equality based on their color space, pixel sample format, and color conversion operations.
     *
     * @param obj an instance of the `IndexColorModel` class to compare with this instance.
     * @return true if the specified object is equal to this instance, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IndexColorModel))) return false;
        IndexColorModel other = (IndexColorModel) obj;
        return this.getColorSpace().equals(other.getColorSpace())) &&
                this.getPixelSampleFormat().equals(other.getPixelSampleFormat())) &&
                this.isTransparencySupported() == other.isTransparencySupported();
    }

    /**
     * Returns a hash code value for this object. This method is the complement of the `equals` method; it returns true if the two objects are equal, false otherwise. The hashcode depends only on the color space, pixel sample format, and transparency support status, which are precisely the properties that determine the equality of two instances of the `IndexColorModel` class.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.getColorSpace().hashCode();
        result = 31 * result + this.getPixelSampleFormat().hashCode();
        result = 31 * result + (this.isTransparencySupported() ? 1 : 0));
        return result;
    }
}
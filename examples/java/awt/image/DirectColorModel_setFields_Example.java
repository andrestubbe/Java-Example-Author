package examples.java.awt.image;

import java.awt.color.ColorModel;
import java.awt.image.DirectColorModel;

/**
 * A Java class that demonstrates the use of the DirectColorModel class in a single Java file. This example code ensures that the smallest version possible is provided, with clear formatting and comments for each relevant line of code.
 */
public class DirectColorModel_setFields_Example {

    // Inline comment explaining the purpose of this field
    private final int field1;

    // Inline comment explaining the purpose of this field
    private final String field2;

    /**
     * A public constructor that allows the creation of an instance of the DirectColorModel class. This constructor takes two parameters: an integer value for the first field, and a string value for the second field. The constructor initializes the fields of the object with the provided values.
     * @param field1 An integer value for the first field.
     * @param field2 A string value for the second field.
     */
    public DirectColorModel_setFields_Example(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    /**
     * A public method that allows the user to retrieve the value of the first field. This method returns an integer value.
     * @return An integer value representing the value of the first field.
     */
    public int getField1() {
        return this.field1;
    }

    /**
     * A public method that allows the user to retrieve the value of the second field. This method returns a string value.
     * @return A string value representing the value of the second field.
     */
    public String getField2() {
        return this.field2;
    }

    /**
     * A public method that allows the user to set the value of the first field. This method takes an integer value as a parameter and sets the value of the first field accordingly.
     * @param field1 An integer value representing the new value for the first field.
     */
    public void setField1(int field1) {
        this.field1 = field1;
    }

    /**
     * A public method that allows the user to set the value of the second field. This method takes a string value as a parameter and sets the value of the second field accordingly.
     * @param field2 A string value representing the new value for the second field.
     */
    public void setField2(String field2) {
        this.field2 = field2;
    }

    /**
     * A public method that allows the user to get a string representation of the object. This method returns a string value representing the object's fields and their values in a formatted string.
     * @return A string value representing the object's fields and their values in a formatted string.
     */
    @Override
    public String toString() {
        return "DirectColorModel_setFields_Example{" +
                "field1=" + field1 +
                ", field2='" + field2 + "'" +
                '}';
    }
}
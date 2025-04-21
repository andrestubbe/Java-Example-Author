package examples.javax.swing.text.html;

import java.awt.Component;
import java.lang.reflect.Field;
import javax.accessibility.AccessibleHTML;

public class AccessibleHTML_createElementInfo_Example {

    /**
     * This example demonstrates how to use the {@link AccessibleHTML} class's 
     * `getElementInfo()` method. The purpose of this example is 
     * to provide a runnable code block that showcases 
     * the functionality of the `getElementInfo()` 
     * method within the context of the `AccessibleHTML` 
     * class.
     * 
     * This example runs standalone and does not require any additional dependencies.
     */

    public static void main(String[] args) {

        // Create an instance of the AccessibleHTML class
        AccessibleHTML accessibleHTML = new AccessibleHTML();

        try {

            // Get the private field "document" within the AccessibleHTML class
            Field documentField = AccessibleHTML.class.getDeclaredField("document");
            documentField.setAccessible(true);

            // Get the value of the "document" field
            Object document = documentField.get(accessibleHTML));;

            // Print the value of the "document" field
            System.out.println(document);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
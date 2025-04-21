package examples.javax.swing.text.html;

import java.lang.reflect.AccessibleContext;

/**
 * Example class that demonstrates how to use the `getAccessibleIndexInParent` method from the `AccessibleHTML$HTMLAccessibleContext` class within a single Java file.
 *
 * This example code is designed to demonstrate the usage of the `getAccessibleIndexInParent` method in the context of HTML content and its accessibility within Swing components.
 */
public class AccessibleHTML$HTMLAccessibleContext_getAccessibleIndexInParent_Example {

    /**
     * Method that demonstrates the usage of the `getAccessibleIndexInParent` method from the `AccessibleHTML$HTMLAccessibleContext` class.
     *
     * This method creates a sample HTML content with its accessibility context, and then uses the `getAccessibleIndexInParent` method to retrieve the index of the current component within its parent container.
     *
     * @return the index of the current component within its parent container.
     */
    public int getAccessibleIndexInParent() {
        // Create a sample HTML content with its accessibility context.
        String htmlContent = "<html><body>" +
                "<div id='container'>" +
                "<h1>Heading 1</h1>" +
                "<p>Paragraph 1</p>" +
                "</div></body></html>";

        // Get the accessibility context of the HTML content.
        AccessibleContext accessibleContext = new AccessibleHTML().createHTMLContent(htmlContent).getAccessibleContext();

        // Retrieve the index of the current component within its parent container using the `getAccessibleIndexInParent` method.
        int accessibleIndexInParent = ((AccessibleHTML$HTMLAccessibleContext) accessibleContext).getAccessibleIndexInParent();

        return accessibleIndexInParent;
    }
}
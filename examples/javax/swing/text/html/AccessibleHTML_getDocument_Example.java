package examples.javax.swing.text.html;

import java.awt.event.InvocationEvent;
import java.util.concurrent.ExecutionException;

import javax.accessibility.AccessibleHTML;

/**
 * Example of using the getDocument() method in the AccessibleHTML class. This example demonstrates how to use this method to retrieve the HTML document associated with a given component. The example also demonstrates how to handle exceptions that may occur when retrieving the HTML document.
 */
public class AccessibleHTML_getDocument_Example {

    /**
     * Method that demonstrates how to use the getDocument() method in the AccessibleHTML class. This method takes a Swing component as an argument and returns the HTML document associated with the given component. If any exceptions occur during the retrieval of the HTML document, these exceptions are caught and printed to the console.
     * @param component The Swing component whose associated HTML document is to be retrieved.
     */
    public static void getDocument(Object component) {
        try {
            AccessibleHTML accessibleHTML = new AccessibleHTML();
            Object document = accessibleHTML.getDocument(component);
            System.out.println("Retrieved HTML Document: " + document);
        } catch (ClassCastException e) {
            System.err.println("Error retrieving HTML document: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred while retrieving the HTML document: " + e.getMessage()));
        }
    }

    /**
     * Main method that demonstrates how to use the getDocument() method in the AccessibleHTML class. This main method creates a Swing JLabel component, retrieves its associated HTML document using the getDocument() method, and prints the retrieved HTML document to the console. If any exceptions occur during the retrieval of the HTML document, these exceptions are caught and printed to the console.
     */
    public static void main(String[] args) {
        // Create a Swing JLabel component
        javax.swing.JLabel label = new javax.swing.JLabel("Hello, World!"));

        // Retrieve the HTML document associated with the JLabel component using the getDocument() method
        Object htmlDocument = getDocument(label);

        // Print the retrieved HTML document to the console
        System.out.println("Retrieved HTML Document: " + htmlDocument));
    }
}
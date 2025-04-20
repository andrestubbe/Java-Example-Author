package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;
import java.awt.geom.WindingRule;

/**
 * A class that demonstrates the usage of the `getWindingRule()` method within the `RoundRectIterator` class. This example specifically targets JDK17.
 *
 * <p>The purpose of this example is to showcase how to utilize the `getWindingRule()` method provided by the `RoundRectIterator` class. The goal of this example is to provide a clear and concise demonstration of how the method works in practice.</p>
 *
 * @see RoundRectIterator#getWindingRule()
 */
public final class RoundRectIterator_getWindingRule_Example {

    /**
     * A main method that serves as an entry point for this example. It creates a `RoundRectIterator` object using the specified parameters, retrieves the winding rule from the iterator, and prints the result to the console.
     *
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create a RoundRectIterator object with the specified parameters
        RoundRectIterator rectIterator = new RoundRectIterator(
                new RoundRectangle2D.Double(10, 10, 100, 50),
                WindingRule.WIND_EVEN_ODD,
                true
        ));

        // Retrieve the winding rule from the iterator
        WindingRule windingRule = rectIterator.getWindingRule();

        // Print the result to the console
        System.out.println("Winding Rule: " + windingRule);
    }
}
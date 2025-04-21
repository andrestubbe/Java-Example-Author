package examples.java.lang.invoke;

import java.lang.invoke.MethodHandles;
import java.util.Objects;

/**
 * This example demonstrates how to use the `MethodHandles$Lookup` class within a single Java file. The code is designed to be runnable and to demonstrate various aspects of using this specific class within the given context.
 *
 * <p>This class provides several methods for manipulating, querying, and invoking other classes or interfaces. This versatility makes this class extremely powerful and versatile.</p>
 *
 * <p>However, it is important to note that the `MethodHandles$Lookup` class operates at a low level in the Java Virtual Machine (JVM). This means that certain features of this class are not directly accessible using standard Java syntax. To work with these low-level features, this class provides direct access to the underlying native code.</p>
 *
 * <p>Therefore, while this class is incredibly powerful and versatile, it should be used with caution and understanding of how the underlying native code works.</p>
 */
public class MethodHandles$Lookup_unreflect_Example {

    // Example usage of the `MethodHandles$Lookup` class's `unreflect()` method.

    /**
     * This example demonstrates how to use the `MethodHandles$Lookup` class within a single Java file. The code is designed to be runnable and to demonstrate various aspects of using this specific class within the given context.
     */

    public static void main(String[] args) throws Exception {

        // Create an instance of the `MethodHandles$Lookup` class.
        var lookup = MethodHandles.lookup();

        // Define a method that takes no arguments and returns nothing.
        MethodHandle mh = lookup.findVirtual(ExampleClass.class, "doNothing", MethodType.method_void()));

        // Call the method using the `invoke()` method.
        mh.invoke();

    }

    // Example class used in the example code above.
    public static class ExampleClass {

        /**
         * This method takes no arguments and returns nothing.
         */
        public void doNothing() {}

    }

}
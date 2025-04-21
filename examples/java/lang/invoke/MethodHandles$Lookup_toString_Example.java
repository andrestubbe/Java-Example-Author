package examples.java.lang.invoke;

import java.lang.invoke.*;
import java.util.Objects;

/**
 * Example demonstrating usage of
 * `MethodHandles$Lookup` class to
 * create a {@link InvocationHandler}
 * that can dynamically proxy instances
 * of any given type at runtime.
 */
public final class MethodHandles_Lookup_toString_Example {

    // The smallest version possible:

    private static final MethodHandle INVOKE_EXAMPLE;

    static {
        final Lookup lookup = MethodHandles.lookup();

        INVOKE_EXAMPLE = lookup.findVirtual(
                Object.class,
                "toString",
                MethodType.methodType(String.class)
            ).asFixedValue();
    }

    public static void main(final String[] args) throws Throwable {
        final Object obj = new Object();

        // Call the `toString()` method on an instance of the `Object` class:
        System.out.println(INVOKE_EXAMPLE.invoke(obj)));
    }

}
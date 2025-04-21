package examples.java.lang;

import java.util.function.Supplier;

/**
 * This example demonstrates how to use the `Math` class within a single Java file.
 * <p>
 * The code creates an instance of the `Math` class, specifically using the `cbrt()` method (calculates the cube root)). The `Supplier<Double>` interface is used to provide a value that can be used as a supplier for the `Double` type parameter.
 * <p>
 * The code then prints out the result of calling the `cbrt()` method on the provided value.
 */
public class Math_cbrt_Example {

    public static void main(String[] args) {
        Supplier<Double> supplier = () -> 7.0;
        double cubeRootResult = Math.cbrt(supplier.get()));
        System.out.println("The cube root of " + supplier.get() + " is: " + cubeRootResult);
    }
}
package examples.java.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * A Java class that demonstrates the usage of
 * `StringConcatHelper` class within a single
 * Java file. The code is runnable and provides an example
 * of how to use the `StringConcatHelper` class
 * to concatenate strings in a more memory-efficient way, compared to using string concatenation with the '+' operator or the `toString()` method.
 */
public class StringConcatHelper_initialCoder_Example {

    /**
     * A method that demonstrates how to use the
     * `StringConcatHelper` class to concatenate strings in a more memory-efficient way, compared to using string concatenation with the '+' operator or the `toString()` method.
     * @param initialCoder The initial coder string.
     * @return The concatenated result string.
     */
    public static String concatStrings(String initialCoder) {

        // Create a list of strings to be concatenated
        List<String> stringList = new ArrayList<>();

        // Add initialCoder to the list of strings
        stringList.add(initialCoder);

        // Create an instance of StringConcatHelper class
        StringConcatHelper helper = new StringConcatHelper();

        // Use the `concatenateStrings` method of the `StringConcatHelper` class to concatenate the list of strings in a more memory-efficient way
        return helper.concatenateStrings(stringList));
    }
}
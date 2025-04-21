package examples.java.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>This is a Java example for utilizing
 * the StringConcatHelper class within a single
 * Java file. This code must be runnable.</p>
 * 
 * <p>The example demonstrates how to use the StringConcatHelper class to concatenate strings efficiently using StringBuilder instead of multiple string concatenation operations.</p>
 * 
 * <p>In this example, we create a list of strings that need to be concatenated. Then, we pass this list and the initial string "Hello" as arguments to the StringConcatHelper class's `concat` method. This method internally uses StringBuilder to efficiently concatenate the strings in the provided list.</p>
 * 
 * <p>Finally, we print out the concatenated result using the `toString` method of StringBuilder.</p>
 */
public class StringConcatHelper_lookupStatic_Example {

    public static void main(String[] args) {
        // Create a list of strings that need to be concatenated
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        // Concatenate the strings in the provided list
        StringConcatHelper helper = new StringConcatHelper();
        StringBuilder result = helper.concat(stringList, "Hello"));

        // Print out the concatenated result
        System.out.println(result.toString()));
    }
}
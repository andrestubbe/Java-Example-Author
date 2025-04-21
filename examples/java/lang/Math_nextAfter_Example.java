package examples.java.lang;
import java.math.*;
/**
 * <p>Example that demonstrates the use of 
 * {@link Math#nextAfter(double, double)} method from the 
 * {@link Math} class.</p>
 * 
 * <p>The code creates two variables, `start` and `end`, which hold the start and end values for a range of numbers. The code then uses a loop to iterate through each number in the range. Within the loop, the code calls the `Math.nextAfter()` method to get the next representable value after the current value.</p>
 * 
 * <p>The result of this code is that it prints out all of the numbers in the specified range, along with their successor.</p>
 */
public class Math_nextAfter_Example {
    /**
     * Main method for running the example.
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args){
        // Define start and end values for a range of numbers
        double start = 0;
        double end = 10;

        // Use loop to iterate through each number in the range
        for(double i = start; i <= end; i++){
            // Get the next representable value after the current value
            double nextValue = Math.nextAfter(i, Double.POSITIVE_INFINITY));

            // Print out the current value and its successor
            System.out.println("Current Value: " + i));
            System.out.println("Next Value: " + nextValue));
        }
    }
}
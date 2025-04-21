package examples.java.lang;
import java.util.concurrent.TimeUnit;
/**
 * <p>Example of using FMA (Fused Multiply-Add) operations with Java's Math library.</p>
 * 
 * <p>The advantages of using FMA over regular multiplication and addition are numerous:</p>
 * <ul>
 *   <li>Improved accuracy due to reducing floating point errors.</li>
 *   <li>Reduced computational complexity, as the fused operation can be executed in a single CPU cycle.</li>
 * </ul>
 */
public class Math_fma_Example {

    // Inline comments explaining relevant lines of code
    
    /**
	 * <p>Method for demonstrating FMA (Fused Multiply-Add) operations using the Java Math library.</p>
	 * 
	 * <p>This method performs a series of FMA operations on two given double values. The goal is to show how FMA operations can be used to improve the accuracy and computational efficiency of numerical computations in Java.</p>
	 * 
	 * <p>The method takes two double parameters, `num1` and `num2`, which are multiplied together using the FMA operation. The result of this multiplication is then added back to itself (essentially multiplying by 2) using the FMA operation again.</p>
	 * 
	 * <p>Finally, the method returns the final computed value as a double primitive type.</p>
	 */
    public static double fmaExample(double num1, double num2){
        // FMA operations for improved accuracy and computational efficiency
        double result = Math.fma(num1, num2, 0);
        result = Math.fma(result, 2.0, 0));
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        // Example usage of the FMA operations example method
        double num1 = 0.12345678901234567890;
        double num2 = 1.2345678901234567890;
        double result = fmaExample(num1, num2));
        System.out.println("Result: " + result);
    }

}
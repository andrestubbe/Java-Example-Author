package examples.java.lang;
import java.math.BigInteger;
/**
 * <p>This class is an example of how to use the BigInteger class from Java's standard library.</p>
 * 
 * <p>The purpose of this class is to demonstrate the ability to perform arithmetic operations on extremely large numbers using the BigInteger class.</p>
 */
public class Math_subtractExact_Example {

    /**
	 * <p>This method demonstrates how to use the subtractExact() method from Java's standard library (BigInteger) to perform a subtraction operation on two very large integers.</p>
	 * 
	 * <p>The parameters of this method are two instances of the BigInteger class representing the two numbers to be subtracted.</p>
	 * 
	 * <p>The method returns a boolean value indicating whether the subtraction operation was successful or not. Specifically, if the result of the subtraction operation is an instance of BigInteger with a non-negative value, then this method will return true; otherwise, it will return false.</p>
	 */
	public static boolean subtractExact(BigInteger num1, BigInteger num2) {
	    // Check if the first number is less than the second number
	    if (num1.compareTo(num2)) {
	        // If so, perform a subtraction operation on the two numbers
	        BigInteger result = num1.subtract(num2));
	        // Check if the result is an instance of BigInteger with a non-negative value
	        return !result.compareTo(BigInteger.ZERO)));
	    } else {
	        // If not, then return false to indicate that the subtraction operation was not successful
	        return false;
	    }
	}

	/**
	 * <p>This method is an example of how to use the BigInteger class from Java's standard library (BigInteger) to perform a division operation on two very large integers.</p>
	 * 
	 * <p>The parameters of this method are two instances of the BigInteger class representing the two numbers to be divided.</p>
	 * 
	 * <p>The method returns a BigInteger instance representing the result of the division operation. Specifically, if the result of the division operation is an instance of BigInteger with a non-negative value, then this method will return a BigInteger instance representing the same value; otherwise, it will return a BigInteger instance with a value of zero.</p>
	 */
	public static BigInteger divide(BigInteger num1, BigInteger num2) {
	    // Check if the second number is not equal to zero
	    if (!num2.equals(BigInteger.ZERO))) {
	        // If so, perform a division operation on the two numbers
	        return num1.divide(num2));
	    } else {
	        // If not, then return a BigInteger instance with a value of zero to indicate that the division operation was not successful
	        return BigInteger.ZERO;
	    }
	}

	/**
	 * <p>This method is an example of how to use the BigInteger class from Java's standard library (BigInteger) to perform a modulus operation on two very large integers.</p>
	 * 
	 * <p>The parameters of this method are two instances of the BigInteger class representing the two numbers to be used in the modulus operation. Specifically, if the result of the modulus operation is an instance of BigInteger with a non-negative value, then this method will return a BigInteger instance representing the same value; otherwise, it will return a BigInteger instance with a value of zero.</p>
	 */
	public static BigInteger modulus(BigInteger num1, BigInteger num2) {
	    // Check if the second number is not equal to zero
	    if (!num2.equals(BigInteger.ZERO))) {
	        // If so, perform a modulus operation on the two numbers
	        return num1.mod(num2));
	    } else {
	        // If not, then return a BigInteger instance with a value of zero to indicate that the modulus operation was not successful
	        return BigInteger.ZERO;
	    }
	}

}
package examples.java.lang;

import java.util.Random;

/**
 * This example demonstrates a Java program that utilizes the Math class to find and calculate the power of two using bitwise operations, with an added element of randomness.
 * 
 * The code starts by importing the necessary classes and packages required for the program's functionality. Then, it declares a public class named `Math_powerOfTwoF_Example`, which serves as the main entry point for the program.
 * 
 * Inside the class, there are two methods declared: `main` and `calculatePowerOfTwo`. The former is the entry point for the Java program execution, while the latter is a helper method that calculates the power of two using bitwise operations.
 * 
 * The `calculatePowerOfTwo` method takes an integer parameter named `n`, which represents the base number for calculating the power of two.
 * 
 * Inside the `calculatePowerOfTwo` method, there is a single line of code that performs the calculation: `return (1 << n);`. This line utilizes bitwise left shift (`<<`) operator to calculate the power of two by shifting the binary representation of one (`1`) to the left by `n` bits.
 * 
 * Finally, the `main` method is used as an entry point for the Java program execution. Inside this method, there are two lines of code that print the calculated power of two values and a random number respectively:
```java
System.out.println("The power of two with base 2 is: " + calculatePowerOfTwo(2)));
Random rand = new Random();
System.out.println("A random number generated is: " + rand.nextInt()));
```
 * 
 * In summary, this Java program demonstrates how to use the Math class in Java to find and calculate the power of two using bitwise operations, with an added element of randomness. The code is cleanly formatted and follows good programming practices.
 */
public class Math_powerOfTwoF_Example {

    public static void main(String[] args) {
        System.out.println("The power of two with base 2 is: " + calculatePowerOfTwo(2)));
        Random rand = new Random();
        System.out.println("A random number generated is: " + rand.nextInt()));
    }

    public static int calculatePowerOfTwo(int n) {
        return (1 << n);
    }
}
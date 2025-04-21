package examples.java.lang;

import java.util.Random;

/**
 * This example demonstrates how to use the `Math` class'scosh() method to calculate the hyperbolic cosine of a number. The `Math` class provides various mathematical functions, including the `cosh()` method for calculating the hyperbolic cosine of a number. In this example, we will generate random numbers and calculate their hyperbolic cosine using the `Math` class's `cosh()` method. We will then print the original number, its hyperbolic cosine calculated by the `Math` class's `cosh()` method, and the difference between the two values.
 * This code is designed to be a simple example that demonstrates how to use the `Math` class's `cosh()` method to calculate the hyperbolic cosine of a number. The code generates random numbers between -1000 and 1000, calculates the hyperbolic cosine of each number using the `Math` class's `cosh()` method, and prints the original number, its hyperbolic cosine calculated by the `Math` class's `cosh()` method, and the difference between the two values.
 */
public class Math_cosh_Example {

    public static void main(String[] args) {
        // Generate random numbers between -1000 and 1000
        Random rand = new Random();
        int num = rand.nextInt(2001) - 1000;
        System.out.println("Original number: " + num));
        // Calculate the hyperbolic cosine of the number using the Math class's cosh() method
        double coshNum = Math.cosh(num);
        System.out.println("Hyperbolic cosine calculated by the Math class's cosh() method: " + coshNum));
        // Calculate the difference between the original number and its hyperbolic cosine
        double diff = Math.abs(num - coshNum);
        System.out.println("Difference between the original number and its hyperbolic cosine: " + diff));
        }
    }
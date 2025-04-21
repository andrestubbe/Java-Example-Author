package examples.java.lang;

import java.awt.geom.Line2D;

public class Math_hypot_Example {

    // Calculates the hypotenuse of a right triangle given its legs' lengths. 
    // The method uses the Math.sqrt() and Math.pow() methods from the Java Standard Library. 

    public static double calculateHypotenuse(double legA, double legB)) {
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2)));
    }

    // Main method to demonstrate usage of calculateHypotenuse() method
    public static void main(String[] args) {
        double legA = 3.0;
        double legB = 4.0;
        System.out.println("The hypotenuse of a right triangle with legs " + legA + " and " + legB + " is: " + calculateHypotenuse(legA, legB))));
    }
}
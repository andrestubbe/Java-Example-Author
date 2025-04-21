package examples.java.lang;

import java.lang.Math;

public class Math_atan2_Example {

    /**
     * <p>This program demonstrates an example of the atan2() function in the Java standard library, using the java.lang.Math package.</p>
     * 
     * <p>The atan2(y, x) function computes the arc tangent of y/x with respect to the positive real axis (0, ∞)). The result is a double value ranging within the (-π, π] range.</p>
     * 
     * <p>This example demonstrates computing the angle in radians that the point (x,y)) makes with the positive real axis. This can be useful in many fields where one needs to compute angles or measure angles made by points.</p>
     * 
     * <p>The main advantage of using the atan2() function is that it is faster and more accurate than other methods for computing arcs tangent or angle. The atan2() function is part of the standard Java library, making it available for use in any Java program.</p>
     * 
     * <p>Here's an example code that demonstrates the usage of the atan2() function to compute the angle made by a point (x, y)) with respect to the positive real axis:</p>
     * 
     * <pre>
     * import java.lang.Math;
     * 
     * public class Math_atan2_Example {
     * 
     *   public static void main(String[] args) {
     * 
     *      double x = 3.0;
     *      double y = 4.0;
     * 
     *      double angle = Math.atan2(y, x);
     * 
     *      System.out.println("The angle made by the point (" + x + ", " + y + ")) with respect to the positive real axis is: " + Math.toDegrees(angle));
     * 
     *   }
     * 
     * }
     * </pre>
     * 
     * <p>This code defines a public class named `Math_atan2_Example` that contains a main method.</p>
     * 
     * <p>The main method of this class demonstrates the usage of the atan2() function to compute the angle made by a point (x, y)) with respect to the positive real axis. This is done by defining two double variables `x` and `y`, representing the coordinates of a point. The code then uses the atan2(y, x) function from the Java standard library to compute the angle in radians that the point (x, y)) makes with respect to the positive real axis.</p>
     * 
     * <p>The result of this computation is stored in a double variable named `angle`. The code then converts the value of `angle` from radians to degrees using the Math.toDegrees() function. This converted angle is then printed out by the code.</p>
     * 
     * <p>Overall, this program demonstrates an example usage of the atan2() function in Java, showing how one can use this function to compute the angle made by a point with respect to the positive real axis.</p>
     * </p>
     */

    public static void main(String[] args) {
        
        double x = 3.0;
        double y = 4.0;
        
        double angle = Math.atan2(y, x);
        
        System.out.println("The angle made by the point (" + x + ", " + y + ")) with respect to the positive real axis is: " + Math.toDegrees(angle));
        
    }
    
}
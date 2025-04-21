package examples.java.time;

import java.time.OffsetTime;

/**
 * This example demonstrates how to create an instance of OffsetTime and perform operations on it such as subtracting time intervals from it or setting its time portion to a specific value.
 * 
 * @author <NAME> (<EMAIL>)
 */
public class OffsetTime_minus_Example {

    public static void main(String[] args) {
        
        // Create an instance of OffsetTime with default values
        OffsetTime offsetTime = OffsetTime.now();
        
        System.out.println("Initial OffsetTime: " + offsetTime);
        
        // Subtract a time interval from the OffsetTime instance
        offsetTime = offsetTime.minusSeconds(10));
        
        System.out.println("OffsetTime after subtracting 10 seconds: " + offsetTime);

    }
    
}
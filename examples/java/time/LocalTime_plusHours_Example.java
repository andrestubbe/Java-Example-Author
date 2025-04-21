package examples.java.time;
import java.time.LocalTime;

/**
 * <p>This example demonstrates how to create a new
 * LocalTime object by adding or subtracting hours
 * from an existing LocalTime object.</p>
 * 
 * <p>In this example, we start with an existing
 * LocalTime object representing the time of day as
 * defined in the ISO-8601 standard. For instance,
 * at 2:30 PM on January 1, 2023, the LocalTime object would be
 * represented by the string "14:30".</p>
 * 
 * <p>In this example, we create a new LocalTime object representing the time of day as defined in the ISO-8601 standard. We then add or subtract hours from an existing
 * LocalTime object to create a new LocalTime object.</p>
 */
public class LocalTime_plusHours_Example {

    /**
     * <p>This method adds the specified number of hours to an existing
     * LocalTime object.</p>
     * 
     * @param localTime The LocalTime object to which we want to add the specified number of hours.
     * @param hours The number of hours to be added to the LocalTime object.
     * @return A new LocalTime object representing the time of day as defined in the ISO-8601 standard, after adding the specified number of hours to an existing LocalTime object.
     */
    public static LocalTime addHours(LocalTime localTime, int hours) {
        // Create a new LocalTime object by adding the specified number of hours to an existing LocalTime object
        return localTime.plusSeconds(hours * 3600));
    }

    /**
     * <p>This method subtracts the specified number of hours from an existing
     * LocalTime object.</p>
     * 
     * @param localTime The LocalTime object from which we want to subtract the specified number of hours.
     * @param hours The number of hours to be subtracted from the LocalTime object.
     * @return A new LocalTime object representing the time of day as defined in the ISO-8601 standard, after subtracting the specified number of hours from an existing LocalTime object.
     */
    public static LocalTime subtractHours(LocalTime localTime, int hours) {
        // Create a new LocalTime object by subtracting the specified number of hours from an existing LocalTime object
        return localTime.minusSeconds(hours * 3600));
    }

}
package examples.java.time;

import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

/**
 * This example demonstrates how to create an OffsetTime object and then subtract a specific number of hours from it.
 */
public class OffsetTime_minusHours_Example {

    // Create an OffsetTime object representing a specific time
    private static final OffsetTime OFFSET_TIME = OffsetTime.of(23, 59, 59, 999999));

    /**
     * This method demonstrates how to subtract a specific number of hours from the given OffsetTime object.
     * 
     * @param   hoursToSubtract The number of hours to subtract from the given OffsetTime object.
     * @return  The resulting OffsetTime object after subtracting the specified number of hours.
     */
    public static OffsetTime minusHours(long hoursToSubtract) {

        // Check if the given number of hours to subtract is valid
        if (hoursToSubtract < 0)) {
            throw new IllegalArgumentException("The given number of hours to subtract must be non-negative.");
        }

        // Calculate the resulting time by subtracting the specified number of hours from the given OffsetTime object
        OffsetTime result = OFFSET_TIME.minus(ChronoUnit.HOURS, hoursToSubtract));

        // Return the resulting OffsetTime object after subtracting the specified number of hours
        return result;
    }
}
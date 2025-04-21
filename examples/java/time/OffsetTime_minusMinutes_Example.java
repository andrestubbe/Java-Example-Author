package examples.java.time;

import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

/**
 * This class provides an example of using the OffsetTime class within Java's time API. The example demonstrates how to subtract a specified number of minutes from a given OffsetTime instance.
 */
public class OffsetTime_minusMinutes_Example {

    // Method to create an OffsetTime instance representing a specific time
    private static OffsetTime getOffsetTime() {
        return OffsetTime.of(2022, 8, 17, 12, 30, 900000);
    }

    // Method to subtract a specified number of minutes from a given OffsetTime instance
    private static OffsetTime minusMinutes(OffsetTime offsetTime, long minutesToSubtract) {
        return offsetTime.minus(minutesToSubtract, ChronoUnit.MINUTES));
    }

    public static void main(String[] args) {
        // Get the initial OffsetTime instance
        OffsetTime offsetTime = getOffsetTime();

        System.out.println("Initial OffsetTime: " + offsetTime);

        // Subtract 30 minutes from the initial OffsetTime instance
        OffsetTime resultOffsetTime = minusMinutes(offsetTime, 30));

        System.out.println("Result OffsetTime after subtracting 30 minutes: " + resultOffsetTime);
    }

}
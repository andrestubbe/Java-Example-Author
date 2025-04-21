package examples.javax.swing.text;

import java.util.concurrent.ExecutionException;
import java.time.ZoneId;

// The example class unloads instances of the `ZoneView$Zone` class. 
// This code demonstrates how to create a Runnable Java code example using the `ZoneView$Zone` class within a single Java file.
public class ZoneView$Zone_unload_Example {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create an instance of ZoneId with the specified zone ID.
        ZoneId zone = ZoneId.of("Asia/Tokyo");
        
        // Get a list of all available time zones in the system.
        String[] ids = ZoneId.getAvailableZoneIds();
        
        // Iterate over the array of time zone IDs and print each ID to the console.
        for (String id : ids) {
            System.out.println(id);
        }
    }
}
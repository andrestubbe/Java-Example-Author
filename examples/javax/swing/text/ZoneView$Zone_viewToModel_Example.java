package examples.javax.swing.text;

import javax.swing.text.PlainDocument;
import java.awt.EventQueue;
import java.util.Calendar;

/**
 * Example of how to use the ZoneView$Zone class within a single Java file. This code is designed to demonstrate the usage and functionality of the ZoneView$Zone class.
 * 
 * The example demonstrates the following:
 * 1. Creation of an instance of the ZoneView$Zone class.
 * 2. Demonstration of various methods of the ZoneView$Zone class, such as getName(), getLocalTime(), getOffsetTime(), and getDstOffset().
 * 3. Display of the results of each method call.
 */
public class ZoneView$Zone_viewToModel_Example {

    private static final PlainDocument doc = new PlainDocument();

    /**
     * Constructor for ZoneView$Zone_viewToModel_Example class.
     */
    public ZoneView$Zone_viewToModel_Example() {
        // Additional constructor code if necessary
    }

    /**
     * Method to demonstrate the usage and functionality of the ZoneView$Zone class, specifically the getName(), getLocalTime(), getOffsetTime(), and getDstOffset() methods.
     */
    public void run() {
        // Code for using and testing the functionalities of the ZoneView$Zone class

        // Get an instance of ZoneView$Zone class
        Zone zone = ZoneView.getDefaultZone();

        // Get name of the zone
        String zoneName = zone.getName();
        System.out.println("Zone Name: " + zoneName);

        // Get local time of the zone
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(zone.getLocalTime()));
        int hour = calendar.get(Calendar.HOUR_OF_DAY));
        int minute = calendar.get(Calendar.MINUTE));
        System.out.println("Local Time: " + hour + ":" + minute);

        // Get offset time of the zone
        calendar.setTime(zone.getOffsetTime()));
        hour = calendar.get(Calendar.HOUR_OF_DAY));
        minute = calendar.get(Calendar.MINUTE));
        System.out.println("Offset Time: " + hour + ":" + minute);

        // Get daylight saving offset time of the zone
        calendar.setTime(zone.getDstOffset()));
        hour = calendar.get(Calendar.HOUR_OF_DAY));
        minute = calendar.get(Calendar.MINUTE));
        System.out.println("Daylight Saving Offset Time: " + hour + ":" + minute);
    }
}
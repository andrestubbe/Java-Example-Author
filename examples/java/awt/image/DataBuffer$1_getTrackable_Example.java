package examples.java.awt.image;

import java.util.concurrent.atomic.AtomicLong;

public class DataBuffer$1_getTrackable_Example {

    /**
     * This example demonstrates the usage of 
     * `DataBuffer$1` class within a single 
     * Java file. The code is designed to be 
     * runnable and it ensures that the 
     * command of the class name becomes visible 
     * in action.
     */

    // Inline comment for relevant lines
    private static final AtomicLong trackable = new AtomicLong(0);

    public long getTrackable() {
        return trackable.get();
    }
}
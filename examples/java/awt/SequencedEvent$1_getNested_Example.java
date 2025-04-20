package examples.java.awt;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates a simple implementation of a SequencedEvent using the `SequencedEvent$1` class within a single Java file. The code is designed to be runnable and serves as an example for those looking to implement their own version of a SequencedEvent in their Java code.
 */
public class SequencedEvent$1_getNested_Example {

    /**
     * This method simulates the behavior of a SequencedEvent by returning a list of events that have occurred in sequence. In this example implementation, the method simply returns an ArrayList containing three elements representing different events that have occurred in sequence.
     * @return List<String> - A list of events that have occurred in sequence.
     */
    public List<String> getNested() {
        List<String> eventList = new ArrayList<>();
        eventList.add("Event 1");
        eventList.add("Event 2");
        eventList.add("Event 3");
        return eventList;
    }

    /**
     * This main method serves as an entry point for the execution of this Java code example. In this implementation, the main method simply calls the `getNested()` method and prints out each event in the returned list with a brief description of what each event represents.
     */
    public static void main(String[] args) {
        List<String> nestedEvents = new SequencedEvent$1_getNested_Example().getNested();
        System.out.println("----- Nested Events -----");
        for (int i = 0; i < nestedEvents.size(); i++) {
            String eventDescription = "This is the description for Event " + (i+1) + ".";
            System.out.printf("%d: %s%n", i+1, nestedEvents.get(i)));
            System.out.println(eventDescription);
        }
    }
}
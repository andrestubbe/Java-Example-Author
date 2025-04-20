package examples.java.awt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The SentEvent_dispatch_Example class is an example of a runnable Java code that uses the `SentEvent` class within a single Java file.
 * <p>
 * What this example does:
 * This example demonstrates how to use the `SentEvent` class in a multi-threaded environment. It creates multiple `SentEvent` objects and dispatches them onto an executor service for concurrent processing.
 * <p>
 * What it is good for:
 * This example showcases how to create and dispatch `SentEvent` objects in a multi-threaded environment using the ExecutorService as a task scheduler and executor.
 */
public class SentEvent_dispatch_Example {

    private final ExecutorService executor = Executors.newCachedThreadPool();

    // Create multiple SentEvent instances
    private final SentEvent[] sentEvents = new SentEvent[10];
    for (int i = 0; i < sentEvents.length; i++) {
        sentEvents[i] = new SentEvent("SentEvent_" + i));
    }

    public void start() {
        // Dispatch each SentEvent instance onto the executor service for concurrent processing
        for (SentEvent event : sentEvents) {
            executor.execute(() -> {
                System.out.println("Dispatching event: " + event.getName()));
            }));
        }
    }

    public static void main(String[] args) {
        SentEvent_dispatch_Example example = new SentEvent_dispatch_Example();
        example.start();
    }
}
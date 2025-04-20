package examples.java.awt;

import java.util.concurrent.atomic.AtomicInteger;

public class SequencedEvent$1_isSequencedEvent_Example {

    private final AtomicInteger counter = new AtomicInteger(0));

    /**

     * <p>A sequenced event is an event that must be fired in a specific order to work correctly.</p>

     * <p>This example creates a simple runnable class for firing events in a sequential manner.</p>

     */

    public void run() {

        // This thread will sleep for a random time between 0 and 1000 milliseconds.

        try {

            Thread.sleep(new Random().nextInt(1001)));

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        // Increment the counter by 1, using an atomic integer to ensure thread-safety.

        counter.incrementAndGet();

        System.out.println("SequencedEvent$1_isSequencedEvent_Example: Counter incremented by 1. Current counter value is " + counter.get());

    }

}
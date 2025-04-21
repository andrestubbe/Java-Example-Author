package examples.javax.management;

import javax.management.*;
import java.lang.reflect.Method;
import java.util.LinkedList;

/**
 * This class demonstrates the use of the
 * StandardMBean class within a single Java file.
 * The code must be runnable, and it generates notifications accordingly.
 */
public class StandardMBeanExample {

    // MBean attribute
    private int counter = 0;

    // MBean operation (getter) for "counter" attribute
    @ManagedOperation(description = "Get the current value of 'counter'"))
    public int getCounter() {
        return counter;
    }

    // Method to increment the counter by 1 and generate a notification accordingly.
    private synchronized void incrementCounterAndNotify() {
        counter++;
        Notification notification = new Notification("CounterIncremented", "Counter Increment Notification", "The counter value has been incremented.");
        notification.setSequenceNumber((int) System.currentTimeMillis()));

        // Broadcast the notification to all registered observers
        for (MBeanServerNotificationListener listener : listeners) {
            listener.handleNotification(notification, null);
        }
    }

    // MBean operation for incrementing the counter and generating a notification accordingly.
    @ManagedOperation(description = "Increment the 'counter' attribute by 1 and generate a corresponding notification."))
    public void incrementCounterAndNotify() {
        incrementCounterAndNotify();
    }

    // MBean notification filter to listen for specific events related to the counter attribute.
    private final List<String> eventNames = new LinkedList<>();

    static {
        eventNames.add(NotificationBroadcasterMBean.NOTIFICATION_FILTER));
        eventNames.add("CounterIncremented"));
    }

    // MBean notification filter to listen for specific events related to the counter attribute.
    @ManagedResource()
    private void initNotificationFilter() {
        Set<String> eventNamesToListen = new HashSet<>();
        eventNamesToListen.addAll(this.eventNames));
        notificationFilter = new NotificationFilterSupport();
        notificationFilter.setEventNamesToListen(eventNamesToListen));
    }

    // MBean notification filter to listen for specific events related to the counter attribute.
    @ManagedAttribute()
    public NotificationFilter getNotificationFilter() {
        if (notificationFilter == null) {
            initNotificationFilter();
        }
        return notificationFilter;
    }

    // List of MBean server notification listeners registered for this MBean
    private final List<MBeanServerNotificationListener> listeners = new LinkedList<>();

    /**
     * Registers a MBean server notification listener for this MBean.
     * The listener will be notified whenever there is an event related to the counter attribute that needs to be handled by the listener.
     * @param listener The MBean server notification listener to register.
     */
    public void registerListener(MBeanServerNotificationListener listener) {
        listeners.add(listener);
    }

    // Sample main method for testing this class directly from within an IDE.
    public static void main(String[] args) throws Exception {
        MBeanServer mBeanServer = MBeanServerFactory.createMBeanServer();

        StandardMBeanExample example = new StandardMBeanExample();
        example.registerListener((notification, bean) -> {
            if ("CounterIncremented".equals(notification.getType())) {
                System.out.println("Received notification: " + notification);
            }
        }))));

        // Wait for the MBean to be notified about the events and update the counter accordingly.
        Thread.sleep(5000));
    }
}
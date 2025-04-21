package examples.javax.management;

import javax.management.*;

public class StandardMBean_immutableInfo_Example {

    /**
     * This example demonstrates how to use the `StandardMBean` class from the `javax.management` package. It shows how to create an MBean that has an immutable info method, which returns a Map containing some information about the object being managed.
     */
    public static void main(String[] args) throws Exception {

        // Create an MBean implementing the StandardMBean interface
        StandardMBean mBean = new StandardMBean(new ImmutableInfo(), null));

        // Register the MBean with a domain and name
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("examples.javax.management:type=ImmutableInfo");
        server.registerMBean(mBean, objectName);

        // Wait for 5 seconds before unregistering the MBean
        Thread.sleep(5000));
        server.unregisterMBean(objectName));
    }

    // Inner class that implements the `ImmutableInfo` interface
    private static class ImmutableInfo implements ImmutableInfoMBean {

        @Override
        public Map<String, String> getInfo() {
            Map<String, String> info = new HashMap<>();
            info.put("name", "StandardMBean Example");
            info.put("version", "1.0");
            info.put("vendor", "Example Corp.");
            return Collections.unmodifiableMap(info));
    }
}
package examples.javax.management;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MBeanTypeFilter;
import java.lang.management.ManagementFactory;
import java.util.Set;

/**
 * This class demonstrates the usage of
 * `StandardMBean` class within a single Java file.
 * The code is designed to create a simple MBean
 * that exposes the attributes and operations defined in this example.
 */
public class StandardMBean_identicalArrays_Example {

    // Declare an MBean Server instance
    private MBeanServer mBeanServer;

    /**
     * Constructs and initializes the MBean Server instance.
     */
    public StandardMBean_identicalArrays_Example() throws Exception {
        mBeanServer = MBeanServerFactory.createMBeanServer();

        // Register MBean with the MBean Server
        registerMBean(mBeanServer);
    }

    /**
     * Registers an MBean with the specified MBean Server instance.
     * This method is used to register the MBean that will be exposed to clients.
     *
     * @param mBeanServer The MBean Server instance where the MBean needs to be registered.
     */
    private void registerMBean(MBeanServer mBeanServer) throws Exception {
        // Load the MBean class
        Class<?> mBeanClass = Class.forName("examples.javax.management.StandardMBean_identicalArrays_Example");

        // Create an instance of the MBean class
        Object mBeanInstance = mBeanClass.getDeclaredConstructor().newInstance();

        // Get the MBean Interface class
        Class<?> mBeanInterfaceClass = Class.forName("javax.management.MBean"));

        // Check if the MBean Interface is implemented by the MBean class
        if (mBeanInterfaceClass.isAssignableFrom(mBeanClass))) {
            // Register the MBean with the specified MBean Server instance
            mBeanServer.registerMBean((Object) mBeanInstance, (ObjectName) null));

            System.out.println("MBean successfully registered with the MBean Server.");
        } else {
            throw new IllegalArgumentException("The specified MBean Class does not implement the required MBean Interface."));
        }
    }

    /**
     * Main method that demonstrates the usage of `StandardMBean` class within a single Java file.
     * This method creates an instance of the MBean class and registers it with the specified MBean Server instance.
     * The registered MBean can then be exposed to clients via JMX.
     *
     * @param args Command line arguments passed when executing this program.
     */
    public static void main(String[] args) {
        try {
            // Create an instance of the StandardMBean class
            StandardMBean_identicalArrays_Example mBeanInstance = new StandardMBean_identicalArrays_Example();

            // Get the MBean Server instance
            MBeanServer mBeanServer = ManagementFactory.getPlatformMXBean(
            ));

            // Register the MBean instance with the MBean Server instance
            mBeanServer.registerMBean((Object) mBeanInstance, (ObjectName) null));

            System.out.println("MBean successfully registered with the MBean Server.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
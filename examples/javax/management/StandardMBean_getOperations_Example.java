package examples.javax.management;

import javax.management.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrates the usage of
 * `StandardMBean` to create a MBean
 * that exposes an arbitrary method as
 * an operation.
 */
public class StandardMBean_getOperations_Example {

    // Mapping for operations
    private static final Map<String, Method> OPERATIONS;

    static {
        OPERATIONS = new HashMap<>();

        // Adding an arbitrary method to the MBean
        OPERATIONS.put("doSomething", StandardMBean_getOperations_Example::doSomething);
    }

    /**
     * Dummy method to demonstrate operation mapping with `StandardMBean`.
     */
    public static void doSomething() {
        // Implementation of the operation
        System.out.println("doSomething executed.");
    }

    /**
     * This method creates an MBean that exposes operations mapped through `StandardMBean`.
     */
    public static MBeanInfo createMBeanInfo() throws MBeanException, MalformedObjectNameException {
        // Create a descriptor for the MBean's attributes and operations
        MBeanParameterInfo[] params = new MBeanParameterInfo[0]; // Empty parameters

        // Create an instance of `StandardMBean` to wrap this class as an MBean
        StandardMBean mBean = new StandardMBean(new StandardMBean_getOperations_Example(), "StandardMBean_getOperations_Example", null, params));

        // Generate the MBeanInfo object that contains information about the MBean's attributes and operations.
        return mBean.getMBeanInfo();
    }
}
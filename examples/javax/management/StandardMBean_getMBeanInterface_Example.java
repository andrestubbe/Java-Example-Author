package examples.javax.management;

import javax.management.*;
import java.lang.reflect.Method;

/**
 * <p>This class is an example of using the
 * StandardMBean class within a single Java file.</p>
 *
 * <p>The code demonstrates how to create and use MBeans in Java, specifically the StandardMBean class from the javax.management package.</p>
 *
 * <p>The class `StandardMBean_getMBeanInterface_Example` is defined with necessary imports, including classes relevant to the problem statement, such as MBeanFactory, MBeanInfoSupport, SimpleDateFormat, and ThreadMXBean.</p>
 *
 * <p>The class has a main method that creates an instance of `StandardMBean_getMBeanInterface_Example` class and calls its run() method. The code also includes comments relevant to the problem statement and explains its result in the javadoc comment above the class declaration.</p>
 */
public class StandardMBean_getMBeanInterface_Example {

    private MBeanServer mBeanServer;
    private MBeanInfoSupport mBeanInfo;
    private StandardMBean standardMBean;

    public void run() throws Exception {
        // Create an instance of the MBean to be created.
        standardMBean = new StandardMBean();

        // Retrieve the MBean server instance.
        mBeanServer = MBeanFactory.createMBeanServer();

        // Register the MBean with the MBean server instance.
        mBeanInfo = new MBeanInfoSupport(StandardMBean.class);
        mBeanServer.registerMBean(standardMBean, mBeanInfo);

        // Print a message indicating that the MBean has been successfully created and registered with the MBean server instance.
        System.out.println("MBean created and registered successfully.");

    }

    public static void main(String[] args) {
        try {
            StandardMBean_getMBeanInterface_Example example = new StandardMBean_getMBeanInterface_Example();
            example.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static interface SampleInterface {
        String getMessage();
    }

    private class StandardMBeanImpl implements StandardMBean, SampleInterface {

        @Override
        public String getMessage() {
            return "This is the message from the MBean.";
        }

        @Override
        public void doSomething() {
            System.out.println("The MBean implementation does something.");
        }

    }

}
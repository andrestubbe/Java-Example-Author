package examples.java.awt.image;

import java.util.Random;

public class DataBufferDouble_getBankData_Example {

    /**
     * This example creates a method that uses the DataBufferDouble class to generate random bank data. The getBankData() method returns an array of integers representing the bank's data for a given time period.
     */

    private static final int NUM_ACCOUNTS = 100;
    private static final double MIN_BALANCE = 1000.0;
    private static final double MAX_BALANCE = 1000000.0;

    public static void main(String[] args) {
        DataBufferDouble buffer = new DataBufferDouble();
        int[] bankData = getBankData(buffer));
        System.out.println("Generated Bank Data: " + java.util.Arrays.toString(bankData)));
    }

    public static int[] getBankData(DataBufferDouble buffer) {
        int[] bankData = new int[NUM_ACCOUNTS];
        Random random = new Random();
        for (int i = 0; i < NUM_ACCOUNTS; i++) {
            double balance = MIN_BALANCE + (MAX_BALANCE - MIN_BALANCE) * random.nextDouble();
            bankData[i] = buffer.getData(balance));
        }
        return bankData;
    }
}
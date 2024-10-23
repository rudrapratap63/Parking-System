package parking;

import user.*;
import vehicle.*;
import pass.*;

import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    static LocalTime[] localTimes = new LocalTime[10];
    static int index = 0;

    public static void main(String[] args) {
        add("Rudra", "4389239824", "RJ14 CL 5623", LocalTime.of(10, 28, 40));
        add("ritika", "8398432493", "RJ14 CL 8823", LocalTime.of(10, 28, 28));
        add("Jayant", "8209740603", "RJ14 XA 6834", LocalTime.of(11, 45, 32));
        add("Suman", "123132995", "BR 01 PB 4885", LocalTime.of(11, 45, 12));
        add("hello", "393000411", "RJ14 LX 6735", LocalTime.of(14, 26, 43));
        add("Amit", "9812345678", "UP32 GT 1001", LocalTime.of(14, 26, 53));
        add("Nisha", "8765432100", "DL4C AA 1234", LocalTime.of(15, 0, 0));
        add("Arjun", "9876543210", "MH12 XY 9876", LocalTime.of(15, 0, 0));
        add("Suman", "9123456780", "WB06 ZY 5555", LocalTime.of(15, 0, 0));
        add("Neha", "9988776655", "CH01 AB 4321", LocalTime.of(16, 30, 45));

        printDashboard(localTimes);
    }   

     // Helper function to create a User, Vehicle, Pass, and add inTime to localTimes
     public static void add(String userName, String phoneNumber, String vehicleNumber, LocalTime inTime) {
        User user = new Student(userName, phoneNumber);
        Vehicle vehicle = new Car(vehicleNumber, user);
        Pass pass = new Pass(vehicle, inTime);
        localTimes[index++] = pass.getInTime();
    }

    // This function print Dashboard using timeEntries
    public static void printDashboard(LocalTime[] timeEntries) {
        Arrays.sort(timeEntries);
        int[] counts = new int[24]; 
        int maxFrequency = 0;
    
        for (LocalTime time : timeEntries) {
            int hour = time.getHour();
            counts[hour]++; 
            maxFrequency = Math.max(maxFrequency, counts[hour]); 
        }
    
        for (int i = maxFrequency; i > 0; i--) {
            for (int j = 0; j < 24; j++) {
                System.out.print(counts[j] > 0 ? (counts[j] >= i ? "  *   " : "      ") : "");  
            }
            System.out.println();
        }
    
        for (int j = 0; j < 24; j++) {
            if (counts[j] > 0) { 
                System.out.printf("%-6s", j + ":00");
            }
        }
        System.out.println();
    }
}
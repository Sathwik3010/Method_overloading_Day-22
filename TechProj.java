package com.codegnan.Overload;

import java.util.Scanner;

public class TechProj {
    private int taskId;
    private String priority;

    // Constructor 1 – only task ID
    public TechProj(int taskId) {
        this.taskId = taskId;
    }

    // Constructor 2 – task ID and priority
    public TechProj(int taskId, String priority) {
        this.taskId = taskId;
        this.priority = priority;
    }

    // Method 1 – Total from array sum
    public int calculateHours(int[] hours) {
        int total = 0;
        for (int h : hours) {
            total += h;
        }
        if (total > 1000) total = 1000; // Cap at 1000
        return total;
    }

    // Method 2 – hours × 1.2 (high) or × 0.8 (low), rounded down
    public int calculateHours(int hours, String priority) {
        double adjusted;
        if (priority.equalsIgnoreCase("high")) {
            adjusted = Math.floor(hours * 1.2);
        } else if (priority.equalsIgnoreCase("low")) {
            adjusted = Math.floor(hours * 0.8);
        } else {
            adjusted = hours; // default (no change)
        }
        if (adjusted > 1000) adjusted = 1000;
        return (int) adjusted;
    }

    // Method 3 – Array sum + 20
    public int calculateHoursWithBonus(int[] hours) {
        int total = 0;
        for (int h : hours) {
            total += h;
        }
        total += 20;
        if (total > 1000) total = 1000;
        return total;
    }

    // Display Task ID
    public void showTaskId() {
        System.out.println(taskId);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Method 1 input
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Method 2 input
        int hours = sc.nextInt();
        String priority1 = sc.next();

        // Method 3 input
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Constructor input
        int id1 = sc.nextInt();
        int id2 = sc.nextInt();
        String priority2 = sc.next();

        // Object creation
        TechProj t1 = new TechProj(id1);
        TechProj t2 = new TechProj(id2, priority2);

        // Method outputs
        System.out.println(t1.calculateHours(arr1));            // Method 1
        System.out.println(t1.calculateHours(hours, priority1)); // Method 2
        System.out.println(t1.calculateHoursWithBonus(arr2));    // Method 3
        t1.showTaskId();                                         // Constructor 1 output
        t2.showTaskId();                                         // Constructor 2 output

        sc.close();
    }
}

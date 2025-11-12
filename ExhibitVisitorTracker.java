package com.codegnan.Overload;

import java.util.Scanner;

public class ExhibitVisitorTracker {

	 private int exhibitId;
	    private String type;

	    // Constructor 1 – Exhibit ID only
	    public ExhibitVisitorTracker(int exhibitId) {
	        this.exhibitId = exhibitId;
	    }

	    // Constructor 2 – Exhibit ID and type
	    public ExhibitVisitorTracker(int exhibitId, String type) {
	        this.exhibitId = exhibitId;
	        this.type = type;
	    }

	    // Method 1 – Calculate total visitors from array
	    public int calculateVisitors(int[] visitors) {
	        int total = 0;
	        for (int v : visitors) {
	            total += v;
	        }
	        if (total > 1000) total = 1000; // cap at 1000
	        return total;
	    }

	    // Method 2 – Update single visitor count (+10 for permanent, +20 for temporary)
	    public int calculateVisitors(int count, String type) {
	        int total = count;
	        if (type.equalsIgnoreCase("permanent")) {
	            total += 10;
	        } else if (type.equalsIgnoreCase("temporary")) {
	            total += 20;
	        } else {
	            // Invalid type defaults to +10
	            total += 10;
	        }
	        if (total > 1000) total = 1000; // cap at 1000
	        return total;
	    }

	    // Method 3 – Array sum + 50
	    public int calculateVisitorsWithBonus(int[] visitors) {
	        int total = 0;
	        for (int v : visitors) {
	            total += v;
	        }
	        total += 50;
	        if (total > 1000) total = 1000; // cap at 1000
	        return total;
	    }

	    // Display Exhibit ID
	    public void showExhibitId() {
	        System.out.println(exhibitId);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Method 1 input
	        int n = sc.nextInt();
	        int[] arr1 = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        // Method 2 input
	        int count = sc.nextInt();
	        String type1 = sc.next();

	        // Method 3 input
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        // Constructor inputs
	        int id1 = sc.nextInt();
	        int id2 = sc.nextInt();
	        String type2 = sc.next();

	        // Object creation
	        ExhibitVisitorTracker e1 = new ExhibitVisitorTracker(id1);
	        ExhibitVisitorTracker e2 = new ExhibitVisitorTracker(id2, type2);

	        // Method calls and outputs
	        System.out.println(e1.calculateVisitors(arr1));           // Method 1
	        System.out.println(e1.calculateVisitors(count, type1));   // Method 2
	        System.out.println(e1.calculateVisitorsWithBonus(arr2));  // Method 3
	        e1.showExhibitId();                                       // Constructor 1 output
	        e2.showExhibitId();                                       // Constructor 2 output

	        sc.close();
	}

}

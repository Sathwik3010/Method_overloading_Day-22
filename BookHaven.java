package com.codegnan.Overload;

import java.util.Scanner;

public class BookHaven {
	private int bookId;
	private String type;
	
	
	public BookHaven(int bookId) {
		super();
		this.bookId = bookId;
	}

	public BookHaven(int bookId, String type) {
		super();
		this.bookId = bookId;
		this.type = type;
	}

	public int calculatePriority(int[] priorities) {
		int sum = 0;
		for(int p: priorities) {
			sum += p;
		}
		if(sum > 100)
			sum = 100;
		return sum;
	}
	
	 public int calculatePriority(int priority, String type) {
	        int total = priority;
	        if (type.equalsIgnoreCase("new")) {
	            total += 5;
	        } else if (type.equalsIgnoreCase("classic")) {
	            total += 3;
	        } else {
	            total += 0; // Invalid type, no change
	        }
	        if (total > 100) total = 100; // Cap at 100
	        return total;
	    }
	 
	 public int calculatePriorityWithBonus(int[] priorities) {
	        int sum = 0;
	        for (int p : priorities) {
	            sum += p;
	        }
	        sum += 5;
	        if (sum > 100) sum = 100; // Cap at 100
	        return sum;
	    }

	    // Display Book ID
	    public void showBookId() {
	        System.out.println(bookId);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Input for Method 1
	        int n = sc.nextInt();
	        int[] arr1 = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        // Input for Method 2
	        int priority = sc.nextInt();
	        String type1 = sc.next();

	        // Input for Method 3
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        // Constructors input
	        int id1 = sc.nextInt();
	        int id2 = sc.nextInt();
	        String type2 = sc.next();

	        // Object creation
	        BookHaven b1 = new BookHaven(id1);
	        BookHaven b2 = new BookHaven(id2, type2);

	        // Method calls and outputs
	        System.out.println(b1.calculatePriority(arr1));             // Method 1
	        System.out.println(b1.calculatePriority(priority, type1));   // Method 2
	        System.out.println(b1.calculatePriorityWithBonus(arr2));     // Method 3
	        b1.showBookId();                                            // Constructor 1
	        b2.showBookId();                                            // Constructor 2

	        sc.close();
	}

}

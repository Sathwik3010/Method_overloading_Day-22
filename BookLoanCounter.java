package com.codegnan.Overload;

import java.util.Scanner;

public class BookLoanCounter {
	private int bookId;
	private String type;
	
	
	public BookLoanCounter(int bookId) {
		super();
		this.bookId = bookId;
	}

	
	public BookLoanCounter(int bookId, String type) {
		super();
		this.bookId = bookId;
		this.type = type;
	}

	public int calculateLoans(int[] loans) {
		int total=0;
		for(int loan: loans) {
			total+=loan;
		}
		if(total > 1000)
			total = 1000;
		return total;
	}
	
	public int calculateLoans(int count, String type) {
		int total=count;
		if(type.equalsIgnoreCase("fiction")) {
			total += 1;
		} else if(type.equalsIgnoreCase("non-fiction")) {
			total -= 2;
		} else {
			total += 1;
		}
		if(total > 1000)
			total = 1000;
		return total;
	}
	
	public int calculateLoansWithBonus(int[] loans) {
		int total=0;
		for(int loan: loans) {
			total+=loan;
		}
		total += 10;
		if(total > 1000)
			total = 1000;
		return total;
	}
	
	public void showBookId() {
		System.out.println(bookId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Input for Method 1
	        int n = sc.nextInt();
	        int[] loans1 = new int[n];
	        for (int i = 0; i < n; i++) {
	            loans1[i] = sc.nextInt();
	        }

	        // Input for Method 2
	        int count = sc.nextInt();
	        String type1 = sc.next();

	        // Input for Method 3
	        int n2 = sc.nextInt();
	        int[] loans2 = new int[n2];
	        for (int i = 0; i < n2; i++) {
	            loans2[i] = sc.nextInt();
	        }

	        // Constructors
	        int id1 = sc.nextInt();
	        int id2 = sc.nextInt();
	        String type2 = sc.next();

	        // Object creation
	        BookLoanCounter b1 = new BookLoanCounter(id1);
	        BookLoanCounter b2 = new BookLoanCounter(id2, type2);

	        // Method outputs
	        System.out.println(b1.calculateLoans(loans1));         // Method 1
	        System.out.println(b1.calculateLoans(count, type1));    // Method 2
	        System.out.println(b1.calculateLoansWithBonus(loans2)); // Method 3
	        b1.showBookId();                                       // Constructor 1
	        b2.showBookId();                                       // Constructor 2

	        sc.close();
	}

}

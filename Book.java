package com.codegnan.Overload;

import java.util.Scanner;

public class Book {
	int id;
	String type;
	
	public Book(int id) {
		this.id = id;
	}
	
	public Book(int id, String type) {
		this.id = id;
		this.type = type;
	}
	
	// method1 calculatefine days*5
	public int calculateFine(int days) {
		int fine=days*5;
		return Math.min(fine, 1000);
	}
	
	//calculate fine based on type
	public int calculateFine(int days, String type) {
		int fine=0;
		if(type.equalsIgnoreCase("regular")) {
			fine=days*2;
		} else {
			if(type.equalsIgnoreCase("Premium")) {
				fine=days*3;
			}
		}
		return Math.min(fine, 1000);
	}
	//method-3 calculatefine days*5+10;
	public int calculateFineAdvanced(int days) {
		int fine=days*5+10;
		return Math.min(fine, 1000);
	}
	public int getId() {
		return id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days=sc.nextInt(); // for method1
		int days1=sc.nextInt();// for method2
		String type=sc.next();// type for method2
		int days2=sc.nextInt();// for method3
		int id1=sc.nextInt();// input for constructor1
		int id2=sc.nextInt();
		String typeForObj2=sc.next();
		Book obj1 = new Book(id1);
		Book obj2 = new Book(id2,typeForObj2);
		
		int fine1=obj1.calculateFine(days);
		int fine2=obj1.calculateFine(days1, type);
		int fine3=obj1.calculateFineAdvanced(days2);
		
		System.out.println(fine1);
		System.out.println(fine2);
		System.out.println(fine3);
		System.out.println(obj1.getId());
		System.out.println(obj2.getId());

		sc.close();
	}

}

package com.codegnan.Overload;

import java.util.Scanner;

public class MusicFest {

	private int ticketId;
	private String type;
	
	
	public MusicFest(int ticketId) {
		super();
		this.ticketId = ticketId;
	}

	public MusicFest(int ticketId, String type) {
		super();
		this.ticketId = ticketId;
		this.type = type;
	}


	public int calculateDiscount(int[] prices) {
		int sum=0;
		for(int price : prices) {
			sum+=price;
		}
		double discount = Math.floor(sum*0.1);
		if(discount > 1000)
			discount = 1000;
		return (int) discount;
	}
	
	public int calculateDiscount(int price, String type) {
		double discount = 0;
		if(type.equalsIgnoreCase("early")) {
			discount = Math.floor(price*0.2);
		} else if(type.equalsIgnoreCase("regular")) {
			discount = Math.floor(price * 0.05);
		}
		if(discount >1000)
			discount = 1000;
		return (int)discount;
	}
	
	public int calculateDiscountWithBonus(int[] prices) {
		int sum = 0;
		for(int price: prices) {
			sum+=price;
		}
		double discount = Math.floor(sum * 0.1 + 20);
		if(discount > 1000)
			discount = 1000;
		return (int)discount;
	}
	
	public void showTicketId() {
		System.out.println(ticketId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        // Input for Method 1
		int n = sc.nextInt();
		int[] prices1 = new int[n];
		for(int i=0;i<n;i++) {
			prices1[i]=sc.nextInt();
		}
		
        // Input for Method 2
		int price2 = sc.nextInt();
		String type1 = sc.next();
		
        // Input for Method 3
		int n2 = sc.nextInt();
		int[]prices2 = new int[n2];
		for(int i=0;i<n2;i++) {
			prices2[i]=sc.nextInt();
		}
		
        // Constructors
		int id1 = sc.nextInt();
		int id2 = sc.nextInt();
		String type2 = sc.next();

        // Object creation
		MusicFest m1 = new MusicFest (id1);
		MusicFest m2 = new MusicFest (id2, type2);

        // Method calls and outputs
		System.out.println(m1.calculateDiscount(prices1));
		System.out.println(m1.calculateDiscount(price2, type1));
        System.out.println(m1.calculateDiscountWithBonus(prices2));  // Method 3
        m1.showTicketId();
        m2.showTicketId();
        
		sc.close();
	}

}

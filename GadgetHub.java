package com.codegnan.Overload;

import java.util.Scanner;

public class GadgetHub {

	private int inventoryId;
	private String category;
	
	
	public GadgetHub(int inventoryId) {
		super();
		this.inventoryId = inventoryId;
	}


	public GadgetHub(int inventoryId, String category) {
		super();
		this.inventoryId = inventoryId;
		this.category = category;
	}

	public int calculatePrice(int[] prices) {
		int total = 0;
		for(int price: prices) {
			total +=price;
		}
		if(total > 10000)
			total = 10000;
		return total;
	}

	public int calculatePrice(int price, String category) {
		double total = 0;
		if(category.equalsIgnoreCase("electronics")) {
			total = price * 1.1;
		} else if(category.equalsIgnoreCase("appliances")) {
			total = price * 1.2;
		} else {
			total = price * 1.1;
		}
		
		if(total > 10000)
			total = 10000;
		return (int) total;
	}
	
	public int calculatePriceWithBonus(int[] prices) {
		int total = 0;
		for(int price: prices) {
			total +=price;
		}
		total+=100;
		if(total > 10000)
			total = 10000;
		return total;
	}
	
	public void showInventoryId() {
		System.out.println(inventoryId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        // First array
        int n = sc.nextInt();
        int[] prices1 = new int[n];
        for(int i=0;i<n;i++) {
        	prices1[i]=sc.nextInt();
        }
        
        // For method 2
        int price2 = sc.nextInt();
        String category1 = sc.next();

        // For method 3
        int n2 = sc.nextInt();
        int[] prices2 = new int[n2];
        for(int i=0;i<n2;i++) {
        	prices2[i]=sc.nextInt();
        }
        
        // For constructors
        int id1 = sc.nextInt();
        int id2 = sc.nextInt();
        String category2 = sc.next();
        
        GadgetHub g1 = new GadgetHub(id1);
        GadgetHub g2 = new GadgetHub(id2,category2);

        System.out.println(g1.calculatePrice(prices1));
        System.out.println(g1.calculatePrice(price2, category1));
        System.out.println(g1.calculatePriceWithBonus(prices2));  // Method 3
        g1.showInventoryId();
        g2.showInventoryId();
        sc.close();
	}

}

package com.codegnan.Overload;

import java.util.Scanner;

public class CoffeeDiscount {

	private int amount;
	private String type;
	
	public CoffeeDiscount(int amount) {
		this.amount=amount;
	}
	
	public CoffeeDiscount(int amount, String type) {
		this.amount=amount;
		this.type=type;
	}
	
	public double CalculateDiscount(int amount) {
		double discount = amount * 0.10;
		if(discount>100)
			discount = 100;
		return discount;
	}
	
	public double CalculateDiscount(int amount, String type) {
		double discount = 0;
		
		if(type.equalsIgnoreCase("regular")) {
			discount = amount * 0.05;
		} else if(type.equalsIgnoreCase("loyal")) {
			discount = amount * 0.15;
		}
		
		if(discount>100)
			discount = 100;
		
		return discount;
	}
	 
    public double calculateDiscountWithBonus(int amount) {
    	double discount = (amount * 0.10) + 5;
    	if(discount>100)
			discount = 100;
		
		return discount;
    }
    
    public void showConstructorAmount() {
    	System.out.println(amount);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amount1 = sc.nextInt(); //for method 1
		int amount2 = sc.nextInt(); //for method 2
		String type = sc.next();
        int amount3 = sc.nextInt(); // for method 3
        int amount4 = sc.nextInt(); // constructor 1
        int amount5 = sc.nextInt(); // constructor 2
        String type2 = sc.next();   // constructor 2 type
        
        CoffeeDiscount cd = new CoffeeDiscount(amount4); // constructor 1
        CoffeeDiscount cd2 = new CoffeeDiscount(amount5, type2); // constructor 2

        // Method calls
        System.out.println((int)cd.CalculateDiscount(amount1));
        System.out.println((int)cd.CalculateDiscount(amount2, type));
        System.out.println((int) cd.calculateDiscountWithBonus(amount3));      // Method 3
        cd.showConstructorAmount();                                            // Constructor 1 output
        cd2.showConstructorAmount();
        
		sc.close();
	}

}

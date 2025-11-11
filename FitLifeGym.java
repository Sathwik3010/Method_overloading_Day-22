package com.codegnan.Overload;

import java.util.Scanner;

public class FitLifeGym {

	private int memberId;
	private String type;
	
	public FitLifeGym(int memberId) {
		this.memberId = memberId;
	}
	public FitLifeGym(int memberId, String type) {
		super();
		this.memberId = memberId;
		this.type = type;
	}

	public int calculateCalories(int hours) {
		int calories = hours * 100;
		if(calories>1000)
			calories = 1000;
		return calories;
	}
	
	public int calculateCalories(int hours, String type) {
		int calories = 0;
		if(type.equalsIgnoreCase("cardio")) {
			calories = hours * 120;
		} else if(type.equalsIgnoreCase("strenght")) {
			calories = hours * 80;
		}
		
		if(calories>1000)
			calories = 1000;
		return calories;
	}
	
	public int calculateCaloriesWithBonus(int hours) {
		int calories = (hours * 100)+50;
		if(calories>1000)
			calories = 1000;
		return calories;
	}
	
	public void showMemberId() {
		System.out.println(memberId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int hours1 = sc.nextInt();         // for method 1
        int hours2 = sc.nextInt();         // for method 2
        String type1 = sc.next();          // exercise type (cardio/strength)
        int hours3 = sc.nextInt();         // for method 3
        int id1 = sc.nextInt();            // for constructor 1
        int id2 = sc.nextInt();            // for constructor 2
        String type2 = sc.next();          // exercise type for constructor 2
        
        // Create objects using overloaded constructors
        FitLifeGym member1  = new FitLifeGym(id1);
        FitLifeGym member2  = new FitLifeGym(id2, type2);
        
        // Method calls
        System.out.println(member1.calculateCalories(hours1));          // Method 1
        System.out.println(member2.calculateCalories(hours2, type1));
        System.out.println(member1.calculateCaloriesWithBonus(hours3)); // Method 3

        // Constructor calls
        member1.showMemberId();                                         // Constructor 1
        member2.showMemberId();
        sc.close();
	}

}

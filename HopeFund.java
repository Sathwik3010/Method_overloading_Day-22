package com.codegnan.Overload;

import java.util.Scanner;

public class HopeFund {

	private int donorId;
	private String donorType;
	
	
	public HopeFund(int donorId) {
		this.donorId = donorId;
	}

	public HopeFund(int donorId, String donorType) {
		this.donorId = donorId;
		this.donorType = donorType;
	}

	public int calculateMatch(int donation) {
		int match = donation * 2;
		if(match > 10000)
			match = 10000;
		return match;
	}

	public int calculateMatch(int donation, String type) {
		int match = 0;
		if(type.equalsIgnoreCase("individual")) {
			match = donation * 3;
		} else if(type.equalsIgnoreCase("corporate")){
			match = donation * 4;
		} else {
			match = donation * 4;
		}
		
		if(match > 10000)
			match = 10000;
		return match;
	}
	
	public int calculateMatchWithBonus(int donation) {
		int match = (donation * 2)+100;
		if(match > 10000)
			match = 10000;
		return match;
	}
	
	public void showDonorId() {
		System.out.println(donorId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int donation1 = sc.nextInt();// For method 1
        int donation2 = sc.nextInt();// For method 2
        String type1 = sc.next();    // Donor type for method 2
        int donation3 = sc.nextInt();         // For method 3
        int id1 = sc.nextInt(); // Constructor 1
        int id2 = sc.nextInt(); // Constructor 2
        String type2 = sc.next();  // Constructor 2 donor type
        
        HopeFund donor1 = new HopeFund(id1);
        HopeFund donor2 = new HopeFund(id2, type2);

        System.out.println(donor1.calculateMatch(donation1));
        System.out.println(donor1.calculateMatch(donation2, type1));
        System.out.println(donor1.calculateMatchWithBonus(donation3));
        donor1.showDonorId();
        donor2.showDonorId();
        sc.close();
	}

}

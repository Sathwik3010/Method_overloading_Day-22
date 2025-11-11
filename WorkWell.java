package com.codegnan.Overload;

import java.util.Scanner;

public class WorkWell {

	private int employeeId;
	private String role;
	
	
	public WorkWell(int employeeId) {
		this.employeeId = employeeId;
	}

	public WorkWell(int employeeId, String role) {
		this.employeeId = employeeId;
		this.role = role;
	}


	public int calculatePay(int hours) {
		int pay = hours * 20;
		if(pay > 1000)
			pay = 1000;
		return pay;
	}
	
	public int calculatePay(int hours, String role) {
		int pay;
		if(role.equalsIgnoreCase("staff")) {
			pay = hours * 15;
		} else if(role.equalsIgnoreCase("manager")) {
			pay = hours * 25;
		} else {
			pay = hours * 25;
		}
		if(pay > 1000)
			pay = 1000;
		return pay;
	}
	
	public int calculatePayWithBonus(int hours) {
		int pay = (hours * 20) + 30;
		if(pay > 1000)
			pay = 1000;
		return pay;
	}
	
	public void showEmployeeId() {
		System.out.println(employeeId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hours1 = sc.nextInt();
		int hours2 = sc.nextInt();
		String role1 = sc.next();
		int hours3 = sc.nextInt();
		int id1 = sc.nextInt();
		int id2 = sc.nextInt();
		String role2 = sc.next();
		
		WorkWell emp1 = new WorkWell(id1);
		WorkWell emp2 = new WorkWell(id2, role2);

		System.out.println(emp1.calculatePay(hours1));
		System.out.println(emp1.calculatePay(hours2,role1));
		System.out.println(emp1.calculatePayWithBonus(hours3));

		emp1.showEmployeeId();
		emp2.showEmployeeId();
		sc.close();
	}

}

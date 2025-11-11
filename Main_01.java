package com.codegnan.Overload;

public class Main_01 {

	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		od.test();
		od.test(10);
		od.test(30,40);
		System.out.println(od.test(5.0));
	}

}
 
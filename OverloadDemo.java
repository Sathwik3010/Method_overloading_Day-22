package com.codegnan.Overload;

public class OverloadDemo {

	public void test() {
		System.out.println("no parameters");
	}
	public void test(int a) {
		System.out.println("A value is: "+a);
	}
	public void test(int a, int b) {
		System.out.println("a and b sum is: "+(a+b));
	}
	public double test(double d) {
		System.out.println("Square of d is");
		return d * d;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}

}

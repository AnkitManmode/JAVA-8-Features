package com.ankit.defaults;

public class Test_Left_Right implements Left, Right {
	public void m1() {
	//	System.out.println("our own m1 method");
	//	Right.super.m1();
		Left.super.m1();
	}

	public static void main(String[] args) {
		Test_Left_Right tp = new Test_Left_Right();
		tp.m1();
	}
}

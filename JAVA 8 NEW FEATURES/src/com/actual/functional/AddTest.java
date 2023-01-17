package com.actual.functional;

public class AddTest {
public static void main(String[] args) {
	// Wherever functional interface are 
	// there there only we can implement lambda expression
	// lambda expression is always associated with functional interface
	AddF af =(a,b)->System.out.println(a+b);
	af.add(45, 76);
}
}

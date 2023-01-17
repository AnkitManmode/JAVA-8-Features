package com.ankit.java8;

public class TheoryLambda {
	
//	1.Lambda expression
//	2.Functional Interface
//	3.Default Methods and static method
//	4.Predefined Functional Interfaces
//	  Predicate
//	  Function
//	  Consumer
//	  Supplier
//	5.Double colon Operator(::)
//	Method reference purpose
//		Constructor purpose
//		Streams
//		date and Time API
//		Optional class
//		Nashron javascript engine
	
	// Main Objective of Lambda Expression
	// To bring benefits of functional programming into java 	
		
	// what is Lambda Expression ?
	// It is an Anonymous function i.e. nameless	
	// without return type
	// without modifiers	
		
//	   without lambda expression
// eg 1.		public void m1() {
//			System.out.println("hello");
//		}
	
	
//		with lambda expression
//    ()->{System.out.println("Hello");}
//    ()->System.out.println("Hello");
//	 If body contains 1 line the curly braces are optional

// eg 2.
	// 	   without lambda expression
//	public void m1(int a, int b) {
//		System.out.println(a+b);
//	}

// with lambda expression
//	(int a, int b)->System.out.println(a+b);
// sometimes compiler can guess the type automatically , no need to write the type
//	(a, b)->System.out.println(a+b);

	// eg 3. 
//	   without lambda expression
	// public int squareIt(int n){
	// return n*n;
	// 	}

	// with lambda expression
	// (int n)->{return n*n;}
	// within curly braces compulsory you should specify  return 
	// (int n)-> n*n;
	//   without curly braces if you want to return something 
	//   then automatically you are not required to specified return
	// compiler can guess the type automatically the we can remove the type 
	//  (n)->n*n;
	// if 1 parameter/ argument is there then no need to use parenthesis, it is optional 
	// n->n*n;

	// eg 4.
	//  without lambda expression
//	public  int m1(String s) {
//		return s.length();
//	}
	// with lambda expression
//	 s->s.length();
	
	// how to call 
	// By using FI (Functional Interface)
	//  An interface contains single abstract method
	// If you want to invoke lambda expression , functional interface must be required
	// job of functional interface is , to call lambda expression , to invoke lambda expression
	
	// Runnable, Comparable, Comparator, ActionListener,   Callable
	// run()     compareTo()  compare()  actionPerformed()   call()
	// All above interfaces contains only 1 method therefore it is also functional interface
	
	// lambda expression have any no.of argument
	// if multiple arguments are there then this arguments are separated with (comma),
	// if only 1 argument is there then parenthesis are optional


	// n->return n*n;        // invalid
	// n->{return n*n;};     // valid
	// n->{return n*n};      // invalid (semicolon is missing)
	// n->{n*n;};			 // invalid (here compulsory we should use return statement)
	// n->n*n;				 // valid

	// without curly braces we cannot use return keyword. compiler will consider return value automatically
	// within curly braces if we want to return some value compulsory we should use return statement

// once we write lambda expression , to call that method , we should go for functional interface
// lambda expression is a method
	
//	1) Functional interface
//	which contains single abstract method
// from 1.8 version we can take any no. of default method and static method also along with single abstract method in functional interface

}

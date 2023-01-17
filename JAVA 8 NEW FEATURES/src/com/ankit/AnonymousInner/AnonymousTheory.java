package com.ankit.AnonymousInner;

public class AnonymousTheory {
	//Implementing thread concept by using anonymous inner classes
// Anonymous inner class
//	the class without having name is called Anonymous  class
//	eg. 
//	Thread t = new Thread();

//	Thread t= new Thread();
//	{
//		===================
//	    ===================
//	};
// 	We are writing a class that extend a  Thread class
// the child class has no name i.e it is called as Anonymous inner class
// i.e. this anonymous inner class extends Thread class


// Runnable r = new Runnable();
//	{
//		==========
//	};	
	
// runnable is an interface , we can't create an object of interface	
// we will create child class for the runnable interface or implementation class for the runnable
// for that implementation class we are going to create an object.
// but that implementation class doesn't have name therefore it is called as Anonymous inner class
//
//wherever required functionality is there, there we can use Anonymous inner class
// Anonymous inner class is for instant use
	



// Where ever anonymous inner class concept is there, to resolve that complexity , lambda expression we can use

// Anonymous inner class is more powerful than lambda expression

// eg. 
	
// interface A{
//	m1();
//	m2();
// }
// here we can't use lambda expression because A is not a functional interface , 2 abstract methods are there

// In this case we can go for anonymous inner class
// there fore Anonymous inner class is more powerful than lambda expression

// interface A{
//	m1();
//	m2();
//
//	A a = new A () {
//	public void m1() {
//			
//	}
//	public void m2() {
//			
//	}
//	};
// there are some cases where we can go for anonymous inner class but not for lambda expression
// where ever anonymous inner class is there it may not possible to use lambda expression, but 
//  where ever lambda expression is there happily we can go for anonymous inner class.	
//	there fore Anonymous inner class is more powerful than lambda expression

// If anonymous inner class implements an interface that contains single abstract method 
// then only we can replace that anonymous inner class with lambda expression 

// anonymous inner class
// Anonymous inner class can extend a normal class
// Anonymous inner class can extend an abstract class
// Anonymous inner class can implement an interface which contains any number of abstract methods

// Lambda Expression
// lambda expression can implements an interface which contains a single abstract method 
//	such type of interfaces is also known as functional interface	

// anonymous inner class ! = lambda Expression



}

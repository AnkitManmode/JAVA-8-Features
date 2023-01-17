package com.PreDefinedfunctionalInterface;

public class Test {
// Predefined Functional interface in java 8 to make lambda expression
// as a common coding activity
	
//  1) Predicate
//	2) Function
//  3) Consumer
//  4) Supplier
	
//  Two argument Predefined Functional interface
	
//  BiPredicate
//	BiFunction
//	BiConsumer
	
// Primitive Functional interface

//  IntPredicate
//	IntFunction
//	IntConsumer
	
// java.util.function package	
	
// Predicate:
// conditional checks
// Predicate functional interface contains only 1 abstract methods	
	
// public abstract boolean test(T t)	
	
//	interface Predicate <T>{
	
//  public boolean test (T t);
//     }
	
	
//  Predicate<T>:	
	
// public boolean test(Integer I){
//	if(I%2==0) {
//		return true;
//	}else {
//		return false;
//	}

//	(Integer I)->I%2==0
//	
//	I->I%2==0
//	
//	To refer this lambda expression, functional interface must be required
//  That functional interface is nothing but predicate concept
//  where ever boolean condition we want to check then we can go for predicate concept
	
// predicate functional interface contain only 1 method called "test"	
// test method Evaluates this predicate on the given argument.
//	Parameters:t the input argument Returns:true if the input argument matches the predicate,otherwise false	
	
// Advantages of using predicate is	
// We can use lambda expression in our programming
// so that more concise code by default is possible
// we use predicate for conditional checks in our programming
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
package com.actual.functional;

public class Test {
public static void main(String[] args) {
	// instead of taking implementation class use that  
	// lambda expression at place of object in test class 
	// no need to create object if we use lambda expression with functional interface 
	// no need to write implementation class
	activity a =()->System.out.println("Do your work");
	a.game();
	a.game();
	a.game();
	a.game();
	// whenever you are calling method the game implementation is itself a lambda expression
	// functional interface can be used to provide reference to lambda expression
}
}

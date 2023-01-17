package com.ankit.java8;

import java.util.function.Predicate;

public class EvenNo {
public static void main(String[] args) {
	//lambda function
	//main objective of java 8 is to enable functional programming in JAVA
	// we can write concise code , no read to write big code
	Predicate<Integer> p =i->i%2==0;
	System.out.println(p.test(10));
	System.out.println(p.test(13));
}
}

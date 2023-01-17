package com.PreDefinedfunctionalInterface;

import java.util.function.Predicate;
// predicate takes only 1 input argument
// return type of predicate is always boolean
public class ComPredEx {
	public static void main(String[] args) {
		// write a predicate to check whether given no. is even or not	
		// write a predicate to check whether given no. is greater than 10 or not	
		int []x = {0,5,10,15,20,25,30,35,40,45};
		Predicate<Integer> p1 =s->s%2==0;
		Predicate<Integer> p2 =s->s>10;
		// we can combine 2 predicate by using single predicate by using below method
		// and(), or(), negate() methods
		// by using above method we can perform predicate joining
		System.out.println("The numbers which are even and greater than 10");
		for(int x1 :x) {
			if(p1.and(p2).test(x1)) {
				System.out.println(x1);
			}
		}
		System.out.println("***************");
		System.out.println("The numbers which are even or greater than 10");
		for(int x1 :x) {
			if(p1.or(p2).test(x1)) {
				System.out.println(x1);
			}
		}
		System.out.println("***************");
		System.out.println("The numbers which are even ");
		for(int x1 :x) {
			if(p1.test(x1)) {
				System.out.println(x1);
			}
		}
		System.out.println("***************");
		System.out.println("The numbers which are not even ");
		for(int x1 :x) {
			if(p1.negate().test(x1)) {
				System.out.println(x1);
			}
		}
	}
}

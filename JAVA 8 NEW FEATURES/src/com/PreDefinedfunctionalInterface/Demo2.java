package com.PreDefinedfunctionalInterface;

import java.util.function.Predicate;

public class Demo2 {
	public static void main(String[] args) {
		// write a predicate for the following string whose length is greater than 5
		String [] str = {"Nag","Chiranjeevi","Venkatesh","Balaiha","Sunny","sachinsir"};

		Predicate<String> p = s->s.length()>5;
		for (String s1 : str) {
			if(p.test(s1)) {

				System.out.println(s1);
			}
		}
	}
}
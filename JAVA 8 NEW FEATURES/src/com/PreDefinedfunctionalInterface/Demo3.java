package com.PreDefinedfunctionalInterface;

import java.util.function.Predicate;

public class Demo3 {
public static void main(String[] args) {
	// write a predicate for the string whose length is even
	// return type of predicate is boolean
	String [] str = { "Rajat","sukany","nayna","sadhna","shiva"};
	Predicate<String> p = s->s.length()%2==0;
	Predicate<String> q = w->w.contains(w);
	

	for(String s1 : str) {
		if(p.test(s1))
			System.out.println(s1);
	}
}
}

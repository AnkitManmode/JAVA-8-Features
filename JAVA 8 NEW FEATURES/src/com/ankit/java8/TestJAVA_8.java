package com.ankit.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestJAVA_8 {
	public static void main(String[] args) {

		Function<Integer, Integer> f = i->i*i;	
    	System.out.println(f.apply(12));
		System.out.println(f.apply(30));

	}

}

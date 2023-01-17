package com.ankit.functions;

import java.util.function.Function;

public class Test2 {
public static void main(String[] args) {
//	input-> string
//	output-> integer
	
	Function<String, Integer> f=s->s.length();
	System.out.println(f.apply("AnkitManmode"));

	Function<String, String> f1=s->s.toUpperCase();
	System.out.println(f1.apply("AnkitManmode"));

}
}

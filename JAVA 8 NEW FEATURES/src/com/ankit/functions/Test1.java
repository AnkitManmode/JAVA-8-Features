package com.ankit.functions;

import java.util.function.Function;
// when we go for function
// read some input perform some operation return some result
// result/return may be in the form of	boolean, string, integer etc.
public class Test1 {
public static void main(String[] args) {
	Function<Integer, Integer> f = i->i*i;
	System.out.println(f.apply(34));
	
}
}

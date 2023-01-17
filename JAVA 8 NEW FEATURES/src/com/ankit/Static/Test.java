package com.ankit.Static;

public class Test implements Interf {
	
public static void main(String[] args) {

// Interface static methods by default not available to the implementation classes	
// interface static method should be called using interface name only		
// There is no other way to call interface static method

// Interf.m1();   1) valid

//m1();          2) Invalid

//Test.m1();     3) Invalid

//Test t = new Test();
//t.m1();        4) Invalid
}
}

package com.ankit.defaults;

public class Test implements Interf{
public static void main(String[] args) {
	Test t = new Test();
	t.m1();
}
@Override
public void m1() {
	System.out.println("Overriding version of default method");
}
}
// by adding default method concept already exist implementation classes never going to get affected
// therefore output will be  "Overriding version of default method"
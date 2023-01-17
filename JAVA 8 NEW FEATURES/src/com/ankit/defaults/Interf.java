package com.ankit.defaults;

public interface Interf {
default void m1() {
	System.out.println("This is default method");
	
}
default int hashcode() {
	return 10;
	
}
}

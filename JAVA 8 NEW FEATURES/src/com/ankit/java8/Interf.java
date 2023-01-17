package com.ankit.java8;
@FunctionalInterface
public interface Interf {
	// it is functional interface
    // because it contains single abstract method 
	// and any no of default and static method
	// to specify explicitly there is 1 annotation called (@FunctionalInterface)
	
	// compiler will give error if there is mistake while making functional interface
	// like this  ===> public void m6(); //     // because it contains single abstract method (here we write 2)
public void m1();
// public void m6();
default void m2() {
	System.out.println("this is default method1");
}
default void m4() {
	System.out.println("this is default method2");
}
public static void m3() {
	System.out.println("This is static method1");
}
public static void m5() {
	System.out.println("This is static method2");
}

}

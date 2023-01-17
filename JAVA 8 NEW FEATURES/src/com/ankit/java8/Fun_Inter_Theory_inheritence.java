package com.ankit.java8;

public class Fun_Inter_Theory_inheritence {

	
	// @FunctionalInterface
	// interface A{
	// public void m1();
//		}
	
//		@FunctionalInterface
//		interface B extends A{
//		}
//if the parent interface is functional interface then automatically child
//interface will become functional interface
// if you are not providing single abstract method also

	// if we provide 1 abstract method in child class the it is also valid
	// because we are overriding only
	// see below example

	// @FunctionalInterface
	// interface A{
	// public void m1();
//		}
	
//		@FunctionalInterface
//		interface B extends A{
	    // public void m1();
//		}
	
	// if we change the method in child then it is invalid because now it contains 2 abstract method 
	// 1 is in parent and 1 is in child 
	// see below example

	// @FunctionalInterface
	// interface A{
	// public void m1();
//		}
	
//		@FunctionalInterface
//		interface B extends A{
	    // public void m2();// it is new abstract method therefore it is not functional interface 
//		}

// if we remove @FunctionalInterface annotation from child then also it is valid
// because 	now child is a normal interface it contains any no. of abstract methods

	// @FunctionalInterface
		// interface A{
		// public void m1();
//			}
		
//			
//			interface B extends A{
		    // public void m2();
//			}
}

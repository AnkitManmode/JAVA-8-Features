package com.actual.functional;
// where ever functional interface is there happily we can implement lambda expression
// lambda expression concept is only applicable for functional interfaces
// if we are not having functional interface , we can't write lambda expressions 
public interface AddF {
	
public void add(int a, int b);
//public void product(int a, int b);

}
// in this case compiler will confuse ,which argument 
// we should take , therefore functional interface 
// contain only one abstract method 
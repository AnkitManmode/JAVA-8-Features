package com.ankit.defaults;

public class DefaultTheory {
// 1.8 version onwards we can take default methods also inside interface
// until 1.7 version, every method present inside interface is always public and abstract

//   eg. void m1();
//	     public void m1();
//	     abstract void m1();
//	     public abstract void m1();

// Related Methods
// In the 1.8 version In interface default methods and static methods are allowed	
// In the 1.9 version In interface private methods are allowed	

// Every variable present inside interface is always public static and final
// No such enhancement with respect to variables in the newer version of JAVA 
	
// Default Method |Virtual Extension Method | Defender Method 
	
// Default method is also called as defender method because it protect itself(funny concept man)


// once we define an interface and implementation classes are already define then you are 
// not allowed to add any new method to the interface
// if you are trying to add new method then all implementations classes are going to affected, the code won't compile
// once we define an interface that is "final", we can't change it
// to overcome this problem java people identified the solution.
// if someone want to extend the functionality by adding new methods, without affecting implementation classes, 
// it is possible to add new methods to the interface with the help of "default methods"

// default method is already having it's implementation
	
// without effecting implementation classes if we want to add new method to the interface, then we should go for default method
// default method is already having implementation(It is dummy implementation only)
	
// instead of normal method if we add default method the code will compile happily	

// The name of default method is default because this method has default implementation 


// Why we are using the word defender ?
	
// Ans: It will provide the protection for all implementation classes, 
//  You are not required  to implement this method	, just i am adding If you want you can use if you are not satisfied you can override
//	if you don't want you can ignore all the facilities i am providing for the implementation classes


// default method you should take in interface only not in a class
// object class methods , we can't implement as default method
// because object class method is by default available to every implementation classes.
//  eg. hashCode is a method of  object class so we can't make this as a default methos in implementation class 

}


























